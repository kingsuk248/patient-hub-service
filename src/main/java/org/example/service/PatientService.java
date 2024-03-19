package org.example.service;

import org.example.model.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    public List<Patient> getAllPatients() {
        return null;
    }

    public Patient getPatientById(@PathVariable("id") int id) {
        return null;
    }

    public Patient addPatient(@RequestBody Patient patient) {
        return null;
    }

    public Patient updatePatient(long id, @RequestBody Patient patient) {
        return null;
    }

    public Patient deletePatient(@PathVariable("id") int id) {
        return null;
    }
}
