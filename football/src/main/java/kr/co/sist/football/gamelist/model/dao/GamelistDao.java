package kr.co.sist.football.gamelist.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.gamelist.model.dto.TeamInfo;
import mybatis.config.MybatisConnector;

@Repository
public class GamelistDao {
	public MybatisConnector mybatisconnector;

	private final String namespace = "mybatis.mappers.GamelistMapper";

	@Autowired
	public GamelistDao(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

	public List<TeamInfo> getTeamInfo() throws Exception {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			return sqlSession.selectList(namespace + ".selectTeamInfo");
		} finally {
			sqlSession.close();
		}
	}
}