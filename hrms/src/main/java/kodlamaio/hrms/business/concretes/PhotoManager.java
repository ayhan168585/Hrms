package kodlamaio.hrms.business.concretes;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.helpers.abstracts.FileHelper;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.hrms.entities.concretes.Photo;


@Service
@Repository
public class PhotoManager implements PhotoService {

	private PhotoDao photoDao;
	private FileHelper fileHelper;
	
	@Autowired
	public PhotoManager(PhotoDao photoDao, FileHelper fileHelper) {
		super();
		this.photoDao = photoDao;
		this.fileHelper = fileHelper;
	}
	@SuppressWarnings("unchecked")
	@Override
	public Result add(MultipartFile file, Photo photo) throws IOException {
		Map<String,String> getImage = (Map<String,String>)fileHelper.upload(file);
		photo.setPath(getImage.get("url"));
		photo.setUploadedAt(LocalDate.now());
		var result = this.photoDao.save(photo);
		if(result != null) {
			return new SuccessResult("Fotoğraf eklendi.");
		}
		return new ErrorResult("Fotoğraf eklenemedi.");
	}
	@Override
	public Result deleteById(int id) {
		// TODO Auto-generated method stub
		this.photoDao.deleteById(id);
		return new SuccessResult("Fotoğraf silindi.");
	}
	@Override
	public DataResult<List<Photo>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Photo>>
		(this.photoDao.findAll(),"Fotoğraflar listelendi.");
	}

	
	
	
	

	
		
}
