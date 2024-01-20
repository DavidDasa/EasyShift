package com.david.EasyShift.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "shifts")
public class Shift {

    @Id
    private String id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String assignedEmployeeId;  // Reference to the assigned employee
    private String dayOfWeek;  // Day of the week for the shift

    // Constructors
    public Shift() {
    }

    public Shift(LocalDateTime startTime, LocalDateTime endTime, String assignedEmployeeId, String dayOfWeek) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.assignedEmployeeId = assignedEmployeeId;
        this.dayOfWeek = dayOfWeek;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getAssignedEmployeeId() {
        return assignedEmployeeId;
    }

    public void setAssignedEmployeeId(String assignedEmployeeId) {
        this.assignedEmployeeId = assignedEmployeeId;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
