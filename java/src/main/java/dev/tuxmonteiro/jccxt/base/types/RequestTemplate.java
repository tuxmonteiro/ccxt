package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "encoded",
        "template"
})
public class RequestTemplate implements Serializable {

    private final static long serialVersionUID = 8028943728331626976L;

    @JsonProperty("encoded")
    private Boolean encoded;

    @JsonProperty("template")
    private Object template;

    public Boolean getEncoded() {
        return encoded;
    }

    public void setEncoded(Boolean encoded) {
        this.encoded = encoded;
    }

    public Object getTemplate() {
        return template;
    }

    public void setTemplate(Object template) {
        this.template = template;
    }
}