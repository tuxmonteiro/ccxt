package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base",
    "baseRate",
    "datetime",
    "info",
    "period",
    "quote",
    "quoteRate",
    "symbol",
    "timestamp"
})
public class IsolatedBorrowRate implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    private String base;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseRate")
    private Double baseRate;
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
    @JsonProperty("quote")
    private String quote;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quoteRate")
    private Double quoteRate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = 5499130038869531627L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseRate")
    public Double getBaseRate() {
        return baseRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("baseRate")
    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
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
    @JsonProperty("quote")
    public String getQuote() {
        return quote;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quote")
    public void setQuote(String quote) {
        this.quote = quote;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quoteRate")
    public Double getQuoteRate() {
        return quoteRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quoteRate")
    public void setQuoteRate(Double quoteRate) {
        this.quoteRate = quoteRate;
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
        sb.append(IsolatedBorrowRate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("baseRate");
        sb.append('=');
        sb.append(((this.baseRate == null)?"<null>":this.baseRate));
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
        sb.append("quote");
        sb.append('=');
        sb.append(((this.quote == null)?"<null>":this.quote));
        sb.append(',');
        sb.append("quoteRate");
        sb.append('=');
        sb.append(((this.quoteRate == null)?"<null>":this.quoteRate));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.baseRate == null)? 0 :this.baseRate.hashCode()));
        result = ((result* 31)+((this.quote == null)? 0 :this.quote.hashCode()));
        result = ((result* 31)+((this.quoteRate == null)? 0 :this.quoteRate.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IsolatedBorrowRate) == false) {
            return false;
        }
        IsolatedBorrowRate rhs = ((IsolatedBorrowRate) other);
        return ((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.baseRate == rhs.baseRate)||((this.baseRate!= null)&&this.baseRate.equals(rhs.baseRate))))&&((this.quote == rhs.quote)||((this.quote!= null)&&this.quote.equals(rhs.quote))))&&((this.quoteRate == rhs.quoteRate)||((this.quoteRate!= null)&&this.quoteRate.equals(rhs.quoteRate))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
