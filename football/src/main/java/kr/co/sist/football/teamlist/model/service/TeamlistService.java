package kr.co.sist.football.teamlist.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.teamlist.model.dao.TeamListDAO;
import kr.co.sist.football.teamlist.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dto.Teamlist;

@Service
public class TeamlistService implements kr.co.sist.football.teamlist.model.service.Service {

	private TeamListDAO teamListDAO;

	@Autowired
	private TeamlistService(TeamListDAO teamListDAO) {
		this.teamListDAO = teamListDAO;
	}


	@Override
	public void insertTeamInfo(TeamInfo teamListDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTeamCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Teamlist getTeamList() {
		Teamlist teamlist = new Teamlist();
		teamlist.setTeamCount(teamListDAO.getTeamCount());
		teamlist.setTeamInfos(teamListDAO.getTeamList());

		return teamlist;
		
	}

	@Override
	public void getTeamInfo(int teamId) {
		// TODO Auto-generated method stub
		
	}

}
