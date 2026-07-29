package com.example.patient;

import com.example.patient.patient;
import org.springframework.data.jpa.repository.JpaRepository;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient, Long>{

}

    

