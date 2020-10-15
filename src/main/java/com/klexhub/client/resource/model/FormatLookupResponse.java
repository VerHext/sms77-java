package com.klexhub.client.resource.model;

import java.util.Objects;

public class FormatLookupResponse {

    private boolean success;
    private String national;
    private String international;
    private String international_formatted;
    private String country_name;
    private String country_code;
    private String country_iso;
    private String carrier;
    private String network_type;

    public FormatLookupResponse() {
    }

    public FormatLookupResponse(boolean success, String national, String international, String international_formatted,
            String country_name, String country_code, String country_iso, String carrier, String network_type) {
        this.success = success;
        this.national = national;
        this.international = international;
        this.international_formatted = international_formatted;
        this.country_name = country_name;
        this.country_code = country_code;
        this.country_iso = country_iso;
        this.carrier = carrier;
        this.network_type = network_type;
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

    public String getNational() {
        return this.national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getInternational() {
        return this.international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    public String getInternational_formatted() {
        return this.international_formatted;
    }

    public void setInternational_formatted(String international_formatted) {
        this.international_formatted = international_formatted;
    }

    public String getCountry_name() {
        return this.country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_code() {
        return this.country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_iso() {
        return this.country_iso;
    }

    public void setCountry_iso(String country_iso) {
        this.country_iso = country_iso;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getNetwork_type() {
        return this.network_type;
    }

    public void setNetwork_type(String network_type) {
        this.network_type = network_type;
    }

    public FormatLookupResponse success(boolean success) {
        this.success = success;
        return this;
    }

    public FormatLookupResponse national(String national) {
        this.national = national;
        return this;
    }

    public FormatLookupResponse international(String international) {
        this.international = international;
        return this;
    }

    public FormatLookupResponse international_formatted(String international_formatted) {
        this.international_formatted = international_formatted;
        return this;
    }

    public FormatLookupResponse country_name(String country_name) {
        this.country_name = country_name;
        return this;
    }

    public FormatLookupResponse country_code(String country_code) {
        this.country_code = country_code;
        return this;
    }

    public FormatLookupResponse country_iso(String country_iso) {
        this.country_iso = country_iso;
        return this;
    }

    public FormatLookupResponse carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public FormatLookupResponse network_type(String network_type) {
        this.network_type = network_type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FormatLookupResponse)) {
            return false;
        }
        FormatLookupResponse formatLookupResponse = (FormatLookupResponse) o;
        return success == formatLookupResponse.success && Objects.equals(national, formatLookupResponse.national)
                && Objects.equals(international, formatLookupResponse.international)
                && Objects.equals(international_formatted, formatLookupResponse.international_formatted)
                && Objects.equals(country_name, formatLookupResponse.country_name)
                && Objects.equals(country_code, formatLookupResponse.country_code)
                && Objects.equals(country_iso, formatLookupResponse.country_iso)
                && Objects.equals(carrier, formatLookupResponse.carrier)
                && Objects.equals(network_type, formatLookupResponse.network_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, national, international, international_formatted, country_name, country_code,
                country_iso, carrier, network_type);
    }

    @Override
    public String toString() {
        return "{" + " success='" + isSuccess() + "'" + ", national='" + getNational() + "'" + ", international='"
                + getInternational() + "'" + ", international_formatted='" + getInternational_formatted() + "'"
                + ", country_name='" + getCountry_name() + "'" + ", country_code='" + getCountry_code() + "'"
                + ", country_iso='" + getCountry_iso() + "'" + ", carrier='" + getCarrier() + "'" + ", network_type='"
                + getNetwork_type() + "'" + "}";
    }

}
