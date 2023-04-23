package learncode.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import learncode.spring.model.*;
@Controller
public class StudentController {
	MajorDAO mdao = new MajorDAO();
	StudentDAO sdao = new StudentDAO();
	@RequestMapping("/student")
	public String show(ModelMap model) {
		model.addAttribute("STUDENT", new Student());
		return "student-form";
	}
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap madel,@ModelAttribute("STUDENT") Student st) {
		Major m = mdao.findById(st.getMajor().getId());
		st.setMajor(m);
		sdao.add(st);
		return "student-form";
	}
	@GetMapping("/list")
	public String list(ModelMap model) {
		model.addAttribute("LIST_STUDENT",sdao.getAll());
		return "view-student";
	}
	@ModelAttribute("list_major")
	public List<Major> getMajor(){
		return mdao.getAll();	
	}
}
