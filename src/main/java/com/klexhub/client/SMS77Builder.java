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

import org.jboss.resteasy.client.jaxrs.ResteasyClient;

public class SMS77Builder {
    private String serverUrl;
    private String apiToken;
    private ResteasyClient resteasyClient;

    public SMS77Builder serverUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    public SMS77Builder apiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    public SMS77Builder resteasyClient(ResteasyClient resteasyClient) {
        this.resteasyClient = resteasyClient;
        return this;
    }

    public SMS77 build() {
        if (serverUrl == null) {
            this.serverUrl = SMS77.API_URL;
        }
        if (apiToken == null) {
            throw new IllegalStateException("apiToken required");
        }

        return new SMS77(apiToken, serverUrl, resteasyClient);
    }

    public static SMS77Builder builder() {
        return new SMS77Builder();
    }
}
