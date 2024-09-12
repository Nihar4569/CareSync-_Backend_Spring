package com.example.Hospital.Management.Repo;

import com.example.Hospital.Management.Model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepo extends MongoRepository<Doctor,Integer> {
    Doctor findByDname(String dname);
}
