package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	@Query("select u from JobSeeker u where u.email = ?1")
	JobSeeker findByEmailAddress(String email );
	@Query("select u from JobSeeker u where u.tcNo = ?1")
	JobSeeker findByTcNo(String tcNo );
	
	
	
}
