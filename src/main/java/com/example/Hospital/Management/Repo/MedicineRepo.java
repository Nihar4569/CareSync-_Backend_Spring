package com.example.Hospital.Management.Repo;

import com.example.Hospital.Management.Model.Medicines;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepo extends MongoRepository<Medicines,String> {
}
