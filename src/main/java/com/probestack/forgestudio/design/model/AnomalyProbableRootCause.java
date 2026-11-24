package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnomalyProbableRootCause
 */
@JsonTypeName("Anomaly_probableRootCause")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyProbableRootCause {

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    MISCONFIGURATION("MISCONFIGURATION"),
    
    CODE_DEPLOY("CODE_DEPLOY"),
    
    TRAFFIC_SPIKE("TRAFFIC_SPIKE"),
    
    RESOURCE_LEAK("RESOURCE_LEAK"),
    
    STORAGE_LEAK("STORAGE_LEAK"),
    
    CROSS_REGION_TRANSFER("CROSS_REGION_TRANSFER"),
    
    RECURSION("RECURSION"),
    
    EXPIRED_RESERVATION("EXPIRED_RESERVATION"),
    
    SPOT_INTERRUPTION("SPOT_INTERRUPTION"),
    
    ATTACK("ATTACK"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CategoryEnum category;

  private String description;

  private Double confidence;

  @Valid
  private List<String> evidence;

  public AnomalyProbableRootCause category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
    @Schema(name = "category", example = "RECURSION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public AnomalyProbableRootCause description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "Lambda function likely stuck in recursive S3 trigger loop; invocation count 100x normal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AnomalyProbableRootCause confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  */
    @Schema(name = "confidence", example = "0.89", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public AnomalyProbableRootCause evidence(List<String> evidence) {
    this.evidence = evidence;
    return this;
  }

  public AnomalyProbableRootCause addEvidenceItem(String evidenceItem) {
    if (this.evidence == null) {
      this.evidence = new ArrayList<>();
    }
    this.evidence.add(evidenceItem);
    return this;
  }

  /**
   * Get evidence
   * @return evidence
  */
    @Schema(name = "evidence", example = "[\"Invocation count: 120K/hr → 12M/hr\",\"Duration: 45ms avg unchanged\",\"Trigger source: S3 event on same bucket function writes to\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evidence")
  public List<String> getEvidence() {
    return evidence;
  }

  public void setEvidence(List<String> evidence) {
    this.evidence = evidence;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyProbableRootCause anomalyProbableRootCause = (AnomalyProbableRootCause) o;
    return Objects.equals(this.category, anomalyProbableRootCause.category) &&
        Objects.equals(this.description, anomalyProbableRootCause.description) &&
        Objects.equals(this.confidence, anomalyProbableRootCause.confidence) &&
        Objects.equals(this.evidence, anomalyProbableRootCause.evidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, confidence, evidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyProbableRootCause {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
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

