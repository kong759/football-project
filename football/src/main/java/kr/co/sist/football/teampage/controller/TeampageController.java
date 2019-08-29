package kr.co.sist.football.teampage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teampage")
public class TeampageController {
	@GetMapping
	public String teampage() {

		return "team/teampage";
	}
}
