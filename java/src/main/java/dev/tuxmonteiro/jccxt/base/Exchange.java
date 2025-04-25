package dev.tuxmonteiro.jccxt.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public abstract class Exchange {

    protected final ObjectMapper mapper = new ObjectMapper();

    private final boolean isSandboxModeEnabled;
    private final JsonNode describe;

    public Exchange() {
        this(UserConfig.DEFAULT, new ObjectMapper().nullNode());
    }

    public Exchange(final UserConfig userConfig, JsonNode describe) {
        this.describe = describe;
        this.isSandboxModeEnabled =
                Boolean.getBoolean((String) userConfig.map().getOrDefault("sandbox", "false")) ||
                Boolean.getBoolean((String) userConfig.map().getOrDefault("testnet", "false"));
    }

    // private void initHttpClient() {}

    // private void transformApiNew(Map<String, Object> api, List<String> paths = List.of([])) {}

    // public void handleHttpStatusCode(Code code, Reason reason, URL url, HttpMethod method, Body body) {}

}
