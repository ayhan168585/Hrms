package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.MernisVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.MernisVerification;

@RestController
@RequestMapping("/api/mernisverifications")
public class MernisVerificationsController {

	private MernisVerificationService mernisVerificationService;

	@Autowired
	public MernisVerificationsController(MernisVerificationService mernisVerificationService) {
		super();
		this.mernisVerificationService = mernisVerificationService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<MernisVerification>> getAll(){
		return this.mernisVerificationService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody MernisVerification mernisVerification) {
		return mernisVerificationService.add(mernisVerification);
	}
	
}
