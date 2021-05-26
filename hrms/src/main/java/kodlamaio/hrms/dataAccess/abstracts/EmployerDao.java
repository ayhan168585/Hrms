package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{
	
	@Query("select u from Employer u where u.emailAdressOfWeb = ?1")
	Employer findByEmailAddress(String email );

}
