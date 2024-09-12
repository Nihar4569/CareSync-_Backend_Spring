package com.example.Hospital.Management.Controller;

import com.example.Hospital.Management.Model.Doctor;
import com.example.Hospital.Management.Model.Hospital;
import com.example.Hospital.Management.Model.Medicines;
import com.example.Hospital.Management.Model.Patient;
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

    @GetMapping("/find/{hosp}")
    public ResponseEntity<Hospital> findHospital(@PathVariable String hosp) {
        Hospital hospital = hService.getHospital(hosp);
        if (hospital == null) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(hospital,HttpStatus.OK);
    }
    @GetMapping("/find/email/{email}")
    public ResponseEntity<Hospital> findByEmail(@PathVariable String email) {
        Hospital hospital = hService.findByEmail(email);
        if (hospital == null) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(hospital,HttpStatus.OK);
    }

    @PostMapping("/addm")
    public ResponseEntity<Medicines> addMedicine(@RequestBody Medicines medicines) {
        Medicines medicine = hService.addMedicine(medicines);
        if (medicine == null) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(medicine,HttpStatus.OK);
    }
    //Update
    @GetMapping("/updatebed/{hname}/{str}")
    public ResponseEntity<Integer> bookBed(@PathVariable String hname, @PathVariable String str) {
        return new ResponseEntity<>(hService.updatBed(hname,str),HttpStatus.OK);
    }
    @GetMapping("/updateebed/{hname}/{str}")
    public ResponseEntity<Integer> bookEbed(@PathVariable String hname, @PathVariable String str) {
        return new ResponseEntity<>(hService.updatEbed(hname,str),HttpStatus.OK);
    }

    @GetMapping("/medi")
    public ResponseEntity<List<Medicines>> getAllMedicines() {
       return ResponseEntity.ok(hService.getAllMedicines());
    }
    //Doctor
    @PostMapping("/doctor")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        Doctor doctor1 = hService.addDoctor(doctor);
        if (doctor1 == null) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(doctor1,HttpStatus.OK);
    }
    @GetMapping("/doctor")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        return ResponseEntity.ok(hService.getAllDoctor());
    }

    //Pateint
    @GetMapping("/pati")
    public ResponseEntity<List<Patient>> getAllPatients() {
        return ResponseEntity.ok(hService.getAllPatient());
    }

    @PostMapping("/pati")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        Patient patient1 = hService.addPatient(patient);
        if (patient1 == null) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(patient1,HttpStatus.OK);
    }
}
