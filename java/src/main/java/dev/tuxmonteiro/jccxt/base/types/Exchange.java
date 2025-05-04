package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "alias",
        "api",
        "certified",
        "comment",
        "commonCurrencies",
        "countries",
        "currencies",
        "dex",
        "enableRateLimit",
        "exceptions",
        "features",
        "fees",
        "functions_ws_req",
        "handleContentTypeApplicationZip",
        "has",
        "headers",
        "hostname",
        "httpExceptions",
        "id",
        "limits",
        "markets",
        "name",
        "options",
        "paddingMode",
        "precisionMode",
        "pro",
        "quoteJsonNumbers",
        "rateLimit",
        "requiredCredentials",
        "requiresEddsa",
        "requiresWeb3",
        "status",
        "streaming",
        "timeframes",
        "timeout",
        "urls",
        "userAgent",
        "version"
})
public class Exchange implements Serializable {

    private final static long serialVersionUID = 4370324370153680134L;

    @JsonProperty("alias")
    private Boolean alias;

    @JsonProperty("api")
    private Map<String, Map<String, List<String>>> api = Map.of();

    @JsonProperty("certified")
    private Boolean certified;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("commonCurrencies")
    private Map<String, String> commonCurrencies = Map.of();

    @JsonProperty("countries")
    private List<String> countries = List.of();

    @JsonProperty("currencies")
    private Map<String, String> currencies = Map.of();

    @JsonProperty("dex")
    private Boolean dex;

    @JsonProperty("enableRateLimit")
    private Boolean enableRateLimit;

    @JsonProperty("exceptions")
    private Map<String, Map<String, Object>> exceptions = Map.of();

    @JsonProperty("features")
    private Map<String, Map<String, Object>> features = Map.of();

    @JsonProperty("fees")
    private Map<String, Map<String, Object>> fees = Map.of();

    @JsonProperty("functions_ws_req")
    private Map<String, Map<String, List<String>>> functions_ws_req = Map.of();

    @JsonProperty("handleContentTypeApplicationZip")
    private Boolean handleContentTypeApplicationZip;

    @JsonProperty("has")
    private Map<String, Object> has = Map.of();

    @JsonProperty("headers")
    private Map<String, String> headers = Map.of();

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("httpExceptions")
    private Map<String, String> httpExceptions = Map.of();

    @JsonProperty("id")
    private String id;

    @JsonProperty("limits")
    private Map<String, Map<String, Double>> limits = Map.of();

    @JsonProperty("markets")
    private Map<String, Map<String, Object>> markets = Map.of();

    @JsonProperty("name")
    private String name;

    @JsonProperty("options")
    private Map<String, Map<String, Object>> options = Map.of();

    @JsonProperty("paddingMode")
    private Integer paddingMode;

    @JsonProperty("precisionMode")
    private Integer precisionMode;

    @JsonProperty("pro")
    private Boolean pro;

    @JsonProperty("quoteJsonNumbers")
    private Boolean quoteJsonNumbers;

    @JsonProperty("rateLimit")
    private Integer rateLimit;

    @JsonProperty("requiredCredentials")
    private Map<String, Boolean> requiredCredentials = Map.of();

    @JsonProperty("requiresEddsa")
    private Boolean requiresEddsa;

    @JsonProperty("requiresWeb3")
    private Boolean requiresWeb3;

    @JsonProperty("status")
    private Map<String, String> status = Map.of();

    @JsonProperty("streaming")
    private Map<String, Object> streaming = Map.of();

    @JsonProperty("timeframes")
    private Map<String, String> timeframes = Map.of();

    @JsonProperty("timeout")
    private Integer timeout;

    @JsonProperty("urls")
    private Map<String, Object> urls = Map.of();

    @JsonProperty("userAgent")
    private String userAgent;

    @JsonProperty("version")
    private String version;

    public Boolean getAlias() {
        return alias;
    }

    public void setAlias(Boolean alias) {
        this.alias = alias;
    }

    public Map<String, Map<String, String>> getApi() {
        return api;
    }

    public void setApi(Map<String, Map<String, String>> api) {
        this.api = api;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Map<String, String> getCommonCurrencies() {
        return commonCurrencies;
    }

    public void setCommonCurrencies(Map<String, String> commonCurrencies) {
        this.commonCurrencies = commonCurrencies;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public Map<String, String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, String> currencies) {
        this.currencies = currencies;
    }

    public Boolean getDex() {
        return dex;
    }

    public void setDex(Boolean dex) {
        this.dex = dex;
    }

    public Boolean getEnableRateLimit() {
        return enableRateLimit;
    }

    public void setEnableRateLimit(Boolean enableRateLimit) {
        this.enableRateLimit = enableRateLimit;
    }

    public Map<String, Map<String, Object>> getExceptions() {
        return exceptions;
    }

    public void setExceptions(Map<String, Map<String, Object>> exceptions) {
        this.exceptions = exceptions;
    }

    public Map<String, Map<String, Object>> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Map<String, Object>> features) {
        this.features = features;
    }

    public Map<String, Map<String, Object>> getFees() {
        return fees;
    }

    public void setFees(Map<String, Map<String, Object>> fees) {
        this.fees = fees;
    }

    public Map<String, Map<String, List<String>>> getFunctions_ws_req() {
        return functions_ws_req;
    }

    public void setFunctions_ws_req(Map<String, Map<String, List<String>>> functions_ws_req) {
        this.functions_ws_req = functions_ws_req;
    }

    public Boolean getHandleContentTypeApplicationZip() {
        return handleContentTypeApplicationZip;
    }

    public void setHandleContentTypeApplicationZip(Boolean handleContentTypeApplicationZip) {
        this.handleContentTypeApplicationZip = handleContentTypeApplicationZip;
    }

    public Map<String, Object> getHas() {
        return has;
    }

    public void setHas(Map<String, Object> has) {
        this.has = has;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Map<String, String> getHttpExceptions() {
        return httpExceptions;
    }

    public void setHttpExceptions(Map<String, String> httpExceptions) {
        this.httpExceptions = httpExceptions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Map<String, Double>> getLimits() {
        return limits;
    }

    public void setLimits(Map<String, Map<String, Double>> limits) {
        this.limits = limits;
    }

    public Map<String, Map<String, Object>> getMarkets() {
        return markets;
    }

    public void setMarkets(Map<String, Map<String, Object>> markets) {
        this.markets = markets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Map<String, Object>> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Map<String, Object>> options) {
        this.options = options;
    }

    public Integer getPaddingMode() {
        return paddingMode;
    }

    public void setPaddingMode(Integer paddingMode) {
        this.paddingMode = paddingMode;
    }

    public Integer getPrecisionMode() {
        return precisionMode;
    }

    public void setPrecisionMode(Integer precisionMode) {
        this.precisionMode = precisionMode;
    }

    public Boolean getPro() {
        return pro;
    }

    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    public Boolean getQuoteJsonNumbers() {
        return quoteJsonNumbers;
    }

    public void setQuoteJsonNumbers(Boolean quoteJsonNumbers) {
        this.quoteJsonNumbers = quoteJsonNumbers;
    }

    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public Map<String, Boolean> getRequiredCredentials() {
        return requiredCredentials;
    }

    public void setRequiredCredentials(Map<String, Boolean> requiredCredentials) {
        this.requiredCredentials = requiredCredentials;
    }

    public Boolean getRequiresEddsa() {
        return requiresEddsa;
    }

    public void setRequiresEddsa(Boolean requiresEddsa) {
        this.requiresEddsa = requiresEddsa;
    }

    public Boolean getRequiresWeb3() {
        return requiresWeb3;
    }

    public void setRequiresWeb3(Boolean requiresWeb3) {
        this.requiresWeb3 = requiresWeb3;
    }

    public Map<String, String> getStatus() {
        return status;
    }

    public void setStatus(Map<String, String> status) {
        this.status = status;
    }

    public Map<String, Object> getStreaming() {
        return streaming;
    }

    public void setStreaming(Map<String, Object> streaming) {
        this.streaming = streaming;
    }

    public Map<String, String> getTimeframes() {
        return timeframes;
    }

    public void setTimeframes(Map<String, String> timeframes) {
        this.timeframes = timeframes;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Map<String, Object> getUrls() {
        return urls;
    }

    public void setUrls(Map<String, Object> urls) {
        this.urls = urls;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Exchange other = (Exchange) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (version == null) {
            if (other.version != null)
                return false;
        } else if (!version.equals(other.version))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Exchange [alias=" + alias + ", comment=" + comment + ", countries=" + countries + ", hostname="
                + hostname + ", id=" + id + ", name=" + name + ", pro=" + pro + ", requiresEddsa=" + requiresEddsa
                + ", requiresWeb3=" + requiresWeb3 + ", version=" + version + "]";
    }

}





