package kr.co.sist.football.teamlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.football.teamlist.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dto.Teamlist;
import kr.co.sist.football.teamlist.model.service.TeamlistService;

@Controller
@RequestMapping("/teamlist")
public class TeamlistController {
	private TeamlistService teamlistService;

	@Autowired
	private TeamlistController(TeamlistService teamlistService) {
		this.teamlistService = teamlistService;
	}

	@GetMapping
	public String teamlist(Model model) {
		Teamlist teamlist = teamlistService.getTeamlist();
		List<TeamInfo> teamInfos = teamlist.getTeamInfos();
		model.addAttribute("teamlist", teamlist);
		model.addAttribute("teamInfos", teamInfos);

		teamlist.getTeamCount();
		teamlist.getTeamInfos().get(0);

		return "team/teamlist";
	}
}
