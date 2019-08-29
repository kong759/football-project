package kr.co.sist.football.teaminfo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.teaminfo.model.dao.TeamListDAO;
import kr.co.sist.football.teaminfo.model.dto.TeamListDTO;

@Service
public class TeamListService {
	
	TeamListDAO teamListDAO;
	
	@Autowired
	public void TeamListService(TeamListDAO teamListDAO) {
		this.teamListDAO = teamListDAO;
	}
	
	public List<TeamListDTO> getTeamCount() {
		List<TeamListDTO> count = teamListDAO.getTeamCount();
		return count;
		
	}
	public TeamListDTO selectAllTeamList(TeamListDTO teamListDTO) {
		return teamListDTO;
		
	}
	public TeamListDTO selectOneTeamList(int num) {
		TeamListDTO dto = teamListDAO.
		return dto;
		
	}

}
