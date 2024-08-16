package JobAssignmentAPI.repo;

import JobAssignmentAPI.api.model.Temps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempsInfoRepo extends JpaRepository<Temps, Integer> {

}
