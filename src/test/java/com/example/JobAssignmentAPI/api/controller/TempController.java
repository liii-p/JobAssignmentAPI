package com.example.JobAssignmentAPI.api.controller;

import com.example.JobAssignmentAPI.api.model.Temps;
import com.example.JobAssignmentAPI.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TempController {

    private TempService tempService;

    @Autowired
    public TempController(TempService tempService){
        this.tempService = tempService;
    }

    @GetMapping("/temps")
    public Temps getTemps(@RequestParam int id) {
        Optional temp = tempService.getUserById(id);
        if (temp.isPresent()) {
            return (Temps) temp.get();
        }
        return null;
    }
}
