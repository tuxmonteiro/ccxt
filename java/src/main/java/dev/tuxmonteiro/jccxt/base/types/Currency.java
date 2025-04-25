package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "active",
    "code",
    "deposit",
    "fee",
    "id",
    "info",
    "limits",
    "margin",
    "name",
    "networks",
    "numericId",
    "precision",
    "type",
    "withdraw"
})
public class Currency implements Serializable
{

    @JsonProperty("active")
    private Boolean active;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    private String code;
    @JsonProperty("deposit")
    private Boolean deposit;
    @JsonProperty("fee")
    private Double fee;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
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
    @JsonProperty("limits")
    private Limits limits;
    @JsonProperty("margin")
    private Boolean margin;
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("networks")
    private Networks networks;
    @JsonProperty("numericId")
    private Double numericId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("precision")
    private Double precision;
    @JsonProperty("type")
    private String type;
    @JsonProperty("withdraw")
    private Boolean withdraw;
    private final static long serialVersionUID = 4627185884312931483L;

    @JsonProperty("active")
    public Optional<Boolean> getActive() {
        return Optional.ofNullable(active);
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("deposit")
    public Optional<Boolean> getDeposit() {
        return Optional.ofNullable(deposit);
    }

    @JsonProperty("deposit")
    public void setDeposit(Boolean deposit) {
        this.deposit = deposit;
    }

    @JsonProperty("fee")
    public Optional<Double> getFee() {
        return Optional.ofNullable(fee);
    }

    @JsonProperty("fee")
    public void setFee(Double fee) {
        this.fee = fee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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
    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    @JsonProperty("margin")
    public Optional<Boolean> getMargin() {
        return Optional.ofNullable(margin);
    }

    @JsonProperty("margin")
    public void setMargin(Boolean margin) {
        this.margin = margin;
    }

    @JsonProperty("name")
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("networks")
    public Networks getNetworks() {
        return networks;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("networks")
    public void setNetworks(Networks networks) {
        this.networks = networks;
    }

    @JsonProperty("numericId")
    public Optional<Double> getNumericId() {
        return Optional.ofNullable(numericId);
    }

    @JsonProperty("numericId")
    public void setNumericId(Double numericId) {
        this.numericId = numericId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("precision")
    public Double getPrecision() {
        return precision;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("precision")
    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("withdraw")
    public Optional<Boolean> getWithdraw() {
        return Optional.ofNullable(withdraw);
    }

    @JsonProperty("withdraw")
    public void setWithdraw(Boolean withdraw) {
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Currency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("margin");
        sb.append('=');
        sb.append(((this.margin == null)?"<null>":this.margin));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("networks");
        sb.append('=');
        sb.append(((this.networks == null)?"<null>":this.networks));
        sb.append(',');
        sb.append("numericId");
        sb.append('=');
        sb.append(((this.numericId == null)?"<null>":this.numericId));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.numericId == null)? 0 :this.numericId.hashCode()));
        result = ((result* 31)+((this.margin == null)? 0 :this.margin.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.networks == null)? 0 :this.networks.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.deposit == null)? 0 :this.deposit.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.withdraw == null)? 0 :this.withdraw.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Currency) == false) {
            return false;
        }
        Currency rhs = ((Currency) other);
        return (((((((((((((((this.numericId == rhs.numericId)||((this.numericId!= null)&&this.numericId.equals(rhs.numericId)))&&((this.margin == rhs.margin)||((this.margin!= null)&&this.margin.equals(rhs.margin))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.networks == rhs.networks)||((this.networks!= null)&&this.networks.equals(rhs.networks))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.deposit == rhs.deposit)||((this.deposit!= null)&&this.deposit.equals(rhs.deposit))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.withdraw == rhs.withdraw)||((this.withdraw!= null)&&this.withdraw.equals(rhs.withdraw))));
    }

}
