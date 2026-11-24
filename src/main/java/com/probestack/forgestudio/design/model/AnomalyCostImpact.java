package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnomalyCostImpact
 */
@JsonTypeName("Anomaly_costImpact")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyCostImpact {

  private Double actualCostUSD;

  private Double expectedCostUSD;

  private Double deviationUSD;

  private Double deviationPercent;

  private Double projectedMonthlyCostUSD;

  public AnomalyCostImpact() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnomalyCostImpact(Double actualCostUSD, Double expectedCostUSD, Double deviationUSD, Double deviationPercent, Double projectedMonthlyCostUSD) {
    this.actualCostUSD = actualCostUSD;
    this.expectedCostUSD = expectedCostUSD;
    this.deviationUSD = deviationUSD;
    this.deviationPercent = deviationPercent;
    this.projectedMonthlyCostUSD = projectedMonthlyCostUSD;
  }

  public AnomalyCostImpact actualCostUSD(Double actualCostUSD) {
    this.actualCostUSD = actualCostUSD;
    return this;
  }

  /**
   * Actual spend during the anomaly window.
   * @return actualCostUSD
  */
  @NotNull   @Schema(name = "actualCostUSD", example = "168.0", description = "Actual spend during the anomaly window.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actualCostUSD")
  public Double getActualCostUSD() {
    return actualCostUSD;
  }

  public void setActualCostUSD(Double actualCostUSD) {
    this.actualCostUSD = actualCostUSD;
  }

  public AnomalyCostImpact expectedCostUSD(Double expectedCostUSD) {
    this.expectedCostUSD = expectedCostUSD;
    return this;
  }

  /**
   * ML-predicted baseline.
   * @return expectedCostUSD
  */
  @NotNull   @Schema(name = "expectedCostUSD", example = "38.2", description = "ML-predicted baseline.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expectedCostUSD")
  public Double getExpectedCostUSD() {
    return expectedCostUSD;
  }

  public void setExpectedCostUSD(Double expectedCostUSD) {
    this.expectedCostUSD = expectedCostUSD;
  }

  public AnomalyCostImpact deviationUSD(Double deviationUSD) {
    this.deviationUSD = deviationUSD;
    return this;
  }

  /**
   * Get deviationUSD
   * @return deviationUSD
  */
  @NotNull   @Schema(name = "deviationUSD", example = "129.8", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviationUSD")
  public Double getDeviationUSD() {
    return deviationUSD;
  }

  public void setDeviationUSD(Double deviationUSD) {
    this.deviationUSD = deviationUSD;
  }

  public AnomalyCostImpact deviationPercent(Double deviationPercent) {
    this.deviationPercent = deviationPercent;
    return this;
  }

  /**
   * Get deviationPercent
   * @return deviationPercent
  */
  @NotNull   @Schema(name = "deviationPercent", example = "340.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deviationPercent")
  public Double getDeviationPercent() {
    return deviationPercent;
  }

  public void setDeviationPercent(Double deviationPercent) {
    this.deviationPercent = deviationPercent;
  }

  public AnomalyCostImpact projectedMonthlyCostUSD(Double projectedMonthlyCostUSD) {
    this.projectedMonthlyCostUSD = projectedMonthlyCostUSD;
    return this;
  }

  /**
   * Extrapolated monthly cost if anomaly continues.
   * @return projectedMonthlyCostUSD
  */
  @NotNull   @Schema(name = "projectedMonthlyCostUSD", example = "62000.0", description = "Extrapolated monthly cost if anomaly continues.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectedMonthlyCostUSD")
  public Double getProjectedMonthlyCostUSD() {
    return projectedMonthlyCostUSD;
  }

  public void setProjectedMonthlyCostUSD(Double projectedMonthlyCostUSD) {
    this.projectedMonthlyCostUSD = projectedMonthlyCostUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyCostImpact anomalyCostImpact = (AnomalyCostImpact) o;
    return Objects.equals(this.actualCostUSD, anomalyCostImpact.actualCostUSD) &&
        Objects.equals(this.expectedCostUSD, anomalyCostImpact.expectedCostUSD) &&
        Objects.equals(this.deviationUSD, anomalyCostImpact.deviationUSD) &&
        Objects.equals(this.deviationPercent, anomalyCostImpact.deviationPercent) &&
        Objects.equals(this.projectedMonthlyCostUSD, anomalyCostImpact.projectedMonthlyCostUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualCostUSD, expectedCostUSD, deviationUSD, deviationPercent, projectedMonthlyCostUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyCostImpact {\n");
    sb.append("    actualCostUSD: ").append(toIndentedString(actualCostUSD)).append("\n");
    sb.append("    expectedCostUSD: ").append(toIndentedString(expectedCostUSD)).append("\n");
    sb.append("    deviationUSD: ").append(toIndentedString(deviationUSD)).append("\n");
    sb.append("    deviationPercent: ").append(toIndentedString(deviationPercent)).append("\n");
    sb.append("    projectedMonthlyCostUSD: ").append(toIndentedString(projectedMonthlyCostUSD)).append("\n");
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

