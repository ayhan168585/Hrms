package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	@Query("From JobAdvertisement where employer.userId=:userId and isActive=:isActive")
	List<JobAdvertisement> getByCompanyName(int userId,boolean isActive);
	
	@Query("From JobAdvertisement where isActive=:isActive")
	List<JobAdvertisement> getAllByIsActive(boolean isActive);
	@Query("From JobAdvertisement where jobAdvertisementId=:jobAdvertisementId")
	JobAdvertisement getByJobAdvertisementId(int jobAdvertisementId);
}
