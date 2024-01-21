package com.hopital.pfaspringboot.hr.services;

import com.hopital.pfaspringboot.hr.models.Patient;
import com.hopital.pfaspringboot.hr.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository ;



    public List<Patient> getAll(){
        return patientRepository.findAll() ;
    }


    public void save (Patient patient){
        patientRepository.save(patient) ;
    }



    public void delete (Long id){
        patientRepository.deleteById(id);
    }

    public Patient getById(Long id) {
        return patientRepository.findById(id).orElse(null) ;

    }
}
