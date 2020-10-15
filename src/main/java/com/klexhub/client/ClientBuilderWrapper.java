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

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.ClientBuilder;

public class ClientBuilderWrapper {

    static Class clazz;
    static {
        try {
            clazz = Class.forName("org.jboss.resteasy.client.jaxrs.internal.ResteasyClientBuilderImpl");
        } catch (ClassNotFoundException e) {
            try {
                clazz = Class.forName("org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder");
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException("RestEasy 3 or 4 not found on classpath");
            }
        }
    }

    public static ClientBuilder create(SSLContext sslContext, boolean disableTrustManager) {
        try {
            Object o = clazz.newInstance();
            clazz.getMethod("sslContext", SSLContext.class).invoke(o, sslContext);
            clazz.getMethod("connectionPoolSize", int.class).invoke(o, 10);
            if (disableTrustManager) {
                clazz.getMethod("disableTrustManager").invoke(o);
            }
            return (ClientBuilder) o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
