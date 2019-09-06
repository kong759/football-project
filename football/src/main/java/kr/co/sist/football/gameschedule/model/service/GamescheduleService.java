package kr.co.sist.football.gameschedule.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.common.model.dto.GameInfo;
import kr.co.sist.football.gameschedule.model.dao.GameDao;
import kr.co.sist.football.gameschedule.model.dto.GameCount;

@Service
public class GamescheduleService {

	private GameDao gameDao;

	@Autowired
	private GamescheduleService(GameDao gameDao) {
		this.gameDao = gameDao;
	}

	/*
	 * public GameInfoByMonth getGameInfo(int month, int kind) { GameInfoByMonth
	 * gameInfoByMonth = new GameInfoByMonth(); List<GameInfo> gameInfo =
	 * gameDao.getGamesByDate(month, kind); int gameCount =
	 * gameDao.getGameCount(kind);
	 * 
	 * gameInfoByMonth.setGameInfo(gameInfo);
	 * gameInfoByMonth.setGameCount(gameCount);
	 * 
	 * return gameInfoByMonth; }
	 */
	
	public List<GameCount> getGameCount(){
		List<GameCount> scheduleMap = gameDao.getGameCount();
		return scheduleMap;
	}
	
	public List<GameInfo> getGameInfo(String gamedate) {
		List<GameInfo> gamelist = gameDao.getGameInfo(gamedate);
		System.out.println("asd"+gamelist);
		
		return gamelist;
	}
}
