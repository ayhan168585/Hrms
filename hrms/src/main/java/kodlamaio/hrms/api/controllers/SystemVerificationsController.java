package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemVerification;

@RestController
@RequestMapping("/api/systemverifications")
public class SystemVerificationsController {

	private SystemVerificationService systemVerificationService;
	@Autowired

	public SystemVerificationsController(SystemVerificationService systemVerificationService) {
		super();
		this.systemVerificationService = systemVerificationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SystemVerification>> getall(){
		return this.systemVerificationService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody SystemVerification systemVerification) {
		return this.systemVerificationService.add(systemVerification);
	}
}
