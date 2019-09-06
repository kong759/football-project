package kr.co.sist.football.teampage.model.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.config.MybatisConnector;

@Repository
public class TeampageDAO {

	public MybatisConnector mybatisconnector;

	private final String namespace = "mybatis.mappers.TeamPageMapper";

	public TeampageDAO() {

	}

	@Autowired
	public TeampageDAO(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

	public int updateTeamId(Map<String, Integer> updateTeamIdMap) {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			return sqlSession.update(namespace + ".updateTeamId", updateTeamIdMap);

		} finally {
			sqlSession.close();
		}
	}

	public int updatePresentNum() {
		return mybatisconnector.sqlSession().update(namespace + ".updatePresentNum");
	}

	// 팀 탈퇴
	public int deleteTeamId(int id) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		int statusCode = 1;

		try {
			statusCode = sqlSession.update(namespace + ".updateTeamIdOfMemberToZero", 0);

			return statusCode;

		} finally {

			sqlSession.close();
		}
	}

	// presentNum 증가시키려고 max값뽑아냄 (null찾으려고)
	public int getMaxpresentNum() {
		Integer presentNum = mybatisconnector.sqlSession().selectOne(namespace + ".selectMaxpresentNum");

		return presentNum;
	}

}