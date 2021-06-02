package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CirculumVitaeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.CirculumVitae;

@RestController
@RequestMapping("/api/circulumvitaes")
@CrossOrigin
public class CirculumVitaesController {

	private CirculumVitaeService circulumVitaeService;

	@Autowired
	public CirculumVitaesController(CirculumVitaeService circulumVitaeService) {
		super();
		this.circulumVitaeService = circulumVitaeService;
	}
	
	@GetMapping("/getall")
	
	public DataResult<List<CirculumVitae>> getAll(){
		return this.circulumVitaeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CirculumVitae circulumVitae) {
		return this.add(circulumVitae);
	}
	
	@GetMapping("/getbyuserid")
	
	public DataResult<CirculumVitae> getByUserId(int userId){
		return this.circulumVitaeService.getByUserId(userId);
	}
}
