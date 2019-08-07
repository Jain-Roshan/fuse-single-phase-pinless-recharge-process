
package com.telkom.singlephase.productorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "href",
    "qualificationItemId",
    "@referredType"
})
public class Qualification {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("qualificationItemId")
    private String qualificationItemId;
    @JsonProperty("@referredType")
    private String referredType;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("qualificationItemId")
    public String getQualificationItemId() {
        return qualificationItemId;
    }

    @JsonProperty("qualificationItemId")
    public void setQualificationItemId(String qualificationItemId) {
        this.qualificationItemId = qualificationItemId;
    }

    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    @JsonProperty("@referredType")
    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

}
