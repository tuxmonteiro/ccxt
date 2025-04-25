package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "debt",
    "free",
    "total",
    "used"
})
public class Balance implements Serializable
{

    @JsonProperty("debt")
    private Double debt;
    @JsonProperty("free")
    private Double free;
    @JsonProperty("total")
    private Double total;
    @JsonProperty("used")
    private Double used;
    private final static long serialVersionUID = -3865922943903865447L;

    @JsonProperty("debt")
    public Optional<Double> getDebt() {
        return Optional.ofNullable(debt);
    }

    @JsonProperty("debt")
    public void setDebt(Double debt) {
        this.debt = debt;
    }

    @JsonProperty("free")
    public Optional<Double> getFree() {
        return Optional.ofNullable(free);
    }

    @JsonProperty("free")
    public void setFree(Double free) {
        this.free = free;
    }

    @JsonProperty("total")
    public Optional<Double> getTotal() {
        return Optional.ofNullable(total);
    }

    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    @JsonProperty("used")
    public Optional<Double> getUsed() {
        return Optional.ofNullable(used);
    }

    @JsonProperty("used")
    public void setUsed(Double used) {
        this.used = used;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Balance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("debt");
        sb.append('=');
        sb.append(((this.debt == null)?"<null>":this.debt));
        sb.append(',');
        sb.append("free");
        sb.append('=');
        sb.append(((this.free == null)?"<null>":this.free));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("used");
        sb.append('=');
        sb.append(((this.used == null)?"<null>":this.used));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.used == null)? 0 :this.used.hashCode()));
        result = ((result* 31)+((this.free == null)? 0 :this.free.hashCode()));
        result = ((result* 31)+((this.debt == null)? 0 :this.debt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Balance) == false) {
            return false;
        }
        Balance rhs = ((Balance) other);
        return (((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.used == rhs.used)||((this.used!= null)&&this.used.equals(rhs.used))))&&((this.free == rhs.free)||((this.free!= null)&&this.free.equals(rhs.free))))&&((this.debt == rhs.debt)||((this.debt!= null)&&this.debt.equals(rhs.debt))));
    }

}
