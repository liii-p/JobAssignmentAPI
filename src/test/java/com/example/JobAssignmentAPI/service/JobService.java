package com.example.JobAssignmentAPI.service;

import com.example.JobAssignmentAPI.api.model.Jobs;
import com.example.JobAssignmentAPI.api.model.Temps;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JobService {
    private List<Jobs> jobsList;

    public JobService() {
        jobsList = new ArrayList<>();
        Jobs job1 = new Jobs(1, "Software Developer", "03/11/24", "12/12/25");
    }

    public Optional<Temps> getUserById(int id) {
        Optional optional = Optional.empty();
        for (Jobs job : jobsList) {
            if (id == job.getId()){
                optional = Optional.of(job);
                return optional;
            }
        }
        return optional;
    }
}
