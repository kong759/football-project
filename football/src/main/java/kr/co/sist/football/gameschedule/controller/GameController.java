package kr.co.sist.football.gameschedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.football.gameschedule.model.service.GameInfoService;

@Controller
@RequestMapping("/game/")
public class GameController {

	public GameInfoService gameInfoService;

	@Autowired
	public GameController(GameInfoService gameInfoService) {
		this.gameInfoService = gameInfoService;
	}

	@RequestMapping("calendar")
	public String reservation(@RequestParam(value = "kind", required = false, defaultValue = "1") int kind,
			String month, Model model) {
		System.out.println("controller");
		kind = 0;
		month = "08";
		model.addAttribute("gameInfoByMonth", gameInfoService.getGameInfo(kind, month));

		return "game/calendar";
	}

//	@RequestMapping("list")
//	public String list(Model model) {
//
//		List<GameInfo> articleList =
//
//				// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////				model.addAttribute("articleList", futsalGET());
//
//		// /view/list.jsp
//		return "list";
//	}

}
