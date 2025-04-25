package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "info",
    "maintenanceMarginRate",
    "maxLeverage",
    "maxNotional",
    "minNotional",
    "symbol",
    "tier"
})
public class LeverageTier implements Serializable
{

    @JsonProperty("currency")
    private String currency;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("maintenanceMarginRate")
    private Double maintenanceMarginRate;
    @JsonProperty("maxLeverage")
    private Double maxLeverage;
    @JsonProperty("maxNotional")
    private Double maxNotional;
    @JsonProperty("minNotional")
    private Double minNotional;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("tier")
    private Double tier;
    private final static long serialVersionUID = -419695662915346230L;

    @JsonProperty("currency")
    public Optional<String> getCurrency() {
        return Optional.ofNullable(currency);
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
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

    @JsonProperty("maintenanceMarginRate")
    public Optional<Double> getMaintenanceMarginRate() {
        return Optional.ofNullable(maintenanceMarginRate);
    }

    @JsonProperty("maintenanceMarginRate")
    public void setMaintenanceMarginRate(Double maintenanceMarginRate) {
        this.maintenanceMarginRate = maintenanceMarginRate;
    }

    @JsonProperty("maxLeverage")
    public Optional<Double> getMaxLeverage() {
        return Optional.ofNullable(maxLeverage);
    }

    @JsonProperty("maxLeverage")
    public void setMaxLeverage(Double maxLeverage) {
        this.maxLeverage = maxLeverage;
    }

    @JsonProperty("maxNotional")
    public Optional<Double> getMaxNotional() {
        return Optional.ofNullable(maxNotional);
    }

    @JsonProperty("maxNotional")
    public void setMaxNotional(Double maxNotional) {
        this.maxNotional = maxNotional;
    }

    @JsonProperty("minNotional")
    public Optional<Double> getMinNotional() {
        return Optional.ofNullable(minNotional);
    }

    @JsonProperty("minNotional")
    public void setMinNotional(Double minNotional) {
        this.minNotional = minNotional;
    }

    @JsonProperty("symbol")
    public Optional<String> getSymbol() {
        return Optional.ofNullable(symbol);
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("tier")
    public Optional<Double> getTier() {
        return Optional.ofNullable(tier);
    }

    @JsonProperty("tier")
    public void setTier(Double tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LeverageTier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("maintenanceMarginRate");
        sb.append('=');
        sb.append(((this.maintenanceMarginRate == null)?"<null>":this.maintenanceMarginRate));
        sb.append(',');
        sb.append("maxLeverage");
        sb.append('=');
        sb.append(((this.maxLeverage == null)?"<null>":this.maxLeverage));
        sb.append(',');
        sb.append("maxNotional");
        sb.append('=');
        sb.append(((this.maxNotional == null)?"<null>":this.maxNotional));
        sb.append(',');
        sb.append("minNotional");
        sb.append('=');
        sb.append(((this.minNotional == null)?"<null>":this.minNotional));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("tier");
        sb.append('=');
        sb.append(((this.tier == null)?"<null>":this.tier));
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
        result = ((result* 31)+((this.maxNotional == null)? 0 :this.maxNotional.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.maintenanceMarginRate == null)? 0 :this.maintenanceMarginRate.hashCode()));
        result = ((result* 31)+((this.tier == null)? 0 :this.tier.hashCode()));
        result = ((result* 31)+((this.minNotional == null)? 0 :this.minNotional.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.maxLeverage == null)? 0 :this.maxLeverage.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeverageTier) == false) {
            return false;
        }
        LeverageTier rhs = ((LeverageTier) other);
        return (((((((((this.maxNotional == rhs.maxNotional)||((this.maxNotional!= null)&&this.maxNotional.equals(rhs.maxNotional)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.maintenanceMarginRate == rhs.maintenanceMarginRate)||((this.maintenanceMarginRate!= null)&&this.maintenanceMarginRate.equals(rhs.maintenanceMarginRate))))&&((this.tier == rhs.tier)||((this.tier!= null)&&this.tier.equals(rhs.tier))))&&((this.minNotional == rhs.minNotional)||((this.minNotional!= null)&&this.minNotional.equals(rhs.minNotional))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.maxLeverage == rhs.maxLeverage)||((this.maxLeverage!= null)&&this.maxLeverage.equals(rhs.maxLeverage))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))));
    }

}
