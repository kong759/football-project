package kr.co.sist.football.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.football.test.model.dto.GameList;
import kr.co.sist.football.test.model.service.GameListService;


//import service.BoardDBBeanMybatis;

@Controller
public class GameListController {
	ModelAndView mv = new ModelAndView();
	String name;
	
	
	
	@Autowired
	public GameListService gameListService;
	//singleton객체 생성 해주는 역할 
	
	@RequestMapping("/gamelist")
	public String gamelist(@) {
		System.out.println("test");
		return "gameList";

	}//model에 addAttribute 해서 article 대입
	
	
	@ModelAttribute
	public void setAttr(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String reqboardid = request.getParameter("name");

		if (reqboardid != null)
			session.setAttribute("name", reqboardid);
		if (session.getAttribute("name") == null)
			name = "1";
		else
			name = (String) session.getAttribute("name");
	}
	
	
	@RequestMapping("gameList")
	public List gamelistTeaminfo(int start) throws Exception {
		
		List articleList = gameListService.gamelistTeaminfo(name);
		
		if (gameListService.mybatisConnector.sqlSession() != null) {
			articleList = gameListService.gamelistTeaminfo(name);
		} else {
			articleList = gameListService.gamelistTeaminfo(name);
		}
		return articleList;
	}

}

