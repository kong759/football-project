package kr.co.sist.football.gamelist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gamelist")
public class GamelistController {
	@GetMapping
	public String gamelist() {

		return "game/gamelist";
	}
}
