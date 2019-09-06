package kr.co.sist.football.gameschedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sist.football.common.model.dto.GameInfo;
import kr.co.sist.football.gameschedule.model.dto.GameCount;
import kr.co.sist.football.gameschedule.model.service.GamescheduleService;

@Controller
@RequestMapping("/gameschedule")
public class GamescheduleController {

	private GamescheduleService gamescheduleService;

	@Autowired
	public GamescheduleController(GamescheduleService gamescheduleService) {
		this.gamescheduleService = gamescheduleService;
	}

	@GetMapping
	public String gameschedule(Model model) {
		// kind가 0이면 인원 무관으로?
		List<GameCount> scheduleMap = gamescheduleService.getGameCount();
		model.addAttribute("scheduleMap", scheduleMap);
		System.out.println(scheduleMap);
		
		return "game/gameschedule";
	}
	
	@RequestMapping("/searchgame")
	public String searchgame(Model model,String gamedate) {
		System.out.println(gamedate);
		List<GameInfo> gameList = gamescheduleService.getGameInfo(gamedate);
		model.addAttribute("gameList", gameList);
		return "game/sortedgamelist";
		
//		System.out.println("1"+gamedate);
//		List<GameInfo> gameMap = gamescheduleService.getGameInfo(gamedate);
//		System.out.println("2"+gameMap);
//		model.addAttribute("gameMap",gameMap);
//		System.out.println("3"+gameMap);
//		return "game/sortedgamelist";
	}

}
//Controller는 View와 자바를 연결해주는 역할 !
//원래는 View딴에서 Controller로 이동을 해 가지구 Service에서 알고리즘을 처리 Dao로 가서 DB와 연결 가져와야 할 자료 있으면
// 다시 역순으로 return해가지고 DAO SERVICE CONTROLLER VIEW순으로 다시 정보를 준다는 느낌 