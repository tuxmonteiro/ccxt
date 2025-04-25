package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cross",
    "isolated"
})
public class MarketMarginModes implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cross")
    private Boolean cross;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isolated")
    private Boolean isolated;
    private final static long serialVersionUID = 8858806844492277113L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cross")
    public Boolean getCross() {
        return cross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cross")
    public void setCross(Boolean cross) {
        this.cross = cross;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isolated")
    public Boolean getIsolated() {
        return isolated;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("isolated")
    public void setIsolated(Boolean isolated) {
        this.isolated = isolated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MarketMarginModes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cross");
        sb.append('=');
        sb.append(((this.cross == null)?"<null>":this.cross));
        sb.append(',');
        sb.append("isolated");
        sb.append('=');
        sb.append(((this.isolated == null)?"<null>":this.isolated));
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
        result = ((result* 31)+((this.cross == null)? 0 :this.cross.hashCode()));
        result = ((result* 31)+((this.isolated == null)? 0 :this.isolated.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketMarginModes) == false) {
            return false;
        }
        MarketMarginModes rhs = ((MarketMarginModes) other);
        return (((this.cross == rhs.cross)||((this.cross!= null)&&this.cross.equals(rhs.cross)))&&((this.isolated == rhs.isolated)||((this.isolated!= null)&&this.isolated.equals(rhs.isolated))));
    }

}
