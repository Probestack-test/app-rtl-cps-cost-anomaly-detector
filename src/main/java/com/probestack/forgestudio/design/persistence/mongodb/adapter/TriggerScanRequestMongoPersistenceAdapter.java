package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.TriggerScanRequestDomainRepository;
import com.probestack.forgestudio.design.model.TriggerScanRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.TriggerScanRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.TriggerScanRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TriggerScanRequestMongoPersistenceAdapter implements TriggerScanRequestDomainRepository {
    private final TriggerScanRequestMongoRepository repository;

    public TriggerScanRequestMongoPersistenceAdapter(TriggerScanRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public TriggerScanRequest save(TriggerScanRequest triggerScanRequest) {
        TriggerScanRequestDocument document = toDocument(triggerScanRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<TriggerScanRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<TriggerScanRequest> findAll() {
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

    private TriggerScanRequestDocument toDocument(TriggerScanRequest triggerScanRequest) {
        TriggerScanRequestDocument document = new TriggerScanRequestDocument();
        BeanUtils.copyProperties(triggerScanRequest, document);
        return document;
    }

    private TriggerScanRequest toDomain(TriggerScanRequestDocument document) {
        TriggerScanRequest domain = new TriggerScanRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
