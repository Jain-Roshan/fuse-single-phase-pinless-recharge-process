
package com.telkom.singlephase.productorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "priceType",
    "unitOfMeasure",
    "recurringChargePeriod",
    "applicationDuration",
    "priority",
    "price",
    "@type",
    "@schemaLocation"
})
public class PriceAlteration {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;
    @JsonProperty("recurringChargePeriod")
    private String recurringChargePeriod;
    @JsonProperty("applicationDuration")
    private String applicationDuration;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("unitOfMeasure")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @JsonProperty("recurringChargePeriod")
    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    @JsonProperty("recurringChargePeriod")
    public void setRecurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    @JsonProperty("applicationDuration")
    public String getApplicationDuration() {
        return applicationDuration;
    }

    @JsonProperty("applicationDuration")
    public void setApplicationDuration(String applicationDuration) {
        this.applicationDuration = applicationDuration;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    @JsonProperty("@schemaLocation")
    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

}
