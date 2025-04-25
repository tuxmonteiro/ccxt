package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseVolume",
    "datetime",
    "info",
    "openInterestAmount",
    "openInterestValue",
    "quoteVolume",
    "symbol",
    "timestamp"
})
public class OpenInterest implements Serializable
{

    @JsonProperty("baseVolume")
    private Double baseVolume;
    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("openInterestAmount")
    private Double openInterestAmount;
    @JsonProperty("openInterestValue")
    private Double openInterestValue;
    @JsonProperty("quoteVolume")
    private Double quoteVolume;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = 6797950571539258429L;

    @JsonProperty("baseVolume")
    public Optional<Double> getBaseVolume() {
        return Optional.ofNullable(baseVolume);
    }

    @JsonProperty("baseVolume")
    public void setBaseVolume(Double baseVolume) {
        this.baseVolume = baseVolume;
    }

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    public Object getInfo() {
        return info;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    public void setInfo(Object info) {
        this.info = info;
    }

    @JsonProperty("openInterestAmount")
    public Optional<Double> getOpenInterestAmount() {
        return Optional.ofNullable(openInterestAmount);
    }

    @JsonProperty("openInterestAmount")
    public void setOpenInterestAmount(Double openInterestAmount) {
        this.openInterestAmount = openInterestAmount;
    }

    @JsonProperty("openInterestValue")
    public Optional<Double> getOpenInterestValue() {
        return Optional.ofNullable(openInterestValue);
    }

    @JsonProperty("openInterestValue")
    public void setOpenInterestValue(Double openInterestValue) {
        this.openInterestValue = openInterestValue;
    }

    @JsonProperty("quoteVolume")
    public Optional<Double> getQuoteVolume() {
        return Optional.ofNullable(quoteVolume);
    }

    @JsonProperty("quoteVolume")
    public void setQuoteVolume(Double quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
        return Optional.ofNullable(timestamp);
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenInterest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseVolume");
        sb.append('=');
        sb.append(((this.baseVolume == null)?"<null>":this.baseVolume));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("openInterestAmount");
        sb.append('=');
        sb.append(((this.openInterestAmount == null)?"<null>":this.openInterestAmount));
        sb.append(',');
        sb.append("openInterestValue");
        sb.append('=');
        sb.append(((this.openInterestValue == null)?"<null>":this.openInterestValue));
        sb.append(',');
        sb.append("quoteVolume");
        sb.append('=');
        sb.append(((this.quoteVolume == null)?"<null>":this.quoteVolume));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.openInterestAmount == null)? 0 :this.openInterestAmount.hashCode()));
        result = ((result* 31)+((this.openInterestValue == null)? 0 :this.openInterestValue.hashCode()));
        result = ((result* 31)+((this.quoteVolume == null)? 0 :this.quoteVolume.hashCode()));
        result = ((result* 31)+((this.baseVolume == null)? 0 :this.baseVolume.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenInterest) == false) {
            return false;
        }
        OpenInterest rhs = ((OpenInterest) other);
        return (((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.openInterestAmount == rhs.openInterestAmount)||((this.openInterestAmount!= null)&&this.openInterestAmount.equals(rhs.openInterestAmount))))&&((this.openInterestValue == rhs.openInterestValue)||((this.openInterestValue!= null)&&this.openInterestValue.equals(rhs.openInterestValue))))&&((this.quoteVolume == rhs.quoteVolume)||((this.quoteVolume!= null)&&this.quoteVolume.equals(rhs.quoteVolume))))&&((this.baseVolume == rhs.baseVolume)||((this.baseVolume!= null)&&this.baseVolume.equals(rhs.baseVolume))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
