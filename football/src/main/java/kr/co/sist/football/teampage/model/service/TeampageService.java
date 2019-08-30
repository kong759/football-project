package kr.co.sist.football.teampage.model.service;

import java.awt.List;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.teampage.model.dao.TeampageDAO;
import kr.co.sist.football.teampage.model.dto.TeampageDTO;
import mybatis.config.MybatisConnector;

@Service
public class TeampageService {

	TeampageDAO teampageDAO;

	@Autowired
	public void teampageService(TeampageDAO teampageDAO) {
		this.teampageDAO = teampageDAO;
	}

	public int updateTeamId(int memberId, int teamId) {
		int statusCode;

		if (selectCountTeamMember(teamId) > 100) {
			System.out.print("정원 초과했습니다");
			return statusCode;
		}

		updateTeamId(memberId, teamId);
	}
}
