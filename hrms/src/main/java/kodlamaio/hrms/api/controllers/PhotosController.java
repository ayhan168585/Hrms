package kodlamaio.hrms.api.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.Photo;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/photos")
@CrossOrigin

public class PhotosController {


	PhotoService photoService;
	@Autowired
	public PhotosController(PhotoService photoService) {
		super();
		this.photoService = photoService;
	}
	
	@GetMapping("/getall")
	
	public DataResult<List<Photo>> getAll(){
		return this.photoService.getAll();
	}

	@PostMapping("/upload")
	public Result upload (@RequestBody MultipartFile multipartFile,@RequestParam int userId) throws IOException{
		Photo photo=new Photo();
		User user=new User();
		user.setUserId(userId);
		photo.setUser(user);
		
		return this.photoService.add(multipartFile, photo);
		
	}
	@DeleteMapping("/deletebyid")
	public Result deleteById(int id) {
		return this.photoService.deleteById(id);
	}
	
	
}
