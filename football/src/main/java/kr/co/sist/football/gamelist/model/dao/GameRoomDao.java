package kr.co.sist.football.gamelist.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.common.model.dto.GameInfo;
import kr.co.sist.football.gamelist.model.dto.TeamParticipate;
import mybatis.config.MybatisConnector;

@Repository
public class GameRoomDao {
	public static MybatisConnector mybatisconnector;
	
	private final static String namespace = "mybatis.mappers.GamelistMapper";

	@Autowired
	private GameRoomDao(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}
	
	
	public int getCreateGame(GameInfo gameInfo) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		try { 
			return sqlSession.insert(namespace + ".insertGameRoom", gameInfo);
		} finally {
			sqlSession.close();
		}
	}
	
	public int insertGameInfo(GameInfo gameInfo, int teamId) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
        System.out.println(gameInfo);
        TeamParticipate teamParticipate = new TeamParticipate();
        teamParticipate.setTeamId(teamId);
        teamParticipate.setGameId(gameInfo.getId());
		try {
			
			int insertGameResult = sqlSession.insert(namespace + ".insertGameRoom", gameInfo);
			int insertTeamParticipate = sqlSession.insert(namespace + ".insertTeamParticipate", teamParticipate);
			return insertGameResult;
		} finally {
			sqlSession.close();
		}
	}
	public static int getMaxGameId() {
		Integer maxGameId = mybatisconnector.sqlSession().selectOne(namespace + ".selectMaxGameId");
		
		return maxGameId;
	}

//	//teamparticipate를 위한 추가사항
//	public int insertJoinGame(TeamParticipate teamParticipate, int teamId) {
//		SqlSession sqlSession = mybatisconnector.sqlSession();
//		   TeamParticipate teamParticipate1 = new TeamParticipate();
//	        teamParticipate1.setTeamId(teamId);
//		try {
//			int joinGame = sqlSession.insert(namespace + ".insertTeamPariticate");
//			return joinGame;
//		} finally {
//			sqlSession.close();
//		}
//	}
}