package org.example.controller;

import org.example.model.Patient;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/")
    public String welcome() {
        return "Patient API !";
    }

    @GetMapping(value = "/patient")
    public List<Patient> getAllPatients() {
        try {
            List<Patient> patients = patientService.getAllPatients();
        } catch (Exception ex) {
            throw new CustomHttpException(ex.getMessage());
        }
        return null;
    }

    @GetMapping(value = "/patient/{id}")
    public Patient getPatient(@PathVariable("id") int id) {
        return patientService.getPatientById(id);
    }

    @PostMapping(value = "/patient")
    public Patient addPatient(@RequestBody Patient patient) {
        patient.setId(0L);
        return patientService.addPatient(patient);
    }

    @PutMapping(value = "/patient/{id}")
    public Patient updatePatient(@PathVariable long id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }

    @DeleteMapping(value = "/patients/{id}")
    public Patient deletePatient(@PathVariable("id") int id) {
        return patientService.deletePatient(id);
    }

}
