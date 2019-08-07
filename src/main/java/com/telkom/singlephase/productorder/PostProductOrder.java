
package com.telkom.singlephase.productorder;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "externalId",
    "priority",
    "bulkInfo",
    "description",
    "category",
    "requestedStartDate",
    "requestedCompletionDate",
    "notificationContact",
    "@baseType",
    "@type",
    "@schemaLocation",
    "channel",
    "note",
    "relatedParty",
    "payment",
    "action",
    "billingAccount",
    "orderTotalPrice",
    "orderItem"
})
public class PostProductOrder {

    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("bulkInfo")
    private BulkInfo bulkInfo;
    @JsonProperty("description")
    private String description;
    @JsonProperty("category")
    private String category;
    @JsonProperty("requestedStartDate")
    private String requestedStartDate;
    @JsonProperty("requestedCompletionDate")
    private String requestedCompletionDate;
    @JsonProperty("notificationContact")
    private String notificationContact;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("channel")
    private List<Channel> channel = null;
    @JsonProperty("note")
    private List<Note> note = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("payment")
    private List<Payment> payment = null;
    @JsonProperty("action")
    private String action;
    @JsonProperty("billingAccount")
    private BillingAccount billingAccount;
    @JsonProperty("orderTotalPrice")
    private List<OrderTotalPrice> orderTotalPrice = null;
    @JsonProperty("orderItem")
    private List<OrderItem> orderItem = null;

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("bulkInfo")
    public BulkInfo getBulkInfo() {
        return bulkInfo;
    }

    @JsonProperty("bulkInfo")
    public void setBulkInfo(BulkInfo bulkInfo) {
        this.bulkInfo = bulkInfo;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("requestedStartDate")
    public String getRequestedStartDate() {
        return requestedStartDate;
    }

    @JsonProperty("requestedStartDate")
    public void setRequestedStartDate(String requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    @JsonProperty("requestedCompletionDate")
    public String getRequestedCompletionDate() {
        return requestedCompletionDate;
    }

    @JsonProperty("requestedCompletionDate")
    public void setRequestedCompletionDate(String requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
    }

    @JsonProperty("notificationContact")
    public String getNotificationContact() {
        return notificationContact;
    }

    @JsonProperty("notificationContact")
    public void setNotificationContact(String notificationContact) {
        this.notificationContact = notificationContact;
    }

    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(String baseType) {
        this.baseType = baseType;
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

    @JsonProperty("channel")
    public List<Channel> getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(List<Channel> channel) {
        this.channel = channel;
    }

    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(List<Note> note) {
        this.note = note;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("payment")
    public List<Payment> getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("billingAccount")
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    @JsonProperty("billingAccount")
    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    @JsonProperty("orderTotalPrice")
    public List<OrderTotalPrice> getOrderTotalPrice() {
        return orderTotalPrice;
    }

    @JsonProperty("orderTotalPrice")
    public void setOrderTotalPrice(List<OrderTotalPrice> orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
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
