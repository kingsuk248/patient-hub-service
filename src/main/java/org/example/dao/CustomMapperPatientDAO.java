package org.example.dao;

import org.example.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CustomMapperPatientDAO {

    private static final class PatientMapper implements RowMapper<Patient> {
        @Override
        public Patient mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Patient patient = new Patient();
            patient.setId(resultSet.getLong("id"));
            patient.setFirstName(resultSet.getString("first_name"));
            patient.setLastName(resultSet.getString("last_name"));
            return patient;
        }
    }
}
