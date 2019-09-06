package kr.co.sist.football.gamelist.model.dto;

public class gameRound {
private int id;
private int gameId;
private int teamId;
private int score;
private int roundNum;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getGameId() {
	return gameId;
}
public void setGameId(int gameId) {
	this.gameId = gameId;
}
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getRoundNum() {
	return roundNum;
}
public void setRoundNum(int roundNum) {
	this.roundNum = roundNum;
}

@Override
public String toString() {
	return "gameRound [id=" + id + ", gameId=" + gameId + ", teamId=" + teamId + ", score=" + score + ", roundNum="
			+ roundNum + "]";
}

}
