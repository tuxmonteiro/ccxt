package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "datetime",
    "fundingRate",
    "info",
    "symbol",
    "timestamp"
})
public class FundingRateHistory implements Serializable
{

    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fundingRate")
    private Double fundingRate;
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
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = -8628157664285252347L;

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
    @JsonProperty("fundingRate")
    public Double getFundingRate() {
        return fundingRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fundingRate")
    public void setFundingRate(Double fundingRate) {
        this.fundingRate = fundingRate;
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
        sb.append(FundingRateHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("fundingRate");
        sb.append('=');
        sb.append(((this.fundingRate == null)?"<null>":this.fundingRate));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
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
        result = ((result* 31)+((this.fundingRate == null)? 0 :this.fundingRate.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundingRateHistory) == false) {
            return false;
        }
        FundingRateHistory rhs = ((FundingRateHistory) other);
        return ((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.fundingRate == rhs.fundingRate)||((this.fundingRate!= null)&&this.fundingRate.equals(rhs.fundingRate))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
