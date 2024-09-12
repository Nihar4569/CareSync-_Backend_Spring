package com.example.Hospital.Management.Repo;

import com.example.Hospital.Management.Model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepo extends MongoRepository<Patient, Integer> {

}
