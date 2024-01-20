package com.david.EasyShift.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "employees")
public class Employee {

    @Id
    private String id;
    private String name;
    private Map<String, String> shiftPreferences;  // Map to store shift preferences for each day

    // Constructors
    public Employee() {
    }

    public Employee(String name, Map<String, String> shiftPreferences) {
        this.name = name;
        this.shiftPreferences = shiftPreferences;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getShiftPreferences() {
        return shiftPreferences;
    }

    public void setShiftPreferences(Map<String, String> shiftPreferences) {
        this.shiftPreferences = shiftPreferences;
    }
}
