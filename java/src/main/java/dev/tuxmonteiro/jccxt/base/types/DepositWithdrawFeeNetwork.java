package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fee",
    "percentage"
})
public class DepositWithdrawFeeNetwork implements Serializable
{

    @JsonProperty("fee")
    private Double fee;
    @JsonProperty("percentage")
    private Boolean percentage;
    private final static long serialVersionUID = 8182799989214464990L;

    @JsonProperty("fee")
    public Optional<Double> getFee() {
        return Optional.ofNullable(fee);
    }

    @JsonProperty("fee")
    public void setFee(Double fee) {
        this.fee = fee;
    }

    @JsonProperty("percentage")
    public Optional<Boolean> getPercentage() {
        return Optional.ofNullable(percentage);
    }

    @JsonProperty("percentage")
    public void setPercentage(Boolean percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositWithdrawFeeNetwork.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
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
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositWithdrawFeeNetwork) == false) {
            return false;
        }
        DepositWithdrawFeeNetwork rhs = ((DepositWithdrawFeeNetwork) other);
        return (((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee)))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))));
    }

}
