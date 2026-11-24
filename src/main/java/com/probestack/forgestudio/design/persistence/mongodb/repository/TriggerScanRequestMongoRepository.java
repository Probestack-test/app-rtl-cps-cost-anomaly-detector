package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.TriggerScanRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for TriggerScanRequest documents.
 */
public interface TriggerScanRequestMongoRepository extends MongoRepository<TriggerScanRequestDocument, String> {
}
