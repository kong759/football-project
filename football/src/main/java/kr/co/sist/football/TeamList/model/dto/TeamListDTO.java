package kr.co.sist.football.TeamList.model.dto;

public class TeamListDTO {
	private int id;
	private String name;
	private String logo_path;
	private int present_num;
	private int max_num;
	private int uniform_color_code;
	private int strength_code;
	private String location;
	private String formation;
	
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
	public String getLogo_path() {
		return logo_path;
	}
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	public int getPresent_num() {
		return present_num;
	}
	public void setPresent_num(int present_num) {
		this.present_num = present_num;
	}
	public int getMax_num() {
		return max_num;
	}
	public void setMax_num(int max_num) {
		this.max_num = max_num;
	}
	public int getUniform_color_code() {
		return uniform_color_code;
	}
	public void setUniform_color_code(int uniform_color_code) {
		this.uniform_color_code = uniform_color_code;
	}
	public int getStrength_code() {
		return strength_code;
	}
	public void setStrength_code(int strength_code) {
		this.strength_code = strength_code;
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
	
	@Override
	public String toString() {
		return "TeamList [id=" + id + ", name=" + name + ", logo_path=" + logo_path + ", present_num=" + present_num
				+ ", max_num=" + max_num + ", uniform_color_code=" + uniform_color_code + ", strength_code="
				+ strength_code + ", location=" + location + ", formation=" + formation + "]";
	}
}
