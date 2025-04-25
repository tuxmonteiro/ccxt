package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amount",
    "currency",
    "datetime",
    "fromAccount",
    "id",
    "info",
    "status",
    "timestamp",
    "toAccount"
})
public class TransferEntry implements Serializable
{

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("fromAccount")
    private String fromAccount;
    @JsonProperty("id")
    private String id;
    @JsonProperty("info")
    private Object info;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("toAccount")
    private String toAccount;
    private final static long serialVersionUID = -991983516589139592L;

    @JsonProperty("amount")
    public Optional<Double> getAmount() {
        return Optional.ofNullable(amount);
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
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

    @JsonProperty("fromAccount")
    public Optional<String> getFromAccount() {
        return Optional.ofNullable(fromAccount);
    }

    @JsonProperty("fromAccount")
    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("info")
    public Optional<Object> getInfo() {
        return Optional.ofNullable(info);
    }

    @JsonProperty("info")
    public void setInfo(Object info) {
        this.info = info;
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

    @JsonProperty("toAccount")
    public Optional<String> getToAccount() {
        return Optional.ofNullable(toAccount);
    }

    @JsonProperty("toAccount")
    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("fromAccount");
        sb.append('=');
        sb.append(((this.fromAccount == null)?"<null>":this.fromAccount));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("toAccount");
        sb.append('=');
        sb.append(((this.toAccount == null)?"<null>":this.toAccount));
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
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.toAccount == null)? 0 :this.toAccount.hashCode()));
        result = ((result* 31)+((this.fromAccount == null)? 0 :this.fromAccount.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
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
        if ((other instanceof TransferEntry) == false) {
            return false;
        }
        TransferEntry rhs = ((TransferEntry) other);
        return ((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.toAccount == rhs.toAccount)||((this.toAccount!= null)&&this.toAccount.equals(rhs.toAccount))))&&((this.fromAccount == rhs.fromAccount)||((this.fromAccount!= null)&&this.fromAccount.equals(rhs.fromAccount))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
