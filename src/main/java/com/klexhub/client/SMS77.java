/*
 * Copyright 2020 KlexHub UG (haftungsbeschränkt). and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the MIT License,(the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author j.waigel@klexhub.com
 */

package com.klexhub.client;

import java.net.URI;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import com.klexhub.client.resource.Balance;
import com.klexhub.client.resource.Lookup;
import com.klexhub.client.resource.PriceList;
import com.klexhub.client.resource.SMSDispatch;
import com.klexhub.client.resource.StatusReports;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJackson2Provider;

public class SMS77 implements AutoCloseable {

    public static final String API_URL = "https://gateway.sms77.io/api";
    private final Config config;
    private final ResteasyWebTarget target;
    private final Client client;
    private final String apiToken;
    private boolean closed = false;

    SMS77(String apitoken, String serverUrl, Client resteasyClient) {
        config = new Config(serverUrl, apitoken);
        client = resteasyClient != null ? resteasyClient : newRestEasyClient(null, null, false);
        apiToken = apitoken;
        target = (ResteasyWebTarget) client.target(config.getServerUrl());
        target.register(newAuthFilter());
        target.register(JsonContentTypeResponseFilter.class);
    }

    private BasicAuthFilter newAuthFilter() {
        return apiToken != null ? new BasicAuthFilter(apiToken) : null;
    }

    private static Client newRestEasyClient(ResteasyJackson2Provider customJacksonProvider, SSLContext sslContext,
            boolean disableTrustManager) {
        ClientBuilder clientBuilder = ClientBuilderWrapper.create(sslContext, disableTrustManager);
        if (customJacksonProvider != null) {
            clientBuilder.register(customJacksonProvider, 100);
        } else {
            clientBuilder.register(JacksonProvider.class, 100);
        }
        return clientBuilder.build();
    }

    public static SMS77 getInstance(String serverUrl, String apiToken, SSLContext sslContext,
            ResteasyJackson2Provider customJacksonProvider, boolean disableTrustManager) {
        return new SMS77(serverUrl, apiToken,
                newRestEasyClient(customJacksonProvider, sslContext, disableTrustManager));
    }

    public static SMS77 getInstance(String apiToken, SSLContext sslContext,
            ResteasyJackson2Provider customJacksonProvider, boolean disableTrustManager) {
        return new SMS77(API_URL, apiToken, newRestEasyClient(customJacksonProvider, sslContext, disableTrustManager));
    }

    public static SMS77 getInstance(String apiToken) {
        return new SMS77(API_URL, apiToken, null);
    }

    public static SMS77 getInstance(String apiToken, String serverUrl) {
        return new SMS77(serverUrl, apiToken, null);
    }

    /**
     * Create a secure proxy based on an absolute URI. All set up with appropriate
     * token
     *
     * @param proxyClass
     * @param absoluteURI
     * @param <T>
     * @return
     */
    public <T> T proxy(Class<T> proxyClass, URI absoluteURI) {
        return ((ResteasyWebTarget) client.target(absoluteURI)).register(newAuthFilter()).proxy(proxyClass);
    }

    @Override
    public void close() throws Exception {
        closed = true;
        client.close();
    }

    public boolean isClosed() {
        return closed;
    }

    public SMSDispatch dispatch() {
        return target.proxy(SMSDispatch.class);
    }

    public StatusReports statusReport() {
        return target.proxy(StatusReports.class);
    }

    public Balance balance() {
        return target.proxy(Balance.class);
    }

    public PriceList priceList() {
        return target.proxy(PriceList.class);
    }

    public Lookup lookup() {
        return target.proxy(Lookup.class);
    }

}
