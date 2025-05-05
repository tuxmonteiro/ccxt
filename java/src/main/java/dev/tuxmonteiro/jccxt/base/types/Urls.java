package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "api",
        "api_management",
        "doc",
        "fees",
        "logo",
        "referral",
        "test",
        "www",
        "ws"
})
public class Urls implements Serializable {

    private final static long serialVersionUID = 8028943728331626976L;

    @JsonProperty("api")
    private Api api;
    @JsonProperty("api_management")
    private String apiManagement;
    @JsonProperty("doc")
    private Object doc;
    @JsonProperty("fees")
    private Object fees;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("referral")
    private Object referral;
    @JsonProperty("test")
    private Object test;
    @JsonProperty("www")
    private String www;
    @JsonProperty("ws")
    private Object ws;

    @JsonProperty("api")
    public Optional<Api> getApi() {
        return Optional.ofNullable(api);
    }

    @JsonProperty("api")
    public void setApi(Api api) {
        this.api = api;
    }

    @JsonProperty("api_management")
    public Optional<String> getApiManagement() {
        return Optional.ofNullable(apiManagement);
    }

    @JsonProperty("api_management")
    public void setApiManagement(String apiManagement) {
        this.apiManagement = apiManagement;
    }

    @JsonProperty("doc")
    public Optional<Object> getDoc() {
        return Optional.ofNullable(doc);
    }

    @JsonProperty("doc")
    public void setDoc(Object doc) {
        this.doc = doc;
    }

    @JsonProperty("fees")
    public Optional<Object> getFees() {
        return Optional.ofNullable(fees);
    }

    @JsonProperty("fees")
    public void setFees(Object fees) {
        this.fees = fees;
    }

    @JsonProperty("logo")
    public Optional<String> getLogo() {
        return Optional.ofNullable(logo);
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("referral")
    public Optional<Object> getReferral() {
        return Optional.ofNullable(referral);
    }

    @JsonProperty("referral")
    public void setReferral(Object referral) {
        this.referral = referral;
    }

    @JsonProperty("test")
    public Optional<Object> getTest() {
        return Optional.ofNullable(test);
    }

    @JsonProperty("test")
    public void setTest(Object test) {
        this.test = test;
    }

    @JsonProperty("www")
    public Optional<String> getWww() {
        return Optional.ofNullable(www);
    }

    @JsonProperty("www")
    public void setWww(String www) {
        this.www = www;
    }

    @JsonProperty("ws")
    public Optional<Object> getWs() {
        return Optional.ofNullable(ws);
    }

    @JsonProperty("ws")
    public void setWs(Object ws) {
        this.ws = ws;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Urls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("api");
        sb.append('=');
        sb.append(((this.api == null) ? "<null>" : this.api));
        sb.append(',');
        sb.append("apiManagement");
        sb.append('=');
        sb.append(((this.apiManagement == null) ? "<null>" : this.apiManagement));
        sb.append(',');
        sb.append("doc");
        sb.append('=');
        sb.append(((this.doc == null) ? "<null>" : this.doc));
        sb.append(',');
        sb.append("fees");
        sb.append('=');
        sb.append(((this.fees == null) ? "<null>" : this.fees));
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null) ? "<null>" : this.logo));
        sb.append(',');
        sb.append("referral");
        sb.append('=');
        sb.append(((this.referral == null) ? "<null>" : this.referral));
        sb.append(',');
        sb.append("test");
        sb.append('=');
        sb.append(((this.test == null) ? "<null>" : this.test));
        sb.append(',');
        sb.append("www");
        sb.append('=');
        sb.append(((this.www == null) ? "<null>" : this.www));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.fees == null) ? 0 : this.fees.hashCode()));
        result = ((result * 31) + ((this.referral == null) ? 0 : this.referral.hashCode()));
        result = ((result * 31) + ((this.test == null) ? 0 : this.test.hashCode()));
        result = ((result * 31) + ((this.www == null) ? 0 : this.www.hashCode()));
        result = ((result * 31) + ((this.doc == null) ? 0 : this.doc.hashCode()));
        result = ((result * 31) + ((this.logo == null) ? 0 : this.logo.hashCode()));
        result = ((result * 31) + ((this.api == null) ? 0 : this.api.hashCode()));
        result = ((result * 31) + ((this.apiManagement == null) ? 0 : this.apiManagement.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urls) == false) {
            return false;
        }
        Urls rhs = ((Urls) other);
        return (((((((((this.fees == rhs.fees) || ((this.fees != null) && this.fees.equals(rhs.fees)))
                && ((this.referral == rhs.referral) || ((this.referral != null) && this.referral.equals(rhs.referral))))
                && ((this.test == rhs.test) || ((this.test != null) && this.test.equals(rhs.test))))
                && ((this.www == rhs.www) || ((this.www != null) && this.www.equals(rhs.www))))
                && ((this.doc == rhs.doc) || ((this.doc != null) && this.doc.equals(rhs.doc))))
                && ((this.logo == rhs.logo) || ((this.logo != null) && this.logo.equals(rhs.logo))))
                && ((this.api == rhs.api) || ((this.api != null) && this.api.equals(rhs.api))))
                && ((this.apiManagement == rhs.apiManagement)
                        || ((this.apiManagement != null) && this.apiManagement.equals(rhs.apiManagement))));
    }

}
