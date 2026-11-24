package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnomalySpendTimelineInner
 */
@JsonTypeName("Anomaly_spendTimeline_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalySpendTimelineInner {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime hour;

  private Double actualCostUSD;

  private Double expectedCostUSD;

  public AnomalySpendTimelineInner hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
  */
  @Valid   @Schema(name = "hour", example = "2026-11-24T07:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hour")
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public AnomalySpendTimelineInner actualCostUSD(Double actualCostUSD) {
    this.actualCostUSD = actualCostUSD;
    return this;
  }

  /**
   * Get actualCostUSD
   * @return actualCostUSD
  */
    @Schema(name = "actualCostUSD", example = "168.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualCostUSD")
  public Double getActualCostUSD() {
    return actualCostUSD;
  }

  public void setActualCostUSD(Double actualCostUSD) {
    this.actualCostUSD = actualCostUSD;
  }

  public AnomalySpendTimelineInner expectedCostUSD(Double expectedCostUSD) {
    this.expectedCostUSD = expectedCostUSD;
    return this;
  }

  /**
   * Get expectedCostUSD
   * @return expectedCostUSD
  */
    @Schema(name = "expectedCostUSD", example = "38.2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedCostUSD")
  public Double getExpectedCostUSD() {
    return expectedCostUSD;
  }

  public void setExpectedCostUSD(Double expectedCostUSD) {
    this.expectedCostUSD = expectedCostUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalySpendTimelineInner anomalySpendTimelineInner = (AnomalySpendTimelineInner) o;
    return Objects.equals(this.hour, anomalySpendTimelineInner.hour) &&
        Objects.equals(this.actualCostUSD, anomalySpendTimelineInner.actualCostUSD) &&
        Objects.equals(this.expectedCostUSD, anomalySpendTimelineInner.expectedCostUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, actualCostUSD, expectedCostUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalySpendTimelineInner {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    actualCostUSD: ").append(toIndentedString(actualCostUSD)).append("\n");
    sb.append("    expectedCostUSD: ").append(toIndentedString(expectedCostUSD)).append("\n");
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

