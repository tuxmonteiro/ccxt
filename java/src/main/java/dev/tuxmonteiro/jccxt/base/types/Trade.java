package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "cost",
    "datetime",
    "fee",
    "id",
    "info",
    "order",
    "price",
    "side",
    "symbol",
    "takerOrMaker",
    "timestamp",
    "type"
})
public class Trade implements Serializable
{

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("cost")
    private Double cost;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("fee")
    private Fee fee;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("order")
    private String order;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private Double price;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("side")
    private Object side;
    @JsonProperty("symbol")
    private String symbol;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("takerOrMaker")
    private Object takerOrMaker;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = -4926463071797815072L;

    @JsonProperty("amount")
    public Optional<Double> getAmount() {
        return Optional.ofNullable(amount);
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("cost")
    public Optional<Double> getCost() {
        return Optional.ofNullable(cost);
    }

    @JsonProperty("cost")
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

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

    @JsonProperty("id")
    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

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

    @JsonProperty("order")
    public Optional<String> getOrder() {
        return Optional.ofNullable(order);
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
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

    @JsonProperty("symbol")
    public Optional<String> getSymbol() {
        return Optional.ofNullable(symbol);
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("takerOrMaker")
    public Object getTakerOrMaker() {
        return takerOrMaker;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("takerOrMaker")
    public void setTakerOrMaker(Object takerOrMaker) {
        this.takerOrMaker = takerOrMaker;
    }

    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
        return Optional.ofNullable(timestamp);
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
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
        sb.append(Trade.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("takerOrMaker");
        sb.append('=');
        sb.append(((this.takerOrMaker == null)?"<null>":this.takerOrMaker));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.cost == null)? 0 :this.cost.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.takerOrMaker == null)? 0 :this.takerOrMaker.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trade) == false) {
            return false;
        }
        Trade rhs = ((Trade) other);
        return ((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.cost == rhs.cost)||((this.cost!= null)&&this.cost.equals(rhs.cost))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.takerOrMaker == rhs.takerOrMaker)||((this.takerOrMaker!= null)&&this.takerOrMaker.equals(rhs.takerOrMaker))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
