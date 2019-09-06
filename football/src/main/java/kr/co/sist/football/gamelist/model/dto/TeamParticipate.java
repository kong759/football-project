package kr.co.sist.football.gamelist.model.dto;

public class TeamParticipate {
 private int gameId;
 private int teamId;
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
@Override
public String toString() {
	return "TeamParticipate [gameId=" + gameId + ", teamId=" + teamId + "]";
}
 
 
}
