package kr.co.sist.football.member.model.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.sist.football.member.model.dao.MemberDAO;
import kr.co.sist.football.member.model.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{

	private MemberDAO memberDAO;

	@Autowired
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public void insertMemberInfo(MemberDTO memberDTO) {
		int teamId;

		try {
			teamId = memberDAO.getMaxTeamId();
		} catch (NullPointerException e) {
			System.err.println("0으로 최초 입력합니다.");
			teamId = 0;
		}
		memberDTO.setTeamId(teamId);
		
		memberDAO.insertMemberInfo(memberDTO);
	}

	@Override
	public int userCheck(String id, String password) {
		int x= memberDAO.userCheck(id, password);
		return x;
		
	}

}
