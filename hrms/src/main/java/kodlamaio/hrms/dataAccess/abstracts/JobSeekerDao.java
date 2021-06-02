package kodlamaio.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerWithJobPositionDto;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	@Query("select u from JobSeeker u where u.email = ?1")
	JobSeeker findByEmailAddress(String email );
	@Query("select u from JobSeeker u where u.tcNo = ?1")
	JobSeeker findByTcNo(String tcNo );
	
    @Query("Select new kodlamaio.hrms.entities.dtos.JobSeekerWithJobPositionDto"
    		+ "(js.id,js.tcNo,js.firstName,js.lastName,js.email,js.birthYear,jp.jobPositionName) "
    		+ "From JobSeeker js inner join js.job_positions jp")
    
	List<JobSeekerWithJobPositionDto> getJobSeekerWithJopPositionDetails();
	
	
		
	}
	
	
	

