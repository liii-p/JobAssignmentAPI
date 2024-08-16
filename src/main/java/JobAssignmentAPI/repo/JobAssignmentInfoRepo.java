package JobAssignmentAPI.repo;

import JobAssignmentAPI.api.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobAssignmentInfoRepo extends JpaRepository<Jobs, Integer> {

}
