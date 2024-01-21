package com.hopital.pfaspringboot.hr.repositories;

import com.hopital.pfaspringboot.hr.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
