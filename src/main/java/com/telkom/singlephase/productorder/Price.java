
package com.telkom.singlephase.productorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taxIncludedAmount",
    "dutyFreeAmount",
    "taxRate",
    "percentage",
    "@type",
    "@schemaLocation"
})
public class Price {

    @JsonProperty("taxIncludedAmount")
    private TaxIncludedAmount taxIncludedAmount;
    @JsonProperty("dutyFreeAmount")
    private DutyFreeAmount dutyFreeAmount;
    @JsonProperty("taxRate")
    private Integer taxRate;
    @JsonProperty("percentage")
    private Integer percentage;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("taxIncludedAmount")
    public TaxIncludedAmount getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    @JsonProperty("taxIncludedAmount")
    public void setTaxIncludedAmount(TaxIncludedAmount taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    @JsonProperty("dutyFreeAmount")
    public DutyFreeAmount getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    @JsonProperty("dutyFreeAmount")
    public void setDutyFreeAmount(DutyFreeAmount dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
    }

    @JsonProperty("taxRate")
    public Integer getTaxRate() {
        return taxRate;
    }

    @JsonProperty("taxRate")
    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    @JsonProperty("percentage")
    public Integer getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
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
