package learncode.spring;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
	
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/save")
	public String save(HttpServletRequest request, ModelMap module) {
		String name = request.getParameter("name");
		String msv = request.getParameter("msv");
		String majors = request.getParameter("majors");
		module.addAttribute("name",name);
		module.addAttribute("msv",msv);
		module.addAttribute("majors",majors);
		
		return "save";
	}

}
