
package com.telkom.singlephase.balancetopup;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "channel",
    "amount",
    "product",
    "id",
    "href",
    "description",
    "requestor",
    "isAutoTopup",
    "recurringPeriod",
    "nrOfPeriods",
    "paymentMethod",
    "voucher",
    "validFor",
    "requestedDate",
    "confirmationDate",
    "status",
    "bucket",
    "partyAccount",
    "relatedParty",
    "characteristic"
})
public class BalanceTopUp {

    @JsonProperty("type")
    private String type;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("description")
    private String description;
    @JsonProperty("requestor")
    private Requestor requestor;
    @JsonProperty("isAutoTopup")
    private Boolean isAutoTopup;
    @JsonProperty("recurringPeriod")
    private String recurringPeriod;
    @JsonProperty("nrOfPeriods")
    private Integer nrOfPeriods;
    @JsonProperty("paymentMethod")
    private PaymentMethod paymentMethod;
    @JsonProperty("voucher")
    private String voucher;
    @JsonProperty("validFor")
    private ValidFor validFor;
    @JsonProperty("requestedDate")
    private String requestedDate;
    @JsonProperty("confirmationDate")
    private String confirmationDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("bucket")
    private Bucket bucket;
    @JsonProperty("partyAccount")
    private PartyAccount partyAccount;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = null;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("requestor")
    public Requestor getRequestor() {
        return requestor;
    }

    @JsonProperty("requestor")
    public void setRequestor(Requestor requestor) {
        this.requestor = requestor;
    }

    @JsonProperty("isAutoTopup")
    public Boolean getIsAutoTopup() {
        return isAutoTopup;
    }

    @JsonProperty("isAutoTopup")
    public void setIsAutoTopup(Boolean isAutoTopup) {
        this.isAutoTopup = isAutoTopup;
    }

    @JsonProperty("recurringPeriod")
    public String getRecurringPeriod() {
        return recurringPeriod;
    }

    @JsonProperty("recurringPeriod")
    public void setRecurringPeriod(String recurringPeriod) {
        this.recurringPeriod = recurringPeriod;
    }

    @JsonProperty("nrOfPeriods")
    public Integer getNrOfPeriods() {
        return nrOfPeriods;
    }

    @JsonProperty("nrOfPeriods")
    public void setNrOfPeriods(Integer nrOfPeriods) {
        this.nrOfPeriods = nrOfPeriods;
    }

    @JsonProperty("paymentMethod")
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("voucher")
    public String getVoucher() {
        return voucher;
    }

    @JsonProperty("voucher")
    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @JsonProperty("validFor")
    public ValidFor getValidFor() {
        return validFor;
    }

    @JsonProperty("validFor")
    public void setValidFor(ValidFor validFor) {
        this.validFor = validFor;
    }

    @JsonProperty("requestedDate")
    public String getRequestedDate() {
        return requestedDate;
    }

    @JsonProperty("requestedDate")
    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    @JsonProperty("confirmationDate")
    public String getConfirmationDate() {
        return confirmationDate;
    }

    @JsonProperty("confirmationDate")
    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("bucket")
    public Bucket getBucket() {
        return bucket;
    }

    @JsonProperty("bucket")
    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    @JsonProperty("partyAccount")
    public PartyAccount getPartyAccount() {
        return partyAccount;
    }

    @JsonProperty("partyAccount")
    public void setPartyAccount(PartyAccount partyAccount) {
        this.partyAccount = partyAccount;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("characteristic")
    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

}
