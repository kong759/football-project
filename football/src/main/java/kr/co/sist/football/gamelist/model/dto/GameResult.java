package kr.co.sist.football.gamelist.model.dto;

public class GameResult {
private int gameId;
private int teamId;
private int memberId;
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
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
@Override
public String toString() {
	return "GameResult [gameId=" + gameId + ", teamId=" + teamId + ", memberId=" + memberId + "]";
}
 

}
