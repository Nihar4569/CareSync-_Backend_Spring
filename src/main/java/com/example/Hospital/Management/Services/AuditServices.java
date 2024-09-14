package com.example.Hospital.Management.Services;

import com.example.Hospital.Management.Model.Audit;
import com.example.Hospital.Management.Repo.AuditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class AuditServices {
    @Autowired
    AuditRepo aRepo;

    public Audit addAudit(Audit audit){
        audit.setDate(LocalDate.now());   // Set the current date using LocalDate
        audit.setTime(LocalTime.now());   // Set the current time using LocalTime
        return aRepo.save(audit);
    }

    public List<Audit> getAllAudits(){
        return aRepo.findAll();
    }
}
