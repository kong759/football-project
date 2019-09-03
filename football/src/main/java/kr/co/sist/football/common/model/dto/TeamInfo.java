package kr.co.sist.football.common.model.dto;

public class TeamInfo {
	private int id;
	private String name;
	private int presentNum;
	private int maxNum;
	private int uniformColorCode;
	private int strengthCode;
	private String logoPath;
	private String location;
	private String formation;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPresentNum() {
		return presentNum;
	}
	public void setPresentNum(int presentNum) {
		this.presentNum = presentNum;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getUniformColorCode() {
		return uniformColorCode;
	}
	public void setUniformColorCode(int uniformColorCode) {
		this.uniformColorCode = uniformColorCode;
	}
	public int getStrengthCode() {
		return strengthCode;
	}
	public void setStrengthCode(int strengthCode) {
		this.strengthCode = strengthCode;
	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "TeamInfo [id=" + id + ", name=" + name + ", presentNum=" + presentNum + ", maxNum=" + maxNum
				+ ", uniformColorCode=" + uniformColorCode + ", strengthCode=" + strengthCode + ", logoPath=" + logoPath
				+ ", location=" + location + ", formation=" + formation + ", description=" + description + "]";
	}
	
}
