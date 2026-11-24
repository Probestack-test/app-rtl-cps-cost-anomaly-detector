package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.AnomalyActionRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for AnomalyActionRequest documents.
 */
public interface AnomalyActionRequestMongoRepository extends MongoRepository<AnomalyActionRequestDocument, String> {
}
