package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemVerification;

public interface SystemVerificationDao extends JpaRepository<SystemVerification, Integer> {

}
