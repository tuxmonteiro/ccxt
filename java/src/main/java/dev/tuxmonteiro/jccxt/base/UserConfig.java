package dev.tuxmonteiro.jccxt.base;

import java.util.Map;

public record UserConfig(Map<String, Object> map) {

    public static final UserConfig DEFAULT = new UserConfig();

    public UserConfig() {
        this(Map.of());
    }

}
