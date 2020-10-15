package com.klexhub.client.resource.model;

import java.util.List;
import java.util.Objects;

public class PriceResponse {
    private int countCountries;
    private int countNetworks;
    private List<Country> countries;

    public PriceResponse() {
    }

    public PriceResponse(int countCountries, int countNetworks, List<Country> countries) {
        this.countCountries = countCountries;
        this.countNetworks = countNetworks;
        this.countries = countries;
    }

    public int getCountCountries() {
        return this.countCountries;
    }

    public void setCountCountries(int countCountries) {
        this.countCountries = countCountries;
    }

    public int getCountNetworks() {
        return this.countNetworks;
    }

    public void setCountNetworks(int countNetworks) {
        this.countNetworks = countNetworks;
    }

    public List<Country> getCountries() {
        return this.countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public PriceResponse countCountries(int countCountries) {
        this.countCountries = countCountries;
        return this;
    }

    public PriceResponse countNetworks(int countNetworks) {
        this.countNetworks = countNetworks;
        return this;
    }

    public PriceResponse countries(List<Country> countries) {
        this.countries = countries;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PriceResponse)) {
            return false;
        }
        PriceResponse priceResponse = (PriceResponse) o;
        return countCountries == priceResponse.countCountries && countNetworks == priceResponse.countNetworks
                && Objects.equals(countries, priceResponse.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countCountries, countNetworks, countries);
    }

    @Override
    public String toString() {
        return "{" + " countCountries='" + getCountCountries() + "'" + ", countNetworks='" + getCountNetworks() + "'"
                + ", countries='" + getCountries() + "'" + "}";
    }

}
