package test.teamlist;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.sist.football.common.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.service.TeamlistServiceImpl;

public class ServiceTest {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
	TeamlistServiceImpl service = ctx.getBean(TeamlistServiceImpl.class);

	@Test
	public void insertTeamInfoTest() {

		TeamInfo teamInfo = new TeamInfo();

		teamInfo.setName("name");
		teamInfo.setLogoPath("testPath://");
		teamInfo.setMaxNum(10);
		teamInfo.setLocation("location");

		service.insertTeamInfo(teamInfo);
	}
	@Test
	public void insertTeamTest() {
		
	}
}
