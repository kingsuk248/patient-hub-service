package org.example.dao;

import org.example.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Patient> getAllPatients() {
        String sql = "SELECT * FROM Patient";
        RowMapper<Patient> rowMapper = new BeanPropertyRowMapper<>(Patient.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    public Patient getPatientById(int id) {
        String sql = "SELECT * FROM Player WHERE id = ?";
        RowMapper<Patient> rowMapper = new BeanPropertyRowMapper<>(Patient.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
}
