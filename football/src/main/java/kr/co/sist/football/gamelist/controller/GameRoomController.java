/*
 * package kr.co.sist.football.gamelist.controller;
 * 
 * import javax.servlet.http.HttpSession;
 * 
 * import org.apache.ibatis.session.SqlSession; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import kr.co.sist.football.common.model.dto.GameInfo; import
 * kr.co.sist.football.gamelist.model.dto.GameRoom; import
 * kr.co.sist.football.gamelist.model.service.GameRoomService; import
 * kr.co.sist.football.teampage.model.dto.TeampageDTO;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/createRoom") public class GameRoomController {
 * private GameRoomService gameRoomService;
 * 
 * @Autowired private GameRoomController(GameRoomService gameRoomService) {
 * this.gameRoomService = gameRoomService; }
 * 
 * @PostMapping public String gameRoomPost(GameInfo gameInfo, Model model) {
 * System.out.println(gameInfo);
 * 
 * gameInfo.setId(gameInfo.getId());
 * gameInfo.setStatusCode(gameInfo.gzetStatusCode());
 * gameInfo.setMaxPersonNum(gameInfo.getMaxPersonNum());
 * gameInfo.setMaxTeamNum(gameInfo.getMaxTeamNum());
 * gameInfo.setKind(gameInfo.getKind());
 * gameInfo.setDuration(gameInfo.getDuration());
 * gameInfo.setName(gameInfo.getName());
 * 
 * System.out.println(gameInfo); return "redirect:/gamelist"; }
 * 
 * 
 * 
 * }
 * 
 * 
 */