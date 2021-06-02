package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkingFeatureService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkingFeature;

@RestController
@RequestMapping("/api/workingFeatures")
@CrossOrigin
public class WorkingFeaturesController {

	private WorkingFeatureService workingFeatureService;

	@Autowired
	public WorkingFeaturesController(WorkingFeatureService workingFeatureService) {
		super();
		this.workingFeatureService = workingFeatureService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<WorkingFeature>> getAll(){
		
		return this.workingFeatureService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody WorkingFeature workingFeature) {
		return this.workingFeatureService.add(workingFeature);
	}
}
