package kr.co.sist.football.teamlist.model.dto;

public class TeamlistCondition {
	private String location;
	private int presentNum;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPresentNum() {
		return presentNum;
	}

	public void setPresentNum(int presentNum) {
		this.presentNum = presentNum;
	}

	@Override
	public String toString() {
		return "TeamlistCondition [location=" + location + ", presentNum=" + presentNum + "]";
	}

}
