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

public class SMSMessage {
    private String id;
    private String sender;
    private String recipient;
    private String text;
    private String encoding;
    private int parts;
    private double price;
    private boolean success;
    private int error;
    private String error_text;

    public SMSMessage() {
    }

    public SMSMessage(String id, String sender, String recipient, String text, String encoding, int parts, double price,
            boolean success, int error, String error_text) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.encoding = encoding;
        this.parts = parts;
        this.price = price;
        this.success = success;
        this.error = error;
        this.error_text = error_text;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public int getParts() {
        return this.parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getError() {
        return this.error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getError_text() {
        return this.error_text;
    }

    public void setError_text(String error_text) {
        this.error_text = error_text;
    }

    public SMSMessage id(String id) {
        this.id = id;
        return this;
    }

    public SMSMessage sender(String sender) {
        this.sender = sender;
        return this;
    }

    public SMSMessage recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public SMSMessage text(String text) {
        this.text = text;
        return this;
    }

    public SMSMessage encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public SMSMessage parts(int parts) {
        this.parts = parts;
        return this;
    }

    public SMSMessage price(double price) {
        this.price = price;
        return this;
    }

    public SMSMessage success(boolean success) {
        this.success = success;
        return this;
    }

    public SMSMessage error(int error) {
        this.error = error;
        return this;
    }

    public SMSMessage error_text(String error_text) {
        this.error_text = error_text;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SMSMessage)) {
            return false;
        }
        SMSMessage sMSMessage = (SMSMessage) o;
        return Objects.equals(id, sMSMessage.id) && Objects.equals(sender, sMSMessage.sender)
                && Objects.equals(recipient, sMSMessage.recipient) && Objects.equals(text, sMSMessage.text)
                && Objects.equals(encoding, sMSMessage.encoding) && parts == sMSMessage.parts
                && price == sMSMessage.price && success == sMSMessage.success && error == sMSMessage.error
                && Objects.equals(error_text, sMSMessage.error_text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sender, recipient, text, encoding, parts, price, success, error, error_text);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", sender='" + getSender() + "'" + ", recipient='" + getRecipient() + "'"
                + ", text='" + getText() + "'" + ", encoding='" + getEncoding() + "'" + ", parts='" + getParts() + "'"
                + ", price='" + getPrice() + "'" + ", success='" + isSuccess() + "'" + ", error='" + getError() + "'"
                + ", error_text='" + getError_text() + "'" + "}";
    }
}
