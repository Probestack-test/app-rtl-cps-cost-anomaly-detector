package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Required when action &#x3D; SUPPRESS. Mutes future similar anomalies.
 */
@Schema(name = "AnomalyActionRequest_suppressionRule", description = "Required when action = SUPPRESS. Mutes future similar anomalies.")
@JsonTypeName("AnomalyActionRequest_suppressionRule")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyActionRequestSuppressionRule {

  private Boolean matchService = true;

  @Valid
  private List<String> matchResourceIds;

  @Valid
  private Map<String, String> matchTag = new HashMap<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  public AnomalyActionRequestSuppressionRule matchService(Boolean matchService) {
    this.matchService = matchService;
    return this;
  }

  /**
   * Get matchService
   * @return matchService
  */
    @Schema(name = "matchService", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchService")
  public Boolean getMatchService() {
    return matchService;
  }

  public void setMatchService(Boolean matchService) {
    this.matchService = matchService;
  }

  public AnomalyActionRequestSuppressionRule matchResourceIds(List<String> matchResourceIds) {
    this.matchResourceIds = matchResourceIds;
    return this;
  }

  public AnomalyActionRequestSuppressionRule addMatchResourceIdsItem(String matchResourceIdsItem) {
    if (this.matchResourceIds == null) {
      this.matchResourceIds = new ArrayList<>();
    }
    this.matchResourceIds.add(matchResourceIdsItem);
    return this;
  }

  /**
   * Get matchResourceIds
   * @return matchResourceIds
  */
    @Schema(name = "matchResourceIds", example = "[\"arn:aws:lambda:us-east-1:123:function:test-*\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchResourceIds")
  public List<String> getMatchResourceIds() {
    return matchResourceIds;
  }

  public void setMatchResourceIds(List<String> matchResourceIds) {
    this.matchResourceIds = matchResourceIds;
  }

  public AnomalyActionRequestSuppressionRule matchTag(Map<String, String> matchTag) {
    this.matchTag = matchTag;
    return this;
  }

  public AnomalyActionRequestSuppressionRule putMatchTagItem(String key, String matchTagItem) {
    if (this.matchTag == null) {
      this.matchTag = new HashMap<>();
    }
    this.matchTag.put(key, matchTagItem);
    return this;
  }

  /**
   * Get matchTag
   * @return matchTag
  */
    @Schema(name = "matchTag", example = "{\"purpose\":\"load-testing\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchTag")
  public Map<String, String> getMatchTag() {
    return matchTag;
  }

  public void setMatchTag(Map<String, String> matchTag) {
    this.matchTag = matchTag;
  }

  public AnomalyActionRequestSuppressionRule expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Suppression expires automatically.
   * @return expiresAt
  */
  @Valid   @Schema(name = "expiresAt", example = "2026-12-31T23:59:59Z", description = "Suppression expires automatically.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiresAt")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyActionRequestSuppressionRule anomalyActionRequestSuppressionRule = (AnomalyActionRequestSuppressionRule) o;
    return Objects.equals(this.matchService, anomalyActionRequestSuppressionRule.matchService) &&
        Objects.equals(this.matchResourceIds, anomalyActionRequestSuppressionRule.matchResourceIds) &&
        Objects.equals(this.matchTag, anomalyActionRequestSuppressionRule.matchTag) &&
        Objects.equals(this.expiresAt, anomalyActionRequestSuppressionRule.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchService, matchResourceIds, matchTag, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyActionRequestSuppressionRule {\n");
    sb.append("    matchService: ").append(toIndentedString(matchService)).append("\n");
    sb.append("    matchResourceIds: ").append(toIndentedString(matchResourceIds)).append("\n");
    sb.append("    matchTag: ").append(toIndentedString(matchTag)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

