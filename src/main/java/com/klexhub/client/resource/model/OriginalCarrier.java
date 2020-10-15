package com.klexhub.client.resource.model;

import java.util.Objects;

public class OriginalCarrier {
    private String network_code;
    private String name;
    private String country;
    private String network_type;

    public OriginalCarrier() {
    }

    public OriginalCarrier(String network_code, String name, String country, String network_type) {
        this.network_code = network_code;
        this.name = name;
        this.country = country;
        this.network_type = network_type;
    }

    public String getNetwork_code() {
        return this.network_code;
    }

    public void setNetwork_code(String network_code) {
        this.network_code = network_code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNetwork_type() {
        return this.network_type;
    }

    public void setNetwork_type(String network_type) {
        this.network_type = network_type;
    }

    public OriginalCarrier network_code(String network_code) {
        this.network_code = network_code;
        return this;
    }

    public OriginalCarrier name(String name) {
        this.name = name;
        return this;
    }

    public OriginalCarrier country(String country) {
        this.country = country;
        return this;
    }

    public OriginalCarrier network_type(String network_type) {
        this.network_type = network_type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OriginalCarrier)) {
            return false;
        }
        OriginalCarrier originalCarrier = (OriginalCarrier) o;
        return Objects.equals(network_code, originalCarrier.network_code) && Objects.equals(name, originalCarrier.name)
                && Objects.equals(country, originalCarrier.country)
                && Objects.equals(network_type, originalCarrier.network_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network_code, name, country, network_type);
    }

    @Override
    public String toString() {
        return "{" + " network_code='" + getNetwork_code() + "'" + ", name='" + getName() + "'" + ", country='"
                + getCountry() + "'" + ", network_type='" + getNetwork_type() + "'" + "}";
    }
}
