package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.AnomalyAttribution;
import com.probestack.forgestudio.design.model.AnomalyCostImpact;
import com.probestack.forgestudio.design.model.AnomalyProbableRootCause;
import com.probestack.forgestudio.design.model.AnomalyRelatedChangesInner;
import com.probestack.forgestudio.design.model.AnomalySpendTimelineInner;
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
 * Anomaly
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class Anomaly {

  private UUID anomalyId;

  private UUID scanId;

  private String title;

  private String description;

  /**
   * Anomaly severity based on cost impact.
   */
  public enum SeverityEnum {
    INFO("INFO"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  /**
   * Lifecycle state.
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    ACKNOWLEDGED("ACKNOWLEDGED"),
    
    INVESTIGATING("INVESTIGATING"),
    
    RESOLVED("RESOLVED"),
    
    SUPPRESSED("SUPPRESSED"),
    
    FALSE_POSITIVE("FALSE_POSITIVE");

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
   * Cloud provider.
   */
  public enum CloudProviderEnum {
    AWS("AWS"),
    
    GCP("GCP"),
    
    AZURE("AZURE");

    private String value;

    CloudProviderEnum(String value) {
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
    public static CloudProviderEnum fromValue(String value) {
      for (CloudProviderEnum b : CloudProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CloudProviderEnum cloudProvider;

  private String service;

  private String serviceDetail;

  private String region;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime detectedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime anomalyWindowStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime anomalyWindowEnd;

  private AnomalyCostImpact costImpact;

  private Double percentDeviation;

  private Double confidence;

  private AnomalyAttribution attribution;

  private AnomalyProbableRootCause probableRootCause;

  @Valid
  private List<@Valid AnomalyRelatedChangesInner> relatedChanges;

  @Valid
  private List<@Valid AnomalySpendTimelineInner> spendTimeline;

  @Valid
  private List<String> recommendedActions;

  private String assignedTo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime acknowledgedAt;

  private String acknowledgedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime resolvedAt;

  private String resolvedBy;

  /**
   * Gets or Sets resolutionType
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

  private String aiSummary;

  private String auditReference;

  public Anomaly() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Anomaly(UUID anomalyId, UUID scanId, String title, SeverityEnum severity, StatusEnum status, CloudProviderEnum cloudProvider, String service, OffsetDateTime detectedAt, AnomalyCostImpact costImpact, Double percentDeviation, Double confidence) {
    this.anomalyId = anomalyId;
    this.scanId = scanId;
    this.title = title;
    this.severity = severity;
    this.status = status;
    this.cloudProvider = cloudProvider;
    this.service = service;
    this.detectedAt = detectedAt;
    this.costImpact = costImpact;
    this.percentDeviation = percentDeviation;
    this.confidence = confidence;
  }

  public Anomaly anomalyId(UUID anomalyId) {
    this.anomalyId = anomalyId;
    return this;
  }

  /**
   * Unique identifier of the anomaly.
   * @return anomalyId
  */
  @NotNull @Valid   @Schema(name = "anomalyId", example = "456e7890-e89b-12d3-a456-426614174001", description = "Unique identifier of the anomaly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("anomalyId")
  public UUID getAnomalyId() {
    return anomalyId;
  }

  public void setAnomalyId(UUID anomalyId) {
    this.anomalyId = anomalyId;
  }

  public Anomaly scanId(UUID scanId) {
    this.scanId = scanId;
    return this;
  }

  /**
   * Scan that detected this anomaly.
   * @return scanId
  */
  @NotNull @Valid   @Schema(name = "scanId", example = "123e4567-e89b-12d3-a456-426614174000", description = "Scan that detected this anomaly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scanId")
  public UUID getScanId() {
    return scanId;
  }

  public void setScanId(UUID scanId) {
    this.scanId = scanId;
  }

  public Anomaly title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Human-readable summary of the anomaly.
   * @return title
  */
  @NotNull   @Schema(name = "title", example = "AWS Lambda spend spiked 340% — likely runaway recursion", description = "Human-readable summary of the anomaly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Anomaly description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description.
   * @return description
  */
    @Schema(name = "description", example = "Lambda invocation count jumped from 120K to 12M/hour, costing $84/hour vs expected $8/hour.", description = "Detailed description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Anomaly severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Anomaly severity based on cost impact.
   * @return severity
  */
  @NotNull   @Schema(name = "severity", example = "CRITICAL", description = "Anomaly severity based on cost impact.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Anomaly status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Lifecycle state.
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "OPEN", description = "Lifecycle state.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Anomaly cloudProvider(CloudProviderEnum cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  /**
   * Cloud provider.
   * @return cloudProvider
  */
  @NotNull   @Schema(name = "cloudProvider", example = "AWS", description = "Cloud provider.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cloudProvider")
  public CloudProviderEnum getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(CloudProviderEnum cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public Anomaly service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Cloud service category.
   * @return service
  */
  @NotNull   @Schema(name = "service", example = "compute", description = "Cloud service category.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public Anomaly serviceDetail(String serviceDetail) {
    this.serviceDetail = serviceDetail;
    return this;
  }

  /**
   * Specific service (e.g., 'Lambda', 'EC2', 'RDS').
   * @return serviceDetail
  */
    @Schema(name = "serviceDetail", example = "Lambda", description = "Specific service (e.g., 'Lambda', 'EC2', 'RDS').", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceDetail")
  public String getServiceDetail() {
    return serviceDetail;
  }

  public void setServiceDetail(String serviceDetail) {
    this.serviceDetail = serviceDetail;
  }

  public Anomaly region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Cloud region.
   * @return region
  */
    @Schema(name = "region", example = "us-east-1", description = "Cloud region.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Anomaly detectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
    return this;
  }

  /**
   * When the anomaly was first detected.
   * @return detectedAt
  */
  @NotNull @Valid   @Schema(name = "detectedAt", example = "2026-11-24T08:15Z", description = "When the anomaly was first detected.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detectedAt")
  public OffsetDateTime getDetectedAt() {
    return detectedAt;
  }

  public void setDetectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
  }

  public Anomaly anomalyWindowStart(OffsetDateTime anomalyWindowStart) {
    this.anomalyWindowStart = anomalyWindowStart;
    return this;
  }

  /**
   * Get anomalyWindowStart
   * @return anomalyWindowStart
  */
  @Valid   @Schema(name = "anomalyWindowStart", example = "2026-11-24T07:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anomalyWindowStart")
  public OffsetDateTime getAnomalyWindowStart() {
    return anomalyWindowStart;
  }

  public void setAnomalyWindowStart(OffsetDateTime anomalyWindowStart) {
    this.anomalyWindowStart = anomalyWindowStart;
  }

  public Anomaly anomalyWindowEnd(OffsetDateTime anomalyWindowEnd) {
    this.anomalyWindowEnd = anomalyWindowEnd;
    return this;
  }

  /**
   * Get anomalyWindowEnd
   * @return anomalyWindowEnd
  */
  @Valid   @Schema(name = "anomalyWindowEnd", example = "2026-11-24T08:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anomalyWindowEnd")
  public OffsetDateTime getAnomalyWindowEnd() {
    return anomalyWindowEnd;
  }

  public void setAnomalyWindowEnd(OffsetDateTime anomalyWindowEnd) {
    this.anomalyWindowEnd = anomalyWindowEnd;
  }

  public Anomaly costImpact(AnomalyCostImpact costImpact) {
    this.costImpact = costImpact;
    return this;
  }

  /**
   * Get costImpact
   * @return costImpact
  */
  @NotNull @Valid   @Schema(name = "costImpact", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("costImpact")
  public AnomalyCostImpact getCostImpact() {
    return costImpact;
  }

  public void setCostImpact(AnomalyCostImpact costImpact) {
    this.costImpact = costImpact;
  }

  public Anomaly percentDeviation(Double percentDeviation) {
    this.percentDeviation = percentDeviation;
    return this;
  }

  /**
   * Percent above baseline.
   * @return percentDeviation
  */
  @NotNull   @Schema(name = "percentDeviation", example = "340.0", description = "Percent above baseline.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percentDeviation")
  public Double getPercentDeviation() {
    return percentDeviation;
  }

  public void setPercentDeviation(Double percentDeviation) {
    this.percentDeviation = percentDeviation;
  }

  public Anomaly confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * ML model confidence that this is a real anomaly (not normal fluctuation).
   * minimum: 0
   * maximum: 1
   * @return confidence
  */
  @NotNull @DecimalMin("0") @DecimalMax("1")   @Schema(name = "confidence", example = "0.96", description = "ML model confidence that this is a real anomaly (not normal fluctuation).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public Anomaly attribution(AnomalyAttribution attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * Get attribution
   * @return attribution
  */
  @Valid   @Schema(name = "attribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution")
  public AnomalyAttribution getAttribution() {
    return attribution;
  }

  public void setAttribution(AnomalyAttribution attribution) {
    this.attribution = attribution;
  }

  public Anomaly probableRootCause(AnomalyProbableRootCause probableRootCause) {
    this.probableRootCause = probableRootCause;
    return this;
  }

  /**
   * Get probableRootCause
   * @return probableRootCause
  */
  @Valid   @Schema(name = "probableRootCause", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("probableRootCause")
  public AnomalyProbableRootCause getProbableRootCause() {
    return probableRootCause;
  }

  public void setProbableRootCause(AnomalyProbableRootCause probableRootCause) {
    this.probableRootCause = probableRootCause;
  }

  public Anomaly relatedChanges(List<@Valid AnomalyRelatedChangesInner> relatedChanges) {
    this.relatedChanges = relatedChanges;
    return this;
  }

  public Anomaly addRelatedChangesItem(AnomalyRelatedChangesInner relatedChangesItem) {
    if (this.relatedChanges == null) {
      this.relatedChanges = new ArrayList<>();
    }
    this.relatedChanges.add(relatedChangesItem);
    return this;
  }

  /**
   * Deployments, config changes, or incidents in the anomaly window.
   * @return relatedChanges
  */
  @Valid   @Schema(name = "relatedChanges", description = "Deployments, config changes, or incidents in the anomaly window.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedChanges")
  public List<@Valid AnomalyRelatedChangesInner> getRelatedChanges() {
    return relatedChanges;
  }

  public void setRelatedChanges(List<@Valid AnomalyRelatedChangesInner> relatedChanges) {
    this.relatedChanges = relatedChanges;
  }

  public Anomaly spendTimeline(List<@Valid AnomalySpendTimelineInner> spendTimeline) {
    this.spendTimeline = spendTimeline;
    return this;
  }

  public Anomaly addSpendTimelineItem(AnomalySpendTimelineInner spendTimelineItem) {
    if (this.spendTimeline == null) {
      this.spendTimeline = new ArrayList<>();
    }
    this.spendTimeline.add(spendTimelineItem);
    return this;
  }

  /**
   * Hourly spend data (if includeTimeline=true).
   * @return spendTimeline
  */
  @Valid   @Schema(name = "spendTimeline", description = "Hourly spend data (if includeTimeline=true).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spendTimeline")
  public List<@Valid AnomalySpendTimelineInner> getSpendTimeline() {
    return spendTimeline;
  }

  public void setSpendTimeline(List<@Valid AnomalySpendTimelineInner> spendTimeline) {
    this.spendTimeline = spendTimeline;
  }

  public Anomaly recommendedActions(List<String> recommendedActions) {
    this.recommendedActions = recommendedActions;
    return this;
  }

  public Anomaly addRecommendedActionsItem(String recommendedActionsItem) {
    if (this.recommendedActions == null) {
      this.recommendedActions = new ArrayList<>();
    }
    this.recommendedActions.add(recommendedActionsItem);
    return this;
  }

  /**
   * Concrete remediation suggestions from the anomaly model.
   * @return recommendedActions
  */
    @Schema(name = "recommendedActions", example = "[\"Throttle Lambda concurrent executions to 100 (currently unlimited).\",\"Fix S3 bucket lifecycle policy to prevent recursive writes.\",\"Add CloudWatch alarm for invocation count > 1M/hour.\"]", description = "Concrete remediation suggestions from the anomaly model.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendedActions")
  public List<String> getRecommendedActions() {
    return recommendedActions;
  }

  public void setRecommendedActions(List<String> recommendedActions) {
    this.recommendedActions = recommendedActions;
  }

  public Anomaly assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * Get assignedTo
   * @return assignedTo
  */
    @Schema(name = "assignedTo", example = "payments-engineer@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignedTo")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public Anomaly acknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
    return this;
  }

  /**
   * Get acknowledgedAt
   * @return acknowledgedAt
  */
  @Valid   @Schema(name = "acknowledgedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgedAt")
  public OffsetDateTime getAcknowledgedAt() {
    return acknowledgedAt;
  }

  public void setAcknowledgedAt(OffsetDateTime acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }

  public Anomaly acknowledgedBy(String acknowledgedBy) {
    this.acknowledgedBy = acknowledgedBy;
    return this;
  }

  /**
   * Get acknowledgedBy
   * @return acknowledgedBy
  */
    @Schema(name = "acknowledgedBy", example = "oncall@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledgedBy")
  public String getAcknowledgedBy() {
    return acknowledgedBy;
  }

  public void setAcknowledgedBy(String acknowledgedBy) {
    this.acknowledgedBy = acknowledgedBy;
  }

  public Anomaly resolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
    return this;
  }

  /**
   * Get resolvedAt
   * @return resolvedAt
  */
  @Valid   @Schema(name = "resolvedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedAt")
  public OffsetDateTime getResolvedAt() {
    return resolvedAt;
  }

  public void setResolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
  }

  public Anomaly resolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
    return this;
  }

  /**
   * Get resolvedBy
   * @return resolvedBy
  */
    @Schema(name = "resolvedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedBy")
  public String getResolvedBy() {
    return resolvedBy;
  }

  public void setResolvedBy(String resolvedBy) {
    this.resolvedBy = resolvedBy;
  }

  public Anomaly resolutionType(ResolutionTypeEnum resolutionType) {
    this.resolutionType = resolutionType;
    return this;
  }

  /**
   * Get resolutionType
   * @return resolutionType
  */
    @Schema(name = "resolutionType", example = "THROTTLING_ADDED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolutionType")
  public ResolutionTypeEnum getResolutionType() {
    return resolutionType;
  }

  public void setResolutionType(ResolutionTypeEnum resolutionType) {
    this.resolutionType = resolutionType;
  }

  public Anomaly actualCostImpactUSD(Double actualCostImpactUSD) {
    this.actualCostImpactUSD = actualCostImpactUSD;
    return this;
  }

  /**
   * Realized cost impact after resolution.
   * @return actualCostImpactUSD
  */
    @Schema(name = "actualCostImpactUSD", example = "12450.0", description = "Realized cost impact after resolution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualCostImpactUSD")
  public Double getActualCostImpactUSD() {
    return actualCostImpactUSD;
  }

  public void setActualCostImpactUSD(Double actualCostImpactUSD) {
    this.actualCostImpactUSD = actualCostImpactUSD;
  }

  public Anomaly aiSummary(String aiSummary) {
    this.aiSummary = aiSummary;
    return this;
  }

  /**
   * AI-generated plain-English summary.
   * @return aiSummary
  */
    @Schema(name = "aiSummary", example = "CRITICAL: AWS Lambda spend spiked 340% ($168/hr vs $38/hr baseline). Root cause: recursive S3 trigger; 12M invocations/hour vs 120K normal. Projected monthly cost if unfixed: $62,000. Deploy at 07:05 UTC is likely trigger. Recommend: throttle concurrency + fix S3 lifecycle.", description = "AI-generated plain-English summary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiSummary")
  public String getAiSummary() {
    return aiSummary;
  }

  public void setAiSummary(String aiSummary) {
    this.aiSummary = aiSummary;
  }

  public Anomaly auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://cost-anomaly/anomaly-456e7890", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Anomaly anomaly = (Anomaly) o;
    return Objects.equals(this.anomalyId, anomaly.anomalyId) &&
        Objects.equals(this.scanId, anomaly.scanId) &&
        Objects.equals(this.title, anomaly.title) &&
        Objects.equals(this.description, anomaly.description) &&
        Objects.equals(this.severity, anomaly.severity) &&
        Objects.equals(this.status, anomaly.status) &&
        Objects.equals(this.cloudProvider, anomaly.cloudProvider) &&
        Objects.equals(this.service, anomaly.service) &&
        Objects.equals(this.serviceDetail, anomaly.serviceDetail) &&
        Objects.equals(this.region, anomaly.region) &&
        Objects.equals(this.detectedAt, anomaly.detectedAt) &&
        Objects.equals(this.anomalyWindowStart, anomaly.anomalyWindowStart) &&
        Objects.equals(this.anomalyWindowEnd, anomaly.anomalyWindowEnd) &&
        Objects.equals(this.costImpact, anomaly.costImpact) &&
        Objects.equals(this.percentDeviation, anomaly.percentDeviation) &&
        Objects.equals(this.confidence, anomaly.confidence) &&
        Objects.equals(this.attribution, anomaly.attribution) &&
        Objects.equals(this.probableRootCause, anomaly.probableRootCause) &&
        Objects.equals(this.relatedChanges, anomaly.relatedChanges) &&
        Objects.equals(this.spendTimeline, anomaly.spendTimeline) &&
        Objects.equals(this.recommendedActions, anomaly.recommendedActions) &&
        Objects.equals(this.assignedTo, anomaly.assignedTo) &&
        Objects.equals(this.acknowledgedAt, anomaly.acknowledgedAt) &&
        Objects.equals(this.acknowledgedBy, anomaly.acknowledgedBy) &&
        Objects.equals(this.resolvedAt, anomaly.resolvedAt) &&
        Objects.equals(this.resolvedBy, anomaly.resolvedBy) &&
        Objects.equals(this.resolutionType, anomaly.resolutionType) &&
        Objects.equals(this.actualCostImpactUSD, anomaly.actualCostImpactUSD) &&
        Objects.equals(this.aiSummary, anomaly.aiSummary) &&
        Objects.equals(this.auditReference, anomaly.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anomalyId, scanId, title, description, severity, status, cloudProvider, service, serviceDetail, region, detectedAt, anomalyWindowStart, anomalyWindowEnd, costImpact, percentDeviation, confidence, attribution, probableRootCause, relatedChanges, spendTimeline, recommendedActions, assignedTo, acknowledgedAt, acknowledgedBy, resolvedAt, resolvedBy, resolutionType, actualCostImpactUSD, aiSummary, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Anomaly {\n");
    sb.append("    anomalyId: ").append(toIndentedString(anomalyId)).append("\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceDetail: ").append(toIndentedString(serviceDetail)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    detectedAt: ").append(toIndentedString(detectedAt)).append("\n");
    sb.append("    anomalyWindowStart: ").append(toIndentedString(anomalyWindowStart)).append("\n");
    sb.append("    anomalyWindowEnd: ").append(toIndentedString(anomalyWindowEnd)).append("\n");
    sb.append("    costImpact: ").append(toIndentedString(costImpact)).append("\n");
    sb.append("    percentDeviation: ").append(toIndentedString(percentDeviation)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
    sb.append("    probableRootCause: ").append(toIndentedString(probableRootCause)).append("\n");
    sb.append("    relatedChanges: ").append(toIndentedString(relatedChanges)).append("\n");
    sb.append("    spendTimeline: ").append(toIndentedString(spendTimeline)).append("\n");
    sb.append("    recommendedActions: ").append(toIndentedString(recommendedActions)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    acknowledgedAt: ").append(toIndentedString(acknowledgedAt)).append("\n");
    sb.append("    acknowledgedBy: ").append(toIndentedString(acknowledgedBy)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
    sb.append("    actualCostImpactUSD: ").append(toIndentedString(actualCostImpactUSD)).append("\n");
    sb.append("    aiSummary: ").append(toIndentedString(aiSummary)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
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

