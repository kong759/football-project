package kr.co.sist.football.teamlist.model.service;

import kr.co.sist.football.common.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dto.Teamlist;
import kr.co.sist.football.teamlist.model.dto.TeamlistCondition;

public interface TeamlistService {
	static final int ONGOING = 1;
	static final int DONE = 0;
	void insertTeamInfo(TeamInfo teamListDTO);
	void getTeamCount();
	Teamlist getTeamList();
	Teamlist getTeamListByCondition(TeamlistCondition teamlistCondition, int recruitCode);
	void getTeamInfo(int teamId);
}
