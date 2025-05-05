package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "cost",
        "leverage",
        "market",
        "price"
})
public class Limits implements Serializable {

    private final static long serialVersionUID = -48593676845442859L;

    /**
     * Request parameters
     *
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Request parameters")
    private MinMax amount;
    /**
     * Request parameters
     *
     */
    @JsonProperty("cost")
    @JsonPropertyDescription("Request parameters")
    private MinMax cost;
    /**
     * Request parameters
     *
     */
    @JsonProperty("leverage")
    @JsonPropertyDescription("Request parameters")
    private MinMax leverage;
    /**
     * Request parameters
     *
     */
    @JsonProperty("market")
    @JsonPropertyDescription("Request parameters")
    private MinMax market;
    /**
     * Request parameters
     *
     */
    @JsonProperty("price")
    @JsonPropertyDescription("Request parameters")
    private MinMax price;

    /**
     * Request parameters
     *
     */
    @JsonProperty("amount")
    public Optional<MinMax> getAmount() {
        return Optional.ofNullable(amount);
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("amount")
    public void setAmount(MinMax amount) {
        this.amount = amount;
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("cost")
    public Optional<MinMax> getCost() {
        return Optional.ofNullable(cost);
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("cost")
    public void setCost(MinMax cost) {
        this.cost = cost;
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("leverage")
    public Optional<MinMax> getLeverage() {
        return Optional.ofNullable(leverage);
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("leverage")
    public void setLeverage(MinMax leverage) {
        this.leverage = leverage;
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("market")
    public Optional<MinMax> getMarket() {
        return Optional.ofNullable(market);
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("market")
    public void setMarket(MinMax market) {
        this.market = market;
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("price")
    public Optional<MinMax> getPrice() {
        return Optional.ofNullable(price);
    }

    /**
     * Request parameters
     *
     */
    @JsonProperty("price")
    public void setPrice(MinMax price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null) ? "<null>" : this.amount));
        sb.append(',');
        sb.append("cost");
        sb.append('=');
        sb.append(((this.cost == null) ? "<null>" : this.cost));
        sb.append(',');
        sb.append("leverage");
        sb.append('=');
        sb.append(((this.leverage == null) ? "<null>" : this.leverage));
        sb.append(',');
        sb.append("market");
        sb.append('=');
        sb.append(((this.market == null) ? "<null>" : this.market));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null) ? "<null>" : this.price));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.market == null) ? 0 : this.market.hashCode()));
        result = ((result * 31) + ((this.leverage == null) ? 0 : this.leverage.hashCode()));
        result = ((result * 31) + ((this.amount == null) ? 0 : this.amount.hashCode()));
        result = ((result * 31) + ((this.cost == null) ? 0 : this.cost.hashCode()));
        result = ((result * 31) + ((this.price == null) ? 0 : this.price.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits) == false) {
            return false;
        }
        Limits rhs = ((Limits) other);
        return ((((((this.market == rhs.market) || ((this.market != null) && this.market.equals(rhs.market)))
                && ((this.leverage == rhs.leverage) || ((this.leverage != null) && this.leverage.equals(rhs.leverage))))
                && ((this.amount == rhs.amount) || ((this.amount != null) && this.amount.equals(rhs.amount))))
                && ((this.cost == rhs.cost) || ((this.cost != null) && this.cost.equals(rhs.cost))))
                && ((this.price == rhs.price) || ((this.price != null) && this.price.equals(rhs.price))));
    }

}
