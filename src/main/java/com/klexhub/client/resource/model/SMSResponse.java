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

package com.klexhub.client.resource.model;

import java.util.Objects;

public class SMSResponse {
    private String success;
    private double total_price;
    private double balance;
    private String debug;
    private String sms_type;
    private SMSMessage[] messages;

    public SMSResponse() {
    }

    public SMSResponse(String success, double total_price, double balance, String debug, String sms_type,
            SMSMessage[] messages) {
        this.success = success;
        this.total_price = total_price;
        this.balance = balance;
        this.debug = debug;
        this.sms_type = sms_type;
        this.messages = messages;
    }

    public String getSuccess() {
        return this.success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public double getTotal_price() {
        return this.total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDebug() {
        return this.debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getSms_type() {
        return this.sms_type;
    }

    public void setSms_type(String sms_type) {
        this.sms_type = sms_type;
    }

    public SMSMessage[] getMessages() {
        return this.messages;
    }

    public void setMessages(SMSMessage[] messages) {
        this.messages = messages;
    }

    public SMSResponse success(String success) {
        this.success = success;
        return this;
    }

    public SMSResponse total_price(double total_price) {
        this.total_price = total_price;
        return this;
    }

    public SMSResponse balance(double balance) {
        this.balance = balance;
        return this;
    }

    public SMSResponse debug(String debug) {
        this.debug = debug;
        return this;
    }

    public SMSResponse sms_type(String sms_type) {
        this.sms_type = sms_type;
        return this;
    }

    public SMSResponse messages(SMSMessage[] messages) {
        this.messages = messages;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SMSResponse)) {
            return false;
        }
        SMSResponse sMSResponse = (SMSResponse) o;
        return Objects.equals(success, sMSResponse.success) && total_price == sMSResponse.total_price
                && balance == sMSResponse.balance && Objects.equals(debug, sMSResponse.debug)
                && Objects.equals(sms_type, sMSResponse.sms_type) && Objects.equals(messages, sMSResponse.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, total_price, balance, debug, sms_type, messages);
    }

    @Override
    public String toString() {
        return "{" + " success='" + getSuccess() + "'" + ", total_price='" + getTotal_price() + "'" + ", balance='"
                + getBalance() + "'" + ", debug='" + getDebug() + "'" + ", sms_type='" + getSms_type() + "'"
                + ", messages='" + getMessages() + "'" + "}";
    }

}
