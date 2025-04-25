package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "active",
    "base",
    "baseId",
    "contract",
    "contractSize",
    "created",
    "expiry",
    "expiryDatetime",
    "feeSide",
    "future",
    "id",
    "info",
    "inverse",
    "limits",
    "linear",
    "lowercaseId",
    "maker",
    "margin",
    "marginModes",
    "numericId",
    "option",
    "optionType",
    "percentage",
    "precision",
    "quanto",
    "quote",
    "quoteId",
    "settle",
    "settleId",
    "spot",
    "strike",
    "subType",
    "swap",
    "symbol",
    "taker",
    "tierBased",
    "type",
    "uppercaseId"
})
public class Market implements Serializable
{

    @JsonProperty("active")
    private Boolean active;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    private String base;
    @JsonProperty("baseId")
    private String baseId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contract")
    private Boolean contract;
    @JsonProperty("contractSize")
    private Double contractSize;
    @JsonProperty("created")
    private Double created;
    @JsonProperty("expiry")
    private Double expiry;
    @JsonProperty("expiryDatetime")
    private String expiryDatetime;
    @JsonProperty("feeSide")
    private String feeSide;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("future")
    private Boolean future;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("inverse")
    private Boolean inverse;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    private Limits limits;
    @JsonProperty("linear")
    private Boolean linear;
    @JsonProperty("lowercaseId")
    private String lowercaseId;
    @JsonProperty("maker")
    private Double maker;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("margin")
    private Boolean margin;
    @JsonProperty("marginModes")
    private MarketMarginModes marginModes;
    @JsonProperty("numericId")
    private Double numericId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("option")
    private Boolean option;
    @JsonProperty("optionType")
    private String optionType;
    @JsonProperty("percentage")
    private Boolean percentage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("precision")
    private Precision precision;
    @JsonProperty("quanto")
    private Boolean quanto;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quote")
    private String quote;
    @JsonProperty("quoteId")
    private String quoteId;
    @JsonProperty("settle")
    private String settle;
    @JsonProperty("settleId")
    private String settleId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spot")
    private Boolean spot;
    @JsonProperty("strike")
    private Double strike;
    @JsonProperty("subType")
    private Market.SubType subType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("swap")
    private Boolean swap;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("taker")
    private Double taker;
    @JsonProperty("tierBased")
    private Boolean tierBased;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Market.MarketType type;
    @JsonProperty("uppercaseId")
    private String uppercaseId;
    private final static long serialVersionUID = 4634515904372782976L;

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
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("baseId")
    public Optional<String> getBaseId() {
        return Optional.ofNullable(baseId);
    }

    @JsonProperty("baseId")
    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contract")
    public Boolean getContract() {
        return contract;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contract")
    public void setContract(Boolean contract) {
        this.contract = contract;
    }

    @JsonProperty("contractSize")
    public Optional<Double> getContractSize() {
        return Optional.ofNullable(contractSize);
    }

    @JsonProperty("contractSize")
    public void setContractSize(Double contractSize) {
        this.contractSize = contractSize;
    }

    @JsonProperty("created")
    public Optional<Double> getCreated() {
        return Optional.ofNullable(created);
    }

    @JsonProperty("created")
    public void setCreated(Double created) {
        this.created = created;
    }

    @JsonProperty("expiry")
    public Optional<Double> getExpiry() {
        return Optional.ofNullable(expiry);
    }

    @JsonProperty("expiry")
    public void setExpiry(Double expiry) {
        this.expiry = expiry;
    }

    @JsonProperty("expiryDatetime")
    public Optional<String> getExpiryDatetime() {
        return Optional.ofNullable(expiryDatetime);
    }

    @JsonProperty("expiryDatetime")
    public void setExpiryDatetime(String expiryDatetime) {
        this.expiryDatetime = expiryDatetime;
    }

    @JsonProperty("feeSide")
    public Optional<String> getFeeSide() {
        return Optional.ofNullable(feeSide);
    }

    @JsonProperty("feeSide")
    public void setFeeSide(String feeSide) {
        this.feeSide = feeSide;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("future")
    public Boolean getFuture() {
        return future;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("future")
    public void setFuture(Boolean future) {
        this.future = future;
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

    @JsonProperty("inverse")
    public Optional<Boolean> getInverse() {
        return Optional.ofNullable(inverse);
    }

    @JsonProperty("inverse")
    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
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

    @JsonProperty("linear")
    public Optional<Boolean> getLinear() {
        return Optional.ofNullable(linear);
    }

    @JsonProperty("linear")
    public void setLinear(Boolean linear) {
        this.linear = linear;
    }

    @JsonProperty("lowercaseId")
    public Optional<String> getLowercaseId() {
        return Optional.ofNullable(lowercaseId);
    }

    @JsonProperty("lowercaseId")
    public void setLowercaseId(String lowercaseId) {
        this.lowercaseId = lowercaseId;
    }

    @JsonProperty("maker")
    public Optional<Double> getMaker() {
        return Optional.ofNullable(maker);
    }

    @JsonProperty("maker")
    public void setMaker(Double maker) {
        this.maker = maker;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("margin")
    public Boolean getMargin() {
        return margin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("margin")
    public void setMargin(Boolean margin) {
        this.margin = margin;
    }

    @JsonProperty("marginModes")
    public Optional<MarketMarginModes> getMarginModes() {
        return Optional.ofNullable(marginModes);
    }

    @JsonProperty("marginModes")
    public void setMarginModes(MarketMarginModes marginModes) {
        this.marginModes = marginModes;
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
    @JsonProperty("option")
    public Boolean getOption() {
        return option;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("option")
    public void setOption(Boolean option) {
        this.option = option;
    }

    @JsonProperty("optionType")
    public Optional<String> getOptionType() {
        return Optional.ofNullable(optionType);
    }

    @JsonProperty("optionType")
    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    @JsonProperty("percentage")
    public Optional<Boolean> getPercentage() {
        return Optional.ofNullable(percentage);
    }

    @JsonProperty("percentage")
    public void setPercentage(Boolean percentage) {
        this.percentage = percentage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("precision")
    public Precision getPrecision() {
        return precision;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("precision")
    public void setPrecision(Precision precision) {
        this.precision = precision;
    }

    @JsonProperty("quanto")
    public Optional<Boolean> getQuanto() {
        return Optional.ofNullable(quanto);
    }

    @JsonProperty("quanto")
    public void setQuanto(Boolean quanto) {
        this.quanto = quanto;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quote")
    public String getQuote() {
        return quote;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quote")
    public void setQuote(String quote) {
        this.quote = quote;
    }

    @JsonProperty("quoteId")
    public Optional<String> getQuoteId() {
        return Optional.ofNullable(quoteId);
    }

    @JsonProperty("quoteId")
    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    @JsonProperty("settle")
    public Optional<String> getSettle() {
        return Optional.ofNullable(settle);
    }

    @JsonProperty("settle")
    public void setSettle(String settle) {
        this.settle = settle;
    }

    @JsonProperty("settleId")
    public Optional<String> getSettleId() {
        return Optional.ofNullable(settleId);
    }

    @JsonProperty("settleId")
    public void setSettleId(String settleId) {
        this.settleId = settleId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spot")
    public Boolean getSpot() {
        return spot;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spot")
    public void setSpot(Boolean spot) {
        this.spot = spot;
    }

    @JsonProperty("strike")
    public Optional<Double> getStrike() {
        return Optional.ofNullable(strike);
    }

    @JsonProperty("strike")
    public void setStrike(Double strike) {
        this.strike = strike;
    }

    @JsonProperty("subType")
    public Optional<Market.SubType> getSubType() {
        return Optional.ofNullable(subType);
    }

    @JsonProperty("subType")
    public void setSubType(Market.SubType subType) {
        this.subType = subType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("swap")
    public Boolean getSwap() {
        return swap;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("swap")
    public void setSwap(Boolean swap) {
        this.swap = swap;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("taker")
    public Optional<Double> getTaker() {
        return Optional.ofNullable(taker);
    }

    @JsonProperty("taker")
    public void setTaker(Double taker) {
        this.taker = taker;
    }

    @JsonProperty("tierBased")
    public Optional<Boolean> getTierBased() {
        return Optional.ofNullable(tierBased);
    }

    @JsonProperty("tierBased")
    public void setTierBased(Boolean tierBased) {
        this.tierBased = tierBased;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Market.MarketType getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Market.MarketType type) {
        this.type = type;
    }

    @JsonProperty("uppercaseId")
    public Optional<String> getUppercaseId() {
        return Optional.ofNullable(uppercaseId);
    }

    @JsonProperty("uppercaseId")
    public void setUppercaseId(String uppercaseId) {
        this.uppercaseId = uppercaseId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Market.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("baseId");
        sb.append('=');
        sb.append(((this.baseId == null)?"<null>":this.baseId));
        sb.append(',');
        sb.append("contract");
        sb.append('=');
        sb.append(((this.contract == null)?"<null>":this.contract));
        sb.append(',');
        sb.append("contractSize");
        sb.append('=');
        sb.append(((this.contractSize == null)?"<null>":this.contractSize));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("expiry");
        sb.append('=');
        sb.append(((this.expiry == null)?"<null>":this.expiry));
        sb.append(',');
        sb.append("expiryDatetime");
        sb.append('=');
        sb.append(((this.expiryDatetime == null)?"<null>":this.expiryDatetime));
        sb.append(',');
        sb.append("feeSide");
        sb.append('=');
        sb.append(((this.feeSide == null)?"<null>":this.feeSide));
        sb.append(',');
        sb.append("future");
        sb.append('=');
        sb.append(((this.future == null)?"<null>":this.future));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("inverse");
        sb.append('=');
        sb.append(((this.inverse == null)?"<null>":this.inverse));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("linear");
        sb.append('=');
        sb.append(((this.linear == null)?"<null>":this.linear));
        sb.append(',');
        sb.append("lowercaseId");
        sb.append('=');
        sb.append(((this.lowercaseId == null)?"<null>":this.lowercaseId));
        sb.append(',');
        sb.append("maker");
        sb.append('=');
        sb.append(((this.maker == null)?"<null>":this.maker));
        sb.append(',');
        sb.append("margin");
        sb.append('=');
        sb.append(((this.margin == null)?"<null>":this.margin));
        sb.append(',');
        sb.append("marginModes");
        sb.append('=');
        sb.append(((this.marginModes == null)?"<null>":this.marginModes));
        sb.append(',');
        sb.append("numericId");
        sb.append('=');
        sb.append(((this.numericId == null)?"<null>":this.numericId));
        sb.append(',');
        sb.append("option");
        sb.append('=');
        sb.append(((this.option == null)?"<null>":this.option));
        sb.append(',');
        sb.append("optionType");
        sb.append('=');
        sb.append(((this.optionType == null)?"<null>":this.optionType));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("precision");
        sb.append('=');
        sb.append(((this.precision == null)?"<null>":this.precision));
        sb.append(',');
        sb.append("quanto");
        sb.append('=');
        sb.append(((this.quanto == null)?"<null>":this.quanto));
        sb.append(',');
        sb.append("quote");
        sb.append('=');
        sb.append(((this.quote == null)?"<null>":this.quote));
        sb.append(',');
        sb.append("quoteId");
        sb.append('=');
        sb.append(((this.quoteId == null)?"<null>":this.quoteId));
        sb.append(',');
        sb.append("settle");
        sb.append('=');
        sb.append(((this.settle == null)?"<null>":this.settle));
        sb.append(',');
        sb.append("settleId");
        sb.append('=');
        sb.append(((this.settleId == null)?"<null>":this.settleId));
        sb.append(',');
        sb.append("spot");
        sb.append('=');
        sb.append(((this.spot == null)?"<null>":this.spot));
        sb.append(',');
        sb.append("strike");
        sb.append('=');
        sb.append(((this.strike == null)?"<null>":this.strike));
        sb.append(',');
        sb.append("subType");
        sb.append('=');
        sb.append(((this.subType == null)?"<null>":this.subType));
        sb.append(',');
        sb.append("swap");
        sb.append('=');
        sb.append(((this.swap == null)?"<null>":this.swap));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("taker");
        sb.append('=');
        sb.append(((this.taker == null)?"<null>":this.taker));
        sb.append(',');
        sb.append("tierBased");
        sb.append('=');
        sb.append(((this.tierBased == null)?"<null>":this.tierBased));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("uppercaseId");
        sb.append('=');
        sb.append(((this.uppercaseId == null)?"<null>":this.uppercaseId));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.settleId == null)? 0 :this.settleId.hashCode()));
        result = ((result* 31)+((this.precision == null)? 0 :this.precision.hashCode()));
        result = ((result* 31)+((this.settle == null)? 0 :this.settle.hashCode()));
        result = ((result* 31)+((this.baseId == null)? 0 :this.baseId.hashCode()));
        result = ((result* 31)+((this.expiryDatetime == null)? 0 :this.expiryDatetime.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.lowercaseId == null)? 0 :this.lowercaseId.hashCode()));
        result = ((result* 31)+((this.optionType == null)? 0 :this.optionType.hashCode()));
        result = ((result* 31)+((this.quote == null)? 0 :this.quote.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        result = ((result* 31)+((this.contractSize == null)? 0 :this.contractSize.hashCode()));
        result = ((result* 31)+((this.expiry == null)? 0 :this.expiry.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.taker == null)? 0 :this.taker.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.inverse == null)? 0 :this.inverse.hashCode()));
        result = ((result* 31)+((this.numericId == null)? 0 :this.numericId.hashCode()));
        result = ((result* 31)+((this.margin == null)? 0 :this.margin.hashCode()));
        result = ((result* 31)+((this.linear == null)? 0 :this.linear.hashCode()));
        result = ((result* 31)+((this.swap == null)? 0 :this.swap.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.contract == null)? 0 :this.contract.hashCode()));
        result = ((result* 31)+((this.strike == null)? 0 :this.strike.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.maker == null)? 0 :this.maker.hashCode()));
        result = ((result* 31)+((this.quoteId == null)? 0 :this.quoteId.hashCode()));
        result = ((result* 31)+((this.feeSide == null)? 0 :this.feeSide.hashCode()));
        result = ((result* 31)+((this.future == null)? 0 :this.future.hashCode()));
        result = ((result* 31)+((this.spot == null)? 0 :this.spot.hashCode()));
        result = ((result* 31)+((this.marginModes == null)? 0 :this.marginModes.hashCode()));
        result = ((result* 31)+((this.subType == null)? 0 :this.subType.hashCode()));
        result = ((result* 31)+((this.tierBased == null)? 0 :this.tierBased.hashCode()));
        result = ((result* 31)+((this.uppercaseId == null)? 0 :this.uppercaseId.hashCode()));
        result = ((result* 31)+((this.quanto == null)? 0 :this.quanto.hashCode()));
        result = ((result* 31)+((this.base == null)? 0 :this.base.hashCode()));
        result = ((result* 31)+((this.option == null)? 0 :this.option.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Market) == false) {
            return false;
        }
        Market rhs = ((Market) other);
        return (((((((((((((((((((((((((((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.settleId == rhs.settleId)||((this.settleId!= null)&&this.settleId.equals(rhs.settleId))))&&((this.precision == rhs.precision)||((this.precision!= null)&&this.precision.equals(rhs.precision))))&&((this.settle == rhs.settle)||((this.settle!= null)&&this.settle.equals(rhs.settle))))&&((this.baseId == rhs.baseId)||((this.baseId!= null)&&this.baseId.equals(rhs.baseId))))&&((this.expiryDatetime == rhs.expiryDatetime)||((this.expiryDatetime!= null)&&this.expiryDatetime.equals(rhs.expiryDatetime))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.lowercaseId == rhs.lowercaseId)||((this.lowercaseId!= null)&&this.lowercaseId.equals(rhs.lowercaseId))))&&((this.optionType == rhs.optionType)||((this.optionType!= null)&&this.optionType.equals(rhs.optionType))))&&((this.quote == rhs.quote)||((this.quote!= null)&&this.quote.equals(rhs.quote))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.contractSize == rhs.contractSize)||((this.contractSize!= null)&&this.contractSize.equals(rhs.contractSize))))&&((this.expiry == rhs.expiry)||((this.expiry!= null)&&this.expiry.equals(rhs.expiry))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.taker == rhs.taker)||((this.taker!= null)&&this.taker.equals(rhs.taker))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.inverse == rhs.inverse)||((this.inverse!= null)&&this.inverse.equals(rhs.inverse))))&&((this.numericId == rhs.numericId)||((this.numericId!= null)&&this.numericId.equals(rhs.numericId))))&&((this.margin == rhs.margin)||((this.margin!= null)&&this.margin.equals(rhs.margin))))&&((this.linear == rhs.linear)||((this.linear!= null)&&this.linear.equals(rhs.linear))))&&((this.swap == rhs.swap)||((this.swap!= null)&&this.swap.equals(rhs.swap))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.contract == rhs.contract)||((this.contract!= null)&&this.contract.equals(rhs.contract))))&&((this.strike == rhs.strike)||((this.strike!= null)&&this.strike.equals(rhs.strike))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.maker == rhs.maker)||((this.maker!= null)&&this.maker.equals(rhs.maker))))&&((this.quoteId == rhs.quoteId)||((this.quoteId!= null)&&this.quoteId.equals(rhs.quoteId))))&&((this.feeSide == rhs.feeSide)||((this.feeSide!= null)&&this.feeSide.equals(rhs.feeSide))))&&((this.future == rhs.future)||((this.future!= null)&&this.future.equals(rhs.future))))&&((this.spot == rhs.spot)||((this.spot!= null)&&this.spot.equals(rhs.spot))))&&((this.marginModes == rhs.marginModes)||((this.marginModes!= null)&&this.marginModes.equals(rhs.marginModes))))&&((this.subType == rhs.subType)||((this.subType!= null)&&this.subType.equals(rhs.subType))))&&((this.tierBased == rhs.tierBased)||((this.tierBased!= null)&&this.tierBased.equals(rhs.tierBased))))&&((this.uppercaseId == rhs.uppercaseId)||((this.uppercaseId!= null)&&this.uppercaseId.equals(rhs.uppercaseId))))&&((this.quanto == rhs.quanto)||((this.quanto!= null)&&this.quanto.equals(rhs.quanto))))&&((this.base == rhs.base)||((this.base!= null)&&this.base.equals(rhs.base))))&&((this.option == rhs.option)||((this.option!= null)&&this.option.equals(rhs.option))));
    }

    public enum MarketType {

        SPOT("spot"),
        MARGIN("margin"),
        SWAP("swap"),
        FUTURE("future"),
        OPTION("option"),
        DELIVERY("delivery"),
        INDEX("index");
        private final String value;
        private final static Map<String, Market.MarketType> CONSTANTS = new HashMap<String, Market.MarketType>();

        static {
            for (Market.MarketType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MarketType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Market.MarketType fromValue(String value) {
            Market.MarketType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SubType {

        LINEAR("linear"),
        INVERSE("inverse");
        private final String value;
        private final static Map<String, Market.SubType> CONSTANTS = new HashMap<String, Market.SubType>();

        static {
            for (Market.SubType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SubType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Market.SubType fromValue(String value) {
            Market.SubType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
