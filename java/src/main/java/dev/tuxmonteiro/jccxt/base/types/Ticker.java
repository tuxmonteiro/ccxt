package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ask",
    "askVolume",
    "average",
    "baseVolume",
    "bid",
    "bidVolume",
    "change",
    "close",
    "datetime",
    "high",
    "indexPrice",
    "info",
    "last",
    "low",
    "markPrice",
    "open",
    "percentage",
    "previousClose",
    "quoteVolume",
    "symbol",
    "timestamp",
    "vwap"
})
public class Ticker implements Serializable
{

    @JsonProperty("ask")
    private Double ask;
    @JsonProperty("askVolume")
    private Double askVolume;
    @JsonProperty("average")
    private Double average;
    @JsonProperty("baseVolume")
    private Double baseVolume;
    @JsonProperty("bid")
    private Double bid;
    @JsonProperty("bidVolume")
    private Double bidVolume;
    @JsonProperty("change")
    private Double change;
    @JsonProperty("close")
    private Double close;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("high")
    private Double high;
    @JsonProperty("indexPrice")
    private Double indexPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("last")
    private Double last;
    @JsonProperty("low")
    private Double low;
    @JsonProperty("markPrice")
    private Double markPrice;
    @JsonProperty("open")
    private Double open;
    @JsonProperty("percentage")
    private Double percentage;
    @JsonProperty("previousClose")
    private Double previousClose;
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
    @JsonProperty("vwap")
    private Double vwap;
    private final static long serialVersionUID = -1558716218008527448L;

    @JsonProperty("ask")
    public Optional<Double> getAsk() {
        return Optional.ofNullable(ask);
    }

    @JsonProperty("ask")
    public void setAsk(Double ask) {
        this.ask = ask;
    }

    @JsonProperty("askVolume")
    public Optional<Double> getAskVolume() {
        return Optional.ofNullable(askVolume);
    }

    @JsonProperty("askVolume")
    public void setAskVolume(Double askVolume) {
        this.askVolume = askVolume;
    }

    @JsonProperty("average")
    public Optional<Double> getAverage() {
        return Optional.ofNullable(average);
    }

    @JsonProperty("average")
    public void setAverage(Double average) {
        this.average = average;
    }

    @JsonProperty("baseVolume")
    public Optional<Double> getBaseVolume() {
        return Optional.ofNullable(baseVolume);
    }

    @JsonProperty("baseVolume")
    public void setBaseVolume(Double baseVolume) {
        this.baseVolume = baseVolume;
    }

    @JsonProperty("bid")
    public Optional<Double> getBid() {
        return Optional.ofNullable(bid);
    }

    @JsonProperty("bid")
    public void setBid(Double bid) {
        this.bid = bid;
    }

    @JsonProperty("bidVolume")
    public Optional<Double> getBidVolume() {
        return Optional.ofNullable(bidVolume);
    }

    @JsonProperty("bidVolume")
    public void setBidVolume(Double bidVolume) {
        this.bidVolume = bidVolume;
    }

    @JsonProperty("change")
    public Optional<Double> getChange() {
        return Optional.ofNullable(change);
    }

    @JsonProperty("change")
    public void setChange(Double change) {
        this.change = change;
    }

    @JsonProperty("close")
    public Optional<Double> getClose() {
        return Optional.ofNullable(close);
    }

    @JsonProperty("close")
    public void setClose(Double close) {
        this.close = close;
    }

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("high")
    public Optional<Double> getHigh() {
        return Optional.ofNullable(high);
    }

    @JsonProperty("high")
    public void setHigh(Double high) {
        this.high = high;
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

    @JsonProperty("last")
    public Optional<Double> getLast() {
        return Optional.ofNullable(last);
    }

    @JsonProperty("last")
    public void setLast(Double last) {
        this.last = last;
    }

    @JsonProperty("low")
    public Optional<Double> getLow() {
        return Optional.ofNullable(low);
    }

    @JsonProperty("low")
    public void setLow(Double low) {
        this.low = low;
    }

    @JsonProperty("markPrice")
    public Optional<Double> getMarkPrice() {
        return Optional.ofNullable(markPrice);
    }

    @JsonProperty("markPrice")
    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    @JsonProperty("open")
    public Optional<Double> getOpen() {
        return Optional.ofNullable(open);
    }

    @JsonProperty("open")
    public void setOpen(Double open) {
        this.open = open;
    }

    @JsonProperty("percentage")
    public Optional<Double> getPercentage() {
        return Optional.ofNullable(percentage);
    }

    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("previousClose")
    public Optional<Double> getPreviousClose() {
        return Optional.ofNullable(previousClose);
    }

    @JsonProperty("previousClose")
    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    @JsonProperty("quoteVolume")
    public Optional<Double> getQuoteVolume() {
        return Optional.ofNullable(quoteVolume);
    }

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

    @JsonProperty("vwap")
    public Optional<Double> getVwap() {
        return Optional.ofNullable(vwap);
    }

    @JsonProperty("vwap")
    public void setVwap(Double vwap) {
        this.vwap = vwap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ticker.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ask");
        sb.append('=');
        sb.append(((this.ask == null)?"<null>":this.ask));
        sb.append(',');
        sb.append("askVolume");
        sb.append('=');
        sb.append(((this.askVolume == null)?"<null>":this.askVolume));
        sb.append(',');
        sb.append("average");
        sb.append('=');
        sb.append(((this.average == null)?"<null>":this.average));
        sb.append(',');
        sb.append("baseVolume");
        sb.append('=');
        sb.append(((this.baseVolume == null)?"<null>":this.baseVolume));
        sb.append(',');
        sb.append("bid");
        sb.append('=');
        sb.append(((this.bid == null)?"<null>":this.bid));
        sb.append(',');
        sb.append("bidVolume");
        sb.append('=');
        sb.append(((this.bidVolume == null)?"<null>":this.bidVolume));
        sb.append(',');
        sb.append("change");
        sb.append('=');
        sb.append(((this.change == null)?"<null>":this.change));
        sb.append(',');
        sb.append("close");
        sb.append('=');
        sb.append(((this.close == null)?"<null>":this.close));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null)?"<null>":this.high));
        sb.append(',');
        sb.append("indexPrice");
        sb.append('=');
        sb.append(((this.indexPrice == null)?"<null>":this.indexPrice));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("last");
        sb.append('=');
        sb.append(((this.last == null)?"<null>":this.last));
        sb.append(',');
        sb.append("low");
        sb.append('=');
        sb.append(((this.low == null)?"<null>":this.low));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("previousClose");
        sb.append('=');
        sb.append(((this.previousClose == null)?"<null>":this.previousClose));
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
        sb.append("vwap");
        sb.append('=');
        sb.append(((this.vwap == null)?"<null>":this.vwap));
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
        result = ((result* 31)+((this.indexPrice == null)? 0 :this.indexPrice.hashCode()));
        result = ((result* 31)+((this.last == null)? 0 :this.last.hashCode()));
        result = ((result* 31)+((this.change == null)? 0 :this.change.hashCode()));
        result = ((result* 31)+((this.vwap == null)? 0 :this.vwap.hashCode()));
        result = ((result* 31)+((this.quoteVolume == null)? 0 :this.quoteVolume.hashCode()));
        result = ((result* 31)+((this.askVolume == null)? 0 :this.askVolume.hashCode()));
        result = ((result* 31)+((this.previousClose == null)? 0 :this.previousClose.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        result = ((result* 31)+((this.ask == null)? 0 :this.ask.hashCode()));
        result = ((result* 31)+((this.bidVolume == null)? 0 :this.bidVolume.hashCode()));
        result = ((result* 31)+((this.baseVolume == null)? 0 :this.baseVolume.hashCode()));
        result = ((result* 31)+((this.bid == null)? 0 :this.bid.hashCode()));
        result = ((result* 31)+((this.close == null)? 0 :this.close.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ticker) == false) {
            return false;
        }
        Ticker rhs = ((Ticker) other);
        return (((((((((((((((((((((((this.average == rhs.average)||((this.average!= null)&&this.average.equals(rhs.average)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.indexPrice == rhs.indexPrice)||((this.indexPrice!= null)&&this.indexPrice.equals(rhs.indexPrice))))&&((this.last == rhs.last)||((this.last!= null)&&this.last.equals(rhs.last))))&&((this.change == rhs.change)||((this.change!= null)&&this.change.equals(rhs.change))))&&((this.vwap == rhs.vwap)||((this.vwap!= null)&&this.vwap.equals(rhs.vwap))))&&((this.quoteVolume == rhs.quoteVolume)||((this.quoteVolume!= null)&&this.quoteVolume.equals(rhs.quoteVolume))))&&((this.askVolume == rhs.askVolume)||((this.askVolume!= null)&&this.askVolume.equals(rhs.askVolume))))&&((this.previousClose == rhs.previousClose)||((this.previousClose!= null)&&this.previousClose.equals(rhs.previousClose))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.ask == rhs.ask)||((this.ask!= null)&&this.ask.equals(rhs.ask))))&&((this.bidVolume == rhs.bidVolume)||((this.bidVolume!= null)&&this.bidVolume.equals(rhs.bidVolume))))&&((this.baseVolume == rhs.baseVolume)||((this.baseVolume!= null)&&this.baseVolume.equals(rhs.baseVolume))))&&((this.bid == rhs.bid)||((this.bid!= null)&&this.bid.equals(rhs.bid))))&&((this.close == rhs.close)||((this.close!= null)&&this.close.equals(rhs.close))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
