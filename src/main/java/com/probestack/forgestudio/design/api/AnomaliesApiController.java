package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Anomaly;
import com.probestack.forgestudio.design.model.AnomalyList;
import com.probestack.forgestudio.design.model.DetectionScan;
import java.time.OffsetDateTime;
import com.probestack.forgestudio.design.model.TriggerScanRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.AnomaliesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")
@Controller
@RequestMapping("${openapi.costAnomalyDetector.base-path:/v1}")
public class AnomaliesApiController implements AnomaliesApi {

    private static final Logger log = LoggerFactory.getLogger(AnomaliesApiController.class);

    private final AnomaliesService anomaliesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public AnomaliesApiController(AnomaliesService anomaliesService, GeneratedRequestValidator generatedRequestValidator) {
        this.anomaliesService = anomaliesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Anomaly> getAnomaly(@PathVariable() UUID anomalyId, @RequestParam(value = "includeTimeline", required = false, defaultValue = "true") Boolean includeTimeline, @RequestParam(value = "includeRelatedChanges", required = false, defaultValue = "true") Boolean includeRelatedChanges) {
        log.info("Processing getAnomaly request");
        try {
            var response = anomaliesService.getAnomaly(anomalyId, includeTimeline, includeRelatedChanges);
            log.info("getAnomaly completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getAnomaly: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<DetectionScan> getScan(@PathVariable() UUID scanId, @RequestParam(value = "includeAnomalies", required = false, defaultValue = "true") Boolean includeAnomalies) {
        log.info("Processing getScan request");
        try {
            var response = anomaliesService.getScan(scanId, includeAnomalies);
            log.info("getScan completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getScan: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<AnomalyList> listAnomalies(@RequestParam(value = "severity", required = false) String severity, @RequestParam(value = "cloudProvider", required = false) String cloudProvider, @RequestParam(value = "service", required = false) String service, @RequestParam(value = "team", required = false) String team, @RequestParam(value = "status", required = false) String status, @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @RequestParam(value = "toDate", required = false) OffsetDateTime toDate, @RequestParam(value = "minCostImpactUSD", required = false) Double minCostImpactUSD, @RequestParam(value = "sortBy", required = false, defaultValue = "COST_IMPACT") String sortBy, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listAnomalies request");
        try {
            var response = anomaliesService.listAnomalies(severity, cloudProvider, service, team, status, fromDate, toDate, minCostImpactUSD, sortBy, page, size);
            log.info("listAnomalies completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listAnomalies: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<DetectionScan> triggerScan(@RequestBody() TriggerScanRequest triggerScanRequest) {
        log.info("Processing triggerScan request");
        try {
            generatedRequestValidator.validate("triggerScan", triggerScanRequest);
            var response = anomaliesService.triggerScan(triggerScanRequest);
            log.info("triggerScan completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process triggerScan: {}", e.getMessage(), e);
            throw e;
        }
    }
}
