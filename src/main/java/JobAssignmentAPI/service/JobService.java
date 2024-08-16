package JobAssignmentAPI.service;

import JobAssignmentAPI.api.model.Jobs;
import JobAssignmentAPI.api.model.Temps;
import JobAssignmentAPI.repo.JobAssignmentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobAssignmentInfoRepo jobAssignmentInfoRepo;

    public Jobs createJob(Jobs job) {
        return jobAssignmentInfoRepo.save(job);
    }

    public List<Jobs> getAllJobs() {
        return jobAssignmentInfoRepo.findAll();
    }

    /*public List<Jobs> getJobsByAssigned(boolean assigned) {
        //return something here
    }*/

    public Jobs getJobById(Integer id) {
        return jobAssignmentInfoRepo.findById(id).orElse(null);
    }

    public Jobs updateJob(Integer id, Jobs job) {
        job.setId(id);
        return jobAssignmentInfoRepo.save(job);
    }

}
