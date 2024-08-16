package JobAssignmentAPI.api.controller;

import JobAssignmentAPI.api.model.Jobs;
import JobAssignmentAPI.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping
    public Jobs createJob(@RequestBody Jobs job) {
        return jobService.createJob(job);
    }

    @GetMapping
    public List<Jobs> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Jobs getJobById(@PathVariable Integer id) {
        return jobService.getJobById(id);
    }

    @PutMapping
    public Jobs updateJob(@PathVariable Integer id, @RequestBody Jobs job) {
        return jobService.updateJob(id, job);
    }

}
