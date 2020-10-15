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

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.HttpHeaders;

public class BasicAuthFilter implements ClientRequestFilter {
    private final String apiToken;

    public BasicAuthFilter(String apitoken) {
        this.apiToken = apitoken;
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        String authHeader = "basic " + this.apiToken;
        requestContext.getHeaders().add(HttpHeaders.AUTHORIZATION, authHeader);
    }
}
