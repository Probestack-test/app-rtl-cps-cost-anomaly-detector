package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.AnomalyActionRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for AnomalyActionRequest domain operations.
 */
public interface AnomalyActionRequestDomainRepository {
    AnomalyActionRequest save(AnomalyActionRequest anomalyActionRequest);

    Optional<AnomalyActionRequest> findById(String id);

    List<AnomalyActionRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
