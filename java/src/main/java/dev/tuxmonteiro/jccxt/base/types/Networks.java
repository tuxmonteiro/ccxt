package dev.tuxmonteiro.jccxt.base.types;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "string"
})
public class Networks implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("string")
    private Object string;
    private final static long serialVersionUID = 8354430221768148338L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("string")
    public Object getString() {
        return string;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("string")
    public void setString(Object string) {
        this.string = string;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Networks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("string");
        sb.append('=');
        sb.append(((this.string == null)?"<null>":this.string));
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
        result = ((result* 31)+((this.string == null)? 0 :this.string.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Networks) == false) {
            return false;
        }
        Networks rhs = ((Networks) other);
        return ((this.string == rhs.string)||((this.string!= null)&&this.string.equals(rhs.string)));
    }

}
