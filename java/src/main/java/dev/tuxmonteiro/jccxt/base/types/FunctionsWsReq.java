package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "comments",
        "raw",
        "request_template",
})
public class FunctionsWsReq implements Serializable {

    private final static long serialVersionUID = 8028943728331626976L;

    @JsonProperty("comments")
    private List<String> comments;

    @JsonProperty("raw")
    private List<String> raw;

    @JsonProperty("request_template")
    private RequestTemplate requestTemplate;

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<String> getRaw() {
        return raw;
    }

    public void setRaw(List<String> raw) {
        this.raw = raw;
    }

    public RequestTemplate getRequestTemplate() {
        return requestTemplate;
    }

    public void setRequestTemplate(RequestTemplate requestTemplate) {
        this.requestTemplate = requestTemplate;
    }
}
