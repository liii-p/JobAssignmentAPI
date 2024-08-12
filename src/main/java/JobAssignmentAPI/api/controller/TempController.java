package JobAssignmentAPI.api.controller;

import JobAssignmentAPI.service.TempService;
import JobAssignmentAPI.api.model.Temps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class TempController {

    private final TempService tempService;

    @Autowired
    public TempController(TempService tempService){
        this.tempService = tempService;
    }

    @GetMapping("/temps/{id}")
    public Temps getTempById(@RequestParam String id) {
        Optional temp = tempService.getTempById(id);
        if (temp.isPresent()) {
            return (Temps) temp.get();
        }
        return null;
    }

    @GetMapping("/temps")
    public Temps getAllTemps() {
        return (Temps) tempService.getAllTemps();
    }

    @PostMapping("/temps")
    public Temps createTemp(@RequestBody Temps temp) {
        tempService.addTemp(temp);
        return temp;
    }
}
