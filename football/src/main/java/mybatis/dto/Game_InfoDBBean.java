package mybatis.dto;

import java.util.Date;

public class Game_InfoDBBean {
	
	private String id;
	private int status_code;
	private int max_person_num;
	private int kind;
	private Date game_date;
	private int duration;
	private String description;
	private int maxinum_team;
	
	public Game_InfoDBBean() {
	}
	
	
	

	public Game_InfoDBBean(String id, int status_code, int max_person_num, int kind, Date game_date, int duration,
			String description, int maxinum_team) {
		super();
		this.id = id;
		this.status_code = status_code;
		this.max_person_num = max_person_num;
		this.kind = kind;
		this.game_date = game_date;
		this.duration = duration;
		this.description = description;
		this.maxinum_team = maxinum_team;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public int getStatus_code() {
		return status_code;
	}




	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}




	public int getMax_person_num() {
		return max_person_num;
	}




	public void setMax_person_num(int max_person_num) {
		this.max_person_num = max_person_num;
	}




	public int getKind() {
		return kind;
	}




	public void setKind(int kind) {
		this.kind = kind;
	}




	public Date getGame_date() {
		return game_date;
	}




	public void setGame_date(Date game_date) {
		this.game_date = game_date;
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




	public int getMaxinum_team() {
		return maxinum_team;
	}




	public void setMaxinum_team(int maxinum_team) {
		this.maxinum_team = maxinum_team;
	}



	@Override
	public String toString() {
		return "Game_InfoDBBeanMybatis [id=" + id + ", status_code=" + status_code + ", max_person_num="
				+ max_person_num + ", kind=" + kind + ", game_date=" + game_date + ", duration=" + duration
				+ ", description=" + description + ", maxinum_team=" + maxinum_team + "]";
	}
	
}
//game-info
//id, status_code, max_person_num, kind, game_dat ,duration, description, maximum_team