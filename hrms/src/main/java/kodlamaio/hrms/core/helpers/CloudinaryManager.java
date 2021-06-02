package kodlamaio.hrms.core.helpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.helpers.abstracts.FileHelper;

@Service
public class CloudinaryManager implements FileHelper {
	
	Cloudinary cloudinary;
	private Map<String,String> valueMap=new HashMap<>();

		public CloudinaryManager() {
		valueMap.put("cloud_name", "dh70tt9xs");
		valueMap.put("api_key", "462525597517432");
		valueMap.put("api_secret", "g_N0TiNk5-n1EmY3MMC6TUY8p34");
		cloudinary=new Cloudinary(valueMap);
	}

	@Override
	public Map upload(MultipartFile multipartFile) throws IOException {
		File file=convert(multipartFile);
		Map result = cloudinary.uploader().upload(file,ObjectUtils.emptyMap());
		file.delete();
		return result;
	}

	@Override
	public Map delete(String id) throws IOException {
		
		Map result = cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
		return result;
	}
	
	private File convert(MultipartFile multipartFile) throws IOException{
		File file=new File(multipartFile.getOriginalFilename());
		FileOutputStream fo=new FileOutputStream(file);
		fo.write(multipartFile.getBytes());
		fo.close();
		return file;
	}

}
