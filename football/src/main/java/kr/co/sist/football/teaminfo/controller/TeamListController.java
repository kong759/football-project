package kr.co.sist.football.teaminfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.football.teaminfo.model.service.TeamListService;

@Controller
@RequestMapping("/TeamList/")
public class TeamListController {
	
	public TeamListService teamListService;
	@Autowired
	public TeamListController(TeamListService teamListService) {
		this.teamListService = teamListService;
	}
	
	@RequestMapping("TeamList")
	public void selectAllTeamList(Model model) {
		TeamListService service;
		service.getTeamCount(count);
		
		model.addAttribute(teamListService.selectAllTeamList(teamListDTO));
	
		
		return mv;
	}

}
