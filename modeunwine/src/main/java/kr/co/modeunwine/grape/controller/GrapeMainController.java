package kr.co.modeunwine.grape.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.modeunwine.grape.service.GrapeMainService;

@Controller
public class GrapeMainController {

	@Autowired
	private GrapeMainService grapeMainService;
	
	@GetMapping("/grape")
	public String GrapeView(Model model) {
		return "fragments/grape/grapeView";
		
	}
}
