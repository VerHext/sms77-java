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

import javax.ws.rs.QueryParam;

public class SMS {
    @QueryParam("to")
    private String to;
    @QueryParam("text")
    private String text;

    @QueryParam("from")
    private String from;
    @QueryParam("debug")
    private int debug;
    @QueryParam("delay")
    private java.util.Date delay;
    @QueryParam("no_reload")
    private int no_reload;
    @QueryParam("unicode")
    private int unicode;
    @QueryParam("flash")
    private int flash;
    @QueryParam("udh")
    private String udh;
    @QueryParam("utf8")
    private int utf8;
    @QueryParam("ttl")
    private int ttl;
    @QueryParam("details")
    private int details = 1;
    @QueryParam("return_msg_id")
    private int return_msg_id;
    @QueryParam("label")
    private String label;
    @QueryParam("json")
    private int json = 1;
    @QueryParam("performance_tracking")
    private int performance_tracking;
    @QueryParam("foreign_id")
    private int foreign_id;

    public SMS() {
    }

    public SMS(String to, String text, String from, int debug, java.util.Date delay, int no_reload, int unicode,
            int flash, String udh, int utf8, int ttl, int details, int return_msg_id, String label, int json,
            int performance_tracking, int foreign_id) {
        this.to = to;
        this.text = text;
        this.from = from;
        this.debug = debug;
        this.delay = delay;
        this.no_reload = no_reload;
        this.unicode = unicode;
        this.flash = flash;
        this.udh = udh;
        this.utf8 = utf8;
        this.ttl = ttl;
        this.details = details;
        this.return_msg_id = return_msg_id;
        this.label = label;
        this.json = json;
        this.performance_tracking = performance_tracking;
        this.foreign_id = foreign_id;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public boolean getDebug() {
        return this.debug == 1 ? true : false;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug ? 1 : 0;
    }

    public java.util.Date getDelay() {
        return this.delay;
    }

    public void setDelay(java.util.Date delay) {
        this.delay = delay;
    }

    public boolean getNo_reload() {
        return this.no_reload == 1 ? true : false;
    }

    public void setNo_reload(Boolean no_reload) {
        this.no_reload = no_reload ? 1 : 0;
    }

    public boolean getUnicode() {
        return this.unicode == 1 ? true : false;
    }

    public void setUnicode(Boolean unicode) {
        this.unicode = unicode ? 1 : 0;
    }

    public boolean getFlash() {
        return this.flash == 1 ? true : false;
    }

    public void setFlash(Boolean flash) {
        this.flash = flash ? 1 : 0;
    }

    public String getUdh() {
        return this.udh;
    }

    public void setUdh(String udh) {
        this.udh = udh;
    }

    public boolean getUtf8() {
        return this.utf8 == 1 ? true : false;
    }

    public void setUtf8(Boolean utf8) {
        this.utf8 = utf8 ? 1 : 0;
    }

    public int getTtl() {
        return this.ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public boolean getDetails() {
        return this.details == 1 ? true : false;
    }

    public void setDetails(Boolean details) {
        this.details = details ? 1 : 0;
    }

    public boolean getReturn_msg_id() {
        return this.return_msg_id == 1 ? true : false;
    }

    public void setReturn_msg_id(Boolean return_msg_id) {
        this.return_msg_id = return_msg_id ? 1 : 0;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean getJson() {
        return this.json == 1 ? true : false;
    }

    public void setJson(Boolean json) {
        this.json = json ? 1 : 0;
    }

    public boolean getPerformance_tracking() {
        return this.performance_tracking == 1 ? true : false;
    }

    public void setPerformance_tracking(Boolean performance_tracking) {
        this.performance_tracking = performance_tracking ? 1 : 0;
    }

    public int getForeign_id() {
        return this.foreign_id;
    }

    public void setForeign_id(int foreign_id) {
        this.foreign_id = foreign_id;
    }

    public SMS to(String to) {
        this.to = to;
        return this;
    }

    public SMS text(String text) {
        this.text = text;
        return this;
    }

    public SMS from(String from) {
        this.from = from;
        return this;
    }

    public SMS debug(Boolean debug) {
        this.debug = debug ? 1 : 0;
        return this;
    }

    public SMS delay(java.util.Date delay) {
        this.delay = delay;
        return this;
    }

    public SMS no_reload(Boolean no_reload) {
        this.no_reload = no_reload ? 1 : 0;
        return this;
    }

    public SMS unicode(Boolean unicode) {
        this.unicode = unicode ? 1 : 0;
        return this;
    }

    public SMS flash(Boolean flash) {
        this.flash = flash ? 1 : 0;
        return this;
    }

    public SMS udh(String udh) {
        this.udh = udh;
        return this;
    }

    public SMS utf8(Boolean utf8) {
        this.utf8 = utf8 ? 1 : 0;
        return this;
    }

    public SMS ttl(int ttl) {
        this.ttl = ttl;
        return this;
    }

    public SMS details(Boolean details) {
        this.details = details ? 1 : 0;
        return this;
    }

    public SMS return_msg_id(Boolean return_msg_id) {
        this.return_msg_id = return_msg_id ? 1 : 0;
        return this;
    }

    public SMS label(String label) {
        this.label = label;
        return this;
    }

    public SMS json(Boolean json) {
        this.json = json ? 1 : 0;
        return this;
    }

    public SMS performance_tracking(Boolean performance_tracking) {
        this.performance_tracking = performance_tracking ? 1 : 0;
        return this;
    }

    public SMS foreign_id(int foreign_id) {
        this.foreign_id = foreign_id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SMS)) {
            return false;
        }
        SMS sMS = (SMS) o;
        return Objects.equals(to, sMS.to) && Objects.equals(text, sMS.text) && Objects.equals(from, sMS.from)
                && debug == sMS.debug && Objects.equals(delay, sMS.delay) && no_reload == sMS.no_reload
                && unicode == sMS.unicode && flash == sMS.flash && Objects.equals(udh, sMS.udh) && utf8 == sMS.utf8
                && ttl == sMS.ttl && details == sMS.details && return_msg_id == sMS.return_msg_id
                && Objects.equals(label, sMS.label) && json == sMS.json
                && performance_tracking == sMS.performance_tracking && foreign_id == sMS.foreign_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, text, from, debug, delay, no_reload, unicode, flash, udh, utf8, ttl, details,
                return_msg_id, label, json, performance_tracking, foreign_id);
    }

    @Override
    public String toString() {
        return "{" + " to='" + getTo() + "'" + ", text='" + getText() + "'" + ", from='" + getFrom() + "'" + ", debug='"
                + getDebug() + "'" + ", delay='" + getDelay() + "'" + ", no_reload='" + getNo_reload() + "'"
                + ", unicode='" + getUnicode() + "'" + ", flash='" + getFlash() + "'" + ", udh='" + getUdh() + "'"
                + ", utf8='" + getUtf8() + "'" + ", ttl='" + getTtl() + "'" + ", details='" + getDetails() + "'"
                + ", return_msg_id='" + getReturn_msg_id() + "'" + ", label='" + getLabel() + "'" + ", json='"
                + getJson() + "'" + ", performance_tracking='" + getPerformance_tracking() + "'" + ", foreign_id='"
                + getForeign_id() + "'" + "}";
    }

}
