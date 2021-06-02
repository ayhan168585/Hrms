package kodlamaio.hrms.core.helpers.abstracts;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;


public interface FileHelper {

	Map upload(MultipartFile file) throws IOException;
	Map delete(String id) throws IOException;
}
