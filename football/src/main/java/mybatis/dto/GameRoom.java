package mybatis.dto;

import org.apache.ibatis.type.Alias;


public class GameRoom {
  
	private String id;
	private String team_name;
	private int game_date;
	private int duration;
	private String location_name;
	private String location_location;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getGame_date() {
		return game_date;
	}
	public void setGame_date(int game_date) {
		this.game_date = game_date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getLocation_location() {
		return location_location;
	}
	public void setLocation_location(String location_location) {
		this.location_location = location_location;
	}
	
	@Override
	public String toString() {
		return "GameRoom [id=" + id + ", team_name=" + team_name + ", game_date=" + game_date + ", duration=" + duration
				+ ", location_name=" + location_name + ", location_location=" + location_location + "]";
	}

}
