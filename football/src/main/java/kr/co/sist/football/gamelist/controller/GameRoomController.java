package kr.co.sist.football.gamelist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.football.gamelist.model.dto.GameList;

@Controller
public class GameRoomController {
	@RequestMapping("/gameRoom")
	public String gameroom(GameList article) {
		System.out.println("test");
		return "gameRoom";
	}
}