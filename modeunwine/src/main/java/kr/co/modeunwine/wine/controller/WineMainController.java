package kr.co.modeunwine.wine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.modeunwine.wine.service.WineMainService;

@Controller
public class WineMainController {

	@Autowired
	private WineMainService wineMainService;
	
	@GetMapping("/grape")
	public String GrapeView(Model model) {
		return "fragments/grape/grapeView";
		
	}
}
