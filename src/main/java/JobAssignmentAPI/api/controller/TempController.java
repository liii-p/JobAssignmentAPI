package JobAssignmentAPI.api.controller;

import JobAssignmentAPI.service.TempService;
import JobAssignmentAPI.api.model.Temps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temps")
public class TempController {

    @Autowired
    private TempService tempService;

    @PostMapping
    public Temps createTemp(@RequestBody Temps temp) {
        return tempService.createTemp(temp);
    }

    @GetMapping
    public List<Temps> getAllTemps() {
        return tempService.getAllTemps();
    }

    @GetMapping("/{id}")
    public Temps getTempById(@PathVariable Integer id) {
        return tempService.getTempById(id);
    }

}
