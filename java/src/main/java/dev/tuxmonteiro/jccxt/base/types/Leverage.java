package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "info",
    "longLeverage",
    "marginMode",
    "shortLeverage",
    "symbol"
})
public class Leverage implements Serializable
{

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
    @JsonProperty("longLeverage")
    private Double longLeverage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marginMode")
    private Object marginMode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shortLeverage")
    private Double shortLeverage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    private final static long serialVersionUID = -2091663323967877129L;

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
    @JsonProperty("longLeverage")
    public Double getLongLeverage() {
        return longLeverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("longLeverage")
    public void setLongLeverage(Double longLeverage) {
        this.longLeverage = longLeverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marginMode")
    public Object getMarginMode() {
        return marginMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marginMode")
    public void setMarginMode(Object marginMode) {
        this.marginMode = marginMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shortLeverage")
    public Double getShortLeverage() {
        return shortLeverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shortLeverage")
    public void setShortLeverage(Double shortLeverage) {
        this.shortLeverage = shortLeverage;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Leverage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("longLeverage");
        sb.append('=');
        sb.append(((this.longLeverage == null)?"<null>":this.longLeverage));
        sb.append(',');
        sb.append("marginMode");
        sb.append('=');
        sb.append(((this.marginMode == null)?"<null>":this.marginMode));
        sb.append(',');
        sb.append("shortLeverage");
        sb.append('=');
        sb.append(((this.shortLeverage == null)?"<null>":this.shortLeverage));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
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
        result = ((result* 31)+((this.longLeverage == null)? 0 :this.longLeverage.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.marginMode == null)? 0 :this.marginMode.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.shortLeverage == null)? 0 :this.shortLeverage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Leverage) == false) {
            return false;
        }
        Leverage rhs = ((Leverage) other);
        return ((((((this.longLeverage == rhs.longLeverage)||((this.longLeverage!= null)&&this.longLeverage.equals(rhs.longLeverage)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.marginMode == rhs.marginMode)||((this.marginMode!= null)&&this.marginMode.equals(rhs.marginMode))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.shortLeverage == rhs.shortLeverage)||((this.shortLeverage!= null)&&this.shortLeverage.equals(rhs.shortLeverage))));
    }

}
