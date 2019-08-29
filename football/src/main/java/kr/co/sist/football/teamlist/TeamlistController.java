package kr.co.sist.football.teamlist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teamlist")
public class TeamlistController {
	@GetMapping
	public String gamelist() {

		return "team/teamlist";
	}
}
