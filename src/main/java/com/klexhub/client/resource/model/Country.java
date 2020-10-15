package com.klexhub.client.resource.model;

import java.util.List;
import java.util.Objects;

public class Country {
    private String countryCode;
    private String countryName;
    private String countryPrefix;
    private List<Network> networks;

    public Country() {
    }

    public Country(String countryCode, String countryName, String countryPrefix, List<Network> networks) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryPrefix = countryPrefix;
        this.networks = networks;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryPrefix() {
        return this.countryPrefix;
    }

    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    public List<Network> getNetworks() {
        return this.networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public Country countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Country countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public Country countryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
        return this;
    }

    public Country networks(List<Network> networks) {
        this.networks = networks;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Country)) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(countryCode, country.countryCode) && Objects.equals(countryName, country.countryName)
                && Objects.equals(countryPrefix, country.countryPrefix) && Objects.equals(networks, country.networks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, countryName, countryPrefix, networks);
    }

    @Override
    public String toString() {
        return "{" + " countryCode='" + getCountryCode() + "'" + ", countryName='" + getCountryName() + "'"
                + ", countryPrefix='" + getCountryPrefix() + "'" + ", networks='" + getNetworks() + "'" + "}";
    }
}
