package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "info",
    "maker",
    "percentage",
    "symbol",
    "taker",
    "tierBased"
})
public class TradingFee implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("maker")
    private Double maker;
    @JsonProperty("percentage")
    private Boolean percentage;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("taker")
    private Double taker;
    @JsonProperty("tierBased")
    private Boolean tierBased;
    private final static long serialVersionUID = 1842996625897906889L;

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

    @JsonProperty("maker")
    public Optional<Double> getMaker() {
        return Optional.ofNullable(maker);
    }

    @JsonProperty("maker")
    public void setMaker(Double maker) {
        this.maker = maker;
    }

    @JsonProperty("percentage")
    public Optional<Boolean> getPercentage() {
        return Optional.ofNullable(percentage);
    }

    @JsonProperty("percentage")
    public void setPercentage(Boolean percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("symbol")
    public Optional<String> getSymbol() {
        return Optional.ofNullable(symbol);
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("taker")
    public Optional<Double> getTaker() {
        return Optional.ofNullable(taker);
    }

    @JsonProperty("taker")
    public void setTaker(Double taker) {
        this.taker = taker;
    }

    @JsonProperty("tierBased")
    public Optional<Boolean> getTierBased() {
        return Optional.ofNullable(tierBased);
    }

    @JsonProperty("tierBased")
    public void setTierBased(Boolean tierBased) {
        this.tierBased = tierBased;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradingFee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("maker");
        sb.append('=');
        sb.append(((this.maker == null)?"<null>":this.maker));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("taker");
        sb.append('=');
        sb.append(((this.taker == null)?"<null>":this.taker));
        sb.append(',');
        sb.append("tierBased");
        sb.append('=');
        sb.append(((this.tierBased == null)?"<null>":this.tierBased));
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
        result = ((result* 31)+((this.maker == null)? 0 :this.maker.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.tierBased == null)? 0 :this.tierBased.hashCode()));
        result = ((result* 31)+((this.taker == null)? 0 :this.taker.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradingFee) == false) {
            return false;
        }
        TradingFee rhs = ((TradingFee) other);
        return (((((((this.maker == rhs.maker)||((this.maker!= null)&&this.maker.equals(rhs.maker)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.tierBased == rhs.tierBased)||((this.tierBased!= null)&&this.tierBased.equals(rhs.tierBased))))&&((this.taker == rhs.taker)||((this.taker!= null)&&this.taker.equals(rhs.taker))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))));
    }

}
