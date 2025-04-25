package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "askPrice",
    "baseVolume",
    "bidPrice",
    "change",
    "currency",
    "datetime",
    "impliedVolatility",
    "info",
    "lastPrice",
    "markPrice",
    "midPrice",
    "openInterest",
    "percentage",
    "quoteVolume",
    "symbol",
    "timestamp",
    "underlyingPrice"
})
public class Option implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askPrice")
    private Double askPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseVolume")
    private Double baseVolume;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidPrice")
    private Double bidPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change")
    private Double change;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("impliedVolatility")
    private Double impliedVolatility;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastPrice")
    private Double lastPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markPrice")
    private Double markPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("midPrice")
    private Double midPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openInterest")
    private Double openInterest;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("percentage")
    private Double percentage;
    /**
     * 
     * (Required)
     * 
     */
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
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice")
    private Double underlyingPrice;
    private final static long serialVersionUID = 520912157077009332L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askPrice")
    public Double getAskPrice() {
        return askPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askPrice")
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseVolume")
    public Double getBaseVolume() {
        return baseVolume;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseVolume")
    public void setBaseVolume(Double baseVolume) {
        this.baseVolume = baseVolume;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidPrice")
    public Double getBidPrice() {
        return bidPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidPrice")
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change")
    public Double getChange() {
        return change;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change")
    public void setChange(Double change) {
        this.change = change;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
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
    @JsonProperty("impliedVolatility")
    public Double getImpliedVolatility() {
        return impliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("impliedVolatility")
    public void setImpliedVolatility(Double impliedVolatility) {
        this.impliedVolatility = impliedVolatility;
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastPrice")
    public Double getLastPrice() {
        return lastPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastPrice")
    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markPrice")
    public Double getMarkPrice() {
        return markPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markPrice")
    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("midPrice")
    public Double getMidPrice() {
        return midPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("midPrice")
    public void setMidPrice(Double midPrice) {
        this.midPrice = midPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openInterest")
    public Double getOpenInterest() {
        return openInterest;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("openInterest")
    public void setOpenInterest(Double openInterest) {
        this.openInterest = openInterest;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quoteVolume")
    public Double getQuoteVolume() {
        return quoteVolume;
    }

    /**
     * 
     * (Required)
     * 
     */
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice")
    public Double getUnderlyingPrice() {
        return underlyingPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice")
    public void setUnderlyingPrice(Double underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Option.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("baseVolume");
        sb.append('=');
        sb.append(((this.baseVolume == null)?"<null>":this.baseVolume));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
        sb.append(',');
        sb.append("change");
        sb.append('=');
        sb.append(((this.change == null)?"<null>":this.change));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("impliedVolatility");
        sb.append('=');
        sb.append(((this.impliedVolatility == null)?"<null>":this.impliedVolatility));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("lastPrice");
        sb.append('=');
        sb.append(((this.lastPrice == null)?"<null>":this.lastPrice));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
        sb.append(',');
        sb.append("midPrice");
        sb.append('=');
        sb.append(((this.midPrice == null)?"<null>":this.midPrice));
        sb.append(',');
        sb.append("openInterest");
        sb.append('=');
        sb.append(((this.openInterest == null)?"<null>":this.openInterest));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
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
        sb.append("underlyingPrice");
        sb.append('=');
        sb.append(((this.underlyingPrice == null)?"<null>":this.underlyingPrice));
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
        result = ((result* 31)+((this.askPrice == null)? 0 :this.askPrice.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.underlyingPrice == null)? 0 :this.underlyingPrice.hashCode()));
        result = ((result* 31)+((this.openInterest == null)? 0 :this.openInterest.hashCode()));
        result = ((result* 31)+((this.change == null)? 0 :this.change.hashCode()));
        result = ((result* 31)+((this.quoteVolume == null)? 0 :this.quoteVolume.hashCode()));
        result = ((result* 31)+((this.impliedVolatility == null)? 0 :this.impliedVolatility.hashCode()));
        result = ((result* 31)+((this.bidPrice == null)? 0 :this.bidPrice.hashCode()));
        result = ((result* 31)+((this.midPrice == null)? 0 :this.midPrice.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.baseVolume == null)? 0 :this.baseVolume.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.lastPrice == null)? 0 :this.lastPrice.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Option) == false) {
            return false;
        }
        Option rhs = ((Option) other);
        return ((((((((((((((((((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.underlyingPrice == rhs.underlyingPrice)||((this.underlyingPrice!= null)&&this.underlyingPrice.equals(rhs.underlyingPrice))))&&((this.openInterest == rhs.openInterest)||((this.openInterest!= null)&&this.openInterest.equals(rhs.openInterest))))&&((this.change == rhs.change)||((this.change!= null)&&this.change.equals(rhs.change))))&&((this.quoteVolume == rhs.quoteVolume)||((this.quoteVolume!= null)&&this.quoteVolume.equals(rhs.quoteVolume))))&&((this.impliedVolatility == rhs.impliedVolatility)||((this.impliedVolatility!= null)&&this.impliedVolatility.equals(rhs.impliedVolatility))))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.midPrice == rhs.midPrice)||((this.midPrice!= null)&&this.midPrice.equals(rhs.midPrice))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.baseVolume == rhs.baseVolume)||((this.baseVolume!= null)&&this.baseVolume.equals(rhs.baseVolume))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.lastPrice == rhs.lastPrice)||((this.lastPrice!= null)&&this.lastPrice.equals(rhs.lastPrice))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
