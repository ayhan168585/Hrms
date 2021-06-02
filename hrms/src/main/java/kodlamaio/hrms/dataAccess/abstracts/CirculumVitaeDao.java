package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CirculumVitae;

public interface CirculumVitaeDao extends JpaRepository<CirculumVitae, Integer> {

	@Query("From CirculumVitae where job_seeker.userId=:userId")
	CirculumVitae getByUserId(int userId);
}
