package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "free",
    "total",
    "used"
})
public class BalanceAccount implements Serializable
{

    @JsonProperty("free")
    private String free;
    @JsonProperty("total")
    private String total;
    @JsonProperty("used")
    private String used;
    private final static long serialVersionUID = 659438178387613601L;

    @JsonProperty("free")
    public Optional<String> getFree() {
        return Optional.ofNullable(free);
    }

    @JsonProperty("free")
    public void setFree(String free) {
        this.free = free;
    }

    @JsonProperty("total")
    public Optional<String> getTotal() {
        return Optional.ofNullable(total);
    }

    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }

    @JsonProperty("used")
    public Optional<String> getUsed() {
        return Optional.ofNullable(used);
    }

    @JsonProperty("used")
    public void setUsed(String used) {
        this.used = used;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BalanceAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.free == null)? 0 :this.free.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.used == null)? 0 :this.used.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalanceAccount) == false) {
            return false;
        }
        BalanceAccount rhs = ((BalanceAccount) other);
        return ((((this.free == rhs.free)||((this.free!= null)&&this.free.equals(rhs.free)))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.used == rhs.used)||((this.used!= null)&&this.used.equals(rhs.used))));
    }

}
