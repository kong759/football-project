package kr.co.sist.football.teampage.model.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.teampage.MybatisTest;
import kr.co.sist.football.teampage.model.dto.TeampageDTO;
import mybatis.config.MybatisConnector;

@Repository
public class TeampageDAO {

	public MybatisConnector mybatisconnector;

	private final String namespace = "mybatis.mappers.TestMapper";

	public TeampageDAO() {

	}

	@Autowired
	public TeampageDAO(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

	/*
	 * public void insertTeampageArticle() { SqlSession sqlSession =
	 * mybatisconnector.sqlSession(); TeampageDTO teampageDTO = new TeampageDTO();
	 * 
	 * teampageDTO.setId(9); teampageDTO.setTeam_id(9);
	 * teampageDTO.setNick_name("이종현"); teampageDTO.setManner_score(9);
	 * teampageDTO.setPic_path("이종현"); teampageDTO.setFoot_code(9);
	 * teampageDTO.setName("이종현"); teampageDTO.setEmail("이종현");
	 * teampageDTO.setPassword("이종현"); teampageDTO.setTel(9);
	 * teampageDTO.setPosition("이종현");
	 * 
	 * try { int result = sqlSession.insert(namespace+ ".insertTeampageArticle",
	 * teampageDTO); System.out.println(result); } finally { sqlSession.close(); } }
	 */

	public void updateTeamId(int id) {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		TeampageDTO teampageDTO = new TeampageDTO();

		teampageDTO.setTeamId(5);

		try {
			int result = sqlSession.update(namespace + ".updateTeamId", id);
			System.out.println(result);
		} finally {
			sqlSession.close();
		}
	}

	public static void main(String[] args) throws Exception {
		MybatisTest test = new MybatisTest();

		test.updateTeamId(0, 1);
	}
}
