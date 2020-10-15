package com.klexhub.client.resource.model;

import java.util.Objects;

public class CnamLookupResponse {
    private String success;
    private String code;
    private String number;
    private String name;

    public CnamLookupResponse() {
    }

    public CnamLookupResponse(String success, String code, String number, String name) {
        this.success = success;
        this.code = code;
        this.number = number;
        this.name = name;
    }

    public String getSuccess() {
        return this.success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CnamLookupResponse success(String success) {
        this.success = success;
        return this;
    }

    public CnamLookupResponse code(String code) {
        this.code = code;
        return this;
    }

    public CnamLookupResponse number(String number) {
        this.number = number;
        return this;
    }

    public CnamLookupResponse name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CnamLookupResponse)) {
            return false;
        }
        CnamLookupResponse cnameLookupResponse = (CnamLookupResponse) o;
        return Objects.equals(success, cnameLookupResponse.success) && Objects.equals(code, cnameLookupResponse.code)
                && Objects.equals(number, cnameLookupResponse.number) && Objects.equals(name, cnameLookupResponse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, code, number, name);
    }

    @Override
    public String toString() {
        return "{" + " success='" + getSuccess() + "'" + ", code='" + getCode() + "'" + ", number='" + getNumber() + "'"
                + ", name='" + getName() + "'" + "}";
    }

}
