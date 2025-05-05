package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "private",
    "public",
    "ws"
})
public class Api implements Serializable {

    private final static long serialVersionUID = 8028943728331626976L;

    @JsonProperty("private")
    private Object privateProperty;

    @JsonProperty("public")
    private Object publicProperty;

    @JsonProperty("ws")
    private Object ws;

    @JsonProperty("private")
    public Optional<Object> getPrivateProperty() {
        return Optional.ofNullable(privateProperty);
    }

    @JsonProperty("private")
    public void setPrivateProperty(Object priObject) {
        this.privateProperty = privateProperty;
    }

    @JsonProperty("public")
    public Optional<Object> getPublicProperty() {
        return Optional.ofNullable(publicProperty);
    }

    @JsonProperty("public")
    public void setPrivate(Object publicProperty) {
        this.publicProperty = publicProperty;
    }

    @JsonProperty("ws")
    public Optional<Object> getWs() {
        return Optional.ofNullable(ws);
    }

    @JsonProperty("ws")
    public void setWs(Object ws) {
        this.ws = ws;
    }

}