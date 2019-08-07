
package com.telkom.singlephase.productorder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "href",
    "name",
    "place",
    "characteristic",
    "relatedParty",
    "productRelationship",
    "productSpecification",
    "@type",
    "@schemaLocation"
})
public class Product {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("place")
    private List<Place> place = null;
    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("productRelationship")
    private List<ProductRelationship> productRelationship = null;
    @JsonProperty("productSpecification")
    private ProductSpecification productSpecification;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;

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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("place")
    public List<Place> getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(List<Place> place) {
        this.place = place;
    }

    @JsonProperty("characteristic")
    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("productRelationship")
    public List<ProductRelationship> getProductRelationship() {
        return productRelationship;
    }

    @JsonProperty("productRelationship")
    public void setProductRelationship(List<ProductRelationship> productRelationship) {
        this.productRelationship = productRelationship;
    }

    @JsonProperty("productSpecification")
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    @JsonProperty("productSpecification")
    public void setProductSpecification(ProductSpecification productSpecification) {
        this.productSpecification = productSpecification;
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
