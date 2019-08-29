package kr.co.sist.football.gameschedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gameschedule")
public class GamescheduleController {
	@GetMapping
	public String gameschedule() {

		return "game/gameschedule";
	}
}
