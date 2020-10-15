package com.klexhub.client.resource.model;

import java.util.List;
import java.util.Objects;

public class Network {
    private String mcc;
    private List<String> mncs;
    private String networkName;
    private double price;
    private List<String> features;
    private String comment;

    public Network() {
    }

    public Network(String mcc, List<String> mncs, String networkName, double price, List<String> features,
            String comment) {
        this.mcc = mcc;
        this.mncs = mncs;
        this.networkName = networkName;
        this.price = price;
        this.features = features;
        this.comment = comment;
    }

    public String getMcc() {
        return this.mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public List<String> getMncs() {
        return this.mncs;
    }

    public void setMncs(List<String> mncs) {
        this.mncs = mncs;
    }

    public String getNetworkName() {
        return this.networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Network mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    public Network mncs(List<String> mncs) {
        this.mncs = mncs;
        return this;
    }

    public Network networkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    public Network price(double price) {
        this.price = price;
        return this;
    }

    public Network features(List<String> features) {
        this.features = features;
        return this;
    }

    public Network comment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Network)) {
            return false;
        }
        Network network = (Network) o;
        return Objects.equals(mcc, network.mcc) && Objects.equals(mncs, network.mncs)
                && Objects.equals(networkName, network.networkName) && price == network.price
                && Objects.equals(features, network.features) && Objects.equals(comment, network.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcc, mncs, networkName, price, features, comment);
    }

    @Override
    public String toString() {
        return "{" + " mcc='" + getMcc() + "'" + ", mncs='" + getMncs() + "'" + ", networkName='" + getNetworkName()
                + "'" + ", price='" + getPrice() + "'" + ", features='" + getFeatures() + "'" + ", comment='"
                + getComment() + "'" + "}";
    }
}
