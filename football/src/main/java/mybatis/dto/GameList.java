package mybatis.dto;

import org.apache.ibatis.type.Alias;


public class GameList {
  
	private String name;
	private String logo_path;
	private int max_num;
	private int present_num;
	private int uniform_color_code;
	private String location;
	private String formation;
    private int strength_code;
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
	public int getMax_num() {
		return max_num;
	}
	public void setMax_num(int max_num) {
		this.max_num = max_num;
	}
	public int getPresent_num() {
		return present_num;
	}
	public void setPresent_num(int present_num) {
		this.present_num = present_num;
	}
	public int getUniform_color_code() {
		return uniform_color_code;
	}
	public void setUniform_color_code(int uniform_color_code) {
		this.uniform_color_code = uniform_color_code;
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
	public int getStrength_code() {
		return strength_code;
	}
	public void setStrength_code(int strength_code) {
		this.strength_code = strength_code;
	}
	@Override
	public String toString() {
		return "gameList [name=" + name + ", logo_path=" + logo_path + ", max_num=" + max_num + ", present_num="
				+ present_num + ", uniform_color_code=" + uniform_color_code + ", location=" + location + ", formation="
				+ formation + ", strength_code=" + strength_code + "]";
	}
	
	
	
}
