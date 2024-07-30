package com.example.JobAssignmentAPI.service;

import com.example.JobAssignmentAPI.api.model.Jobs;
import com.example.JobAssignmentAPI.api.model.Temps;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TempService {
    private List<Temps> tempsList;
    private Jobs jobs;

    public TempService() {
        tempsList = new ArrayList<>();
        Temps temps1 = new Temps(1, "John", "Doe", jobs);
    }

    public Optional<Temps> getUserById(int id) {
        Optional optional = Optional.empty();
        for (Temps temp : tempsList) {
            if (id == temp.getId()){
                optional = Optional.of(temp);
                return optional;
            }
        }
        return optional;
    }
}
