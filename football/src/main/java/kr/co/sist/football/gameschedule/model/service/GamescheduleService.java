package kr.co.sist.football.gameschedule.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.gameschedule.model.dao.GameDao;
import kr.co.sist.football.gameschedule.model.dto.GameInfo;
import kr.co.sist.football.gameschedule.model.dto.GameInfoByMonth;

@Service
public class GamescheduleService {

	GameDao gameDao;

	@Autowired
	public GamescheduleService(GameDao gameDao) {
		this.gameDao = gameDao;
	}

	public GameInfoByMonth getGameInfo(int kind, String month) {
		GameInfoByMonth gameInfoByMonth = new GameInfoByMonth();
		List<GameInfo> gameInfos = gameDao.getGamesByDate(month, kind);
		int gameCount = gameDao.getGameCount(kind);
		
		gameInfoByMonth.setGameInfo(gameInfos);
		gameInfoByMonth.setGameCount(gameCount);
		
		return gameInfoByMonth;
	}

}
