
package com.telkom.singlephase.productorder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "action",
    "quantity",
    "@type",
    "@schemaLocation",
    "appointment",
    "billingAccount",
    "itemPrice",
    "itemTotalPrice",
    "productOffering",
    "product",
    "orderItemRelationship",
    "productOrderRelationship",
    "qualification",
    "payment",
    "itemTerm",
    "orderItem"
})
public class OrderItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("action")
    private String action;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("appointment")
    private Appointment appointment;
    @JsonProperty("billingAccount")
    private BillingAccount billingAccount;
    @JsonProperty("itemPrice")
    private List<ItemPrice> itemPrice = null;
    @JsonProperty("itemTotalPrice")
    private List<ItemTotalPrice> itemTotalPrice = null;
    @JsonProperty("productOffering")
    private ProductOffering productOffering;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("orderItemRelationship")
    private List<OrderItemRelationship> orderItemRelationship = null;
    @JsonProperty("productOrderRelationship")
    private List<ProductOrderRelationship> productOrderRelationship = null;
    @JsonProperty("qualification")
    private List<Qualification> qualification = null;
    @JsonProperty("payment")
    private List<Payment> payment = null;
    @JsonProperty("itemTerm")
    private List<ItemTerm> itemTerm = null;
    @JsonProperty("orderItem")
    private List<OrderItem> orderItem = null;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    @JsonProperty("appointment")
    public Appointment getAppointment() {
        return appointment;
    }

    @JsonProperty("appointment")
    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @JsonProperty("billingAccount")
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    @JsonProperty("billingAccount")
    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    @JsonProperty("itemPrice")
    public List<ItemPrice> getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("itemPrice")
    public void setItemPrice(List<ItemPrice> itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("itemTotalPrice")
    public List<ItemTotalPrice> getItemTotalPrice() {
        return itemTotalPrice;
    }

    @JsonProperty("itemTotalPrice")
    public void setItemTotalPrice(List<ItemTotalPrice> itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    @JsonProperty("productOffering")
    public ProductOffering getProductOffering() {
        return productOffering;
    }

    @JsonProperty("productOffering")
    public void setProductOffering(ProductOffering productOffering) {
        this.productOffering = productOffering;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("orderItemRelationship")
    public List<OrderItemRelationship> getOrderItemRelationship() {
        return orderItemRelationship;
    }

    @JsonProperty("orderItemRelationship")
    public void setOrderItemRelationship(List<OrderItemRelationship> orderItemRelationship) {
        this.orderItemRelationship = orderItemRelationship;
    }

    @JsonProperty("productOrderRelationship")
    public List<ProductOrderRelationship> getProductOrderRelationship() {
        return productOrderRelationship;
    }

    @JsonProperty("productOrderRelationship")
    public void setProductOrderRelationship(List<ProductOrderRelationship> productOrderRelationship) {
        this.productOrderRelationship = productOrderRelationship;
    }

    @JsonProperty("qualification")
    public List<Qualification> getQualification() {
        return qualification;
    }

    @JsonProperty("qualification")
    public void setQualification(List<Qualification> qualification) {
        this.qualification = qualification;
    }

    @JsonProperty("payment")
    public List<Payment> getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    @JsonProperty("itemTerm")
    public List<ItemTerm> getItemTerm() {
        return itemTerm;
    }

    @JsonProperty("itemTerm")
    public void setItemTerm(List<ItemTerm> itemTerm) {
        this.itemTerm = itemTerm;
    }

    @JsonProperty("orderItem")
    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    @JsonProperty("orderItem")
    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

}
