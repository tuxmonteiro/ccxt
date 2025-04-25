package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "account",
    "after",
    "amount",
    "before",
    "currency",
    "datetime",
    "direction",
    "fee",
    "id",
    "info",
    "referenceAccount",
    "referenceId",
    "status",
    "timestamp",
    "type"
})
public class LedgerEntry implements Serializable
{

    @JsonProperty("account")
    private String account;
    @JsonProperty("after")
    private Double after;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("before")
    private Double before;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("fee")
    private Fee fee;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("referenceAccount")
    private String referenceAccount;
    @JsonProperty("referenceId")
    private String referenceId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = -2983420735049711806L;

    @JsonProperty("account")
    public Optional<String> getAccount() {
        return Optional.ofNullable(account);
    }

    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    @JsonProperty("after")
    public Optional<Double> getAfter() {
        return Optional.ofNullable(after);
    }

    @JsonProperty("after")
    public void setAfter(Double after) {
        this.after = after;
    }

    @JsonProperty("amount")
    public Optional<Double> getAmount() {
        return Optional.ofNullable(amount);
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("before")
    public Optional<Double> getBefore() {
        return Optional.ofNullable(before);
    }

    @JsonProperty("before")
    public void setBefore(Double before) {
        this.before = before;
    }

    @JsonProperty("currency")
    public Optional<String> getCurrency() {
        return Optional.ofNullable(currency);
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("direction")
    public Optional<String> getDirection() {
        return Optional.ofNullable(direction);
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("fee")
    public Optional<Fee> getFee() {
        return Optional.ofNullable(fee);
    }

    @JsonProperty("fee")
    public void setFee(Fee fee) {
        this.fee = fee;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

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

    @JsonProperty("referenceAccount")
    public Optional<String> getReferenceAccount() {
        return Optional.ofNullable(referenceAccount);
    }

    @JsonProperty("referenceAccount")
    public void setReferenceAccount(String referenceAccount) {
        this.referenceAccount = referenceAccount;
    }

    @JsonProperty("referenceId")
    public Optional<String> getReferenceId() {
        return Optional.ofNullable(referenceId);
    }

    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @JsonProperty("status")
    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
        return Optional.ofNullable(timestamp);
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LedgerEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
        sb.append(',');
        sb.append("after");
        sb.append('=');
        sb.append(((this.after == null)?"<null>":this.after));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("before");
        sb.append('=');
        sb.append(((this.before == null)?"<null>":this.before));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
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
        sb.append("referenceAccount");
        sb.append('=');
        sb.append(((this.referenceAccount == null)?"<null>":this.referenceAccount));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.before == null)? 0 :this.before.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.referenceAccount == null)? 0 :this.referenceAccount.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.after == null)? 0 :this.after.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LedgerEntry) == false) {
            return false;
        }
        LedgerEntry rhs = ((LedgerEntry) other);
        return ((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.before == rhs.before)||((this.before!= null)&&this.before.equals(rhs.before))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.referenceAccount == rhs.referenceAccount)||((this.referenceAccount!= null)&&this.referenceAccount.equals(rhs.referenceAccount))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.after == rhs.after)||((this.after!= null)&&this.after.equals(rhs.after))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
