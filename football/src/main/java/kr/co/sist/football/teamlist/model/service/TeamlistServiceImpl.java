package kr.co.sist.football.teamlist.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.common.model.dto.TeamInfo;
import kr.co.sist.football.teamlist.model.dao.TeamListDAO;
import kr.co.sist.football.teamlist.model.dto.Teamlist;
import kr.co.sist.football.teamlist.model.dto.TeamlistCondition;

@Service
public class TeamlistServiceImpl implements kr.co.sist.football.teamlist.model.service.TeamlistService {

	private TeamListDAO teamListDAO;

	@Autowired
	private TeamlistServiceImpl(TeamListDAO teamListDAO) {
		this.teamListDAO = teamListDAO;
	}

	@Override
	public void insertTeamInfo(TeamInfo teamInfo) {
		int teamId;
		int presentNum;
		
		try {
			teamId = teamListDAO.getMaxTeamId() + 1;
//			presentNum = teamListDAO.getMaxPresentNum();
//			System.out.println(presentNum);
			
		} catch (NullPointerException e) {
			System.err.println("presentNum 1 입력입니다.");
			System.err.println("team id로 1 입력.");
//			presentNum = 0;
			teamId = 1;
		}

		teamInfo.setId(teamId);
//		teamInfo.setPresentNum(presentNum);

		teamListDAO.insertTeamInfo(teamInfo);
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
		System.out.println("");
	}

	@Override
	public Teamlist getTeamListByCondition(TeamlistCondition teamlistCondition, int recruitCode) {
		Teamlist teamlist = new Teamlist();
		teamlist.setTeamCount(teamListDAO.getTeamCount());
		
		if (recruitCode == ONGOING) {
			teamlist.setTeamInfos(teamListDAO.getTeamListByCondition(teamlistCondition));
			System.out.println(teamlist.getTeamInfos());
		}
		if (recruitCode == DONE) {
			teamlist.setTeamInfos(teamListDAO.getTeamListByConditionRecruitDone(teamlistCondition));
		}
		return teamlist;
	}

}