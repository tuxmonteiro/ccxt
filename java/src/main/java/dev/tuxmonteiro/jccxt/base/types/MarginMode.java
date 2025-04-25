package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "info",
    "marginMode",
    "symbol"
})
public class MarginMode implements Serializable
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
    @JsonProperty("marginMode")
    private Object marginMode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    private final static long serialVersionUID = 6360488777364752317L;

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
        sb.append(MarginMode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("marginMode");
        sb.append('=');
        sb.append(((this.marginMode == null)?"<null>":this.marginMode));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.marginMode == null)? 0 :this.marginMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarginMode) == false) {
            return false;
        }
        MarginMode rhs = ((MarginMode) other);
        return ((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.marginMode == rhs.marginMode)||((this.marginMode!= null)&&this.marginMode.equals(rhs.marginMode))));
    }

}
