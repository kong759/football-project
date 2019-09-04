package kr.co.sist.football.teampage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.sist.football.common.model.dto.TeamInfo;
import kr.co.sist.football.teampage.model.dto.TeampageDTO;
import mybatis.config.MybatisConnector;


public class MybatisTest {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
	private final String namespace = "mybatis.mappers.TeamListMapper";
	MybatisConnector mybatisconnector = ctx.getBean(MybatisConnector.class);

	public MybatisTest() {
	}

	public MybatisTest(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}


	public void updateTeamId(int memberId, int teamId) {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		TeampageDTO teampageDTO = new TeampageDTO();


		Map<String, Integer> updateTeamIdMap = new HashMap<String, Integer>();
		updateTeamIdMap.put("teamId", teamId);
		updateTeamIdMap.put("memberId", memberId);

		try {
			int result = sqlSession.update(namespace + ".updateTeamId", updateTeamIdMap);
			System.out.println(result);
		} finally {
			sqlSession.close();
		}
	}
	// �� 媛��엯�븷 �뻹 insert �꽔�뒗 硫붿냼�뱶 ex)荑쇰━臾몄쓣 泥섎━�븯湲� �쐞�븯�뿬 留ㅺ컻蹂��닔 吏��젙
	public int insertTeamInfo(TeamInfo teamListDTO) {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			int insertTeamResult = sqlSession.insert(namespace + ".insertTeamInfo", teamListDTO);
			return insertTeamResult;
		} finally {
			sqlSession.close();
		}
	}
	public List<TeamInfo> getTeamList() {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			List<TeamInfo> teamList = sqlSession.selectList(namespace + ".selectTeaminfoList");
			System.out.println(teamList);
			return teamList;
		} finally {
			sqlSession.close();
		}
	}
	

	public static void main(String[] args) throws Exception {
		MybatisTest test = new MybatisTest();

			test.getTeamList();
	}
}
