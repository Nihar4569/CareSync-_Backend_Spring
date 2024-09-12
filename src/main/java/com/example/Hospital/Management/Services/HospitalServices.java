package com.example.Hospital.Management.Services;

import com.example.Hospital.Management.Model.Doctor;
import com.example.Hospital.Management.Model.Hospital;
import com.example.Hospital.Management.Model.Medicines;
import com.example.Hospital.Management.Model.Patient;
import com.example.Hospital.Management.Repo.DoctorRepo;
import com.example.Hospital.Management.Repo.HospitalRepo;
import com.example.Hospital.Management.Repo.MedicineRepo;
import com.example.Hospital.Management.Repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

}
