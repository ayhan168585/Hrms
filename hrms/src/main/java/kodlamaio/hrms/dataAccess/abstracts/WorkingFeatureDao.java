package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.WorkingFeature;

public interface WorkingFeatureDao extends JpaRepository<WorkingFeature, Integer> {

}
