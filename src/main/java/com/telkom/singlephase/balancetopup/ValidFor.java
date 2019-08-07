
package com.telkom.singlephase.balancetopup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startDateTime",
    "endDateTime"
})
public class ValidFor {

    @JsonProperty("startDateTime")
    private String startDateTime;
    @JsonProperty("endDateTime")
    private String endDateTime;

    @JsonProperty("startDateTime")
    public String getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("startDateTime")
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("endDateTime")
    public String getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("endDateTime")
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

}
