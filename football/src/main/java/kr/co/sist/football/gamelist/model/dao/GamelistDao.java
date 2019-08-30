package kr.co.sist.football.gamelist.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.gamelist.model.dto.GameInfo;
import kr.co.sist.football.gamelist.model.dto.GameInfoParam;
import kr.co.sist.football.gamelist.model.dto.GameLocation;
import kr.co.sist.football.gamelist.model.dto.TeamInfo;
import mybatis.config.MybatisConnector;

@Repository
public class GamelistDao {
	private MybatisConnector mybatisconnector;

	private final String namespace = "mybatis.mappers.GamelistMapper.";

	@Autowired
	private GamelistDao(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

	public TeamInfo getTeamInfo(int teamId) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		TeamInfo teamInfo = sqlSession.selectOne(namespace + "selectTeamInfo", teamId);
		try {
			return teamInfo;
		} finally {
			sqlSession.close();
		}
	}

	
	public List<GameInfo> getGameInfoList(GameInfoParam gameInfoParam) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		try {
			return sqlSession.selectList(namespace + "selectGameInfo", gameInfoParam);
		} finally {
			sqlSession.close();
		}
	}



	public GameLocation getGameLocationByGameId(int gameInfoId) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		try {
			return sqlSession.selectOne(namespace + "selectGameLocation", gameInfoId);
		} finally {
			sqlSession.close();
		}
	}
}