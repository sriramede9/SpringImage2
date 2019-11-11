package com.img.controller;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.img.model.Studentimg;

@Controller
public class Homecontroller {

	Studentimg simg = new Studentimg();

	@GetMapping("/hi")
	public String home() {
		return "hello";
	}

	@GetMapping("/form")
	public String studentform(Model model) {

		model.addAttribute("sone", simg);

		return "img2";
	}

	@PostMapping("/resp")
	public String formresponse(@ModelAttribute Studentimg st, @RequestParam MultipartFile file) {

		System.out.println(st);

		System.out.println("Image received is" + file);

		// st.setFile(file);

		return "hello";
	}

	@PostMapping("/formresponse")
	public String formresponse2(@RequestParam MultipartFile file, @ModelAttribute Studentimg st) throws IOException {

		// st.setFile(file.getBytes());

		System.out.println(st);

		System.out.println("Image received is" + file.getBytes());

		st.setFile(file.getBytes());

		System.out.println(st);

		return "hello";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST, consumes = {
			MediaType.MULTIPART_FORM_DATA_VALUE })
	public String addProdt(@ModelAttribute Studentimg p, BindingResult bindingResult,@RequestParam MultipartFile file) throws IOException {

		//bindingResult.
		
		//System.out.println(p);
		System.out.println(file.getBytes());
		
		p.setFile(file.getBytes());
		
		System.out.println(p);
		
		return "hello";

	}

}
