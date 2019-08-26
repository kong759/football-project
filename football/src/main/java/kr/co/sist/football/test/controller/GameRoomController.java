package kr.co.sist.football.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.football.test.model.dto.GameList;
//import service.BoardDBBeanMybatis;

@Controller
public class GameRoomController {
	@RequestMapping("/gameRoom")
	public String gameroom(GameList article) {
		System.out.println("test");
		return "gameRoom";
	}
}