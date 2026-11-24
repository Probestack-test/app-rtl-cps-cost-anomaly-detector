package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DetectionScanSummary
 */
@JsonTypeName("DetectionScan_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class DetectionScanSummary {

  private Double totalSpendInWindowUSD;

  private Double expectedSpendUSD;

  private Double actualDeviationUSD;

  private Double actualDeviationPercent;

  public DetectionScanSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DetectionScanSummary(Double totalSpendInWindowUSD, Double expectedSpendUSD, Double actualDeviationUSD, Double actualDeviationPercent) {
    this.totalSpendInWindowUSD = totalSpendInWindowUSD;
    this.expectedSpendUSD = expectedSpendUSD;
    this.actualDeviationUSD = actualDeviationUSD;
    this.actualDeviationPercent = actualDeviationPercent;
  }

  public DetectionScanSummary totalSpendInWindowUSD(Double totalSpendInWindowUSD) {
    this.totalSpendInWindowUSD = totalSpendInWindowUSD;
    return this;
  }

  /**
   * Total cloud spend in the scan window.
   * @return totalSpendInWindowUSD
  */
  @NotNull   @Schema(name = "totalSpendInWindowUSD", example = "18420.5", description = "Total cloud spend in the scan window.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalSpendInWindowUSD")
  public Double getTotalSpendInWindowUSD() {
    return totalSpendInWindowUSD;
  }

  public void setTotalSpendInWindowUSD(Double totalSpendInWindowUSD) {
    this.totalSpendInWindowUSD = totalSpendInWindowUSD;
  }

  public DetectionScanSummary expectedSpendUSD(Double expectedSpendUSD) {
    this.expectedSpendUSD = expectedSpendUSD;
    return this;
  }

  /**
   * ML-predicted baseline spend.
   * @return expectedSpendUSD
  */
  @NotNull   @Schema(name = "expectedSpendUSD", example = "12450.0", description = "ML-predicted baseline spend.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expectedSpendUSD")
  public Double getExpectedSpendUSD() {
    return expectedSpendUSD;
  }

  public void setExpectedSpendUSD(Double expectedSpendUSD) {
    this.expectedSpendUSD = expectedSpendUSD;
  }

  public DetectionScanSummary actualDeviationUSD(Double actualDeviationUSD) {
    this.actualDeviationUSD = actualDeviationUSD;
    return this;
  }

  /**
   * Difference from baseline.
   * @return actualDeviationUSD
  */
  @NotNull   @Schema(name = "actualDeviationUSD", example = "5970.5", description = "Difference from baseline.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actualDeviationUSD")
  public Double getActualDeviationUSD() {
    return actualDeviationUSD;
  }

  public void setActualDeviationUSD(Double actualDeviationUSD) {
    this.actualDeviationUSD = actualDeviationUSD;
  }

  public DetectionScanSummary actualDeviationPercent(Double actualDeviationPercent) {
    this.actualDeviationPercent = actualDeviationPercent;
    return this;
  }

  /**
   * Deviation as a percentage.
   * @return actualDeviationPercent
  */
  @NotNull   @Schema(name = "actualDeviationPercent", example = "48.0", description = "Deviation as a percentage.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actualDeviationPercent")
  public Double getActualDeviationPercent() {
    return actualDeviationPercent;
  }

  public void setActualDeviationPercent(Double actualDeviationPercent) {
    this.actualDeviationPercent = actualDeviationPercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectionScanSummary detectionScanSummary = (DetectionScanSummary) o;
    return Objects.equals(this.totalSpendInWindowUSD, detectionScanSummary.totalSpendInWindowUSD) &&
        Objects.equals(this.expectedSpendUSD, detectionScanSummary.expectedSpendUSD) &&
        Objects.equals(this.actualDeviationUSD, detectionScanSummary.actualDeviationUSD) &&
        Objects.equals(this.actualDeviationPercent, detectionScanSummary.actualDeviationPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSpendInWindowUSD, expectedSpendUSD, actualDeviationUSD, actualDeviationPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectionScanSummary {\n");
    sb.append("    totalSpendInWindowUSD: ").append(toIndentedString(totalSpendInWindowUSD)).append("\n");
    sb.append("    expectedSpendUSD: ").append(toIndentedString(expectedSpendUSD)).append("\n");
    sb.append("    actualDeviationUSD: ").append(toIndentedString(actualDeviationUSD)).append("\n");
    sb.append("    actualDeviationPercent: ").append(toIndentedString(actualDeviationPercent)).append("\n");
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

