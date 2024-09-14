package com.example.Hospital.Management.Services;

import com.example.Hospital.Management.Model.*;
import com.example.Hospital.Management.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Objects;

@Service
public class HospitalServices {
    @Autowired
    HospitalRepo hRepo;
    @Autowired
    MedicineRepo mRepo;
    @Autowired
    DoctorRepo dRepo;
    @Autowired
    PatientRepo pRepo;
    @Autowired
    GovtRepo gRepo;

    public Hospital addHospital(Hospital hospital) {
        return hRepo.save(hospital);
    }

    public List<Hospital> getAllHospitals() {
        return hRepo.findAll();
    }
    public Hospital getHospital(String hname) {
        return hRepo.findByHname(hname);
    }

    public Hospital findByEmail(String email) {
        return hRepo.findByHemail(email);
    }
    public Boolean verified(Hospital hospital) {
        hospital.setHverified(!hospital.getHverified());
        hRepo.save(hospital);
        return hospital.getHverified();
    }


    //Medicines
    public Medicines addMedicine(Medicines medicines) {
        return mRepo.save(medicines);
    }

    public List<Medicines> getAllMedicines() {
       return mRepo.findAll();
    }

    //Doctor
    public List<Doctor> getAllDoctor() {
        return dRepo.findAll();
    }
    public Doctor addDoctor(Doctor doctor) {
        return dRepo.save(doctor);
    }
    public Doctor getDoctor(String dname) {
        return dRepo.findByDname(dname);
    }

    //Update
    public int updatBed(String hname,String str) {
        if(Objects.equals(str, "inc")){
            Hospital hospital = hRepo.findByHname(hname);
            hospital.setBbed(hospital.getBbed()+1);
            hRepo.save(hospital);
            return hospital.getBbed();
        }
        else{
            Hospital hospital = hRepo.findByHname(hname);
            hospital.setBbed(hospital.getBbed()-1);
            hRepo.save(hospital);
            return hospital.getBbed();
        }

    }
    public int updatEbed(String hname,String str) {
        if(Objects.equals(str, "inc")){
            Hospital hospital = hRepo.findByHname(hname);
            hospital.setBebed(hospital.getBebed()+1);
            hRepo.save(hospital);
            return hospital.getBebed();
        }
        else{
            Hospital hospital = hRepo.findByHname(hname);
            hospital.setBebed(hospital.getBebed()-1);
            hRepo.save(hospital);
            return hospital.getBebed();
        }

    }


    public int updateMedicine(String hname,String str) {
        System.out.println(str);

        if(Objects.equals(str, "inc")){
            Hospital hospital = hRepo.findByHname(hname);
            hospital.setBbed(hospital.getBbed()+1);
            hRepo.save(hospital);
            return hospital.getBbed();
        }
        else{
            Hospital hospital = hRepo.findByHname(hname);
            hospital.setBbed(hospital.getBbed()-1);
            hRepo.save(hospital);
            return hospital.getBbed();
        }

    }

    //Pateint
    public List<Patient> getAllPatient() {
        return pRepo.findAll();
    }
    public Patient addPatient(Patient pati){
        return pRepo.save(pati);
    }

    public Doctor getDoctorbyEmail(String email) {
        return dRepo.findByEmail(email);
    }

    public Govt addGovt(Govt govt) {
        return gRepo.save(govt);
    }
    public Govt getGovt(String email) {
        return gRepo.findByEmail(email);
    }
}
