package com.example.Hospital.Management.Repo;

import com.example.Hospital.Management.Model.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends MongoRepository<Hospital, Integer> {

    Hospital findByHname(String hname);
}
