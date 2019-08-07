
package com.telkom.singlephase.productorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "href",
    "version",
    "name",
    "targetResourceSchema"
})
public class ProductSpecification {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("version")
    private String version;
    @JsonProperty("name")
    private String name;
    @JsonProperty("targetResourceSchema")
    private TargetResourceSchema targetResourceSchema;

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

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("targetResourceSchema")
    public TargetResourceSchema getTargetResourceSchema() {
        return targetResourceSchema;
    }

    @JsonProperty("targetResourceSchema")
    public void setTargetResourceSchema(TargetResourceSchema targetResourceSchema) {
        this.targetResourceSchema = targetResourceSchema;
    }

}
