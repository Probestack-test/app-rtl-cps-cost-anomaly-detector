package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.AnomalyActionRequestSuppressionRule;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnomalyActionRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyActionRequest {

  /**
   * Action to perform.
   */
  public enum ActionEnum {
    ACKNOWLEDGE("ACKNOWLEDGE"),
    
    INVESTIGATE("INVESTIGATE"),
    
    RESOLVE("RESOLVE"),
    
    SUPPRESS("SUPPRESS"),
    
    FALSE_POSITIVE("FALSE_POSITIVE"),
    
    REOPEN("REOPEN");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ActionEnum action;

  private String reason;

  private String performedBy;

  private String assignedTo;

  /**
   * Required when action = RESOLVE.
   */
  public enum ResolutionTypeEnum {
    CONFIGURATION_FIX("CONFIGURATION_FIX"),
    
    CODE_FIX("CODE_FIX"),
    
    RESOURCE_TERMINATION("RESOURCE_TERMINATION"),
    
    SCALING_CHANGE("SCALING_CHANGE"),
    
    THROTTLING_ADDED("THROTTLING_ADDED"),
    
    NO_ACTION_NEEDED("NO_ACTION_NEEDED"),
    
    FALSE_POSITIVE("FALSE_POSITIVE");

    private String value;

    ResolutionTypeEnum(String value) {
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
    public static ResolutionTypeEnum fromValue(String value) {
      for (ResolutionTypeEnum b : ResolutionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ResolutionTypeEnum resolutionType;

  private Double actualCostImpactUSD;

  private String preventRecurrence;

  private AnomalyActionRequestSuppressionRule suppressionRule;

  public AnomalyActionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnomalyActionRequest(ActionEnum action, String reason, String performedBy) {
    this.action = action;
    this.reason = reason;
    this.performedBy = performedBy;
  }

  public AnomalyActionRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Action to perform.
   * @return action
  */
  @NotNull   @Schema(name = "action", example = "RESOLVE", description = "Action to perform.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AnomalyActionRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Justification (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "Stopped runaway Lambda recursion; deployed fix via feature flag.", description = "Justification (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AnomalyActionRequest performedBy(String performedBy) {
    this.performedBy = performedBy;
    return this;
  }

  /**
   * Who is performing the action.
   * @return performedBy
  */
  @NotNull @jakarta.validation.constraints.Email   @Schema(name = "performedBy", example = "payments-engineer@forgesphere.example.com", description = "Who is performing the action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("performedBy")
  public String getPerformedBy() {
    return performedBy;
  }

  public void setPerformedBy(String performedBy) {
    this.performedBy = performedBy;
  }

  public AnomalyActionRequest assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Required when action = INVESTIGATE.
   * @return assignedTo
  */
  @jakarta.validation.constraints.Email   @Schema(name = "assignedTo", example = "payments-engineer@forgesphere.example.com", description = "Required when action = INVESTIGATE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedTo")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public AnomalyActionRequest resolutionType(ResolutionTypeEnum resolutionType) {
    this.resolutionType = resolutionType;
    return this;
  }

  /**
   * Required when action = RESOLVE.
   * @return resolutionType
  */
    @Schema(name = "resolutionType", example = "THROTTLING_ADDED", description = "Required when action = RESOLVE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolutionType")
  public ResolutionTypeEnum getResolutionType() {
    return resolutionType;
  }

  public void setResolutionType(ResolutionTypeEnum resolutionType) {
    this.resolutionType = resolutionType;
  }

  public AnomalyActionRequest actualCostImpactUSD(Double actualCostImpactUSD) {
    this.actualCostImpactUSD = actualCostImpactUSD;
    return this;
  }

  /**
   * Realized cost impact (required when action = RESOLVE).
   * @return actualCostImpactUSD
  */
    @Schema(name = "actualCostImpactUSD", example = "12450.0", description = "Realized cost impact (required when action = RESOLVE).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualCostImpactUSD")
  public Double getActualCostImpactUSD() {
    return actualCostImpactUSD;
  }

  public void setActualCostImpactUSD(Double actualCostImpactUSD) {
    this.actualCostImpactUSD = actualCostImpactUSD;
  }

  public AnomalyActionRequest preventRecurrence(String preventRecurrence) {
    this.preventRecurrence = preventRecurrence;
    return this;
  }

  /**
   * What was done to prevent recurrence (required when action = RESOLVE).
   * @return preventRecurrence
  */
    @Schema(name = "preventRecurrence", example = "Added rate limit on Lambda invocation; S3 lifecycle policy updated.", description = "What was done to prevent recurrence (required when action = RESOLVE).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preventRecurrence")
  public String getPreventRecurrence() {
    return preventRecurrence;
  }

  public void setPreventRecurrence(String preventRecurrence) {
    this.preventRecurrence = preventRecurrence;
  }

  public AnomalyActionRequest suppressionRule(AnomalyActionRequestSuppressionRule suppressionRule) {
    this.suppressionRule = suppressionRule;
    return this;
  }

  /**
   * Get suppressionRule
   * @return suppressionRule
  */
  @Valid   @Schema(name = "suppressionRule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suppressionRule")
  public AnomalyActionRequestSuppressionRule getSuppressionRule() {
    return suppressionRule;
  }

  public void setSuppressionRule(AnomalyActionRequestSuppressionRule suppressionRule) {
    this.suppressionRule = suppressionRule;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyActionRequest anomalyActionRequest = (AnomalyActionRequest) o;
    return Objects.equals(this.action, anomalyActionRequest.action) &&
        Objects.equals(this.reason, anomalyActionRequest.reason) &&
        Objects.equals(this.performedBy, anomalyActionRequest.performedBy) &&
        Objects.equals(this.assignedTo, anomalyActionRequest.assignedTo) &&
        Objects.equals(this.resolutionType, anomalyActionRequest.resolutionType) &&
        Objects.equals(this.actualCostImpactUSD, anomalyActionRequest.actualCostImpactUSD) &&
        Objects.equals(this.preventRecurrence, anomalyActionRequest.preventRecurrence) &&
        Objects.equals(this.suppressionRule, anomalyActionRequest.suppressionRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, reason, performedBy, assignedTo, resolutionType, actualCostImpactUSD, preventRecurrence, suppressionRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyActionRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    performedBy: ").append(toIndentedString(performedBy)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
    sb.append("    actualCostImpactUSD: ").append(toIndentedString(actualCostImpactUSD)).append("\n");
    sb.append("    preventRecurrence: ").append(toIndentedString(preventRecurrence)).append("\n");
    sb.append("    suppressionRule: ").append(toIndentedString(suppressionRule)).append("\n");
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

