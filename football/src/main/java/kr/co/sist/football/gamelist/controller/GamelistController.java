package kr.co.sist.football.gamelist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.football.common.model.dto.GameInfo;

import kr.co.sist.football.gamelist.model.dto.GameInfoParam;
import kr.co.sist.football.gamelist.model.dto.Gamelist;
import kr.co.sist.football.gamelist.model.service.GameRoomService;
import kr.co.sist.football.gamelist.model.service.GamelistService;

@Controller
@RequestMapping(value = "/gamelist")
public class GamelistController {
	private final static int MAX_PAGE_NUM = 8;

	GamelistService gamelistService;
	GameRoomService gameRoomService;

	@Autowired
	public GamelistController(GamelistService gamelistService, GameRoomService gameRoomService) {
		this.gamelistService = gamelistService;
		this.gameRoomService = gameRoomService;
	}

	@GetMapping
	public String gamelist(@RequestParam(name = "teamId", required = false, defaultValue = "-1") int teamId,
			@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum, Model model) {
		GameInfoParam gameInfoParam = new GameInfoParam();

		gameInfoParam.setStartNum(pageNum);
		gameInfoParam.setEndNum(pageNum + MAX_PAGE_NUM - 1);

		Gamelist gamelist = gamelistService.getGamelist(teamId, gameInfoParam);

		model.addAttribute("gamelist", gamelist);

		return "game/gameResult";
	}

	@RequestMapping("/createRoom")
	public String createRoom(GameInfo gameInfo) {

		return "game/createRoom";
	}

	@RequestMapping(value = "/insertgame", method = RequestMethod.POST)
	public String createteam(GameInfo gameInfo, int teamId) {
		
		gameRoomService.insertGameInfo(gameInfo, teamId);
	
		return "redirect:/gamelist";
	}

//	//teamparticipate를 위한 추가사항
//	@RequestMapping(value="/joingame", method = RequestMethod.POST)
//	public int joingame(TeamParticipate teamParticipate, int teamId) {
//		gameRoomService.insertJoinGame(teamParticipate, teamId);
//		System.out.println("입장완료");
//		return "redirect:/gamelist";
//		
//	}

}
