package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Anomaly;
import com.probestack.forgestudio.design.model.AnomalyActionRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ActionsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-24T15:23:15.166708230Z[GMT]")
@Controller
@RequestMapping("${openapi.costAnomalyDetector.base-path:/v1}")
public class ActionsApiController implements ActionsApi {

    private static final Logger log = LoggerFactory.getLogger(ActionsApiController.class);

    private final ActionsService actionsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ActionsApiController(ActionsService actionsService, GeneratedRequestValidator generatedRequestValidator) {
        this.actionsService = actionsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Anomaly> takeAnomalyAction(@PathVariable() UUID anomalyId, @RequestBody() AnomalyActionRequest anomalyActionRequest) {
        log.info("Processing takeAnomalyAction request");
        try {
            generatedRequestValidator.validate("takeAnomalyAction", anomalyActionRequest);
            var response = actionsService.takeAnomalyAction(anomalyId, anomalyActionRequest);
            log.info("takeAnomalyAction completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process takeAnomalyAction: {}", e.getMessage(), e);
            throw e;
        }
    }
}
