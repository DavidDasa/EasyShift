package com.david.EasyShift.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "weeklySchedules")
public class WeeklySchedule {

    @Id
    private String id;
    private String weekStartDate;  // You might use a String or LocalDate for the week start date
    private List<Shift> shifts;

    // Constructors
    public WeeklySchedule() {
    }

    public WeeklySchedule(String weekStartDate, List<Shift> shifts) {
        this.weekStartDate = weekStartDate;
        this.shifts = shifts;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(String weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}
