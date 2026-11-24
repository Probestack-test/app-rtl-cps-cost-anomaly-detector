package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TriggerScanRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class TriggerScanRequest {

  /**
   * Gets or Sets cloudProviders
   */
  public enum CloudProvidersEnum {
    AWS("AWS"),
    
    GCP("GCP"),
    
    AZURE("AZURE");

    private String value;

    CloudProvidersEnum(String value) {
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
    public static CloudProvidersEnum fromValue(String value) {
      for (CloudProvidersEnum b : CloudProvidersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<CloudProvidersEnum> cloudProviders = new ArrayList<>();

  private Integer lookbackHours;

  /**
   * Detection sensitivity.
   */
  public enum SensitivityLevelEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    SensitivityLevelEnum(String value) {
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
    public static SensitivityLevelEnum fromValue(String value) {
      for (SensitivityLevelEnum b : SensitivityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SensitivityLevelEnum sensitivityLevel;

  /**
   * Gets or Sets includeServices
   */
  public enum IncludeServicesEnum {
    COMPUTE("compute"),
    
    DATABASE("database"),
    
    STORAGE("storage"),
    
    NETWORK("network"),
    
    AI_ML("ai_ml"),
    
    ANALYTICS("analytics"),
    
    MESSAGING("messaging"),
    
    OTHER("other");

    private String value;

    IncludeServicesEnum(String value) {
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
    public static IncludeServicesEnum fromValue(String value) {
      for (IncludeServicesEnum b : IncludeServicesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<IncludeServicesEnum> includeServices;

  private Boolean excludeExpectedEvents = true;

  private Integer correlationWindowMinutes = 30;

  private Double minCostImpactUSD = 10.0d;

  public TriggerScanRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TriggerScanRequest(List<CloudProvidersEnum> cloudProviders, Integer lookbackHours, SensitivityLevelEnum sensitivityLevel) {
    this.cloudProviders = cloudProviders;
    this.lookbackHours = lookbackHours;
    this.sensitivityLevel = sensitivityLevel;
  }

  public TriggerScanRequest cloudProviders(List<CloudProvidersEnum> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public TriggerScanRequest addCloudProvidersItem(CloudProvidersEnum cloudProvidersItem) {
    if (this.cloudProviders == null) {
      this.cloudProviders = new ArrayList<>();
    }
    this.cloudProviders.add(cloudProvidersItem);
    return this;
  }

  /**
   * Clouds to scan.
   * @return cloudProviders
  */
  @NotNull @Size(min = 1)   @Schema(name = "cloudProviders", example = "[\"AWS\",\"GCP\"]", description = "Clouds to scan.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cloudProviders")
  public List<CloudProvidersEnum> getCloudProviders() {
    return cloudProviders;
  }

  public void setCloudProviders(List<CloudProvidersEnum> cloudProviders) {
    this.cloudProviders = cloudProviders;
  }

  public TriggerScanRequest lookbackHours(Integer lookbackHours) {
    this.lookbackHours = lookbackHours;
    return this;
  }

  /**
   * How far back to analyze (1-168 hours).
   * minimum: 1
   * maximum: 168
   * @return lookbackHours
  */
  @NotNull @Min(1) @Max(168)   @Schema(name = "lookbackHours", example = "6", description = "How far back to analyze (1-168 hours).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lookbackHours")
  public Integer getLookbackHours() {
    return lookbackHours;
  }

  public void setLookbackHours(Integer lookbackHours) {
    this.lookbackHours = lookbackHours;
  }

  public TriggerScanRequest sensitivityLevel(SensitivityLevelEnum sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
    return this;
  }

  /**
   * Detection sensitivity.
   * @return sensitivityLevel
  */
  @NotNull   @Schema(name = "sensitivityLevel", example = "MEDIUM", description = "Detection sensitivity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sensitivityLevel")
  public SensitivityLevelEnum getSensitivityLevel() {
    return sensitivityLevel;
  }

  public void setSensitivityLevel(SensitivityLevelEnum sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
  }

  public TriggerScanRequest includeServices(List<IncludeServicesEnum> includeServices) {
    this.includeServices = includeServices;
    return this;
  }

  public TriggerScanRequest addIncludeServicesItem(IncludeServicesEnum includeServicesItem) {
    if (this.includeServices == null) {
      this.includeServices = new ArrayList<>();
    }
    this.includeServices.add(includeServicesItem);
    return this;
  }

  /**
   * Service categories to include (empty = all).
   * @return includeServices
  */
    @Schema(name = "includeServices", example = "[\"compute\",\"database\",\"storage\",\"network\"]", description = "Service categories to include (empty = all).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeServices")
  public List<IncludeServicesEnum> getIncludeServices() {
    return includeServices;
  }

  public void setIncludeServices(List<IncludeServicesEnum> includeServices) {
    this.includeServices = includeServices;
  }

  public TriggerScanRequest excludeExpectedEvents(Boolean excludeExpectedEvents) {
    this.excludeExpectedEvents = excludeExpectedEvents;
    return this;
  }

  /**
   * Whether to suppress anomalies matching known events (Black Friday, launches).
   * @return excludeExpectedEvents
  */
    @Schema(name = "excludeExpectedEvents", example = "true", description = "Whether to suppress anomalies matching known events (Black Friday, launches).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludeExpectedEvents")
  public Boolean getExcludeExpectedEvents() {
    return excludeExpectedEvents;
  }

  public void setExcludeExpectedEvents(Boolean excludeExpectedEvents) {
    this.excludeExpectedEvents = excludeExpectedEvents;
  }

  public TriggerScanRequest correlationWindowMinutes(Integer correlationWindowMinutes) {
    this.correlationWindowMinutes = correlationWindowMinutes;
    return this;
  }

  /**
   * How far to look for correlated changes (deploys, incidents).
   * minimum: 0
   * maximum: 120
   * @return correlationWindowMinutes
  */
  @Min(0) @Max(120)   @Schema(name = "correlationWindowMinutes", example = "30", description = "How far to look for correlated changes (deploys, incidents).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationWindowMinutes")
  public Integer getCorrelationWindowMinutes() {
    return correlationWindowMinutes;
  }

  public void setCorrelationWindowMinutes(Integer correlationWindowMinutes) {
    this.correlationWindowMinutes = correlationWindowMinutes;
  }

  public TriggerScanRequest minCostImpactUSD(Double minCostImpactUSD) {
    this.minCostImpactUSD = minCostImpactUSD;
    return this;
  }

  /**
   * Ignore anomalies below this USD impact.
   * minimum: 0
   * @return minCostImpactUSD
  */
  @DecimalMin("0")   @Schema(name = "minCostImpactUSD", example = "10.0", description = "Ignore anomalies below this USD impact.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minCostImpactUSD")
  public Double getMinCostImpactUSD() {
    return minCostImpactUSD;
  }

  public void setMinCostImpactUSD(Double minCostImpactUSD) {
    this.minCostImpactUSD = minCostImpactUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerScanRequest triggerScanRequest = (TriggerScanRequest) o;
    return Objects.equals(this.cloudProviders, triggerScanRequest.cloudProviders) &&
        Objects.equals(this.lookbackHours, triggerScanRequest.lookbackHours) &&
        Objects.equals(this.sensitivityLevel, triggerScanRequest.sensitivityLevel) &&
        Objects.equals(this.includeServices, triggerScanRequest.includeServices) &&
        Objects.equals(this.excludeExpectedEvents, triggerScanRequest.excludeExpectedEvents) &&
        Objects.equals(this.correlationWindowMinutes, triggerScanRequest.correlationWindowMinutes) &&
        Objects.equals(this.minCostImpactUSD, triggerScanRequest.minCostImpactUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProviders, lookbackHours, sensitivityLevel, includeServices, excludeExpectedEvents, correlationWindowMinutes, minCostImpactUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerScanRequest {\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    lookbackHours: ").append(toIndentedString(lookbackHours)).append("\n");
    sb.append("    sensitivityLevel: ").append(toIndentedString(sensitivityLevel)).append("\n");
    sb.append("    includeServices: ").append(toIndentedString(includeServices)).append("\n");
    sb.append("    excludeExpectedEvents: ").append(toIndentedString(excludeExpectedEvents)).append("\n");
    sb.append("    correlationWindowMinutes: ").append(toIndentedString(correlationWindowMinutes)).append("\n");
    sb.append("    minCostImpactUSD: ").append(toIndentedString(minCostImpactUSD)).append("\n");
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

