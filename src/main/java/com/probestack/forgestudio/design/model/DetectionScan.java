package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.Anomaly;
import com.probestack.forgestudio.design.model.DetectionScanSummary;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DetectionScan
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class DetectionScan {

  private UUID scanId;

  /**
   * Current scan state.
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    FETCHING_BILLING_DATA("FETCHING_BILLING_DATA"),
    
    BUILDING_BASELINES("BUILDING_BASELINES"),
    
    DETECTING("DETECTING"),
    
    ANALYZING("ANALYZING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

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
   * Detection sensitivity — higher catches more but more false positives.
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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private Integer durationSeconds;

  private Integer anomaliesDetected;

  private DetectionScanSummary summary;

  @Valid
  private List<@Valid Anomaly> anomalies;

  private String errorMessage;

  public DetectionScan() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DetectionScan(UUID scanId, StatusEnum status, List<CloudProvidersEnum> cloudProviders, Integer lookbackHours, OffsetDateTime startedAt, Integer anomaliesDetected, DetectionScanSummary summary) {
    this.scanId = scanId;
    this.status = status;
    this.cloudProviders = cloudProviders;
    this.lookbackHours = lookbackHours;
    this.startedAt = startedAt;
    this.anomaliesDetected = anomaliesDetected;
    this.summary = summary;
  }

  public DetectionScan scanId(UUID scanId) {
    this.scanId = scanId;
    return this;
  }

  /**
   * Unique identifier of the scan.
   * @return scanId
  */
  @NotNull @Valid   @Schema(name = "scanId", example = "123e4567-e89b-12d3-a456-426614174000", description = "Unique identifier of the scan.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scanId")
  public UUID getScanId() {
    return scanId;
  }

  public void setScanId(UUID scanId) {
    this.scanId = scanId;
  }

  public DetectionScan status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current scan state.
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "COMPLETED", description = "Current scan state.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DetectionScan cloudProviders(List<CloudProvidersEnum> cloudProviders) {
    this.cloudProviders = cloudProviders;
    return this;
  }

  public DetectionScan addCloudProvidersItem(CloudProvidersEnum cloudProvidersItem) {
    if (this.cloudProviders == null) {
      this.cloudProviders = new ArrayList<>();
    }
    this.cloudProviders.add(cloudProvidersItem);
    return this;
  }

  /**
   * Get cloudProviders
   * @return cloudProviders
  */
  @NotNull   @Schema(name = "cloudProviders", example = "[\"AWS\",\"GCP\"]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cloudProviders")
  public List<CloudProvidersEnum> getCloudProviders() {
    return cloudProviders;
  }

  public void setCloudProviders(List<CloudProvidersEnum> cloudProviders) {
    this.cloudProviders = cloudProviders;
  }

  public DetectionScan lookbackHours(Integer lookbackHours) {
    this.lookbackHours = lookbackHours;
    return this;
  }

  /**
   * How far back the scan analyzed.
   * minimum: 1
   * maximum: 168
   * @return lookbackHours
  */
  @NotNull @Min(1) @Max(168)   @Schema(name = "lookbackHours", example = "6", description = "How far back the scan analyzed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lookbackHours")
  public Integer getLookbackHours() {
    return lookbackHours;
  }

  public void setLookbackHours(Integer lookbackHours) {
    this.lookbackHours = lookbackHours;
  }

  public DetectionScan sensitivityLevel(SensitivityLevelEnum sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
    return this;
  }

  /**
   * Detection sensitivity — higher catches more but more false positives.
   * @return sensitivityLevel
  */
    @Schema(name = "sensitivityLevel", example = "MEDIUM", description = "Detection sensitivity — higher catches more but more false positives.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensitivityLevel")
  public SensitivityLevelEnum getSensitivityLevel() {
    return sensitivityLevel;
  }

  public void setSensitivityLevel(SensitivityLevelEnum sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
  }

  public DetectionScan startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @NotNull @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public DetectionScan completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public DetectionScan durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Get durationSeconds
   * @return durationSeconds
  */
    @Schema(name = "durationSeconds", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public DetectionScan anomaliesDetected(Integer anomaliesDetected) {
    this.anomaliesDetected = anomaliesDetected;
    return this;
  }

  /**
   * Number of anomalies flagged.
   * @return anomaliesDetected
  */
  @NotNull   @Schema(name = "anomaliesDetected", example = "3", description = "Number of anomalies flagged.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("anomaliesDetected")
  public Integer getAnomaliesDetected() {
    return anomaliesDetected;
  }

  public void setAnomaliesDetected(Integer anomaliesDetected) {
    this.anomaliesDetected = anomaliesDetected;
  }

  public DetectionScan summary(DetectionScanSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @NotNull @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("summary")
  public DetectionScanSummary getSummary() {
    return summary;
  }

  public void setSummary(DetectionScanSummary summary) {
    this.summary = summary;
  }

  public DetectionScan anomalies(List<@Valid Anomaly> anomalies) {
    this.anomalies = anomalies;
    return this;
  }

  public DetectionScan addAnomaliesItem(Anomaly anomaliesItem) {
    if (this.anomalies == null) {
      this.anomalies = new ArrayList<>();
    }
    this.anomalies.add(anomaliesItem);
    return this;
  }

  /**
   * Full anomaly list (if includeAnomalies=true).
   * @return anomalies
  */
  @Valid   @Schema(name = "anomalies", description = "Full anomaly list (if includeAnomalies=true).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anomalies")
  public List<@Valid Anomaly> getAnomalies() {
    return anomalies;
  }

  public void setAnomalies(List<@Valid Anomaly> anomalies) {
    this.anomalies = anomalies;
  }

  public DetectionScan errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Populated if status = FAILED.
   * @return errorMessage
  */
    @Schema(name = "errorMessage", description = "Populated if status = FAILED.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectionScan detectionScan = (DetectionScan) o;
    return Objects.equals(this.scanId, detectionScan.scanId) &&
        Objects.equals(this.status, detectionScan.status) &&
        Objects.equals(this.cloudProviders, detectionScan.cloudProviders) &&
        Objects.equals(this.lookbackHours, detectionScan.lookbackHours) &&
        Objects.equals(this.sensitivityLevel, detectionScan.sensitivityLevel) &&
        Objects.equals(this.startedAt, detectionScan.startedAt) &&
        Objects.equals(this.completedAt, detectionScan.completedAt) &&
        Objects.equals(this.durationSeconds, detectionScan.durationSeconds) &&
        Objects.equals(this.anomaliesDetected, detectionScan.anomaliesDetected) &&
        Objects.equals(this.summary, detectionScan.summary) &&
        Objects.equals(this.anomalies, detectionScan.anomalies) &&
        Objects.equals(this.errorMessage, detectionScan.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanId, status, cloudProviders, lookbackHours, sensitivityLevel, startedAt, completedAt, durationSeconds, anomaliesDetected, summary, anomalies, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectionScan {\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProviders: ").append(toIndentedString(cloudProviders)).append("\n");
    sb.append("    lookbackHours: ").append(toIndentedString(lookbackHours)).append("\n");
    sb.append("    sensitivityLevel: ").append(toIndentedString(sensitivityLevel)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    anomaliesDetected: ").append(toIndentedString(anomaliesDetected)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    anomalies: ").append(toIndentedString(anomalies)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

