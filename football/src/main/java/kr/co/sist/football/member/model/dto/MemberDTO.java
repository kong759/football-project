package kr.co.sist.football.member.model.dto;


public class MemberDTO {
	private String id;
	private int teamId;
	private String name;
	private String nickname;
	private String password;
	private String birthday;
	private int tel;
	private String position;
	private int mannerscore;
	private String picPath;
	private int footCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getMannerscore() {
		return mannerscore;
	}
	public void setMannerscore(int mannerscore) {
		this.mannerscore = mannerscore;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public int getFootCode() {
		return footCode;
	}
	public void setFootCode(int footCode) {
		this.footCode = footCode;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", teamId=" + teamId + ", name=" + name + ", nickname=" + nickname
				+ ", password=" + password + ", birthday=" + birthday + ", tel=" + tel + ", position=" + position
				+ ", mannerscore=" + mannerscore + ", picPath=" + picPath + ", footCode=" + footCode + "]";
	}
	
}
