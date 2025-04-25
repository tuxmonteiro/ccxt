package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "datetime",
    "fee",
    "fromAmount",
    "fromCurrency",
    "id",
    "info",
    "price",
    "timestamp",
    "toAmount",
    "toCurrency"
})
public class Conversion implements Serializable
{

    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fee")
    private Double fee;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromAmount")
    private Double fromAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromCurrency")
    private String fromCurrency;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
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
    @JsonProperty("price")
    private Double price;
    @JsonProperty("timestamp")
    private Double timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("toAmount")
    private Double toAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("toCurrency")
    private String toCurrency;
    private final static long serialVersionUID = 1145825350311502053L;

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
    @JsonProperty("fee")
    public Double getFee() {
        return fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fee")
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromAmount")
    public Double getFromAmount() {
        return fromAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromAmount")
    public void setFromAmount(Double fromAmount) {
        this.fromAmount = fromAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromCurrency")
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fromCurrency")
    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
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
    @JsonProperty("toAmount")
    public Double getToAmount() {
        return toAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("toAmount")
    public void setToAmount(Double toAmount) {
        this.toAmount = toAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("toCurrency")
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("toCurrency")
    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Conversion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
        sb.append(',');
        sb.append("fromAmount");
        sb.append('=');
        sb.append(((this.fromAmount == null)?"<null>":this.fromAmount));
        sb.append(',');
        sb.append("fromCurrency");
        sb.append('=');
        sb.append(((this.fromCurrency == null)?"<null>":this.fromCurrency));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("toAmount");
        sb.append('=');
        sb.append(((this.toAmount == null)?"<null>":this.toAmount));
        sb.append(',');
        sb.append("toCurrency");
        sb.append('=');
        sb.append(((this.toCurrency == null)?"<null>":this.toCurrency));
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
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.toCurrency == null)? 0 :this.toCurrency.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.fromAmount == null)? 0 :this.fromAmount.hashCode()));
        result = ((result* 31)+((this.toAmount == null)? 0 :this.toAmount.hashCode()));
        result = ((result* 31)+((this.fromCurrency == null)? 0 :this.fromCurrency.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conversion) == false) {
            return false;
        }
        Conversion rhs = ((Conversion) other);
        return (((((((((((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime)))&&((this.toCurrency == rhs.toCurrency)||((this.toCurrency!= null)&&this.toCurrency.equals(rhs.toCurrency))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.fromAmount == rhs.fromAmount)||((this.fromAmount!= null)&&this.fromAmount.equals(rhs.fromAmount))))&&((this.toAmount == rhs.toAmount)||((this.toAmount!= null)&&this.toAmount.equals(rhs.toAmount))))&&((this.fromCurrency == rhs.fromCurrency)||((this.fromCurrency!= null)&&this.fromCurrency.equals(rhs.fromCurrency))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
