package kr.co.sist.football.gamelist.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kr.co.sist.football.common.model.dto.GameInfo;
import kr.co.sist.football.gamelist.model.dao.GameRoomDao;
import kr.co.sist.football.gamelist.model.dto.GameRoom;

@Service
public class GameRoomService {
	private GameRoomDao gameRoomDao;

	@Autowired
	private GameRoomService(GameRoomDao gameRoomDao) {
		this.gameRoomDao = gameRoomDao;
	}

	public void insertGameInfo(GameInfo gameInfo, int teamId) {
		int gameId;

		try {
			gameId = GameRoomDao.getMaxGameId() + 1;
		} catch (NullPointerException e) {
			System.err.println("최초 입력입니다.");
			System.err.println("game id로 1 입력.");
			gameId = 1;
		}
		gameInfo.setId(gameId);
		gameRoomDao.insertGameInfo(gameInfo, teamId);
	}
	
//	//teamparticipate를 위한 추가사항
//	public void insertJoinGame(TeamParticipate teamParticipate, int teamId) {
//		int gameId;
//		try {
//			gameId = GameRoomDao.getMaxGameId() + 1;
//		} catch (NullPointerException e) {
//			System.err.println("최초 입력입니다.");
//			System.err.println("game id로 1 입력.");
//			gameId = 1;
//		}
//		teamParticipate.setTeamId(teamId);
//		gameRoomDao.insertJoinGame(teamParticipate, teamId);
//	}
}
