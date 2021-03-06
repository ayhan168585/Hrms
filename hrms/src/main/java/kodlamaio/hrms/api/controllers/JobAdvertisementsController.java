package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
@CrossOrigin
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	@GetMapping("/getAllByPaging")
	public DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize){
		return this.jobAdvertisementService.getAll(pageNo, pageSize);
	}
	@GetMapping("/getbycompanyname")
	public DataResult<List<JobAdvertisement>> getByCompanyName(int userId,boolean isActive){
		return this.jobAdvertisementService.getByCompanyName(userId,isActive);
	}
	@GetMapping("getallbyisactive")
	
	public DataResult<List<JobAdvertisement>> getAllByIsActive(boolean isActive){
		return this.jobAdvertisementService.getAllByIsActive(isActive);
	}
	@GetMapping("/getallsorted")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertisementService.getAllSorted();
	}
	
	@GetMapping("/getbyjobadvertisementid")
	
	public DataResult<JobAdvertisement> getByJobAdvertisementId(int jobAdvertisementId){
		return this.jobAdvertisementService.getByJobAdvertisementId(jobAdvertisementId);
	}
	
}
