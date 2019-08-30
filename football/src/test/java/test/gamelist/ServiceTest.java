package test.gamelist;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.sist.football.gamelist.model.dao.GamelistDao;
import kr.co.sist.football.gamelist.model.dto.GameInfoParam;
import kr.co.sist.football.gamelist.model.service.GamelistService;

public class ServiceTest {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
	GamelistService gamelistService = ctx.getBean(GamelistService.class);

	@Test
	public void testGetTeamInfo() {
		int teamId = 0;
		GameInfoParam gameInfoParam = new GameInfoParam();
		int gameInfoId = 0;

		gameInfoParam.setStartNum(1);
		gameInfoParam.setEndNum(2);

		System.out.println(gamelistService.getGamelist(teamId, gameInfoParam, gameInfoId));
	}

}
