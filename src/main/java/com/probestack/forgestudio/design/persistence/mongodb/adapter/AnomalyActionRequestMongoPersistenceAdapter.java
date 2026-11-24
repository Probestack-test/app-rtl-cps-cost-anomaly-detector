package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.AnomalyActionRequestDomainRepository;
import com.probestack.forgestudio.design.model.AnomalyActionRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.AnomalyActionRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.AnomalyActionRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AnomalyActionRequestMongoPersistenceAdapter implements AnomalyActionRequestDomainRepository {
    private final AnomalyActionRequestMongoRepository repository;

    public AnomalyActionRequestMongoPersistenceAdapter(
            AnomalyActionRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnomalyActionRequest save(AnomalyActionRequest anomalyActionRequest) {
        AnomalyActionRequestDocument document = toDocument(anomalyActionRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<AnomalyActionRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<AnomalyActionRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private AnomalyActionRequestDocument toDocument(AnomalyActionRequest anomalyActionRequest) {
        AnomalyActionRequestDocument document = new AnomalyActionRequestDocument();
        BeanUtils.copyProperties(anomalyActionRequest, document);
        return document;
    }

    private AnomalyActionRequest toDomain(AnomalyActionRequestDocument document) {
        AnomalyActionRequest domain = new AnomalyActionRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
