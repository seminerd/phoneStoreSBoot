package com.sapoyoungtalent.PhoneStoreSB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhoneController {
	@GetMapping("/")
	public String getIndex() {
		return "Index";
	}
	@PostMapping("/greeting")
	public String getLocation(@RequestParam("location") String location,Model model) {
		model.addAttribute("location",location);
		return "Index";
	}

}
