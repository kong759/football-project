package kr.co.sist.football.test.model.dto;

import java.util.List;

public class GameInfoByMonth {
	private int gameCount;
	private List<GameInfo> gameInfo;

	public int getGameCount() {
		return gameCount;
	}

	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}

	public List<GameInfo> getGameInfo() {
		return gameInfo;
	}

	public void setGameInfo(List<GameInfo> gameInfo) {
		this.gameInfo = gameInfo;
	}

	@Override
	public String toString() {
		return "GameInfoByDate [gameCount=" + gameCount + ", gameInfo=" + gameInfo + "]";
	}

}
