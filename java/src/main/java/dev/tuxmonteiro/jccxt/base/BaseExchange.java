package dev.tuxmonteiro.jccxt.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public abstract class BaseExchange {

    protected final ObjectMapper mapper = new ObjectMapper();

    private final boolean isSandboxModeEnabled;
    private final JsonNode describe;

    public BaseExchange() {
        this(UserConfig.DEFAULT, new ObjectMapper().nullNode());
    }

    public BaseExchange(final UserConfig userConfig, JsonNode describe) {
        this.describe = describe;
        this.isSandboxModeEnabled =
                Boolean.getBoolean((String) userConfig.map().getOrDefault("sandbox", "false")) ||
                Boolean.getBoolean((String) userConfig.map().getOrDefault("testnet", "false"));
    }

    public boolean isSandboxModeEnabled() {
        return isSandboxModeEnabled;
    }

    public JsonNode getDescribe() {
        return describe;
    }

    // private void initHttpClient() {}

    // private void transformApiNew(Map<String, Object> api, List<String> paths = List.of([])) {}

    // public void handleHttpStatusCode(Code code, Reason reason, URL url, HttpMethod method, Body body) {}

}
