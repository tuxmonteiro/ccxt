import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountId",
    "agent",
    "api",
    "apiKey",
    "balance",
    "bidsasks",
    "certified",
    "countries",
    "fetchImplementation",
    "fundingRates",
    "handleContentTypeApplicationZip",
    "headers",
    "httpAgent",
    "httpProxy",
    "httpProxyCallback",
    "httpsAgent",
    "httpsProxy",
    "httpsProxyCallback",
    "isSandboxModeEnabled",
    "liquidations",
    "login",
    "minFundingAddressLength",
    "myLiquidations",
    "myTrades",
    "nodeHttpModuleLoaded",
    "number",
    "ohlcvs",
    "options",
    "orderbooks",
    "orders",
    "origin",
    "password",
    "positions",
    "privateKey",
    "pro",
    "proxy",
    "proxyUrl",
    "proxyUrlCallback",
    "quoteJsonNumbers",
    "reduceFees",
    "requiresEddsa",
    "requiresWeb3",
    "secret",
    "sleep",
    "socksProxy",
    "socksProxyCallback",
    "substituteCommonCurrencyCodes",
    "throttleProp",
    "tickers",
    "timeout",
    "token",
    "trades",
    "transactions",
    "triggerOrders",
    "twofa",
    "uid",
    "urls",
    "userAgent",
    "userAgents",
    "validateClientSsl",
    "validateServerSsl",
    "verbose",
    "walletAddress",
    "wsProxy",
    "wsSocksProxy",
    "wssProxy"
})
public class Exchange implements Serializable
{

    @JsonProperty("accountId")
    private String accountId;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("agent")
    private Object agent;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("api")
    private Object api;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("apiKey")
    private String apiKey;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("balance")
    private Balance balance;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("bidsasks")
    private Map<String, Ticker> bidsasks = Map.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("certified")
    private Boolean certified;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("countries")
    private List<String> countries = new ArrayList<String>();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fetchImplementation")
    private Object fetchImplementation;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fundingRates")
    private Map<String, FundingRate> fundingRates = Map.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("handleContentTypeApplicationZip")
    private Boolean handleContentTypeApplicationZip;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("headers")
    private Map<Object, Object> headers = Map.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpAgent")
    private String httpAgent;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpProxy")
    private String httpProxy;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpProxyCallback")
    private Object httpProxyCallback;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsAgent")
    private String httpsAgent;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("httpsProxy")
    private String httpsProxy;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("httpsProxyCallback")
    private Object httpsProxyCallback;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("isSandboxModeEnabled")
    private Boolean isSandboxModeEnabled;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("liquidations")
    private List<Liquidation> liquidations = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("login")
    private String login;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("minFundingAddressLength")
    private Double minFundingAddressLength;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("myLiquidations")
    private List<Liquidation> myLiquidations = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("myTrades")
    private List<Trade> myTrades = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ohlcvs")
    private Map<Long, Map<String, Double>> ohlcvs = Map.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("options")
    private List<Option> options = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("orderbooks")
    private List<OrderBook> orderbooks;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("orders")
    private List<Order> orders orders - List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("origin")
    private String origin;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("password")
    private String password;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("positions")
    private List<Position> positions = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("privateKey")
    private String privateKey;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pro")
    private Boolean pro;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxy")
    private Object proxy;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("proxyUrlCallback")
    private Object proxyUrlCallback;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("quoteJsonNumbers")
    private Boolean quoteJsonNumbers;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("reduceFees")
    private Boolean reduceFees;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("requiresEddsa")
    private Boolean requiresEddsa;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("requiresWeb3")
    private Boolean requiresWeb3;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("secret")
    private String secret;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sleep")
    private Long sleep;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("socksProxy")
    private String socksProxy;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("socksProxyCallback")
    private Object socksProxyCallback;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("substituteCommonCurrencyCodes")
    private Boolean substituteCommonCurrencyCodes;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("throttleProp")
    private Object throttleProp;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tickers")
    private List<Ticker> tickers = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("timeout")
    private Double timeout;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("token")
    private String token;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("trades")
    private List<Trade> trades = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("transactions")
    private List<Transaction> transactions = List.of();
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("triggerOrders")
    private TriggerOrders triggerOrders;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("twofa")
    private Object twofa;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("uid")
    private String uid;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("urls")
    private Urls urls;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("userAgent")
    private String userAgent;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("userAgents")
    private List<String> userAgents;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("validateClientSsl")
    private Boolean validateClientSsl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("validateServerSsl")
    private Boolean validateServerSsl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("verbose")
    private Boolean verbose;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("walletAddress")
    private String walletAddress;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("wsProxy")
    private String wsProxy;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("wsSocksProxy")
    private String wsSocksProxy;
    /**
     *
     * (Required)
     * (Required)
     *
     */
    @JsonProperty("wssProxy")
    private String wssProxy;
    private final static long serialVersionUID = 4370324370153680134L;

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("agent")
    public Object getAgent() {
        return agent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("agent")
    public void setAgent(Object agent) {
        this.agent = agent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("api")
    public Object getApi() {
        return api;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("api")
    public void setApi(Object api) {
        this.api = api;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("apiKey")
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("balance")
    public Balance getBalance() {
        return balance;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("balance")
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("bidsasks")
    public Bidsasks getBidsasks() {
        return bidsasks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("bidsasks")
    public void setBidsasks(Bidsasks bidsasks) {
        this.bidsasks = bidsasks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("certified")
    public Boolean getCertified() {
        return certified;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("certified")
    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("countries")
    public List<String> getCountries() {
        return countries;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("countries")
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fetchImplementation")
    public Object getFetchImplementation() {
        return fetchImplementation;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fetchImplementation")
    public void setFetchImplementation(Object fetchImplementation) {
        this.fetchImplementation = fetchImplementation;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fundingRates")
    public FundingRates getFundingRates() {
        return fundingRates;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fundingRates")
    public void setFundingRates(FundingRates fundingRates) {
        this.fundingRates = fundingRates;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("handleContentTypeApplicationZip")
    public Boolean getHandleContentTypeApplicationZip() {
        return handleContentTypeApplicationZip;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("handleContentTypeApplicationZip")
    public void setHandleContentTypeApplicationZip(Boolean handleContentTypeApplicationZip) {
        this.handleContentTypeApplicationZip = handleContentTypeApplicationZip;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("headers")
    public Object getHeaders() {
        return headers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("headers")
    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpAgent")
    public Object getHttpAgent() {
        return httpAgent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpAgent")
    public void setHttpAgent(Object httpAgent) {
        this.httpAgent = httpAgent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpProxy")
    public String getHttpProxy() {
        return httpProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpProxy")
    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpProxyCallback")
    public Object getHttpProxyCallback() {
        return httpProxyCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpProxyCallback")
    public void setHttpProxyCallback(Object httpProxyCallback) {
        this.httpProxyCallback = httpProxyCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsAgent")
    public Object getHttpsAgent() {
        return httpsAgent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsAgent")
    public void setHttpsAgent(Object httpsAgent) {
        this.httpsAgent = httpsAgent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsProxy")
    public String getHttpsProxy() {
        return httpsProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsProxy")
    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsProxyCallback")
    public Object getHttpsProxyCallback() {
        return httpsProxyCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("httpsProxyCallback")
    public void setHttpsProxyCallback(Object httpsProxyCallback) {
        this.httpsProxyCallback = httpsProxyCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("isSandboxModeEnabled")
    public Boolean getIsSandboxModeEnabled() {
        return isSandboxModeEnabled;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("isSandboxModeEnabled")
    public void setIsSandboxModeEnabled(Boolean isSandboxModeEnabled) {
        this.isSandboxModeEnabled = isSandboxModeEnabled;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("liquidations")
    public Liquidations getLiquidations() {
        return liquidations;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("liquidations")
    public void setLiquidations(Liquidations liquidations) {
        this.liquidations = liquidations;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("minFundingAddressLength")
    public Double getMinFundingAddressLength() {
        return minFundingAddressLength;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("minFundingAddressLength")
    public void setMinFundingAddressLength(Double minFundingAddressLength) {
        this.minFundingAddressLength = minFundingAddressLength;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("myLiquidations")
    public MyLiquidations getMyLiquidations() {
        return myLiquidations;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("myLiquidations")
    public void setMyLiquidations(MyLiquidations myLiquidations) {
        this.myLiquidations = myLiquidations;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("myTrades")
    public MyTrades getMyTrades() {
        return myTrades;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("myTrades")
    public void setMyTrades(MyTrades myTrades) {
        this.myTrades = myTrades;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("nodeHttpModuleLoaded")
    public Boolean getNodeHttpModuleLoaded() {
        return nodeHttpModuleLoaded;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("nodeHttpModuleLoaded")
    public void setNodeHttpModuleLoaded(Boolean nodeHttpModuleLoaded) {
        this.nodeHttpModuleLoaded = nodeHttpModuleLoaded;
    }

    /**
     * (numberString: string) => number
     * (Required)
     *
     */
    @JsonProperty("number")
    public Number getNumber() {
        return number;
    }

    /**
     * (numberString: string) => number
     * (Required)
     *
     */
    @JsonProperty("number")
    public void setNumber(Number number) {
        this.number = number;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ohlcvs")
    public Ohlcvs getOhlcvs() {
        return ohlcvs;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ohlcvs")
    public void setOhlcvs(Ohlcvs ohlcvs) {
        this.ohlcvs = ohlcvs;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("options")
    public Options getOptions() {
        return options;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("options")
    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("orderbooks")
    public Orderbooks getOrderbooks() {
        return orderbooks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("orderbooks")
    public void setOrderbooks(Orderbooks orderbooks) {
        this.orderbooks = orderbooks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("orders")
    public Orders getOrders() {
        return orders;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("orders")
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("positions")
    public Object getPositions() {
        return positions;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("positions")
    public void setPositions(Object positions) {
        this.positions = positions;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("privateKey")
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("privateKey")
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pro")
    public Boolean getPro() {
        return pro;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pro")
    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxy")
    public Object getProxy() {
        return proxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxy")
    public void setProxy(Object proxy) {
        this.proxy = proxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxyUrl")
    public String getProxyUrl() {
        return proxyUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxyUrl")
    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxyUrlCallback")
    public Object getProxyUrlCallback() {
        return proxyUrlCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("proxyUrlCallback")
    public void setProxyUrlCallback(Object proxyUrlCallback) {
        this.proxyUrlCallback = proxyUrlCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("quoteJsonNumbers")
    public Boolean getQuoteJsonNumbers() {
        return quoteJsonNumbers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("quoteJsonNumbers")
    public void setQuoteJsonNumbers(Boolean quoteJsonNumbers) {
        this.quoteJsonNumbers = quoteJsonNumbers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("reduceFees")
    public Boolean getReduceFees() {
        return reduceFees;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("reduceFees")
    public void setReduceFees(Boolean reduceFees) {
        this.reduceFees = reduceFees;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("requiresEddsa")
    public Boolean getRequiresEddsa() {
        return requiresEddsa;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("requiresEddsa")
    public void setRequiresEddsa(Boolean requiresEddsa) {
        this.requiresEddsa = requiresEddsa;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("requiresWeb3")
    public Boolean getRequiresWeb3() {
        return requiresWeb3;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("requiresWeb3")
    public void setRequiresWeb3(Boolean requiresWeb3) {
        this.requiresWeb3 = requiresWeb3;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sleep")
    public Object getSleep() {
        return sleep;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("sleep")
    public void setSleep(Object sleep) {
        this.sleep = sleep;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("socksProxy")
    public String getSocksProxy() {
        return socksProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("socksProxy")
    public void setSocksProxy(String socksProxy) {
        this.socksProxy = socksProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("socksProxyCallback")
    public Object getSocksProxyCallback() {
        return socksProxyCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("socksProxyCallback")
    public void setSocksProxyCallback(Object socksProxyCallback) {
        this.socksProxyCallback = socksProxyCallback;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("substituteCommonCurrencyCodes")
    public Boolean getSubstituteCommonCurrencyCodes() {
        return substituteCommonCurrencyCodes;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("substituteCommonCurrencyCodes")
    public void setSubstituteCommonCurrencyCodes(Boolean substituteCommonCurrencyCodes) {
        this.substituteCommonCurrencyCodes = substituteCommonCurrencyCodes;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("throttleProp")
    public Object getThrottleProp() {
        return throttleProp;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("throttleProp")
    public void setThrottleProp(Object throttleProp) {
        this.throttleProp = throttleProp;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tickers")
    public Tickers getTickers() {
        return tickers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tickers")
    public void setTickers(Tickers tickers) {
        this.tickers = tickers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("timeout")
    public Double getTimeout() {
        return timeout;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("timeout")
    public void setTimeout(Double timeout) {
        this.timeout = timeout;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("trades")
    public Trades getTrades() {
        return trades;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("trades")
    public void setTrades(Trades trades) {
        this.trades = trades;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("transactions")
    public Transactions getTransactions() {
        return transactions;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("transactions")
    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("triggerOrders")
    public TriggerOrders getTriggerOrders() {
        return triggerOrders;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("triggerOrders")
    public void setTriggerOrders(TriggerOrders triggerOrders) {
        this.triggerOrders = triggerOrders;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("twofa")
    public Object getTwofa() {
        return twofa;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("twofa")
    public void setTwofa(Object twofa) {
        this.twofa = twofa;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("userAgent")
    public Object getUserAgent() {
        return userAgent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("userAgent")
    public void setUserAgent(Object userAgent) {
        this.userAgent = userAgent;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("userAgents")
    public Object getUserAgents() {
        return userAgents;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("userAgents")
    public void setUserAgents(Object userAgents) {
        this.userAgents = userAgents;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("validateClientSsl")
    public Boolean getValidateClientSsl() {
        return validateClientSsl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("validateClientSsl")
    public void setValidateClientSsl(Boolean validateClientSsl) {
        this.validateClientSsl = validateClientSsl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("validateServerSsl")
    public Boolean getValidateServerSsl() {
        return validateServerSsl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("validateServerSsl")
    public void setValidateServerSsl(Boolean validateServerSsl) {
        this.validateServerSsl = validateServerSsl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("verbose")
    public Boolean getVerbose() {
        return verbose;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("verbose")
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("walletAddress")
    public String getWalletAddress() {
        return walletAddress;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("walletAddress")
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wsProxy")
    public String getWsProxy() {
        return wsProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wsProxy")
    public void setWsProxy(String wsProxy) {
        this.wsProxy = wsProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wsSocksProxy")
    public String getWsSocksProxy() {
        return wsSocksProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wsSocksProxy")
    public void setWsSocksProxy(String wsSocksProxy) {
        this.wsSocksProxy = wsSocksProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wssProxy")
    public String getWssProxy() {
        return wssProxy;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("wssProxy")
    public void setWssProxy(String wssProxy) {
        this.wssProxy = wssProxy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Exchange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("abortError");
        sb.append('=');
        sb.append(((this.abortError == null)?"<null>":this.abortError));
        sb.append(',');
        sb.append("fetchError");
        sb.append('=');
        sb.append(((this.fetchError == null)?"<null>":this.fetchError));
        sb.append(',');
        sb.append("maxValue");
        sb.append('=');
        sb.append(((this.maxValue == null)?"<null>":this.maxValue));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("agent");
        sb.append('=');
        sb.append(((this.agent == null)?"<null>":this.agent));
        sb.append(',');
        sb.append("api");
        sb.append('=');
        sb.append(((this.api == null)?"<null>":this.api));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("bidsasks");
        sb.append('=');
        sb.append(((this.bidsasks == null)?"<null>":this.bidsasks));
        sb.append(',');
        sb.append("certified");
        sb.append('=');
        sb.append(((this.certified == null)?"<null>":this.certified));
        sb.append(',');
        sb.append("countries");
        sb.append('=');
        sb.append(((this.countries == null)?"<null>":this.countries));
        sb.append(',');
        sb.append("fetchImplementation");
        sb.append('=');
        sb.append(((this.fetchImplementation == null)?"<null>":this.fetchImplementation));
        sb.append(',');
        sb.append("fundingRates");
        sb.append('=');
        sb.append(((this.fundingRates == null)?"<null>":this.fundingRates));
        sb.append(',');
        sb.append("handleContentTypeApplicationZip");
        sb.append('=');
        sb.append(((this.handleContentTypeApplicationZip == null)?"<null>":this.handleContentTypeApplicationZip));
        sb.append(',');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
        sb.append(',');
        sb.append("httpAgent");
        sb.append('=');
        sb.append(((this.httpAgent == null)?"<null>":this.httpAgent));
        sb.append(',');
        sb.append("httpProxy");
        sb.append('=');
        sb.append(((this.httpProxy == null)?"<null>":this.httpProxy));
        sb.append(',');
        sb.append("httpProxyCallback");
        sb.append('=');
        sb.append(((this.httpProxyCallback == null)?"<null>":this.httpProxyCallback));
        sb.append(',');
        sb.append("httpsAgent");
        sb.append('=');
        sb.append(((this.httpsAgent == null)?"<null>":this.httpsAgent));
        sb.append(',');
        sb.append("httpsProxy");
        sb.append('=');
        sb.append(((this.httpsProxy == null)?"<null>":this.httpsProxy));
        sb.append(',');
        sb.append("httpsProxyCallback");
        sb.append('=');
        sb.append(((this.httpsProxyCallback == null)?"<null>":this.httpsProxyCallback));
        sb.append(',');
        sb.append("isSandboxModeEnabled");
        sb.append('=');
        sb.append(((this.isSandboxModeEnabled == null)?"<null>":this.isSandboxModeEnabled));
        sb.append(',');
        sb.append("liquidations");
        sb.append('=');
        sb.append(((this.liquidations == null)?"<null>":this.liquidations));
        sb.append(',');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        sb.append("minFundingAddressLength");
        sb.append('=');
        sb.append(((this.minFundingAddressLength == null)?"<null>":this.minFundingAddressLength));
        sb.append(',');
        sb.append("myLiquidations");
        sb.append('=');
        sb.append(((this.myLiquidations == null)?"<null>":this.myLiquidations));
        sb.append(',');
        sb.append("myTrades");
        sb.append('=');
        sb.append(((this.myTrades == null)?"<null>":this.myTrades));
        sb.append(',');
        sb.append("nodeHttpModuleLoaded");
        sb.append('=');
        sb.append(((this.nodeHttpModuleLoaded == null)?"<null>":this.nodeHttpModuleLoaded));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("ohlcvs");
        sb.append('=');
        sb.append(((this.ohlcvs == null)?"<null>":this.ohlcvs));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null)?"<null>":this.options));
        sb.append(',');
        sb.append("orderbooks");
        sb.append('=');
        sb.append(((this.orderbooks == null)?"<null>":this.orderbooks));
        sb.append(',');
        sb.append("orders");
        sb.append('=');
        sb.append(((this.orders == null)?"<null>":this.orders));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("positions");
        sb.append('=');
        sb.append(((this.positions == null)?"<null>":this.positions));
        sb.append(',');
        sb.append("privateKey");
        sb.append('=');
        sb.append(((this.privateKey == null)?"<null>":this.privateKey));
        sb.append(',');
        sb.append("pro");
        sb.append('=');
        sb.append(((this.pro == null)?"<null>":this.pro));
        sb.append(',');
        sb.append("proxy");
        sb.append('=');
        sb.append(((this.proxy == null)?"<null>":this.proxy));
        sb.append(',');
        sb.append("proxyUrl");
        sb.append('=');
        sb.append(((this.proxyUrl == null)?"<null>":this.proxyUrl));
        sb.append(',');
        sb.append("proxyUrlCallback");
        sb.append('=');
        sb.append(((this.proxyUrlCallback == null)?"<null>":this.proxyUrlCallback));
        sb.append(',');
        sb.append("quoteJsonNumbers");
        sb.append('=');
        sb.append(((this.quoteJsonNumbers == null)?"<null>":this.quoteJsonNumbers));
        sb.append(',');
        sb.append("reduceFees");
        sb.append('=');
        sb.append(((this.reduceFees == null)?"<null>":this.reduceFees));
        sb.append(',');
        sb.append("requiresEddsa");
        sb.append('=');
        sb.append(((this.requiresEddsa == null)?"<null>":this.requiresEddsa));
        sb.append(',');
        sb.append("requiresWeb3");
        sb.append('=');
        sb.append(((this.requiresWeb3 == null)?"<null>":this.requiresWeb3));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("sleep");
        sb.append('=');
        sb.append(((this.sleep == null)?"<null>":this.sleep));
        sb.append(',');
        sb.append("socksProxy");
        sb.append('=');
        sb.append(((this.socksProxy == null)?"<null>":this.socksProxy));
        sb.append(',');
        sb.append("socksProxyCallback");
        sb.append('=');
        sb.append(((this.socksProxyCallback == null)?"<null>":this.socksProxyCallback));
        sb.append(',');
        sb.append("substituteCommonCurrencyCodes");
        sb.append('=');
        sb.append(((this.substituteCommonCurrencyCodes == null)?"<null>":this.substituteCommonCurrencyCodes));
        sb.append(',');
        sb.append("throttleProp");
        sb.append('=');
        sb.append(((this.throttleProp == null)?"<null>":this.throttleProp));
        sb.append(',');
        sb.append("tickers");
        sb.append('=');
        sb.append(((this.tickers == null)?"<null>":this.tickers));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("trades");
        sb.append('=');
        sb.append(((this.trades == null)?"<null>":this.trades));
        sb.append(',');
        sb.append("transactions");
        sb.append('=');
        sb.append(((this.transactions == null)?"<null>":this.transactions));
        sb.append(',');
        sb.append("triggerOrders");
        sb.append('=');
        sb.append(((this.triggerOrders == null)?"<null>":this.triggerOrders));
        sb.append(',');
        sb.append("twofa");
        sb.append('=');
        sb.append(((this.twofa == null)?"<null>":this.twofa));
        sb.append(',');
        sb.append("uid");
        sb.append('=');
        sb.append(((this.uid == null)?"<null>":this.uid));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
        sb.append(',');
        sb.append("userAgent");
        sb.append('=');
        sb.append(((this.userAgent == null)?"<null>":this.userAgent));
        sb.append(',');
        sb.append("userAgents");
        sb.append('=');
        sb.append(((this.userAgents == null)?"<null>":this.userAgents));
        sb.append(',');
        sb.append("validateClientSsl");
        sb.append('=');
        sb.append(((this.validateClientSsl == null)?"<null>":this.validateClientSsl));
        sb.append(',');
        sb.append("validateServerSsl");
        sb.append('=');
        sb.append(((this.validateServerSsl == null)?"<null>":this.validateServerSsl));
        sb.append(',');
        sb.append("verbose");
        sb.append('=');
        sb.append(((this.verbose == null)?"<null>":this.verbose));
        sb.append(',');
        sb.append("walletAddress");
        sb.append('=');
        sb.append(((this.walletAddress == null)?"<null>":this.walletAddress));
        sb.append(',');
        sb.append("wsProxy");
        sb.append('=');
        sb.append(((this.wsProxy == null)?"<null>":this.wsProxy));
        sb.append(',');
        sb.append("wsSocksProxy");
        sb.append('=');
        sb.append(((this.wsSocksProxy == null)?"<null>":this.wsSocksProxy));
        sb.append(',');
        sb.append("wssProxy");
        sb.append('=');
        sb.append(((this.wssProxy == null)?"<null>":this.wssProxy));
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
        result = ((result* 31)+((this.agent == null)? 0 :this.agent.hashCode()));
        result = ((result* 31)+((this.minFundingAddressLength == null)? 0 :this.minFundingAddressLength.hashCode()));
        result = ((result* 31)+((this.apiKey == null)? 0 :this.apiKey.hashCode()));
        result = ((result* 31)+((this.httpProxyCallback == null)? 0 :this.httpProxyCallback.hashCode()));
        result = ((result* 31)+((this.tickers == null)? 0 :this.tickers.hashCode()));
        result = ((result* 31)+((this.throttleProp == null)? 0 :this.throttleProp.hashCode()));
        result = ((result* 31)+((this.wsSocksProxy == null)? 0 :this.wsSocksProxy.hashCode()));
        result = ((result* 31)+((this.liquidations == null)? 0 :this.liquidations.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.options == null)? 0 :this.options.hashCode()));
        result = ((result* 31)+((this.abortError == null)? 0 :this.abortError.hashCode()));
        result = ((result* 31)+((this.api == null)? 0 :this.api.hashCode()));
        result = ((result* 31)+((this.ohlcvs == null)? 0 :this.ohlcvs.hashCode()));
        result = ((result* 31)+((this.twofa == null)? 0 :this.twofa.hashCode()));
        result = ((result* 31)+((this.fetchImplementation == null)? 0 :this.fetchImplementation.hashCode()));
        result = ((result* 31)+((this.httpsProxyCallback == null)? 0 :this.httpsProxyCallback.hashCode()));
        result = ((result* 31)+((this.orderbooks == null)? 0 :this.orderbooks.hashCode()));
        result = ((result* 31)+((this.fetchError == null)? 0 :this.fetchError.hashCode()));
        result = ((result* 31)+((this.httpProxy == null)? 0 :this.httpProxy.hashCode()));
        result = ((result* 31)+((this.maxValue == null)? 0 :this.maxValue.hashCode()));
        result = ((result* 31)+((this.myTrades == null)? 0 :this.myTrades.hashCode()));
        result = ((result* 31)+((this.positions == null)? 0 :this.positions.hashCode()));
        result = ((result* 31)+((this.proxyUrlCallback == null)? 0 :this.proxyUrlCallback.hashCode()));
        result = ((result* 31)+((this.countries == null)? 0 :this.countries.hashCode()));
        result = ((result* 31)+((this.pro == null)? 0 :this.pro.hashCode()));
        result = ((result* 31)+((this.socksProxy == null)? 0 :this.socksProxy.hashCode()));
        result = ((result* 31)+((this.transactions == null)? 0 :this.transactions.hashCode()));
        result = ((result* 31)+((this.wsProxy == null)? 0 :this.wsProxy.hashCode()));
        result = ((result* 31)+((this.reduceFees == null)? 0 :this.reduceFees.hashCode()));
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.proxy == null)? 0 :this.proxy.hashCode()));
        result = ((result* 31)+((this.substituteCommonCurrencyCodes == null)? 0 :this.substituteCommonCurrencyCodes.hashCode()));
        result = ((result* 31)+((this.validateServerSsl == null)? 0 :this.validateServerSsl.hashCode()));
        result = ((result* 31)+((this.httpsProxy == null)? 0 :this.httpsProxy.hashCode()));
        result = ((result* 31)+((this.orders == null)? 0 :this.orders.hashCode()));
        result = ((result* 31)+((this.walletAddress == null)? 0 :this.walletAddress.hashCode()));
        result = ((result* 31)+((this.fundingRates == null)? 0 :this.fundingRates.hashCode()));
        result = ((result* 31)+((this.triggerOrders == null)? 0 :this.triggerOrders.hashCode()));
        result = ((result* 31)+((this.httpsAgent == null)? 0 :this.httpsAgent.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.userAgents == null)? 0 :this.userAgents.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.login == null)? 0 :this.login.hashCode()));
        result = ((result* 31)+((this.isSandboxModeEnabled == null)? 0 :this.isSandboxModeEnabled.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.handleContentTypeApplicationZip == null)? 0 :this.handleContentTypeApplicationZip.hashCode()));
        result = ((result* 31)+((this.sleep == null)? 0 :this.sleep.hashCode()));
        result = ((result* 31)+((this.uid == null)? 0 :this.uid.hashCode()));
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.httpAgent == null)? 0 :this.httpAgent.hashCode()));
        result = ((result* 31)+((this.nodeHttpModuleLoaded == null)? 0 :this.nodeHttpModuleLoaded.hashCode()));
        result = ((result* 31)+((this.certified == null)? 0 :this.certified.hashCode()));
        result = ((result* 31)+((this.myLiquidations == null)? 0 :this.myLiquidations.hashCode()));
        result = ((result* 31)+((this.headers == null)? 0 :this.headers.hashCode()));
        result = ((result* 31)+((this.wssProxy == null)? 0 :this.wssProxy.hashCode()));
        result = ((result* 31)+((this.proxyUrl == null)? 0 :this.proxyUrl.hashCode()));
        result = ((result* 31)+((this.socksProxyCallback == null)? 0 :this.socksProxyCallback.hashCode()));
        result = ((result* 31)+((this.trades == null)? 0 :this.trades.hashCode()));
        result = ((result* 31)+((this.quoteJsonNumbers == null)? 0 :this.quoteJsonNumbers.hashCode()));
        result = ((result* 31)+((this.userAgent == null)? 0 :this.userAgent.hashCode()));
        result = ((result* 31)+((this.requiresWeb3 == null)? 0 :this.requiresWeb3 .hashCode()));
        result = ((result* 31)+((this.validateClientSsl == null)? 0 :this.validateClientSsl.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.verbose == null)? 0 :this.verbose.hashCode()));
        result = ((result* 31)+((this.privateKey == null)? 0 :this.privateKey.hashCode()));
        result = ((result* 31)+((this.bidsasks == null)? 0 :this.bidsasks.hashCode()));
        result = ((result* 31)+((this.requiresEddsa == null)? 0 :this.requiresEddsa.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exchange) == false) {
            return false;
        }
        Exchange rhs = ((Exchange) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.agent == rhs.agent)||((this.agent!= null)&&this.agent.equals(rhs.agent)))&&((this.minFundingAddressLength == rhs.minFundingAddressLength)||((this.minFundingAddressLength!= null)&&this.minFundingAddressLength.equals(rhs.minFundingAddressLength))))&&((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey))))&&((this.httpProxyCallback == rhs.httpProxyCallback)||((this.httpProxyCallback!= null)&&this.httpProxyCallback.equals(rhs.httpProxyCallback))))&&((this.tickers == rhs.tickers)||((this.tickers!= null)&&this.tickers.equals(rhs.tickers))))&&((this.throttleProp == rhs.throttleProp)||((this.throttleProp!= null)&&this.throttleProp.equals(rhs.throttleProp))))&&((this.wsSocksProxy == rhs.wsSocksProxy)||((this.wsSocksProxy!= null)&&this.wsSocksProxy.equals(rhs.wsSocksProxy))))&&((this.liquidations == rhs.liquidations)||((this.liquidations!= null)&&this.liquidations.equals(rhs.liquidations))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.options == rhs.options)||((this.options!= null)&&this.options.equals(rhs.options))))&&((this.abortError == rhs.abortError)||((this.abortError!= null)&&this.abortError.equals(rhs.abortError))))&&((this.api == rhs.api)||((this.api!= null)&&this.api.equals(rhs.api))))&&((this.ohlcvs == rhs.ohlcvs)||((this.ohlcvs!= null)&&this.ohlcvs.equals(rhs.ohlcvs))))&&((this.twofa == rhs.twofa)||((this.twofa!= null)&&this.twofa.equals(rhs.twofa))))&&((this.fetchImplementation == rhs.fetchImplementation)||((this.fetchImplementation!= null)&&this.fetchImplementation.equals(rhs.fetchImplementation))))&&((this.httpsProxyCallback == rhs.httpsProxyCallback)||((this.httpsProxyCallback!= null)&&this.httpsProxyCallback.equals(rhs.httpsProxyCallback))))&&((this.orderbooks == rhs.orderbooks)||((this.orderbooks!= null)&&this.orderbooks.equals(rhs.orderbooks))))&&((this.fetchError == rhs.fetchError)||((this.fetchError!= null)&&this.fetchError.equals(rhs.fetchError))))&&((this.httpProxy == rhs.httpProxy)||((this.httpProxy!= null)&&this.httpProxy.equals(rhs.httpProxy))))&&((this.maxValue == rhs.maxValue)||((this.maxValue!= null)&&this.maxValue.equals(rhs.maxValue))))&&((this.myTrades == rhs.myTrades)||((this.myTrades!= null)&&this.myTrades.equals(rhs.myTrades))))&&((this.positions == rhs.positions)||((this.positions!= null)&&this.positions.equals(rhs.positions))))&&((this.proxyUrlCallback == rhs.proxyUrlCallback)||((this.proxyUrlCallback!= null)&&this.proxyUrlCallback.equals(rhs.proxyUrlCallback))))&&((this.countries == rhs.countries)||((this.countries!= null)&&this.countries.equals(rhs.countries))))&&((this.pro == rhs.pro)||((this.pro!= null)&&this.pro.equals(rhs.pro))))&&((this.socksProxy == rhs.socksProxy)||((this.socksProxy!= null)&&this.socksProxy.equals(rhs.socksProxy))))&&((this.transactions == rhs.transactions)||((this.transactions!= null)&&this.transactions.equals(rhs.transactions))))&&((this.wsProxy == rhs.wsProxy)||((this.wsProxy!= null)&&this.wsProxy.equals(rhs.wsProxy))))&&((this.reduceFees == rhs.reduceFees)||((this.reduceFees!= null)&&this.reduceFees.equals(rhs.reduceFees))))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.proxy == rhs.proxy)||((this.proxy!= null)&&this.proxy.equals(rhs.proxy))))&&((this.substituteCommonCurrencyCodes == rhs.substituteCommonCurrencyCodes)||((this.substituteCommonCurrencyCodes!= null)&&this.substituteCommonCurrencyCodes.equals(rhs.substituteCommonCurrencyCodes))))&&((this.validateServerSsl == rhs.validateServerSsl)||((this.validateServerSsl!= null)&&this.validateServerSsl.equals(rhs.validateServerSsl))))&&((this.httpsProxy == rhs.httpsProxy)||((this.httpsProxy!= null)&&this.httpsProxy.equals(rhs.httpsProxy))))&&((this.orders == rhs.orders)||((this.orders!= null)&&this.orders.equals(rhs.orders))))&&((this.walletAddress == rhs.walletAddress)||((this.walletAddress!= null)&&this.walletAddress.equals(rhs.walletAddress))))&&((this.fundingRates == rhs.fundingRates)||((this.fundingRates!= null)&&this.fundingRates.equals(rhs.fundingRates))))&&((this.triggerOrders == rhs.triggerOrders)||((this.triggerOrders!= null)&&this.triggerOrders.equals(rhs.triggerOrders))))&&((this.httpsAgent == rhs.httpsAgent)||((this.httpsAgent!= null)&&this.httpsAgent.equals(rhs.httpsAgent))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.userAgents == rhs.userAgents)||((this.userAgents!= null)&&this.userAgents.equals(rhs.userAgents))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.login == rhs.login)||((this.login!= null)&&this.login.equals(rhs.login))))&&((this.isSandboxModeEnabled == rhs.isSandboxModeEnabled)||((this.isSandboxModeEnabled!= null)&&this.isSandboxModeEnabled.equals(rhs.isSandboxModeEnabled))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.handleContentTypeApplicationZip == rhs.handleContentTypeApplicationZip)||((this.handleContentTypeApplicationZip!= null)&&this.handleContentTypeApplicationZip.equals(rhs.handleContentTypeApplicationZip))))&&((this.sleep == rhs.sleep)||((this.sleep!= null)&&this.sleep.equals(rhs.sleep))))&&((this.uid == rhs.uid)||((this.uid!= null)&&this.uid.equals(rhs.uid))))&&((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls))))&&((this.httpAgent == rhs.httpAgent)||((this.httpAgent!= null)&&this.httpAgent.equals(rhs.httpAgent))))&&((this.nodeHttpModuleLoaded == rhs.nodeHttpModuleLoaded)||((this.nodeHttpModuleLoaded!= null)&&this.nodeHttpModuleLoaded.equals(rhs.nodeHttpModuleLoaded))))&&((this.certified == rhs.certified)||((this.certified!= null)&&this.certified.equals(rhs.certified))))&&((this.myLiquidations == rhs.myLiquidations)||((this.myLiquidations!= null)&&this.myLiquidations.equals(rhs.myLiquidations))))&&((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers))))&&((this.wssProxy == rhs.wssProxy)||((this.wssProxy!= null)&&this.wssProxy.equals(rhs.wssProxy))))&&((this.proxyUrl == rhs.proxyUrl)||((this.proxyUrl!= null)&&this.proxyUrl.equals(rhs.proxyUrl))))&&((this.socksProxyCallback == rhs.socksProxyCallback)||((this.socksProxyCallback!= null)&&this.socksProxyCallback.equals(rhs.socksProxyCallback))))&&((this.trades == rhs.trades)||((this.trades!= null)&&this.trades.equals(rhs.trades))))&&((this.quoteJsonNumbers == rhs.quoteJsonNumbers)||((this.quoteJsonNumbers!= null)&&this.quoteJsonNumbers.equals(rhs.quoteJsonNumbers))))&&((this.userAgent == rhs.userAgent)||((this.userAgent!= null)&&this.userAgent.equals(rhs.userAgent))))&&((this.requiresWeb3 == rhs.requiresWeb3)||((this.requiresWeb3 != null)&&this.requiresWeb3 .equals(rhs.requiresWeb3))))&&((this.validateClientSsl == rhs.validateClientSsl)||((this.validateClientSsl!= null)&&this.validateClientSsl.equals(rhs.validateClientSsl))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))))&&((this.verbose == rhs.verbose)||((this.verbose!= null)&&this.verbose.equals(rhs.verbose))))&&((this.privateKey == rhs.privateKey)||((this.privateKey!= null)&&this.privateKey.equals(rhs.privateKey))))&&((this.bidsasks == rhs.bidsasks)||((this.bidsasks!= null)&&this.bidsasks.equals(rhs.bidsasks))))&&((this.requiresEddsa == rhs.requiresEddsa)||((this.requiresEddsa!= null)&&this.requiresEddsa.equals(rhs.requiresEddsa))));
    }

}
