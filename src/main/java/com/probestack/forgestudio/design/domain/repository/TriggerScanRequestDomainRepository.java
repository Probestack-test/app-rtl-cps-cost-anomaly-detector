package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.TriggerScanRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for TriggerScanRequest domain operations.
 */
public interface TriggerScanRequestDomainRepository {
    TriggerScanRequest save(TriggerScanRequest triggerScanRequest);

    Optional<TriggerScanRequest> findById(String id);

    List<TriggerScanRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
