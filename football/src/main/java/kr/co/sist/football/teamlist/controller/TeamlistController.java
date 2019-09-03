package kr.co.sist.football.teamlist.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.sist.football.common.model.dto.TeamInfo;

import kr.co.sist.football.teamlist.model.dto.Teamlist;
import kr.co.sist.football.teamlist.model.service.TeamlistService;
import kr.co.sist.football.teamlist.model.service.TeamlistServiceImpl;

@Controller
@RequestMapping("/teamlist")
public class TeamlistController {
	private TeamlistServiceImpl teamlistServiceImpl;
	
	@Autowired
	private TeamlistController(TeamlistServiceImpl teamlistServiceImpl) {
		this.teamlistServiceImpl = teamlistServiceImpl;
	}

	@GetMapping
	public String teamlist(Model model) {
		Teamlist teamlist = teamlistServiceImpl.getTeamList();

		model.addAttribute("teamlist", teamlist);

		return "team/teams";
	}

	@RequestMapping(value = "/insertteam", method = RequestMethod.POST)
	public String createteam(MultipartHttpServletRequest multipartRequest, TeamInfo teamInfo) throws FileNotFoundException, IOException {
		System.out.println(teamInfo);
		MultipartFile multi = multipartRequest.getFile("uploadname");
		String logoPath = multi.getOriginalFilename();
		System.out.println(teamInfo);
		if(logoPath != null && !logoPath.equals("")) {
            String uploadPath = multipartRequest.getRealPath("/")+ "filesave";
            System.out.println(uploadPath);
            FileCopyUtils.copy(multi.getInputStream(), new FileOutputStream(uploadPath + "/" + multi.getOriginalFilename()));
            teamInfo.setLogoPath(logoPath);
        }else {
        	teamInfo.setLogoPath("");
        }
		
		teamlistServiceImpl.insertTeamInfo(teamInfo);

		return "team/teamlist";//
	}

	@RequestMapping(value = "/insertteam", method = RequestMethod.GET)
	public String insertteam(TeamInfo info, BindingResult result, Model model) {

		return "team/Teaminsert";
	}
	@RequestMapping("/html")
	public String asd(Model model) {
		
		return "team/teams";
	}

}
