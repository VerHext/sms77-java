package com.klexhub.client.resource.model;

import java.util.Objects;

public class HlrLookupResponse {
    private String status_message;
    private boolean status;
    private boolean lookup_outcome;
    private String lookup_outcome_message;
    private String international_format_number;
    private String international_formatted;
    private String national_format_number;
    private String country_code;
    private String country_code_iso3;
    private String country_name;
    private String country_prefix;
    private CurrentCarrier current_carrier;
    private OriginalCarrier original_carrier;
    private String valid_number;
    private String reachable;
    private String ported;
    private String roaming;
    private String gsm_code;
    private String gsm_message;

    public HlrLookupResponse() {
    }

    public HlrLookupResponse(String status_message, boolean status, boolean lookup_outcome,
            String lookup_outcome_message, String international_format_number, String international_formatted,
            String national_format_number, String country_code, String country_code_iso3, String country_name,
            String country_prefix, CurrentCarrier current_carrier, OriginalCarrier original_carrier,
            String valid_number, String reachable, String ported, String roaming, String gsm_code, String gsm_message) {
        this.status_message = status_message;
        this.status = status;
        this.lookup_outcome = lookup_outcome;
        this.lookup_outcome_message = lookup_outcome_message;
        this.international_format_number = international_format_number;
        this.international_formatted = international_formatted;
        this.national_format_number = national_format_number;
        this.country_code = country_code;
        this.country_code_iso3 = country_code_iso3;
        this.country_name = country_name;
        this.country_prefix = country_prefix;
        this.current_carrier = current_carrier;
        this.original_carrier = original_carrier;
        this.valid_number = valid_number;
        this.reachable = reachable;
        this.ported = ported;
        this.roaming = roaming;
        this.gsm_code = gsm_code;
        this.gsm_message = gsm_message;
    }

    public String getStatus_message() {
        return this.status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isLookup_outcome() {
        return this.lookup_outcome;
    }

    public boolean getLookup_outcome() {
        return this.lookup_outcome;
    }

    public void setLookup_outcome(boolean lookup_outcome) {
        this.lookup_outcome = lookup_outcome;
    }

    public String getLookup_outcome_message() {
        return this.lookup_outcome_message;
    }

    public void setLookup_outcome_message(String lookup_outcome_message) {
        this.lookup_outcome_message = lookup_outcome_message;
    }

    public String getInternational_format_number() {
        return this.international_format_number;
    }

    public void setInternational_format_number(String international_format_number) {
        this.international_format_number = international_format_number;
    }

    public String getInternational_formatted() {
        return this.international_formatted;
    }

    public void setInternational_formatted(String international_formatted) {
        this.international_formatted = international_formatted;
    }

    public String getNational_format_number() {
        return this.national_format_number;
    }

    public void setNational_format_number(String national_format_number) {
        this.national_format_number = national_format_number;
    }

    public String getCountry_code() {
        return this.country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_code_iso3() {
        return this.country_code_iso3;
    }

    public void setCountry_code_iso3(String country_code_iso3) {
        this.country_code_iso3 = country_code_iso3;
    }

    public String getCountry_name() {
        return this.country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountry_prefix() {
        return this.country_prefix;
    }

    public void setCountry_prefix(String country_prefix) {
        this.country_prefix = country_prefix;
    }

    public CurrentCarrier getCurrent_carrier() {
        return this.current_carrier;
    }

    public void setCurrent_carrier(CurrentCarrier current_carrier) {
        this.current_carrier = current_carrier;
    }

    public OriginalCarrier getOriginal_carrier() {
        return this.original_carrier;
    }

    public void setOriginal_carrier(OriginalCarrier original_carrier) {
        this.original_carrier = original_carrier;
    }

    public String getValid_number() {
        return this.valid_number;
    }

    public void setValid_number(String valid_number) {
        this.valid_number = valid_number;
    }

    public String getReachable() {
        return this.reachable;
    }

    public void setReachable(String reachable) {
        this.reachable = reachable;
    }

    public String getPorted() {
        return this.ported;
    }

    public void setPorted(String ported) {
        this.ported = ported;
    }

    public String getRoaming() {
        return this.roaming;
    }

    public void setRoaming(String roaming) {
        this.roaming = roaming;
    }

    public String getGsm_code() {
        return this.gsm_code;
    }

    public void setGsm_code(String gsm_code) {
        this.gsm_code = gsm_code;
    }

    public String getGsm_message() {
        return this.gsm_message;
    }

    public void setGsm_message(String gsm_message) {
        this.gsm_message = gsm_message;
    }

    public HlrLookupResponse status_message(String status_message) {
        this.status_message = status_message;
        return this;
    }

    public HlrLookupResponse status(boolean status) {
        this.status = status;
        return this;
    }

    public HlrLookupResponse lookup_outcome(boolean lookup_outcome) {
        this.lookup_outcome = lookup_outcome;
        return this;
    }

    public HlrLookupResponse lookup_outcome_message(String lookup_outcome_message) {
        this.lookup_outcome_message = lookup_outcome_message;
        return this;
    }

    public HlrLookupResponse international_format_number(String international_format_number) {
        this.international_format_number = international_format_number;
        return this;
    }

    public HlrLookupResponse international_formatted(String international_formatted) {
        this.international_formatted = international_formatted;
        return this;
    }

    public HlrLookupResponse national_format_number(String national_format_number) {
        this.national_format_number = national_format_number;
        return this;
    }

    public HlrLookupResponse country_code(String country_code) {
        this.country_code = country_code;
        return this;
    }

    public HlrLookupResponse country_code_iso3(String country_code_iso3) {
        this.country_code_iso3 = country_code_iso3;
        return this;
    }

    public HlrLookupResponse country_name(String country_name) {
        this.country_name = country_name;
        return this;
    }

    public HlrLookupResponse country_prefix(String country_prefix) {
        this.country_prefix = country_prefix;
        return this;
    }

    public HlrLookupResponse current_carrier(CurrentCarrier current_carrier) {
        this.current_carrier = current_carrier;
        return this;
    }

    public HlrLookupResponse original_carrier(OriginalCarrier original_carrier) {
        this.original_carrier = original_carrier;
        return this;
    }

    public HlrLookupResponse valid_number(String valid_number) {
        this.valid_number = valid_number;
        return this;
    }

    public HlrLookupResponse reachable(String reachable) {
        this.reachable = reachable;
        return this;
    }

    public HlrLookupResponse ported(String ported) {
        this.ported = ported;
        return this;
    }

    public HlrLookupResponse roaming(String roaming) {
        this.roaming = roaming;
        return this;
    }

    public HlrLookupResponse gsm_code(String gsm_code) {
        this.gsm_code = gsm_code;
        return this;
    }

    public HlrLookupResponse gsm_message(String gsm_message) {
        this.gsm_message = gsm_message;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HlrLookupResponse)) {
            return false;
        }
        HlrLookupResponse hlrLookupResponse = (HlrLookupResponse) o;
        return Objects.equals(status_message, hlrLookupResponse.status_message) && status == hlrLookupResponse.status
                && lookup_outcome == hlrLookupResponse.lookup_outcome
                && Objects.equals(lookup_outcome_message, hlrLookupResponse.lookup_outcome_message)
                && Objects.equals(international_format_number, hlrLookupResponse.international_format_number)
                && Objects.equals(international_formatted, hlrLookupResponse.international_formatted)
                && Objects.equals(national_format_number, hlrLookupResponse.national_format_number)
                && Objects.equals(country_code, hlrLookupResponse.country_code)
                && Objects.equals(country_code_iso3, hlrLookupResponse.country_code_iso3)
                && Objects.equals(country_name, hlrLookupResponse.country_name)
                && Objects.equals(country_prefix, hlrLookupResponse.country_prefix)
                && Objects.equals(current_carrier, hlrLookupResponse.current_carrier)
                && Objects.equals(original_carrier, hlrLookupResponse.original_carrier)
                && Objects.equals(valid_number, hlrLookupResponse.valid_number)
                && Objects.equals(reachable, hlrLookupResponse.reachable)
                && Objects.equals(ported, hlrLookupResponse.ported)
                && Objects.equals(roaming, hlrLookupResponse.roaming)
                && Objects.equals(gsm_code, hlrLookupResponse.gsm_code)
                && Objects.equals(gsm_message, hlrLookupResponse.gsm_message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status_message, status, lookup_outcome, lookup_outcome_message, international_format_number,
                international_formatted, national_format_number, country_code, country_code_iso3, country_name,
                country_prefix, current_carrier, original_carrier, valid_number, reachable, ported, roaming, gsm_code,
                gsm_message);
    }

    @Override
    public String toString() {
        return "{" + " status_message='" + getStatus_message() + "'" + ", status='" + isStatus() + "'"
                + ", lookup_outcome='" + isLookup_outcome() + "'" + ", lookup_outcome_message='"
                + getLookup_outcome_message() + "'" + ", international_format_number='"
                + getInternational_format_number() + "'" + ", international_formatted='" + getInternational_formatted()
                + "'" + ", national_format_number='" + getNational_format_number() + "'" + ", country_code='"
                + getCountry_code() + "'" + ", country_code_iso3='" + getCountry_code_iso3() + "'" + ", country_name='"
                + getCountry_name() + "'" + ", country_prefix='" + getCountry_prefix() + "'" + ", current_carrier='"
                + getCurrent_carrier() + "'" + ", original_carrier='" + getOriginal_carrier() + "'" + ", valid_number='"
                + getValid_number() + "'" + ", reachable='" + getReachable() + "'" + ", ported='" + getPorted() + "'"
                + ", roaming='" + getRoaming() + "'" + ", gsm_code='" + getGsm_code() + "'" + ", gsm_message='"
                + getGsm_message() + "'" + "}";
    }

}
