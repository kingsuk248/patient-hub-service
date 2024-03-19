package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class Ailment {

    private String name;
    private String[] defaultMedicines;
    private String[] recommendedTests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDefaultMedicines() {
        return defaultMedicines;
    }

    public void setDefaultMedicines(String[] defaultMedicines) {
        this.defaultMedicines = defaultMedicines;
    }

    public String[] getRecommendedTests() {
        return recommendedTests;
    }

    public void setRecommendedTests(String[] recommendedTests) {
        this.recommendedTests = recommendedTests;
    }
}
