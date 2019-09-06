package kr.co.sist.football.member.model.service;

import kr.co.sist.football.member.model.dto.MemberDTO;

public interface MemberService {
	void insertMemberInfo(MemberDTO memberDTO);
	int userCheck(String id, String password);
}
