package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Aggregate metrics for the current filter.
 */
@Schema(name = "AnomalyList_summary", description = "Aggregate metrics for the current filter.")
@JsonTypeName("AnomalyList_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyListSummary {

  private Integer totalAnomalies;

  private Integer open;

  private Integer acknowledged;

  private Integer investigating;

  private Integer resolved;

  private Double totalCostImpactUSD;

  private Double projectedMonthlyImpactUSD;

  private String topProvider;

  private String topService;

  public AnomalyListSummary totalAnomalies(Integer totalAnomalies) {
    this.totalAnomalies = totalAnomalies;
    return this;
  }

  /**
   * Get totalAnomalies
   * @return totalAnomalies
  */
    @Schema(name = "totalAnomalies", example = "47", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalAnomalies")
  public Integer getTotalAnomalies() {
    return totalAnomalies;
  }

  public void setTotalAnomalies(Integer totalAnomalies) {
    this.totalAnomalies = totalAnomalies;
  }

  public AnomalyListSummary open(Integer open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
  */
    @Schema(name = "open", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("open")
  public Integer getOpen() {
    return open;
  }

  public void setOpen(Integer open) {
    this.open = open;
  }

  public AnomalyListSummary acknowledged(Integer acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Get acknowledged
   * @return acknowledged
  */
    @Schema(name = "acknowledged", example = "8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acknowledged")
  public Integer getAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Integer acknowledged) {
    this.acknowledged = acknowledged;
  }

  public AnomalyListSummary investigating(Integer investigating) {
    this.investigating = investigating;
    return this;
  }

  /**
   * Get investigating
   * @return investigating
  */
    @Schema(name = "investigating", example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("investigating")
  public Integer getInvestigating() {
    return investigating;
  }

  public void setInvestigating(Integer investigating) {
    this.investigating = investigating;
  }

  public AnomalyListSummary resolved(Integer resolved) {
    this.resolved = resolved;
    return this;
  }

  /**
   * Get resolved
   * @return resolved
  */
    @Schema(name = "resolved", example = "22", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolved")
  public Integer getResolved() {
    return resolved;
  }

  public void setResolved(Integer resolved) {
    this.resolved = resolved;
  }

  public AnomalyListSummary totalCostImpactUSD(Double totalCostImpactUSD) {
    this.totalCostImpactUSD = totalCostImpactUSD;
    return this;
  }

  /**
   * Get totalCostImpactUSD
   * @return totalCostImpactUSD
  */
    @Schema(name = "totalCostImpactUSD", example = "28450.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCostImpactUSD")
  public Double getTotalCostImpactUSD() {
    return totalCostImpactUSD;
  }

  public void setTotalCostImpactUSD(Double totalCostImpactUSD) {
    this.totalCostImpactUSD = totalCostImpactUSD;
  }

  public AnomalyListSummary projectedMonthlyImpactUSD(Double projectedMonthlyImpactUSD) {
    this.projectedMonthlyImpactUSD = projectedMonthlyImpactUSD;
    return this;
  }

  /**
   * If all open anomalies persist for a month.
   * @return projectedMonthlyImpactUSD
  */
    @Schema(name = "projectedMonthlyImpactUSD", example = "124500.0", description = "If all open anomalies persist for a month.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectedMonthlyImpactUSD")
  public Double getProjectedMonthlyImpactUSD() {
    return projectedMonthlyImpactUSD;
  }

  public void setProjectedMonthlyImpactUSD(Double projectedMonthlyImpactUSD) {
    this.projectedMonthlyImpactUSD = projectedMonthlyImpactUSD;
  }

  public AnomalyListSummary topProvider(String topProvider) {
    this.topProvider = topProvider;
    return this;
  }

  /**
   * Get topProvider
   * @return topProvider
  */
    @Schema(name = "topProvider", example = "AWS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topProvider")
  public String getTopProvider() {
    return topProvider;
  }

  public void setTopProvider(String topProvider) {
    this.topProvider = topProvider;
  }

  public AnomalyListSummary topService(String topService) {
    this.topService = topService;
    return this;
  }

  /**
   * Get topService
   * @return topService
  */
    @Schema(name = "topService", example = "compute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topService")
  public String getTopService() {
    return topService;
  }

  public void setTopService(String topService) {
    this.topService = topService;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyListSummary anomalyListSummary = (AnomalyListSummary) o;
    return Objects.equals(this.totalAnomalies, anomalyListSummary.totalAnomalies) &&
        Objects.equals(this.open, anomalyListSummary.open) &&
        Objects.equals(this.acknowledged, anomalyListSummary.acknowledged) &&
        Objects.equals(this.investigating, anomalyListSummary.investigating) &&
        Objects.equals(this.resolved, anomalyListSummary.resolved) &&
        Objects.equals(this.totalCostImpactUSD, anomalyListSummary.totalCostImpactUSD) &&
        Objects.equals(this.projectedMonthlyImpactUSD, anomalyListSummary.projectedMonthlyImpactUSD) &&
        Objects.equals(this.topProvider, anomalyListSummary.topProvider) &&
        Objects.equals(this.topService, anomalyListSummary.topService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAnomalies, open, acknowledged, investigating, resolved, totalCostImpactUSD, projectedMonthlyImpactUSD, topProvider, topService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyListSummary {\n");
    sb.append("    totalAnomalies: ").append(toIndentedString(totalAnomalies)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    investigating: ").append(toIndentedString(investigating)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    totalCostImpactUSD: ").append(toIndentedString(totalCostImpactUSD)).append("\n");
    sb.append("    projectedMonthlyImpactUSD: ").append(toIndentedString(projectedMonthlyImpactUSD)).append("\n");
    sb.append("    topProvider: ").append(toIndentedString(topProvider)).append("\n");
    sb.append("    topService: ").append(toIndentedString(topService)).append("\n");
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

