package com.example.Hospital.Management.Controller;

import com.example.Hospital.Management.Model.Hospital;
import com.example.Hospital.Management.Services.HospitalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("hosp")
public class HospitalController {
    @Autowired
    HospitalServices hService;

    @PostMapping("/add")
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hService.addHospital(hospital);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hospital>> getAllHospitals() {
        return new ResponseEntity<>(hService.getAllHospitals(), HttpStatus.OK);
    }

    @PostMapping("/find")
    public ResponseEntity<Hospital> findHospital(@PathVariable String hosp) {
        Hospital hospital = hService.getHospital(hosp);
        if (hospital == null) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(hospital,HttpStatus.OK);
    }
}
