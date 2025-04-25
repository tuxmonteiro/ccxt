package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "datetime",
    "info",
    "period",
    "rate",
    "timestamp"
})
public class CrossBorrowRate implements Serializable
{

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("period")
    private Double period;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    private Double rate;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = -711835733338782845L;

    @JsonProperty("currency")
    public Optional<String> getCurrency() {
        return Optional.ofNullable(currency);
    }

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

    @JsonProperty("period")
    public Optional<Double> getPeriod() {
        return Optional.ofNullable(period);
    }

    @JsonProperty("period")
    public void setPeriod(Double period) {
        this.period = period;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
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
        sb.append(CrossBorrowRate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
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
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossBorrowRate) == false) {
            return false;
        }
        CrossBorrowRate rhs = ((CrossBorrowRate) other);
        return (((((((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency)))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
