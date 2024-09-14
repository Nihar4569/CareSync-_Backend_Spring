package com.example.Hospital.Management.Repo;

import com.example.Hospital.Management.Model.Audit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepo extends MongoRepository<Audit, Integer> {
    Audit findByAudit(String audit);
}
