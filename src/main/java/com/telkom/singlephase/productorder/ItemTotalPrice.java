
package com.telkom.singlephase.productorder;

import java.util.List;
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
    "@type",
    "@schemaLocation",
    "price",
    "priceAlteration",
    "billingAccount"
})
public class ItemTotalPrice {

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
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("priceAlteration")
    private List<PriceAlteration> priceAlteration = null;
    @JsonProperty("billingAccount")
    private BillingAccount billingAccount;

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

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("priceAlteration")
    public List<PriceAlteration> getPriceAlteration() {
        return priceAlteration;
    }

    @JsonProperty("priceAlteration")
    public void setPriceAlteration(List<PriceAlteration> priceAlteration) {
        this.priceAlteration = priceAlteration;
    }

    @JsonProperty("billingAccount")
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    @JsonProperty("billingAccount")
    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

}
