package com.example.Hospital.Management.Repo;

import com.example.Hospital.Management.Model.Govt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GovtRepo extends MongoRepository<Govt, String> {
    Govt findByEmail(String email);
}
