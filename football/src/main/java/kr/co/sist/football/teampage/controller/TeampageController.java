package kr.co.sist.football.teampage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.football.member.model.dto.MemberDTO;
import kr.co.sist.football.teampage.model.dto.Teampage;
import kr.co.sist.football.teampage.model.dto.TeampageDTO;
import kr.co.sist.football.teampage.model.service.TeampageService;

@Controller
@RequestMapping("/teampage")
public class TeampageController {

	@Autowired
	public TeampageService teampageService;
	public TeampageDTO teampageDTO;
	public MemberDTO memberDTO;

	//teamList에 생성된 해당 teampage가져오기
	@GetMapping
	public String teampage(@RequestParam(name = "teamId", required = false) int teamId, Model model) {
		Teampage teampage = teampageService.getTeampage(teamId);

		model.addAttribute("teampage", teampage);
		
		return "team/teampage";
	}
	
	//teampage 가입하기
		@RequestMapping("/join")
		public String join() {
			
			return "redirect:/teampage";
		}

	//teampage 가입하기
	@RequestMapping("/jointeam")
	public ModelAndView jointeam(int teamId, HttpServletRequest request) {
		HttpSession session = request.getSession();
		int memberId = Integer.parseInt((String)session.getAttribute("userId"));
		
		ModelAndView mv = new ModelAndView();
		
		teampageService.setTeamId(memberId, teamId);
		
		mv.setViewName("team/jointeam");
		return mv;
	}

	// 팀 탈퇴
	@GetMapping("/quit")
	public String quitTeam(@RequestParam int id, @RequestParam String password) {

		teampageService.quitTeam(id, password);

		boolean pwCheck = teampageDTO.matchPassword(password);

		if (!pwCheck) {

			return "team/quit";

		} else {

			return "redirect:/teampage/teampage";
			
		}
	
	}
	//teamplayer 가입된 선수명단 가져오기
	@GetMapping("/teamplayer")
	public String teamPlayer() {
		
		
		return "team/teamplayer";
	}
}