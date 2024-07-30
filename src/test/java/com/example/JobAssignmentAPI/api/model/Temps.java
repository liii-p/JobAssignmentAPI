package com.example.JobAssignmentAPI.api.model;

public class Temps {
    private final int id;
    private final String firstName;
    private final String lastName;
    private Jobs jobs;

    public Temps(int id, String firstName, String lastName, Jobs jobs) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobs = jobs;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }
}
