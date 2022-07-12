package jana60.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/ora")
	public String ora(@RequestParam(name="name") String name, Model model) {
		name = "Michelangelo";
		
		model.addAttribute("name", name);
		model.addAttribute("time", LocalTime.now());
		
		return "ora";
	}

}
