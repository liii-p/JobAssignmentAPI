package JobAssignmentAPI.service;

import JobAssignmentAPI.api.model.Jobs;
import JobAssignmentAPI.api.model.Temps;
import JobAssignmentAPI.repo.TempsInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TempService {
    @Autowired
    private TempsInfoRepo tempsInfoRepo;

    public Temps createTemp(Temps temp) {
        return tempsInfoRepo.save(temp);
    }

    public List<Temps> getAllTemps() {
        return tempsInfoRepo.findAll();
    }

    public Temps getTempById(Integer id) {
        return tempsInfoRepo.findById(id).orElse(null);
    }

}
