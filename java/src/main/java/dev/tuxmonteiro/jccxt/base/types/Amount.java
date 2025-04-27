package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "max",
    "min"
})
public class Amount implements Serializable
{

    @JsonProperty("max")
    private Double max;
    @JsonProperty("min")
    private Double min;
    private final static long serialVersionUID = 5249165013733511514L;

    @JsonProperty("max")
    public Optional<Double> getMax() {
        return Optional.ofNullable(max);
    }

    @JsonProperty("max")
    public void setMax(Double max) {
        this.max = max;
    }

    @JsonProperty("min")
    public Optional<Double> getMin() {
        return Optional.ofNullable(min);
    }

    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("max");
        sb.append('=');
        sb.append(((this.max == null)?"<null>":this.max));
        sb.append(',');
        sb.append("min");
        sb.append('=');
        sb.append(((this.min == null)?"<null>":this.min));
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
        result = ((result* 31)+((this.max == null)? 0 :this.max.hashCode()));
        result = ((result* 31)+((this.min == null)? 0 :this.min.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amount) == false) {
            return false;
        }
        Amount rhs = ((Amount) other);
        return (((this.max == rhs.max)||((this.max!= null)&&this.max.equals(rhs.max)))&&((this.min == rhs.min)||((this.min!= null)&&this.min.equals(rhs.min))));
    }

}
