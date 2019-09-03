package test.teamlist;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.sist.football.common.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dao.TeamListDAO;

public class DaoTest {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");

	TeamListDAO dao = ctx.getBean(TeamListDAO.class);

//	@Test
	public void insertTeamInfoTest() {
		TeamInfo teamInfo = new TeamInfo();

		teamInfo.setId(5);
		teamInfo.setName("name");
		teamInfo.setLogoPath("testPath://");
		teamInfo.setMaxNum(10);
		teamInfo.setLocation("location");

		dao.insertTeamInfo(teamInfo);
	}

	@Test
	public void getMaxTeamIdTest() {
		System.out.println(dao.getMaxTeamId());
	}

}
