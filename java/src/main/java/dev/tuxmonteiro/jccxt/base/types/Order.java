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
    "amount",
    "average",
    "clientOrderId",
    "cost",
    "datetime",
    "fee",
    "filled",
    "id",
    "info",
    "lastTradeTimestamp",
    "lastUpdateTimestamp",
    "postOnly",
    "price",
    "reduceOnly",
    "remaining",
    "side",
    "status",
    "stopLossPrice",
    "stopPrice",
    "symbol",
    "takeProfitPrice",
    "timeInForce",
    "timestamp",
    "trades",
    "triggerPrice",
    "type"
})
public class Order implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("average")
    private Double average;
    @JsonProperty("clientOrderId")
    private String clientOrderId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost")
    private Double cost;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("fee")
    private Fee fee;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filled")
    private Double filled;
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
    @JsonProperty("lastTradeTimestamp")
    private Double lastTradeTimestamp;
    @JsonProperty("lastUpdateTimestamp")
    private Double lastUpdateTimestamp;
    @JsonProperty("postOnly")
    private Boolean postOnly;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private Double price;
    @JsonProperty("reduceOnly")
    private Boolean reduceOnly;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remaining")
    private Double remaining;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("side")
    private Object side;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private Object status;
    @JsonProperty("stopLossPrice")
    private Double stopLossPrice;
    @JsonProperty("stopPrice")
    private Double stopPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("takeProfitPrice")
    private Double takeProfitPrice;
    @JsonProperty("timeInForce")
    private String timeInForce;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private Double timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trades")
    private List<Trade> trades = new ArrayList<Trade>();
    @JsonProperty("triggerPrice")
    private Double triggerPrice;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = 2605516261437625403L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("average")
    public Optional<Double> getAverage() {
        return Optional.ofNullable(average);
    }

    @JsonProperty("average")
    public void setAverage(Double average) {
        this.average = average;
    }

    @JsonProperty("clientOrderId")
    public Optional<String> getClientOrderId() {
        return Optional.ofNullable(clientOrderId);
    }

    @JsonProperty("clientOrderId")
    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost")
    public Double getCost() {
        return cost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cost")
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("fee")
    public Optional<Fee> getFee() {
        return Optional.ofNullable(fee);
    }

    @JsonProperty("fee")
    public void setFee(Fee fee) {
        this.fee = fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filled")
    public Double getFilled() {
        return filled;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("filled")
    public void setFilled(Double filled) {
        this.filled = filled;
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
    @JsonProperty("lastTradeTimestamp")
    public Double getLastTradeTimestamp() {
        return lastTradeTimestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastTradeTimestamp")
    public void setLastTradeTimestamp(Double lastTradeTimestamp) {
        this.lastTradeTimestamp = lastTradeTimestamp;
    }

    @JsonProperty("lastUpdateTimestamp")
    public Optional<Double> getLastUpdateTimestamp() {
        return Optional.ofNullable(lastUpdateTimestamp);
    }

    @JsonProperty("lastUpdateTimestamp")
    public void setLastUpdateTimestamp(Double lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    @JsonProperty("postOnly")
    public Optional<Boolean> getPostOnly() {
        return Optional.ofNullable(postOnly);
    }

    @JsonProperty("postOnly")
    public void setPostOnly(Boolean postOnly) {
        this.postOnly = postOnly;
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

    @JsonProperty("reduceOnly")
    public Optional<Boolean> getReduceOnly() {
        return Optional.ofNullable(reduceOnly);
    }

    @JsonProperty("reduceOnly")
    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remaining")
    public Double getRemaining() {
        return remaining;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remaining")
    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("side")
    public Object getSide() {
        return side;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("side")
    public void setSide(Object side) {
        this.side = side;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("stopLossPrice")
    public Optional<Double> getStopLossPrice() {
        return Optional.ofNullable(stopLossPrice);
    }

    @JsonProperty("stopLossPrice")
    public void setStopLossPrice(Double stopLossPrice) {
        this.stopLossPrice = stopLossPrice;
    }

    @JsonProperty("stopPrice")
    public Optional<Double> getStopPrice() {
        return Optional.ofNullable(stopPrice);
    }

    @JsonProperty("stopPrice")
    public void setStopPrice(Double stopPrice) {
        this.stopPrice = stopPrice;
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

    @JsonProperty("takeProfitPrice")
    public Optional<Double> getTakeProfitPrice() {
        return Optional.ofNullable(takeProfitPrice);
    }

    @JsonProperty("takeProfitPrice")
    public void setTakeProfitPrice(Double takeProfitPrice) {
        this.takeProfitPrice = takeProfitPrice;
    }

    @JsonProperty("timeInForce")
    public Optional<String> getTimeInForce() {
        return Optional.ofNullable(timeInForce);
    }

    @JsonProperty("timeInForce")
    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trades")
    public List<Trade> getTrades() {
        return trades;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("trades")
    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }

    @JsonProperty("triggerPrice")
    public Optional<Double> getTriggerPrice() {
        return Optional.ofNullable(triggerPrice);
    }

    @JsonProperty("triggerPrice")
    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("average");
        sb.append('=');
        sb.append(((this.average == null)?"<null>":this.average));
        sb.append(',');
        sb.append("clientOrderId");
        sb.append('=');
        sb.append(((this.clientOrderId == null)?"<null>":this.clientOrderId));
        sb.append(',');
        sb.append("cost");
        sb.append('=');
        sb.append(((this.cost == null)?"<null>":this.cost));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
        sb.append(',');
        sb.append("filled");
        sb.append('=');
        sb.append(((this.filled == null)?"<null>":this.filled));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("lastTradeTimestamp");
        sb.append('=');
        sb.append(((this.lastTradeTimestamp == null)?"<null>":this.lastTradeTimestamp));
        sb.append(',');
        sb.append("lastUpdateTimestamp");
        sb.append('=');
        sb.append(((this.lastUpdateTimestamp == null)?"<null>":this.lastUpdateTimestamp));
        sb.append(',');
        sb.append("postOnly");
        sb.append('=');
        sb.append(((this.postOnly == null)?"<null>":this.postOnly));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("reduceOnly");
        sb.append('=');
        sb.append(((this.reduceOnly == null)?"<null>":this.reduceOnly));
        sb.append(',');
        sb.append("remaining");
        sb.append('=');
        sb.append(((this.remaining == null)?"<null>":this.remaining));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("stopLossPrice");
        sb.append('=');
        sb.append(((this.stopLossPrice == null)?"<null>":this.stopLossPrice));
        sb.append(',');
        sb.append("stopPrice");
        sb.append('=');
        sb.append(((this.stopPrice == null)?"<null>":this.stopPrice));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("takeProfitPrice");
        sb.append('=');
        sb.append(((this.takeProfitPrice == null)?"<null>":this.takeProfitPrice));
        sb.append(',');
        sb.append("timeInForce");
        sb.append('=');
        sb.append(((this.timeInForce == null)?"<null>":this.timeInForce));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("trades");
        sb.append('=');
        sb.append(((this.trades == null)?"<null>":this.trades));
        sb.append(',');
        sb.append("triggerPrice");
        sb.append('=');
        sb.append(((this.triggerPrice == null)?"<null>":this.triggerPrice));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.average == null)? 0 :this.average.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.takeProfitPrice == null)? 0 :this.takeProfitPrice.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.lastUpdateTimestamp == null)? 0 :this.lastUpdateTimestamp.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stopLossPrice == null)? 0 :this.stopLossPrice.hashCode()));
        result = ((result* 31)+((this.lastTradeTimestamp == null)? 0 :this.lastTradeTimestamp.hashCode()));
        result = ((result* 31)+((this.timeInForce == null)? 0 :this.timeInForce.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.cost == null)? 0 :this.cost.hashCode()));
        result = ((result* 31)+((this.triggerPrice == null)? 0 :this.triggerPrice.hashCode()));
        result = ((result* 31)+((this.clientOrderId == null)? 0 :this.clientOrderId.hashCode()));
        result = ((result* 31)+((this.trades == null)? 0 :this.trades.hashCode()));
        result = ((result* 31)+((this.filled == null)? 0 :this.filled.hashCode()));
        result = ((result* 31)+((this.remaining == null)? 0 :this.remaining.hashCode()));
        result = ((result* 31)+((this.postOnly == null)? 0 :this.postOnly.hashCode()));
        result = ((result* 31)+((this.stopPrice == null)? 0 :this.stopPrice.hashCode()));
        result = ((result* 31)+((this.reduceOnly == null)? 0 :this.reduceOnly.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return (((((((((((((((((((((((((((this.average == rhs.average)||((this.average!= null)&&this.average.equals(rhs.average)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.takeProfitPrice == rhs.takeProfitPrice)||((this.takeProfitPrice!= null)&&this.takeProfitPrice.equals(rhs.takeProfitPrice))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.lastUpdateTimestamp == rhs.lastUpdateTimestamp)||((this.lastUpdateTimestamp!= null)&&this.lastUpdateTimestamp.equals(rhs.lastUpdateTimestamp))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stopLossPrice == rhs.stopLossPrice)||((this.stopLossPrice!= null)&&this.stopLossPrice.equals(rhs.stopLossPrice))))&&((this.lastTradeTimestamp == rhs.lastTradeTimestamp)||((this.lastTradeTimestamp!= null)&&this.lastTradeTimestamp.equals(rhs.lastTradeTimestamp))))&&((this.timeInForce == rhs.timeInForce)||((this.timeInForce!= null)&&this.timeInForce.equals(rhs.timeInForce))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.cost == rhs.cost)||((this.cost!= null)&&this.cost.equals(rhs.cost))))&&((this.triggerPrice == rhs.triggerPrice)||((this.triggerPrice!= null)&&this.triggerPrice.equals(rhs.triggerPrice))))&&((this.clientOrderId == rhs.clientOrderId)||((this.clientOrderId!= null)&&this.clientOrderId.equals(rhs.clientOrderId))))&&((this.trades == rhs.trades)||((this.trades!= null)&&this.trades.equals(rhs.trades))))&&((this.filled == rhs.filled)||((this.filled!= null)&&this.filled.equals(rhs.filled))))&&((this.remaining == rhs.remaining)||((this.remaining!= null)&&this.remaining.equals(rhs.remaining))))&&((this.postOnly == rhs.postOnly)||((this.postOnly!= null)&&this.postOnly.equals(rhs.postOnly))))&&((this.stopPrice == rhs.stopPrice)||((this.stopPrice!= null)&&this.stopPrice.equals(rhs.stopPrice))))&&((this.reduceOnly == rhs.reduceOnly)||((this.reduceOnly!= null)&&this.reduceOnly.equals(rhs.reduceOnly))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
