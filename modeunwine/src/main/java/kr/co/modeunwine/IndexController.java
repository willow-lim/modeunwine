package kr.co.modeunwine;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "hello wolrd");
		return "index";
	}
}
