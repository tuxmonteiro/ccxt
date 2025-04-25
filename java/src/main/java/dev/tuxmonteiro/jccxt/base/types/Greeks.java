package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "askImpliedVolatility",
    "askPrice",
    "askSize",
    "bidImpliedVolatility",
    "bidPrice",
    "bidSize",
    "datetime",
    "delta",
    "gamma",
    "info",
    "lastPrice",
    "markImpliedVolatility",
    "markPrice",
    "rho",
    "symbol",
    "theta",
    "timestamp",
    "underlyingPrice",
    "vega"
})
public class Greeks implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askImpliedVolatility")
    private Double askImpliedVolatility;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askPrice")
    private Double askPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askSize")
    private Double askSize;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidImpliedVolatility")
    private Double bidImpliedVolatility;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidPrice")
    private Double bidPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidSize")
    private Double bidSize;
    @JsonProperty("datetime")
    private String datetime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delta")
    private Double delta;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gamma")
    private Double gamma;
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
    @JsonProperty("lastPrice")
    private Double lastPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markImpliedVolatility")
    private Double markImpliedVolatility;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markPrice")
    private Double markPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rho")
    private Double rho;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta")
    private Double theta;
    @JsonProperty("timestamp")
    private Double timestamp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice")
    private Double underlyingPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vega")
    private Double vega;
    private final static long serialVersionUID = -3797481088192989232L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askImpliedVolatility")
    public Double getAskImpliedVolatility() {
        return askImpliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askImpliedVolatility")
    public void setAskImpliedVolatility(Double askImpliedVolatility) {
        this.askImpliedVolatility = askImpliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askPrice")
    public Double getAskPrice() {
        return askPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askPrice")
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askSize")
    public Double getAskSize() {
        return askSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("askSize")
    public void setAskSize(Double askSize) {
        this.askSize = askSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidImpliedVolatility")
    public Double getBidImpliedVolatility() {
        return bidImpliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidImpliedVolatility")
    public void setBidImpliedVolatility(Double bidImpliedVolatility) {
        this.bidImpliedVolatility = bidImpliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidPrice")
    public Double getBidPrice() {
        return bidPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidPrice")
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidSize")
    public Double getBidSize() {
        return bidSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bidSize")
    public void setBidSize(Double bidSize) {
        this.bidSize = bidSize;
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
    @JsonProperty("delta")
    public Double getDelta() {
        return delta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delta")
    public void setDelta(Double delta) {
        this.delta = delta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gamma")
    public Double getGamma() {
        return gamma;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("gamma")
    public void setGamma(Double gamma) {
        this.gamma = gamma;
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
    @JsonProperty("lastPrice")
    public Double getLastPrice() {
        return lastPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastPrice")
    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markImpliedVolatility")
    public Double getMarkImpliedVolatility() {
        return markImpliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markImpliedVolatility")
    public void setMarkImpliedVolatility(Double markImpliedVolatility) {
        this.markImpliedVolatility = markImpliedVolatility;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markPrice")
    public Double getMarkPrice() {
        return markPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("markPrice")
    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rho")
    public Double getRho() {
        return rho;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rho")
    public void setRho(Double rho) {
        this.rho = rho;
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta")
    public Double getTheta() {
        return theta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("theta")
    public void setTheta(Double theta) {
        this.theta = theta;
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
    @JsonProperty("underlyingPrice")
    public Double getUnderlyingPrice() {
        return underlyingPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice")
    public void setUnderlyingPrice(Double underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vega")
    public Double getVega() {
        return vega;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vega")
    public void setVega(Double vega) {
        this.vega = vega;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Greeks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("askImpliedVolatility");
        sb.append('=');
        sb.append(((this.askImpliedVolatility == null)?"<null>":this.askImpliedVolatility));
        sb.append(',');
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("askSize");
        sb.append('=');
        sb.append(((this.askSize == null)?"<null>":this.askSize));
        sb.append(',');
        sb.append("bidImpliedVolatility");
        sb.append('=');
        sb.append(((this.bidImpliedVolatility == null)?"<null>":this.bidImpliedVolatility));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
        sb.append(',');
        sb.append("bidSize");
        sb.append('=');
        sb.append(((this.bidSize == null)?"<null>":this.bidSize));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("delta");
        sb.append('=');
        sb.append(((this.delta == null)?"<null>":this.delta));
        sb.append(',');
        sb.append("gamma");
        sb.append('=');
        sb.append(((this.gamma == null)?"<null>":this.gamma));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("lastPrice");
        sb.append('=');
        sb.append(((this.lastPrice == null)?"<null>":this.lastPrice));
        sb.append(',');
        sb.append("markImpliedVolatility");
        sb.append('=');
        sb.append(((this.markImpliedVolatility == null)?"<null>":this.markImpliedVolatility));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
        sb.append(',');
        sb.append("rho");
        sb.append('=');
        sb.append(((this.rho == null)?"<null>":this.rho));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("theta");
        sb.append('=');
        sb.append(((this.theta == null)?"<null>":this.theta));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("underlyingPrice");
        sb.append('=');
        sb.append(((this.underlyingPrice == null)?"<null>":this.underlyingPrice));
        sb.append(',');
        sb.append("vega");
        sb.append('=');
        sb.append(((this.vega == null)?"<null>":this.vega));
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
        result = ((result* 31)+((this.askPrice == null)? 0 :this.askPrice.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.underlyingPrice == null)? 0 :this.underlyingPrice.hashCode()));
        result = ((result* 31)+((this.bidSize == null)? 0 :this.bidSize.hashCode()));
        result = ((result* 31)+((this.bidImpliedVolatility == null)? 0 :this.bidImpliedVolatility.hashCode()));
        result = ((result* 31)+((this.delta == null)? 0 :this.delta.hashCode()));
        result = ((result* 31)+((this.theta == null)? 0 :this.theta.hashCode()));
        result = ((result* 31)+((this.askImpliedVolatility == null)? 0 :this.askImpliedVolatility.hashCode()));
        result = ((result* 31)+((this.bidPrice == null)? 0 :this.bidPrice.hashCode()));
        result = ((result* 31)+((this.markImpliedVolatility == null)? 0 :this.markImpliedVolatility.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.rho == null)? 0 :this.rho.hashCode()));
        result = ((result* 31)+((this.askSize == null)? 0 :this.askSize.hashCode()));
        result = ((result* 31)+((this.gamma == null)? 0 :this.gamma.hashCode()));
        result = ((result* 31)+((this.vega == null)? 0 :this.vega.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.lastPrice == null)? 0 :this.lastPrice.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Greeks) == false) {
            return false;
        }
        Greeks rhs = ((Greeks) other);
        return ((((((((((((((((((((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.underlyingPrice == rhs.underlyingPrice)||((this.underlyingPrice!= null)&&this.underlyingPrice.equals(rhs.underlyingPrice))))&&((this.bidSize == rhs.bidSize)||((this.bidSize!= null)&&this.bidSize.equals(rhs.bidSize))))&&((this.bidImpliedVolatility == rhs.bidImpliedVolatility)||((this.bidImpliedVolatility!= null)&&this.bidImpliedVolatility.equals(rhs.bidImpliedVolatility))))&&((this.delta == rhs.delta)||((this.delta!= null)&&this.delta.equals(rhs.delta))))&&((this.theta == rhs.theta)||((this.theta!= null)&&this.theta.equals(rhs.theta))))&&((this.askImpliedVolatility == rhs.askImpliedVolatility)||((this.askImpliedVolatility!= null)&&this.askImpliedVolatility.equals(rhs.askImpliedVolatility))))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.markImpliedVolatility == rhs.markImpliedVolatility)||((this.markImpliedVolatility!= null)&&this.markImpliedVolatility.equals(rhs.markImpliedVolatility))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.rho == rhs.rho)||((this.rho!= null)&&this.rho.equals(rhs.rho))))&&((this.askSize == rhs.askSize)||((this.askSize!= null)&&this.askSize.equals(rhs.askSize))))&&((this.gamma == rhs.gamma)||((this.gamma!= null)&&this.gamma.equals(rhs.gamma))))&&((this.vega == rhs.vega)||((this.vega!= null)&&this.vega.equals(rhs.vega))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.lastPrice == rhs.lastPrice)||((this.lastPrice!= null)&&this.lastPrice.equals(rhs.lastPrice))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
