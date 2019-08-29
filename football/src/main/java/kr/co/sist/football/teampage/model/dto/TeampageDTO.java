package kr.co.sist.football.teampage.model.dto;

import org.apache.ibatis.type.Alias;

@Alias("teamId")
public class TeampageDTO {
	/*
	 * private int id; private int team_id; private String nick_name; private int
	 * manner_score; private String pic_path; private int foot_code; private String
	 * name; private String email; private String password; private int tel; private
	 * String position; private Timestamp birthday; public int getId() { return id;
	 * } public void setId(int id) { this.id = id; } public int getTeam_id() {
	 * return team_id; } public void setTeam_id(int team_id) { this.team_id =
	 * team_id; } public String getNick_name() { return nick_name; } public void
	 * setNick_name(String nick_name) { this.nick_name = nick_name; } public int
	 * getManner_score() { return manner_score; } public void setManner_score(int
	 * manner_score) { this.manner_score = manner_score; } public String
	 * getPic_path() { return pic_path; } public void setPic_path(String pic_path) {
	 * this.pic_path = pic_path; } public int getFoot_code() { return foot_code; }
	 * public void setFoot_code(int foot_code) { this.foot_code = foot_code; }
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getEmail() { return email; } public void
	 * setEmail(String email) { this.email = email; } public String getPassword() {
	 * return password; } public void setPassword(String password) { this.password =
	 * password; } public int getTel() { return tel; } public void setTel(int tel) {
	 * this.tel = tel; } public String getPosition() { return position; } public
	 * void setPosition(String position) { this.position = position; } public
	 * Timestamp getBirthday() { return birthday; } public void
	 * setBirthday(Timestamp birthday) { this.birthday = birthday; }
	 * 
	 * @Override public String toString() { return "TeampageDTO [id=" + id +
	 * ", team_id=" + team_id + ", nick_name=" + nick_name + ", manner_score=" +
	 * manner_score + ", pic_path=" + pic_path + ", foot_code=" + foot_code +
	 * ", name=" + name + ", email=" + email + ", password=" + password + ", tel=" +
	 * tel + ", position=" + position + ", birthday=" + birthday + "]"; }
	 */

	private int teamId;
	private int id;
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "TeampageDTO [teamId=" + teamId + ", id=" + id + "]";
	}

}
