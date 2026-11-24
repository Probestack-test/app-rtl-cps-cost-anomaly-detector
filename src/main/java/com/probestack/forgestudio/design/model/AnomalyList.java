package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.Anomaly;
import com.probestack.forgestudio.design.model.AnomalyListSummary;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnomalyList
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")public class AnomalyList {

  @Valid
  private List<@Valid Anomaly> content = new ArrayList<>();

  private Integer page;

  private Integer size;

  private Integer totalElements;

  private Integer totalPages;

  private AnomalyListSummary summary;

  public AnomalyList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnomalyList(List<@Valid Anomaly> content, Integer page, Integer size, Integer totalElements, Integer totalPages) {
    this.content = content;
    this.page = page;
    this.size = size;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public AnomalyList content(List<@Valid Anomaly> content) {
    this.content = content;
    return this;
  }

  public AnomalyList addContentItem(Anomaly contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid   @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid Anomaly> getContent() {
    return content;
  }

  public void setContent(List<@Valid Anomaly> content) {
    this.content = content;
  }

  public AnomalyList page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * minimum: 0
   * @return page
  */
  @NotNull @Min(0)   @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public AnomalyList size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * minimum: 1
   * @return size
  */
  @NotNull @Min(1)   @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AnomalyList totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * minimum: 0
   * @return totalElements
  */
  @NotNull @Min(0)   @Schema(name = "totalElements", example = "47", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public AnomalyList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * minimum: 0
   * @return totalPages
  */
  @NotNull @Min(0)   @Schema(name = "totalPages", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public AnomalyList summary(AnomalyListSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public AnomalyListSummary getSummary() {
    return summary;
  }

  public void setSummary(AnomalyListSummary summary) {
    this.summary = summary;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnomalyList anomalyList = (AnomalyList) o;
    return Objects.equals(this.content, anomalyList.content) &&
        Objects.equals(this.page, anomalyList.page) &&
        Objects.equals(this.size, anomalyList.size) &&
        Objects.equals(this.totalElements, anomalyList.totalElements) &&
        Objects.equals(this.totalPages, anomalyList.totalPages) &&
        Objects.equals(this.summary, anomalyList.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, size, totalElements, totalPages, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnomalyList {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

