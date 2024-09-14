package com.example.Hospital.Management.Controller;

import com.example.Hospital.Management.Model.Audit;
import com.example.Hospital.Management.Services.AuditServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {
    @Autowired
    AuditServices Aservice;
    @PostMapping("/add")
    private ResponseEntity<Audit> addAudit(@RequestBody Audit audit) {
        return ResponseEntity.ok(Aservice.addAudit(audit));
    }

    @GetMapping("/all")
    private ResponseEntity<List<Audit>> getAllAudit() {
        return ResponseEntity.ok(Aservice.getAllAudits());
    }
}
