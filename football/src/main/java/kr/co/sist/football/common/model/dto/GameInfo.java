package kr.co.sist.football.common.model.dto;

import java.util.Date;

public class GameInfo {
	private int id;
	private int statusCode;
	private int maxPersonNum;
	private int kind;
	private Date gameDate;
	private int duration;
	private String description;
	private int maxTeamNum;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public int getMaxPersonNum() {
		return maxPersonNum;
	}
	public void setMaxPersonNum(int maxPersonNum) {
		this.maxPersonNum = maxPersonNum;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public Date getGameDate() {
		return gameDate;
	}
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMaxTeamNum() {
		return maxTeamNum;
	}
	public void setMaxTeamNum(int maxTeamNum) {
		this.maxTeamNum = maxTeamNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GameInfo [id=" + id + ", statusCode=" + statusCode + ", maxPersonNum=" + maxPersonNum + ", kind=" + kind
				+ ", gameDate=" + gameDate + ", duration=" + duration + ", description=" + description + ", maxTeamNum="
				+ maxTeamNum + ", name=" + name + "]";
	}
	

	



	

}
