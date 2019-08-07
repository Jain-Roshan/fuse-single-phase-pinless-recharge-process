
package com.telkom.singlephase.productorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionCount",
    "successCount",
    "failureCount",
    "processingCount",
    "fileURL"
})
public class BulkInfo {

    @JsonProperty("transactionCount")
    private Integer transactionCount;
    @JsonProperty("successCount")
    private Integer successCount;
    @JsonProperty("failureCount")
    private Integer failureCount;
    @JsonProperty("processingCount")
    private Integer processingCount;
    @JsonProperty("fileURL")
    private String fileURL;

    @JsonProperty("transactionCount")
    public Integer getTransactionCount() {
        return transactionCount;
    }

    @JsonProperty("transactionCount")
    public void setTransactionCount(Integer transactionCount) {
        this.transactionCount = transactionCount;
    }

    @JsonProperty("successCount")
    public Integer getSuccessCount() {
        return successCount;
    }

    @JsonProperty("successCount")
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    @JsonProperty("failureCount")
    public Integer getFailureCount() {
        return failureCount;
    }

    @JsonProperty("failureCount")
    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    @JsonProperty("processingCount")
    public Integer getProcessingCount() {
        return processingCount;
    }

    @JsonProperty("processingCount")
    public void setProcessingCount(Integer processingCount) {
        this.processingCount = processingCount;
    }

    @JsonProperty("fileURL")
    public String getFileURL() {
        return fileURL;
    }

    @JsonProperty("fileURL")
    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

}
