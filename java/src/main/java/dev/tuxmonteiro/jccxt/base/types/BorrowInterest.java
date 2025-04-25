package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amountBorrowed",
    "currency",
    "datetime",
    "info",
    "interest",
    "interestRate",
    "marginMode",
    "symbol",
    "timestamp"
})
public class BorrowInterest implements Serializable
{

    @JsonProperty("amountBorrowed")
    private Double amountBorrowed;
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
    @JsonProperty("interest")
    private Double interest;
    @JsonProperty("interestRate")
    private Double interestRate;
    @JsonProperty("marginMode")
    private String marginMode;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = 794625106413447358L;

    @JsonProperty("amountBorrowed")
    public Optional<Double> getAmountBorrowed() {
        return Optional.ofNullable(amountBorrowed);
    }

    @JsonProperty("amountBorrowed")
    public void setAmountBorrowed(Double amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

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

    @JsonProperty("interest")
    public Optional<Double> getInterest() {
        return Optional.ofNullable(interest);
    }

    @JsonProperty("interest")
    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @JsonProperty("interestRate")
    public Optional<Double> getInterestRate() {
        return Optional.ofNullable(interestRate);
    }

    @JsonProperty("interestRate")
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @JsonProperty("marginMode")
    public Optional<String> getMarginMode() {
        return Optional.ofNullable(marginMode);
    }

    @JsonProperty("marginMode")
    public void setMarginMode(String marginMode) {
        this.marginMode = marginMode;
    }

    @JsonProperty("symbol")
    public Optional<String> getSymbol() {
        return Optional.ofNullable(symbol);
    }

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
        sb.append(BorrowInterest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amountBorrowed");
        sb.append('=');
        sb.append(((this.amountBorrowed == null)?"<null>":this.amountBorrowed));
        sb.append(',');
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
        sb.append("interest");
        sb.append('=');
        sb.append(((this.interest == null)?"<null>":this.interest));
        sb.append(',');
        sb.append("interestRate");
        sb.append('=');
        sb.append(((this.interestRate == null)?"<null>":this.interestRate));
        sb.append(',');
        sb.append("marginMode");
        sb.append('=');
        sb.append(((this.marginMode == null)?"<null>":this.marginMode));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.interest == null)? 0 :this.interest.hashCode()));
        result = ((result* 31)+((this.amountBorrowed == null)? 0 :this.amountBorrowed.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.marginMode == null)? 0 :this.marginMode.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BorrowInterest) == false) {
            return false;
        }
        BorrowInterest rhs = ((BorrowInterest) other);
        return ((((((((((this.interestRate == rhs.interestRate)||((this.interestRate!= null)&&this.interestRate.equals(rhs.interestRate)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.interest == rhs.interest)||((this.interest!= null)&&this.interest.equals(rhs.interest))))&&((this.amountBorrowed == rhs.amountBorrowed)||((this.amountBorrowed!= null)&&this.amountBorrowed.equals(rhs.amountBorrowed))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.marginMode == rhs.marginMode)||((this.marginMode!= null)&&this.marginMode.equals(rhs.marginMode))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
