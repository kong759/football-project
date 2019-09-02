package kr.co.sist.football.teamlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sist.football.teamlist.model.dao.TeamListDAO;
import kr.co.sist.football.teamlist.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dto.Teamlist;
import kr.co.sist.football.teamlist.model.service.TeamValidator;
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
		Teamlist teamlist = teamlistService.getTeamList();

		model.addAttribute("teamlist", teamlist);

		return "team/teamlist";
	}
	@RequestMapping(value="/insertteam", method=RequestMethod.GET)
	   public String createteam(Model model,TeamInfo info) {
		
	      model.addAttribute("name",info.getName());
	      model.addAttribute("maxNum",info.getMaxNum());
//	      model.addAttribute("id",info.getId());//유니폼 유/무 테이블 생성 uniform
//	      model.addAttribute("uniformColorCode",info.getUniformColorCode());
	      model.addAttribute("logoPath",info.getLocation());//view에 로케이션 추가
	      model.addAttribute("logoPath",info.getLogoPath());
	   
	      return "team/Teaminsert";
	   }
	   @RequestMapping(value="/insertteam",method=RequestMethod.POST)
	   public String insertteam(TeamInfo info,BindingResult result,Model model) {
	      TeamListDAO teamListDAO = new TeamListDAO();
	      teamListDAO.insertTeamInfo(info);
	      
	      return "team/teamlist";//종현이 형이 만든 팀페이지로 이동
	   }

}
