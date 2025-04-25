package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "addressFrom",
    "addressTo",
    "amount",
    "comment",
    "currency",
    "datetime",
    "fee",
    "id",
    "info",
    "internal",
    "network",
    "status",
    "tag",
    "tagFrom",
    "tagTo",
    "timestamp",
    "txid",
    "type",
    "updated"
})
public class Transaction implements Serializable
{

    @JsonProperty("address")
    private String address;
    @JsonProperty("addressFrom")
    private String addressFrom;
    @JsonProperty("addressTo")
    private String addressTo;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("datetime")
    private String datetime;
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
    @JsonProperty("internal")
    private Boolean internal;
    @JsonProperty("network")
    private String network;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private Object status;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("tagFrom")
    private String tagFrom;
    @JsonProperty("tagTo")
    private String tagTo;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("txid")
    private String txid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Object type;
    @JsonProperty("updated")
    private Double updated;
    private final static long serialVersionUID = 6190836546396606529L;

    @JsonProperty("address")
    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("addressFrom")
    public Optional<String> getAddressFrom() {
        return Optional.ofNullable(addressFrom);
    }

    @JsonProperty("addressFrom")
    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    @JsonProperty("addressTo")
    public Optional<String> getAddressTo() {
        return Optional.ofNullable(addressTo);
    }

    @JsonProperty("addressTo")
    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    @JsonProperty("amount")
    public Optional<Double> getAmount() {
        return Optional.ofNullable(amount);
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("comment")
    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
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

    @JsonProperty("internal")
    public Optional<Boolean> getInternal() {
        return Optional.ofNullable(internal);
    }

    @JsonProperty("internal")
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    @JsonProperty("network")
    public Optional<String> getNetwork() {
        return Optional.ofNullable(network);
    }

    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("tag")
    public Optional<String> getTag() {
        return Optional.ofNullable(tag);
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("tagFrom")
    public Optional<String> getTagFrom() {
        return Optional.ofNullable(tagFrom);
    }

    @JsonProperty("tagFrom")
    public void setTagFrom(String tagFrom) {
        this.tagFrom = tagFrom;
    }

    @JsonProperty("tagTo")
    public Optional<String> getTagTo() {
        return Optional.ofNullable(tagTo);
    }

    @JsonProperty("tagTo")
    public void setTagTo(String tagTo) {
        this.tagTo = tagTo;
    }

    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
        return Optional.ofNullable(timestamp);
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("txid")
    public Optional<String> getTxid() {
        return Optional.ofNullable(txid);
    }

    @JsonProperty("txid")
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("updated")
    public Optional<Double> getUpdated() {
        return Optional.ofNullable(updated);
    }

    @JsonProperty("updated")
    public void setUpdated(Double updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transaction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("addressFrom");
        sb.append('=');
        sb.append(((this.addressFrom == null)?"<null>":this.addressFrom));
        sb.append(',');
        sb.append("addressTo");
        sb.append('=');
        sb.append(((this.addressTo == null)?"<null>":this.addressTo));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
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
        sb.append("internal");
        sb.append('=');
        sb.append(((this.internal == null)?"<null>":this.internal));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("tagFrom");
        sb.append('=');
        sb.append(((this.tagFrom == null)?"<null>":this.tagFrom));
        sb.append(',');
        sb.append("tagTo");
        sb.append('=');
        sb.append(((this.tagTo == null)?"<null>":this.tagTo));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("txid");
        sb.append('=');
        sb.append(((this.txid == null)?"<null>":this.txid));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
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
        result = ((result* 31)+((this.tagFrom == null)? 0 :this.tagFrom.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.internal == null)? 0 :this.internal.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.tagTo == null)? 0 :this.tagTo.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.txid == null)? 0 :this.txid.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.addressTo == null)? 0 :this.addressTo.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.addressFrom == null)? 0 :this.addressFrom.hashCode()));
        result = ((result* 31)+((this.updated == null)? 0 :this.updated.hashCode()));
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
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return (((((((((((((((((((((this.tagFrom == rhs.tagFrom)||((this.tagFrom!= null)&&this.tagFrom.equals(rhs.tagFrom)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.internal == rhs.internal)||((this.internal!= null)&&this.internal.equals(rhs.internal))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.tagTo == rhs.tagTo)||((this.tagTo!= null)&&this.tagTo.equals(rhs.tagTo))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.txid == rhs.txid)||((this.txid!= null)&&this.txid.equals(rhs.txid))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.addressTo == rhs.addressTo)||((this.addressTo!= null)&&this.addressTo.equals(rhs.addressTo))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.addressFrom == rhs.addressFrom)||((this.addressFrom!= null)&&this.addressFrom.equals(rhs.addressFrom))))&&((this.updated == rhs.updated)||((this.updated!= null)&&this.updated.equals(rhs.updated))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
