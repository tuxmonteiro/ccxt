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
    "has",
    "headers",
    "httpAgent",
    "httpProxy",
    "httpProxyCallback",
    "httpsAgent",
    "httpsProxy",
    "httpsProxyCallback",
    "id",
    "isSandboxModeEnabled",
    "liquidations",
    "login",
    "minFundingAddressLength",
    "myLiquidations",
    "myTrades",
    "nodeHttpModuleLoaded",
    "name",
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

    private final static long serialVersionUID = 4370324370153680134L;

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("agent")
    private Object agent;

    @JsonProperty("api")
    private Object api;

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("balance")
    private Balance balance;

    @JsonProperty("bidsasks")
    private Map<String, Ticker> bidsasks = Map.of();

    @JsonProperty("certified")
    private Boolean certified;

    @JsonProperty("countries")
    private List<String> countries = Map.of();

    @JsonProperty("fetchImplementation")
    private Object fetchImplementation;

    @JsonProperty("fundingRates")
    private Map<String, FundingRate> fundingRates = Map.of();

    @JsonProperty("handleContentTypeApplicationZip")
    private Boolean handleContentTypeApplicationZip;

    @JsonProperty("headers")
    private Map<Object, Object> headers = Map.of();

    @JsonProperty("httpAgent")
    private String httpAgent;

    @JsonProperty("httpProxy")
    private String httpProxy;

    @JsonProperty("httpProxyCallback")
    private Object httpProxyCallback;

    @JsonProperty("httpsAgent")
    private String httpsAgent;

    @JsonProperty("httpsProxy")
    private String httpsProxy;

    @JsonProperty("httpsProxyCallback")
    private Object httpsProxyCallback;

    @JsonProperty("isSandboxModeEnabled")
    private Boolean isSandboxModeEnabled;

    @JsonProperty("liquidations")
    private Map<String, Liquidation> liquidations = List.of();

    @JsonProperty("login")
    private String login;

    @JsonProperty("minFundingAddressLength")
    private Double minFundingAddressLength;

    @JsonProperty("myLiquidations")
    private Map<String, Liquidation> myLiquidations = Map.of();

    @JsonProperty("myTrades")
    private Map<String, Trade> myTrades = Map.of();

    @JsonProperty("ohlcvs")
    private Map<Long, Map<String, Double>> ohlcvs = Map.of();

    @JsonProperty("options")
    private Map<String, Option> options = Map.of();

    @JsonProperty("orderbooks")
    private Map<String, OrderBook> orderbooks;

    @JsonProperty("orders")
    private Map<String, Order> orders orders - Map.of();

    @JsonProperty("origin")
    private String origin;

    @JsonProperty("password")
    private String password;

    @JsonProperty("positions")
    private Map<String, Position> positions = Map.of();

    @JsonProperty("privateKey")
    private String privateKey;

    @JsonProperty("pro")
    private Boolean pro;

    @JsonProperty("proxy")
    private Object proxy;

    @JsonProperty("proxyUrl")
    private String proxyUrl;

    @JsonProperty("proxyUrlCallback")
    private Object proxyUrlCallback;

    @JsonProperty("quoteJsonNumbers")
    private Boolean quoteJsonNumbers;

    @JsonProperty("reduceFees")
    private Boolean reduceFees;

    @JsonProperty("requiresEddsa")
    private Boolean requiresEddsa;

    @JsonProperty("requiresWeb3")
    private Boolean requiresWeb3;

    @JsonProperty("secret")
    private String secret;

    @JsonProperty("sleep")
    private Long sleep;

    @JsonProperty("socksProxy")
    private String socksProxy;

    @JsonProperty("socksProxyCallback")
    private Object socksProxyCallback;

    @JsonProperty("substituteCommonCurrencyCodes")
    private Boolean substituteCommonCurrencyCodes;

    @JsonProperty("throttleProp")
    private Object throttleProp;

    @JsonProperty("tickers")
    private Map<String, Ticker> tickers = Map.of();

    @JsonProperty("timeout")
    private Double timeout;

    @JsonProperty("token")
    private String token;

    @JsonProperty("trades")
    private Map<String, Trade> trades = Map.of();

    @JsonProperty("transactions")
    private Map<String, Transaction> transactions = Map.of();

    @JsonProperty("triggerOrders")
    private TriggerOrders triggerOrders;

    @JsonProperty("twofa")
    private Object twofa;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("urls")
    private Urls urls;

    @JsonProperty("userAgent")
    private String userAgent;

    @JsonProperty("userAgents")
    private Map<String, String> userAgents;

    @JsonProperty("validateClientSsl")
    private Boolean validateClientSsl;

    @JsonProperty("validateServerSsl")
    private Boolean validateServerSsl;

    @JsonProperty("verbose")
    private Boolean verbose;

    @JsonProperty("walletAddress")
    private String walletAddress;

    @JsonProperty("wsProxy")
    private String wsProxy;

    @JsonProperty("wsSocksProxy")
    private String wsSocksProxy;

    @JsonProperty("wssProxy")
    private String wssProxy;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Object getAgent() {
        return agent;
    }

    public void setAgent(Object agent) {
        this.agent = agent;
    }

    public Object getApi() {
        return api;
    }

    public void setApi(Object api) {
        this.api = api;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Map<String, Ticker> getBidsasks() {
        return bidsasks;
    }

    public void setBidsasks(Map<String, Ticker> bidsasks) {
        this.bidsasks = bidsasks;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public Object getFetchImplementation() {
        return fetchImplementation;
    }

    public void setFetchImplementation(Object fetchImplementation) {
        this.fetchImplementation = fetchImplementation;
    }

    public Map<String, FundingRate> getFundingRates() {
        return fundingRates;
    }

    public void setFundingRates(Map<String, FundingRate> fundingRates) {
        this.fundingRates = fundingRates;
    }

    public Boolean getHandleContentTypeApplicationZip() {
        return handleContentTypeApplicationZip;
    }

    public void setHandleContentTypeApplicationZip(Boolean handleContentTypeApplicationZip) {
        this.handleContentTypeApplicationZip = handleContentTypeApplicationZip;
    }

    public Map<Object, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<Object, Object> headers) {
        this.headers = headers;
    }

    public String getHttpAgent() {
        return httpAgent;
    }

    public void setHttpAgent(String httpAgent) {
        this.httpAgent = httpAgent;
    }

    public String getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
    }

    public Object getHttpProxyCallback() {
        return httpProxyCallback;
    }

    public void setHttpProxyCallback(Object httpProxyCallback) {
        this.httpProxyCallback = httpProxyCallback;
    }

    public String getHttpsAgent() {
        return httpsAgent;
    }

    public void setHttpsAgent(String httpsAgent) {
        this.httpsAgent = httpsAgent;
    }

    public String getHttpsProxy() {
        return httpsProxy;
    }

    public void setHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    public Object getHttpsProxyCallback() {
        return httpsProxyCallback;
    }

    public void setHttpsProxyCallback(Object httpsProxyCallback) {
        this.httpsProxyCallback = httpsProxyCallback;
    }

    public Boolean getIsSandboxModeEnabled() {
        return isSandboxModeEnabled;
    }

    public void setIsSandboxModeEnabled(Boolean isSandboxModeEnabled) {
        this.isSandboxModeEnabled = isSandboxModeEnabled;
    }

    public Map<String, Liquidation> getLiquidations() {
        return liquidations;
    }

    public void setLiquidations(Map<String, Liquidation> liquidations) {
        this.liquidations = liquidations;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Double getMinFundingAddressLength() {
        return minFundingAddressLength;
    }

    public void setMinFundingAddressLength(Double minFundingAddressLength) {
        this.minFundingAddressLength = minFundingAddressLength;
    }

    public Map<String, Liquidation> getMyLiquidations() {
        return myLiquidations;
    }

    public void setMyLiquidations(Map<String, Liquidation> myLiquidations) {
        this.myLiquidations = myLiquidations;
    }

    public Map<String, Trade> getMyTrades() {
        return myTrades;
    }

    public void setMyTrades(Map<String, Trade> myTrades) {
        this.myTrades = myTrades;
    }

    public Map<Long, Map<String, Double>> getOhlcvs() {
        return ohlcvs;
    }

    public void setOhlcvs(Map<Long, Map<String, Double>> ohlcvs) {
        this.ohlcvs = ohlcvs;
    }

    public Map<String, Option> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Option> options) {
        this.options = options;
    }

    public Map<String, OrderBook> getOrderbooks() {
        return orderbooks;
    }

    public void setOrderbooks(Map<String, OrderBook> orderbooks) {
        this.orderbooks = orderbooks;
    }

    public Map<String, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Order> orders) {
        this.orders = orders;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Position> getPositions() {
        return positions;
    }

    public void setPositions(Map<String, Position> positions) {
        this.positions = positions;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public Boolean getPro() {
        return pro;
    }

    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    public Object getProxy() {
        return proxy;
    }

    public void setProxy(Object proxy) {
        this.proxy = proxy;
    }

    public String getProxyUrl() {
        return proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    public Object getProxyUrlCallback() {
        return proxyUrlCallback;
    }

    public void setProxyUrlCallback(Object proxyUrlCallback) {
        this.proxyUrlCallback = proxyUrlCallback;
    }

    public Boolean getQuoteJsonNumbers() {
        return quoteJsonNumbers;
    }

    public void setQuoteJsonNumbers(Boolean quoteJsonNumbers) {
        this.quoteJsonNumbers = quoteJsonNumbers;
    }

    public Boolean getReduceFees() {
        return reduceFees;
    }

    public void setReduceFees(Boolean reduceFees) {
        this.reduceFees = reduceFees;
    }

    public Boolean getRequiresEddsa() {
        return requiresEddsa;
    }

    public void setRequiresEddsa(Boolean requiresEddsa) {
        this.requiresEddsa = requiresEddsa;
    }

    public Boolean getRequiresWeb3() {
        return requiresWeb3;
    }

    public void setRequiresWeb3(Boolean requiresWeb3) {
        this.requiresWeb3 = requiresWeb3;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getSleep() {
        return sleep;
    }

    public void setSleep(Long sleep) {
        this.sleep = sleep;
    }

    public String getSocksProxy() {
        return socksProxy;
    }

    public void setSocksProxy(String socksProxy) {
        this.socksProxy = socksProxy;
    }

    public Object getSocksProxyCallback() {
        return socksProxyCallback;
    }

    public void setSocksProxyCallback(Object socksProxyCallback) {
        this.socksProxyCallback = socksProxyCallback;
    }

    public Boolean getSubstituteCommonCurrencyCodes() {
        return substituteCommonCurrencyCodes;
    }

    public void setSubstituteCommonCurrencyCodes(Boolean substituteCommonCurrencyCodes) {
        this.substituteCommonCurrencyCodes = substituteCommonCurrencyCodes;
    }

    public Object getThrottleProp() {
        return throttleProp;
    }

    public void setThrottleProp(Object throttleProp) {
        this.throttleProp = throttleProp;
    }

    public Map<String, Ticker> getTickers() {
        return tickers;
    }

    public void setTickers(Map<String, Ticker> tickers) {
        this.tickers = tickers;
    }

    public Double getTimeout() {
        return timeout;
    }

    public void setTimeout(Double timeout) {
        this.timeout = timeout;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Map<String, Trade> getTrades() {
        return trades;
    }

    public void setTrades(Map<String, Trade> trades) {
        this.trades = trades;
    }

    public Map<String, Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Map<String, Transaction> transactions) {
        this.transactions = transactions;
    }

    public TriggerOrders getTriggerOrders() {
        return triggerOrders;
    }

    public void setTriggerOrders(TriggerOrders triggerOrders) {
        this.triggerOrders = triggerOrders;
    }

    public Object getTwofa() {
        return twofa;
    }

    public void setTwofa(Object twofa) {
        this.twofa = twofa;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Map<String, String> getUserAgents() {
        return userAgents;
    }

    public void setUserAgents(Map<String, String> userAgents) {
        this.userAgents = userAgents;
    }

    public Boolean getValidateClientSsl() {
        return validateClientSsl;
    }

    public void setValidateClientSsl(Boolean validateClientSsl) {
        this.validateClientSsl = validateClientSsl;
    }

    public Boolean getValidateServerSsl() {
        return validateServerSsl;
    }

    public void setValidateServerSsl(Boolean validateServerSsl) {
        this.validateServerSsl = validateServerSsl;
    }

    public Boolean getVerbose() {
        return verbose;
    }

    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getWsProxy() {
        return wsProxy;
    }

    public void setWsProxy(String wsProxy) {
        this.wsProxy = wsProxy;
    }

    public String getWsSocksProxy() {
        return wsSocksProxy;
    }

    public void setWsSocksProxy(String wsSocksProxy) {
        this.wsSocksProxy = wsSocksProxy;
    }

    public String getWssProxy() {
        return wssProxy;
    }

    public void setWssProxy(String wssProxy) {
        this.wssProxy = wssProxy;
    }


}
