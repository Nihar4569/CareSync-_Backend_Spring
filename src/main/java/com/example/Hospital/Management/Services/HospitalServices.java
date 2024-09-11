package com.example.Hospital.Management.Services;

import com.example.Hospital.Management.Model.Hospital;
import com.example.Hospital.Management.Repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServices {
    @Autowired
    HospitalRepo hRepo;

    public Hospital addHospital(Hospital hospital) {
        return hRepo.save(hospital);
    }

    public List<Hospital> getAllHospitals() {
        return hRepo.findAll();
    }
    public Hospital getHospital(String hname) {
        return hRepo.findByHname(hname);
    }
}
