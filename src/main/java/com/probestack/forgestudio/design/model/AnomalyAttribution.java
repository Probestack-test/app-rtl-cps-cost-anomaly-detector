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
 * Who/what caused this anomaly.
 */
@Schema(name = "Anomaly_attribution", description = "Who/what caused this anomaly.")
@JsonTypeName("Anomaly_attribution")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyAttribution {

  private String team;

  private String costCenter;

  private String application;

  /**
   * Gets or Sets environment
   */
  public enum EnvironmentEnum {
    DEV("DEV"),
    
    STAGING("STAGING"),
    
    PRODUCTION("PRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
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
    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnvironmentEnum environment;

  @Valid
  private List<String> resourceIds;

  private String trafficChange;

  public AnomalyAttribution team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
    @Schema(name = "team", example = "payments-team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public AnomalyAttribution costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  /**
   * Get costCenter
   * @return costCenter
  */
    @Schema(name = "costCenter", example = "CC-PAYMENTS-001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costCenter")
  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public AnomalyAttribution application(String application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
    @Schema(name = "application", example = "payment-processor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public AnomalyAttribution environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
    @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public AnomalyAttribution resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public AnomalyAttribution addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

  /**
   * Specific resources involved.
   * @return resourceIds
  */
    @Schema(name = "resourceIds", example = "[\"arn:aws:lambda:us-east-1:123:function:payment-processor-authorize\"]", description = "Specific resources involved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceIds")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public AnomalyAttribution trafficChange(String trafficChange) {
    this.trafficChange = trafficChange;
    return this;
  }

  /**
   * If driven by traffic, what happened.
   * @return trafficChange
  */
    @Schema(name = "trafficChange", example = "10,000% increase in invocation count", description = "If driven by traffic, what happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficChange")
  public String getTrafficChange() {
    return trafficChange;
  }

  public void setTrafficChange(String trafficChange) {
    this.trafficChange = trafficChange;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyAttribution anomalyAttribution = (AnomalyAttribution) o;
    return Objects.equals(this.team, anomalyAttribution.team) &&
        Objects.equals(this.costCenter, anomalyAttribution.costCenter) &&
        Objects.equals(this.application, anomalyAttribution.application) &&
        Objects.equals(this.environment, anomalyAttribution.environment) &&
        Objects.equals(this.resourceIds, anomalyAttribution.resourceIds) &&
        Objects.equals(this.trafficChange, anomalyAttribution.trafficChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, costCenter, application, environment, resourceIds, trafficChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyAttribution {\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    trafficChange: ").append(toIndentedString(trafficChange)).append("\n");
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

