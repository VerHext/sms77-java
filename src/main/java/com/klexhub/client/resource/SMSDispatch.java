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

package com.klexhub.client.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.klexhub.client.resource.model.SMS;
import com.klexhub.client.resource.model.SMSResponse;

import org.jboss.resteasy.annotations.Form;

@Path("/sms")
@Consumes(MediaType.APPLICATION_JSON)
public interface SMSDispatch {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    SMSResponse create(@Form SMS dispatchSMS);

}
