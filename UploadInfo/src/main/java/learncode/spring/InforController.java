package learncode.spring;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



@Controller
public class InforController {
	
	@RequestMapping("/")
	public String register() {
		return "infor";
	}
	
	@PostMapping("/save")
	public String save(@RequestParam("name") String name,
			@RequestParam("photo") MultipartFile photo,
			@RequestParam("filecv") MultipartFile filecv,
			ModelMap model) {
		
		Infor infor = new Infor();
		infor.setName(name);
		
		if(photo.isEmpty() || filecv.isEmpty()) {
			return "infor";
		}
		
		Path path =Paths.get("uploads/");
		
		try {
			InputStream inputStream = photo.getInputStream();
			Files.copy(inputStream, path.resolve(photo.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			infor.setPhoto(photo.getOriginalFilename().toLowerCase());
			///
			inputStream = filecv.getInputStream();
			Files.copy(inputStream, path.resolve(filecv.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			model.addAttribute("INFOR",infor);
			model.addAttribute("FILE_NAME",filecv.getOriginalFilename());
			model.addAttribute("FILE_TYPE",filecv.getContentType());
			model.addAttribute("FILE_SIZE",filecv.getSize());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "view-infor";
	}
}
