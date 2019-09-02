package kr.co.sist.football.teamlist.model.service;

import kr.co.sist.football.teamlist.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dto.Teamlist;

public interface Service {
	void insertTeamInfo(TeamInfo teamListDTO);
	void getTeamCount();
	Teamlist getTeamList();
	void getTeamInfo(int teamId);
}
