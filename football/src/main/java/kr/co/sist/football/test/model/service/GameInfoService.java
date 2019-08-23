package kr.co.sist.football.test.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.test.model.dao.GameDao;
import kr.co.sist.football.test.model.dto.GameInfo;
import kr.co.sist.football.test.model.dto.GameInfoByMonth;

@Service
public class GameInfoService {

	GameDao gameDao;

	@Autowired
	public GameInfoService(GameDao gameDao) {
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
