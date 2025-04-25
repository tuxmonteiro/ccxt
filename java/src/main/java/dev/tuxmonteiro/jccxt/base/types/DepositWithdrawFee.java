package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deposit",
    "info",
    "networks",
    "withdraw"
})
public class DepositWithdrawFee implements Serializable
{

    @JsonProperty("deposit")
    private DepositWithdrawFeeNetwork deposit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("networks")
    private List<DepositWithdrawFeeNetwork> networks = new ArrayList<DepositWithdrawFeeNetwork>();
    @JsonProperty("withdraw")
    private DepositWithdrawFeeNetwork withdraw;
    private final static long serialVersionUID = 1544241078567282027L;

    @JsonProperty("deposit")
    public Optional<DepositWithdrawFeeNetwork> getDeposit() {
        return Optional.ofNullable(deposit);
    }

    @JsonProperty("deposit")
    public void setDeposit(DepositWithdrawFeeNetwork deposit) {
        this.deposit = deposit;
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

    @JsonProperty("networks")
    public Optional<List<DepositWithdrawFeeNetwork>> getNetworks() {
        return Optional.ofNullable(networks);
    }

    @JsonProperty("networks")
    public void setNetworks(List<DepositWithdrawFeeNetwork> networks) {
        this.networks = networks;
    }

    @JsonProperty("withdraw")
    public Optional<DepositWithdrawFeeNetwork> getWithdraw() {
        return Optional.ofNullable(withdraw);
    }

    @JsonProperty("withdraw")
    public void setWithdraw(DepositWithdrawFeeNetwork withdraw) {
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DepositWithdrawFee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("networks");
        sb.append('=');
        sb.append(((this.networks == null)?"<null>":this.networks));
        sb.append(',');
        sb.append("withdraw");
        sb.append('=');
        sb.append(((this.withdraw == null)?"<null>":this.withdraw));
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
        result = ((result* 31)+((this.deposit == null)? 0 :this.deposit.hashCode()));
        result = ((result* 31)+((this.networks == null)? 0 :this.networks.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.withdraw == null)? 0 :this.withdraw.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepositWithdrawFee) == false) {
            return false;
        }
        DepositWithdrawFee rhs = ((DepositWithdrawFee) other);
        return (((((this.deposit == rhs.deposit)||((this.deposit!= null)&&this.deposit.equals(rhs.deposit)))&&((this.networks == rhs.networks)||((this.networks!= null)&&this.networks.equals(rhs.networks))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.withdraw == rhs.withdraw)||((this.withdraw!= null)&&this.withdraw.equals(rhs.withdraw))));
    }

}
