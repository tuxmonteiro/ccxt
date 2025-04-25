package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "collateral",
    "contractSize",
    "contracts",
    "datetime",
    "entryPrice",
    "hedged",
    "id",
    "info",
    "initialMargin",
    "initialMarginPercentage",
    "lastPrice",
    "lastUpdateTimestamp",
    "leverage",
    "liquidationPrice",
    "maintenanceMargin",
    "maintenanceMarginPercentage",
    "marginMode",
    "marginRatio",
    "markPrice",
    "notional",
    "percentage",
    "realizedPnl",
    "side",
    "stopLossPrice",
    "symbol",
    "takeProfitPrice",
    "timestamp",
    "unrealizedPnl"
})
public class Position implements Serializable
{

    @JsonProperty("collateral")
    private Double collateral;
    @JsonProperty("contractSize")
    private Double contractSize;
    @JsonProperty("contracts")
    private Double contracts;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("entryPrice")
    private Double entryPrice;
    @JsonProperty("hedged")
    private Boolean hedged;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("info")
    private Object info;
    @JsonProperty("initialMargin")
    private Double initialMargin;
    @JsonProperty("initialMarginPercentage")
    private Double initialMarginPercentage;
    @JsonProperty("lastPrice")
    private Double lastPrice;
    @JsonProperty("lastUpdateTimestamp")
    private Double lastUpdateTimestamp;
    @JsonProperty("leverage")
    private Double leverage;
    @JsonProperty("liquidationPrice")
    private Double liquidationPrice;
    @JsonProperty("maintenanceMargin")
    private Double maintenanceMargin;
    @JsonProperty("maintenanceMarginPercentage")
    private Double maintenanceMarginPercentage;
    @JsonProperty("marginMode")
    private String marginMode;
    @JsonProperty("marginRatio")
    private Double marginRatio;
    @JsonProperty("markPrice")
    private Double markPrice;
    @JsonProperty("notional")
    private Double notional;
    @JsonProperty("percentage")
    private Double percentage;
    @JsonProperty("realizedPnl")
    private Double realizedPnl;
    @JsonProperty("side")
    private String side;
    @JsonProperty("stopLossPrice")
    private Double stopLossPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("takeProfitPrice")
    private Double takeProfitPrice;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("unrealizedPnl")
    private Double unrealizedPnl;
    private final static long serialVersionUID = 6951663343660897456L;

    @JsonProperty("collateral")
    public Optional<Double> getCollateral() {
        return Optional.ofNullable(collateral);
    }

    @JsonProperty("collateral")
    public void setCollateral(Double collateral) {
        this.collateral = collateral;
    }

    @JsonProperty("contractSize")
    public Optional<Double> getContractSize() {
        return Optional.ofNullable(contractSize);
    }

    @JsonProperty("contractSize")
    public void setContractSize(Double contractSize) {
        this.contractSize = contractSize;
    }

    @JsonProperty("contracts")
    public Optional<Double> getContracts() {
        return Optional.ofNullable(contracts);
    }

    @JsonProperty("contracts")
    public void setContracts(Double contracts) {
        this.contracts = contracts;
    }

    @JsonProperty("datetime")
    public Optional<String> getDatetime() {
        return Optional.ofNullable(datetime);
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("entryPrice")
    public Optional<Double> getEntryPrice() {
        return Optional.ofNullable(entryPrice);
    }

    @JsonProperty("entryPrice")
    public void setEntryPrice(Double entryPrice) {
        this.entryPrice = entryPrice;
    }

    @JsonProperty("hedged")
    public Optional<Boolean> getHedged() {
        return Optional.ofNullable(hedged);
    }

    @JsonProperty("hedged")
    public void setHedged(Boolean hedged) {
        this.hedged = hedged;
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

    @JsonProperty("initialMargin")
    public Optional<Double> getInitialMargin() {
        return Optional.ofNullable(initialMargin);
    }

    @JsonProperty("initialMargin")
    public void setInitialMargin(Double initialMargin) {
        this.initialMargin = initialMargin;
    }

    @JsonProperty("initialMarginPercentage")
    public Optional<Double> getInitialMarginPercentage() {
        return Optional.ofNullable(initialMarginPercentage);
    }

    @JsonProperty("initialMarginPercentage")
    public void setInitialMarginPercentage(Double initialMarginPercentage) {
        this.initialMarginPercentage = initialMarginPercentage;
    }

    @JsonProperty("lastPrice")
    public Optional<Double> getLastPrice() {
        return Optional.ofNullable(lastPrice);
    }

    @JsonProperty("lastPrice")
    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    @JsonProperty("lastUpdateTimestamp")
    public Optional<Double> getLastUpdateTimestamp() {
        return Optional.ofNullable(lastUpdateTimestamp);
    }

    @JsonProperty("lastUpdateTimestamp")
    public void setLastUpdateTimestamp(Double lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    @JsonProperty("leverage")
    public Optional<Double> getLeverage() {
        return Optional.ofNullable(leverage);
    }

    @JsonProperty("leverage")
    public void setLeverage(Double leverage) {
        this.leverage = leverage;
    }

    @JsonProperty("liquidationPrice")
    public Optional<Double> getLiquidationPrice() {
        return Optional.ofNullable(liquidationPrice);
    }

    @JsonProperty("liquidationPrice")
    public void setLiquidationPrice(Double liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
    }

    @JsonProperty("maintenanceMargin")
    public Optional<Double> getMaintenanceMargin() {
        return Optional.ofNullable(maintenanceMargin);
    }

    @JsonProperty("maintenanceMargin")
    public void setMaintenanceMargin(Double maintenanceMargin) {
        this.maintenanceMargin = maintenanceMargin;
    }

    @JsonProperty("maintenanceMarginPercentage")
    public Optional<Double> getMaintenanceMarginPercentage() {
        return Optional.ofNullable(maintenanceMarginPercentage);
    }

    @JsonProperty("maintenanceMarginPercentage")
    public void setMaintenanceMarginPercentage(Double maintenanceMarginPercentage) {
        this.maintenanceMarginPercentage = maintenanceMarginPercentage;
    }

    @JsonProperty("marginMode")
    public Optional<String> getMarginMode() {
        return Optional.ofNullable(marginMode);
    }

    @JsonProperty("marginMode")
    public void setMarginMode(String marginMode) {
        this.marginMode = marginMode;
    }

    @JsonProperty("marginRatio")
    public Optional<Double> getMarginRatio() {
        return Optional.ofNullable(marginRatio);
    }

    @JsonProperty("marginRatio")
    public void setMarginRatio(Double marginRatio) {
        this.marginRatio = marginRatio;
    }

    @JsonProperty("markPrice")
    public Optional<Double> getMarkPrice() {
        return Optional.ofNullable(markPrice);
    }

    @JsonProperty("markPrice")
    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    @JsonProperty("notional")
    public Optional<Double> getNotional() {
        return Optional.ofNullable(notional);
    }

    @JsonProperty("notional")
    public void setNotional(Double notional) {
        this.notional = notional;
    }

    @JsonProperty("percentage")
    public Optional<Double> getPercentage() {
        return Optional.ofNullable(percentage);
    }

    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("realizedPnl")
    public Optional<Double> getRealizedPnl() {
        return Optional.ofNullable(realizedPnl);
    }

    @JsonProperty("realizedPnl")
    public void setRealizedPnl(Double realizedPnl) {
        this.realizedPnl = realizedPnl;
    }

    @JsonProperty("side")
    public Optional<String> getSide() {
        return Optional.ofNullable(side);
    }

    @JsonProperty("side")
    public void setSide(String side) {
        this.side = side;
    }

    @JsonProperty("stopLossPrice")
    public Optional<Double> getStopLossPrice() {
        return Optional.ofNullable(stopLossPrice);
    }

    @JsonProperty("stopLossPrice")
    public void setStopLossPrice(Double stopLossPrice) {
        this.stopLossPrice = stopLossPrice;
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

    @JsonProperty("takeProfitPrice")
    public Optional<Double> getTakeProfitPrice() {
        return Optional.ofNullable(takeProfitPrice);
    }

    @JsonProperty("takeProfitPrice")
    public void setTakeProfitPrice(Double takeProfitPrice) {
        this.takeProfitPrice = takeProfitPrice;
    }

    @JsonProperty("timestamp")
    public Optional<Double> getTimestamp() {
        return Optional.ofNullable(timestamp);
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("unrealizedPnl")
    public Optional<Double> getUnrealizedPnl() {
        return Optional.ofNullable(unrealizedPnl);
    }

    @JsonProperty("unrealizedPnl")
    public void setUnrealizedPnl(Double unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Position.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("collateral");
        sb.append('=');
        sb.append(((this.collateral == null)?"<null>":this.collateral));
        sb.append(',');
        sb.append("contractSize");
        sb.append('=');
        sb.append(((this.contractSize == null)?"<null>":this.contractSize));
        sb.append(',');
        sb.append("contracts");
        sb.append('=');
        sb.append(((this.contracts == null)?"<null>":this.contracts));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null)?"<null>":this.datetime));
        sb.append(',');
        sb.append("entryPrice");
        sb.append('=');
        sb.append(((this.entryPrice == null)?"<null>":this.entryPrice));
        sb.append(',');
        sb.append("hedged");
        sb.append('=');
        sb.append(((this.hedged == null)?"<null>":this.hedged));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("initialMargin");
        sb.append('=');
        sb.append(((this.initialMargin == null)?"<null>":this.initialMargin));
        sb.append(',');
        sb.append("initialMarginPercentage");
        sb.append('=');
        sb.append(((this.initialMarginPercentage == null)?"<null>":this.initialMarginPercentage));
        sb.append(',');
        sb.append("lastPrice");
        sb.append('=');
        sb.append(((this.lastPrice == null)?"<null>":this.lastPrice));
        sb.append(',');
        sb.append("lastUpdateTimestamp");
        sb.append('=');
        sb.append(((this.lastUpdateTimestamp == null)?"<null>":this.lastUpdateTimestamp));
        sb.append(',');
        sb.append("leverage");
        sb.append('=');
        sb.append(((this.leverage == null)?"<null>":this.leverage));
        sb.append(',');
        sb.append("liquidationPrice");
        sb.append('=');
        sb.append(((this.liquidationPrice == null)?"<null>":this.liquidationPrice));
        sb.append(',');
        sb.append("maintenanceMargin");
        sb.append('=');
        sb.append(((this.maintenanceMargin == null)?"<null>":this.maintenanceMargin));
        sb.append(',');
        sb.append("maintenanceMarginPercentage");
        sb.append('=');
        sb.append(((this.maintenanceMarginPercentage == null)?"<null>":this.maintenanceMarginPercentage));
        sb.append(',');
        sb.append("marginMode");
        sb.append('=');
        sb.append(((this.marginMode == null)?"<null>":this.marginMode));
        sb.append(',');
        sb.append("marginRatio");
        sb.append('=');
        sb.append(((this.marginRatio == null)?"<null>":this.marginRatio));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
        sb.append(',');
        sb.append("notional");
        sb.append('=');
        sb.append(((this.notional == null)?"<null>":this.notional));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("realizedPnl");
        sb.append('=');
        sb.append(((this.realizedPnl == null)?"<null>":this.realizedPnl));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("stopLossPrice");
        sb.append('=');
        sb.append(((this.stopLossPrice == null)?"<null>":this.stopLossPrice));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("takeProfitPrice");
        sb.append('=');
        sb.append(((this.takeProfitPrice == null)?"<null>":this.takeProfitPrice));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("unrealizedPnl");
        sb.append('=');
        sb.append(((this.unrealizedPnl == null)?"<null>":this.unrealizedPnl));
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
        result = ((result* 31)+((this.leverage == null)? 0 :this.leverage.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.notional == null)? 0 :this.notional.hashCode()));
        result = ((result* 31)+((this.takeProfitPrice == null)? 0 :this.takeProfitPrice.hashCode()));
        result = ((result* 31)+((this.liquidationPrice == null)? 0 :this.liquidationPrice.hashCode()));
        result = ((result* 31)+((this.marginMode == null)? 0 :this.marginMode.hashCode()));
        result = ((result* 31)+((this.contracts == null)? 0 :this.contracts.hashCode()));
        result = ((result* 31)+((this.initialMargin == null)? 0 :this.initialMargin.hashCode()));
        result = ((result* 31)+((this.datetime == null)? 0 :this.datetime.hashCode()));
        result = ((result* 31)+((this.lastUpdateTimestamp == null)? 0 :this.lastUpdateTimestamp.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.maintenanceMargin == null)? 0 :this.maintenanceMargin.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        result = ((result* 31)+((this.contractSize == null)? 0 :this.contractSize.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stopLossPrice == null)? 0 :this.stopLossPrice.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        result = ((result* 31)+((this.maintenanceMarginPercentage == null)? 0 :this.maintenanceMarginPercentage.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.marginRatio == null)? 0 :this.marginRatio.hashCode()));
        result = ((result* 31)+((this.hedged == null)? 0 :this.hedged.hashCode()));
        result = ((result* 31)+((this.entryPrice == null)? 0 :this.entryPrice.hashCode()));
        result = ((result* 31)+((this.unrealizedPnl == null)? 0 :this.unrealizedPnl.hashCode()));
        result = ((result* 31)+((this.realizedPnl == null)? 0 :this.realizedPnl.hashCode()));
        result = ((result* 31)+((this.collateral == null)? 0 :this.collateral.hashCode()));
        result = ((result* 31)+((this.initialMarginPercentage == null)? 0 :this.initialMarginPercentage.hashCode()));
        result = ((result* 31)+((this.lastPrice == null)? 0 :this.lastPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Position) == false) {
            return false;
        }
        Position rhs = ((Position) other);
        return (((((((((((((((((((((((((((((this.leverage == rhs.leverage)||((this.leverage!= null)&&this.leverage.equals(rhs.leverage)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.notional == rhs.notional)||((this.notional!= null)&&this.notional.equals(rhs.notional))))&&((this.takeProfitPrice == rhs.takeProfitPrice)||((this.takeProfitPrice!= null)&&this.takeProfitPrice.equals(rhs.takeProfitPrice))))&&((this.liquidationPrice == rhs.liquidationPrice)||((this.liquidationPrice!= null)&&this.liquidationPrice.equals(rhs.liquidationPrice))))&&((this.marginMode == rhs.marginMode)||((this.marginMode!= null)&&this.marginMode.equals(rhs.marginMode))))&&((this.contracts == rhs.contracts)||((this.contracts!= null)&&this.contracts.equals(rhs.contracts))))&&((this.initialMargin == rhs.initialMargin)||((this.initialMargin!= null)&&this.initialMargin.equals(rhs.initialMargin))))&&((this.datetime == rhs.datetime)||((this.datetime!= null)&&this.datetime.equals(rhs.datetime))))&&((this.lastUpdateTimestamp == rhs.lastUpdateTimestamp)||((this.lastUpdateTimestamp!= null)&&this.lastUpdateTimestamp.equals(rhs.lastUpdateTimestamp))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.maintenanceMargin == rhs.maintenanceMargin)||((this.maintenanceMargin!= null)&&this.maintenanceMargin.equals(rhs.maintenanceMargin))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.contractSize == rhs.contractSize)||((this.contractSize!= null)&&this.contractSize.equals(rhs.contractSize))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stopLossPrice == rhs.stopLossPrice)||((this.stopLossPrice!= null)&&this.stopLossPrice.equals(rhs.stopLossPrice))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))))&&((this.maintenanceMarginPercentage == rhs.maintenanceMarginPercentage)||((this.maintenanceMarginPercentage!= null)&&this.maintenanceMarginPercentage.equals(rhs.maintenanceMarginPercentage))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.marginRatio == rhs.marginRatio)||((this.marginRatio!= null)&&this.marginRatio.equals(rhs.marginRatio))))&&((this.hedged == rhs.hedged)||((this.hedged!= null)&&this.hedged.equals(rhs.hedged))))&&((this.entryPrice == rhs.entryPrice)||((this.entryPrice!= null)&&this.entryPrice.equals(rhs.entryPrice))))&&((this.unrealizedPnl == rhs.unrealizedPnl)||((this.unrealizedPnl!= null)&&this.unrealizedPnl.equals(rhs.unrealizedPnl))))&&((this.realizedPnl == rhs.realizedPnl)||((this.realizedPnl!= null)&&this.realizedPnl.equals(rhs.realizedPnl))))&&((this.collateral == rhs.collateral)||((this.collateral!= null)&&this.collateral.equals(rhs.collateral))))&&((this.initialMarginPercentage == rhs.initialMarginPercentage)||((this.initialMarginPercentage!= null)&&this.initialMarginPercentage.equals(rhs.initialMarginPercentage))))&&((this.lastPrice == rhs.lastPrice)||((this.lastPrice!= null)&&this.lastPrice.equals(rhs.lastPrice))));
    }

}
