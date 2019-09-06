package kr.co.sist.football.gameschedule.model.dto;

public class GameCount {
	String gamedate;
	int count;
	
	public String getGamedate() {
		return gamedate;
	}
	public void setGamedate(String gamedate) {
		this.gamedate = gamedate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "GameCount [gamedate=" + gamedate + ", count=" + count + "]";
	}
	
	
}
