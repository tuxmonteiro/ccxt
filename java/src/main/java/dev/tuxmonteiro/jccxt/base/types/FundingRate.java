package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "datetime",
    "estimatedSettlePrice",
    "fundingDatetime",
    "fundingRate",
    "fundingTimestamp",
    "indexPrice",
    "info",
    "interestRate",
    "interval",
    "markPrice",
    "nextFundingDatetime",
    "nextFundingRate",
    "nextFundingTimestamp",
    "previousFundingDatetime",
    "previousFundingRate",
    "previousFundingTimestamp",
    "symbol",
    "timestamp"
})
public class FundingRate implements Serializable
{

    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("estimatedSettlePrice")
    private Double estimatedSettlePrice;
    @JsonProperty("fundingDatetime")
    private String fundingDatetime;
    @JsonProperty("fundingRate")
    private Double fundingRate;
    @JsonProperty("fundingTimestamp")
    private Double fundingTimestamp;
    @JsonProperty("indexPrice")
    private Double indexPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("interestRate")
    private Double interestRate;
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("markPrice")
    private Double markPrice;
    @JsonProperty("nextFundingDatetime")
    private String nextFundingDatetime;
    @JsonProperty("nextFundingRate")
    private Double nextFundingRate;
    @JsonProperty("nextFundingTimestamp")
    private Double nextFundingTimestamp;
    @JsonProperty("previousFundingDatetime")
    private String previousFundingDatetime;
    @JsonProperty("previousFundingRate")
    private Double previousFundingRate;
    @JsonProperty("previousFundingTimestamp")
    private Double previousFundingTimestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = -8238861338450021376L;

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("estimatedSettlePrice")
    public Optional<Double> getEstimatedSettlePrice() {
        return Optional.ofNullable(estimatedSettlePrice);
    }

    @JsonProperty("estimatedSettlePrice")
    public void setEstimatedSettlePrice(Double estimatedSettlePrice) {
        this.estimatedSettlePrice = estimatedSettlePrice;
    }

    @JsonProperty("fundingDatetime")
    public Optional<String> getFundingDatetime() {
        return Optional.ofNullable(fundingDatetime);
    }

    @JsonProperty("fundingDatetime")
    public void setFundingDatetime(String fundingDatetime) {
        this.fundingDatetime = fundingDatetime;
    }

    @JsonProperty("fundingRate")
    public Optional<Double> getFundingRate() {
        return Optional.ofNullable(fundingRate);
    }

    @JsonProperty("fundingRate")
    public void setFundingRate(Double fundingRate) {
        this.fundingRate = fundingRate;
    }

    @JsonProperty("fundingTimestamp")
    public Optional<Double> getFundingTimestamp() {
        return Optional.ofNullable(fundingTimestamp);
    }

    @JsonProperty("fundingTimestamp")
    public void setFundingTimestamp(Double fundingTimestamp) {
        this.fundingTimestamp = fundingTimestamp;
    }

    @JsonProperty("indexPrice")
    public Optional<Double> getIndexPrice() {
        return Optional.ofNullable(indexPrice);
    }

    @JsonProperty("indexPrice")
    public void setIndexPrice(Double indexPrice) {
        this.indexPrice = indexPrice;
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

    @JsonProperty("interestRate")
    public Optional<Double> getInterestRate() {
        return Optional.ofNullable(interestRate);
    }

    @JsonProperty("interestRate")
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @JsonProperty("interval")
    public Optional<String> getInterval() {
        return Optional.ofNullable(interval);
    }

    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    @JsonProperty("markPrice")
    public Optional<Double> getMarkPrice() {
        return Optional.ofNullable(markPrice);
    }

    @JsonProperty("markPrice")
    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    @JsonProperty("nextFundingDatetime")
    public Optional<String> getNextFundingDatetime() {
        return Optional.ofNullable(nextFundingDatetime);
    }

    @JsonProperty("nextFundingDatetime")
    public void setNextFundingDatetime(String nextFundingDatetime) {
        this.nextFundingDatetime = nextFundingDatetime;
    }

    @JsonProperty("nextFundingRate")
    public Optional<Double> getNextFundingRate() {
        return Optional.ofNullable(nextFundingRate);
    }

    @JsonProperty("nextFundingRate")
    public void setNextFundingRate(Double nextFundingRate) {
        this.nextFundingRate = nextFundingRate;
    }

    @JsonProperty("nextFundingTimestamp")
    public Optional<Double> getNextFundingTimestamp() {
        return Optional.ofNullable(nextFundingTimestamp);
    }

    @JsonProperty("nextFundingTimestamp")
    public void setNextFundingTimestamp(Double nextFundingTimestamp) {
        this.nextFundingTimestamp = nextFundingTimestamp;
    }

    @JsonProperty("previousFundingDatetime")
    public Optional<String> getPreviousFundingDatetime() {
        return Optional.ofNullable(previousFundingDatetime);
    }

    @JsonProperty("previousFundingDatetime")
    public void setPreviousFundingDatetime(String previousFundingDatetime) {
        this.previousFundingDatetime = previousFundingDatetime;
    }

    @JsonProperty("previousFundingRate")
    public Optional<Double> getPreviousFundingRate() {
        return Optional.ofNullable(previousFundingRate);
    }

    @JsonProperty("previousFundingRate")
    public void setPreviousFundingRate(Double previousFundingRate) {
        this.previousFundingRate = previousFundingRate;
    }

    @JsonProperty("previousFundingTimestamp")
    public Optional<Double> getPreviousFundingTimestamp() {
        return Optional.ofNullable(previousFundingTimestamp);
    }

    @JsonProperty("previousFundingTimestamp")
    public void setPreviousFundingTimestamp(Double previousFundingTimestamp) {
        this.previousFundingTimestamp = previousFundingTimestamp;
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
        sb.append(FundingRate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("estimatedSettlePrice");
        sb.append('=');
        sb.append(((this.estimatedSettlePrice == null)?"<null>":this.estimatedSettlePrice));
        sb.append(',');
        sb.append("fundingDatetime");
        sb.append('=');
        sb.append(((this.fundingDatetime == null)?"<null>":this.fundingDatetime));
        sb.append(',');
        sb.append("fundingRate");
        sb.append('=');
        sb.append(((this.fundingRate == null)?"<null>":this.fundingRate));
        sb.append(',');
        sb.append("fundingTimestamp");
        sb.append('=');
        sb.append(((this.fundingTimestamp == null)?"<null>":this.fundingTimestamp));
        sb.append(',');
        sb.append("indexPrice");
        sb.append('=');
        sb.append(((this.indexPrice == null)?"<null>":this.indexPrice));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("interestRate");
        sb.append('=');
        sb.append(((this.interestRate == null)?"<null>":this.interestRate));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
        sb.append(',');
        sb.append("nextFundingDatetime");
        sb.append('=');
        sb.append(((this.nextFundingDatetime == null)?"<null>":this.nextFundingDatetime));
        sb.append(',');
        sb.append("nextFundingRate");
        sb.append('=');
        sb.append(((this.nextFundingRate == null)?"<null>":this.nextFundingRate));
        sb.append(',');
        sb.append("nextFundingTimestamp");
        sb.append('=');
        sb.append(((this.nextFundingTimestamp == null)?"<null>":this.nextFundingTimestamp));
        sb.append(',');
        sb.append("previousFundingDatetime");
        sb.append('=');
        sb.append(((this.previousFundingDatetime == null)?"<null>":this.previousFundingDatetime));
        sb.append(',');
        sb.append("previousFundingRate");
        sb.append('=');
        sb.append(((this.previousFundingRate == null)?"<null>":this.previousFundingRate));
        sb.append(',');
        sb.append("previousFundingTimestamp");
        sb.append('=');
        sb.append(((this.previousFundingTimestamp == null)?"<null>":this.previousFundingTimestamp));
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
        result = ((result* 31)+((this.interestRate == null)? 0 :this.interestRate.hashCode()));
        result = ((result* 31)+((this.nextFundingTimestamp == null)? 0 :this.nextFundingTimestamp.hashCode()));
        result = ((result* 31)+((this.previousFundingRate == null)? 0 :this.previousFundingRate.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.indexPrice == null)? 0 :this.indexPrice.hashCode()));
        result = ((result* 31)+((this.previousFundingTimestamp == null)? 0 :this.previousFundingTimestamp.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.fundingTimestamp == null)? 0 :this.fundingTimestamp.hashCode()));
        result = ((result* 31)+((this.nextFundingRate == null)? 0 :this.nextFundingRate.hashCode()));
        result = ((result* 31)+((this.previousFundingDatetime == null)? 0 :this.previousFundingDatetime.hashCode()));
        result = ((result* 31)+((this.nextFundingDatetime == null)? 0 :this.nextFundingDatetime.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.fundingDatetime == null)? 0 :this.fundingDatetime.hashCode()));
        result = ((result* 31)+((this.estimatedSettlePrice == null)? 0 :this.estimatedSettlePrice.hashCode()));
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
        if ((other instanceof FundingRate) == false) {
            return false;
        }
        FundingRate rhs = ((FundingRate) other);
        return (((((((((((((((((((this.interestRate == rhs.interestRate)||((this.interestRate!= null)&&this.interestRate.equals(rhs.interestRate)))&&((this.nextFundingTimestamp == rhs.nextFundingTimestamp)||((this.nextFundingTimestamp!= null)&&this.nextFundingTimestamp.equals(rhs.nextFundingTimestamp))))&&((this.previousFundingRate == rhs.previousFundingRate)||((this.previousFundingRate!= null)&&this.previousFundingRate.equals(rhs.previousFundingRate))))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.indexPrice == rhs.indexPrice)||((this.indexPrice!= null)&&this.indexPrice.equals(rhs.indexPrice))))&&((this.previousFundingTimestamp == rhs.previousFundingTimestamp)||((this.previousFundingTimestamp!= null)&&this.previousFundingTimestamp.equals(rhs.previousFundingTimestamp))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.fundingTimestamp == rhs.fundingTimestamp)||((this.fundingTimestamp!= null)&&this.fundingTimestamp.equals(rhs.fundingTimestamp))))&&((this.nextFundingRate == rhs.nextFundingRate)||((this.nextFundingRate!= null)&&this.nextFundingRate.equals(rhs.nextFundingRate))))&&((this.previousFundingDatetime == rhs.previousFundingDatetime)||((this.previousFundingDatetime!= null)&&this.previousFundingDatetime.equals(rhs.previousFundingDatetime))))&&((this.nextFundingDatetime == rhs.nextFundingDatetime)||((this.nextFundingDatetime!= null)&&this.nextFundingDatetime.equals(rhs.nextFundingDatetime))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.fundingDatetime == rhs.fundingDatetime)||((this.fundingDatetime!= null)&&this.fundingDatetime.equals(rhs.fundingDatetime))))&&((this.estimatedSettlePrice == rhs.estimatedSettlePrice)||((this.estimatedSettlePrice!= null)&&this.estimatedSettlePrice.equals(rhs.estimatedSettlePrice))))&&((this.fundingRate == rhs.fundingRate)||((this.fundingRate!= null)&&this.fundingRate.equals(rhs.fundingRate))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
