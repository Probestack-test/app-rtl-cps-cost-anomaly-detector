package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnomalyRelatedChangesInner
 */
@JsonTypeName("Anomaly_relatedChanges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyRelatedChangesInner {

  /**
   * Gets or Sets changeType
   */
  public enum ChangeTypeEnum {
    DEPLOYMENT("DEPLOYMENT"),
    
    CONFIG_CHANGE("CONFIG_CHANGE"),
    
    INCIDENT("INCIDENT"),
    
    INFRASTRUCTURE_CHANGE("INFRASTRUCTURE_CHANGE"),
    
    FEATURE_FLAG_TOGGLE("FEATURE_FLAG_TOGGLE");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ChangeTypeEnum changeType;

  private String changeId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occurredAt;

  private Double correlationConfidence;

  private String summary;

  public AnomalyRelatedChangesInner changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
  */
    @Schema(name = "changeType", example = "DEPLOYMENT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeType")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public AnomalyRelatedChangesInner changeId(String changeId) {
    this.changeId = changeId;
    return this;
  }

  /**
   * Get changeId
   * @return changeId
  */
    @Schema(name = "changeId", example = "deploy-abc123", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeId")
  public String getChangeId() {
    return changeId;
  }

  public void setChangeId(String changeId) {
    this.changeId = changeId;
  }

  public AnomalyRelatedChangesInner occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Get occurredAt
   * @return occurredAt
  */
  @Valid   @Schema(name = "occurredAt", example = "2026-11-24T07:05Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurredAt")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  public AnomalyRelatedChangesInner correlationConfidence(Double correlationConfidence) {
    this.correlationConfidence = correlationConfidence;
    return this;
  }

  /**
   * How likely this change caused the anomaly.
   * @return correlationConfidence
  */
    @Schema(name = "correlationConfidence", example = "0.92", description = "How likely this change caused the anomaly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationConfidence")
  public Double getCorrelationConfidence() {
    return correlationConfidence;
  }

  public void setCorrelationConfidence(Double correlationConfidence) {
    this.correlationConfidence = correlationConfidence;
  }

  public AnomalyRelatedChangesInner summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
    @Schema(name = "summary", example = "payments-team deployed v2.5.0 to Lambda authorizer function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyRelatedChangesInner anomalyRelatedChangesInner = (AnomalyRelatedChangesInner) o;
    return Objects.equals(this.changeType, anomalyRelatedChangesInner.changeType) &&
        Objects.equals(this.changeId, anomalyRelatedChangesInner.changeId) &&
        Objects.equals(this.occurredAt, anomalyRelatedChangesInner.occurredAt) &&
        Objects.equals(this.correlationConfidence, anomalyRelatedChangesInner.correlationConfidence) &&
        Objects.equals(this.summary, anomalyRelatedChangesInner.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeType, changeId, occurredAt, correlationConfidence, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyRelatedChangesInner {\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    changeId: ").append(toIndentedString(changeId)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    correlationConfidence: ").append(toIndentedString(correlationConfidence)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

