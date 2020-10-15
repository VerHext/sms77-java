package com.klexhub.client.resource.model;

import java.util.Objects;

public class CurrentCarrier {

    private String network_code;
    private String name;
    private String country;
    private String network_type;

    public CurrentCarrier() {
    }

    public CurrentCarrier(String network_code, String name, String country, String network_type) {
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

    public CurrentCarrier network_code(String network_code) {
        this.network_code = network_code;
        return this;
    }

    public CurrentCarrier name(String name) {
        this.name = name;
        return this;
    }

    public CurrentCarrier country(String country) {
        this.country = country;
        return this;
    }

    public CurrentCarrier network_type(String network_type) {
        this.network_type = network_type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CurrentCarrier)) {
            return false;
        }
        CurrentCarrier currentCarrier = (CurrentCarrier) o;
        return Objects.equals(network_code, currentCarrier.network_code) && Objects.equals(name, currentCarrier.name)
                && Objects.equals(country, currentCarrier.country)
                && Objects.equals(network_type, currentCarrier.network_type);
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
