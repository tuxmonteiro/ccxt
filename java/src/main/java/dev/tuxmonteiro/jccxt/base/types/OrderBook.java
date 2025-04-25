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
    "asks",
    "bids",
    "datetime",
    "nonce",
    "symbol",
    "timestamp"
})
public class OrderBook implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asks")
    private List<List<Object>> asks = new ArrayList<List<Object>>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bids")
    private List<List<Object>> bids = new ArrayList<List<Object>>();
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("nonce")
    private Double nonce;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("timestamp")
    private Double timestamp;
    private final static long serialVersionUID = 7972759401960651455L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asks")
    public List<List<Object>> getAsks() {
        return asks;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asks")
    public void setAsks(List<List<Object>> asks) {
        this.asks = asks;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bids")
    public List<List<Object>> getBids() {
        return bids;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bids")
    public void setBids(List<List<Object>> bids) {
        this.bids = bids;
    }

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("nonce")
    public Optional<Double> getNonce() {
        return Optional.ofNullable(nonce);
    }

    @JsonProperty("nonce")
    public void setNonce(Double nonce) {
        this.nonce = nonce;
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
        sb.append(OrderBook.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("asks");
        sb.append('=');
        sb.append(((this.asks == null)?"<null>":this.asks));
        sb.append(',');
        sb.append("bids");
        sb.append('=');
        sb.append(((this.bids == null)?"<null>":this.bids));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("nonce");
        sb.append('=');
        sb.append(((this.nonce == null)?"<null>":this.nonce));
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
        result = ((result* 31)+((this.bids == null)? 0 :this.bids.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.nonce == null)? 0 :this.nonce.hashCode()));
        result = ((result* 31)+((this.asks == null)? 0 :this.asks.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderBook) == false) {
            return false;
        }
        OrderBook rhs = ((OrderBook) other);
        return (((((((this.bids == rhs.bids)||((this.bids!= null)&&this.bids.equals(rhs.bids)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.nonce == rhs.nonce)||((this.nonce!= null)&&this.nonce.equals(rhs.nonce))))&&((this.asks == rhs.asks)||((this.asks!= null)&&this.asks.equals(rhs.asks))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
