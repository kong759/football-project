package kr.co.sist.football.member.model.dao;

 import java.util.HashMap;

 import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 import kr.co.sist.football.member.model.dto.MemberDTO;
import mybatis.config.MybatisConnector;

 @Repository
public class MemberDAO {
	public MybatisConnector mybatisconnector;

 	private final String namespace = "mybatis.mappers.MemberMapper";

 	public MemberDAO() {
	}
	@Autowired
	public MemberDAO(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

 	// 회원가입 가입할 떄 insert 넣는 메소드 ex)쿼리문을 처리하기 위하여 매개변수 지정
	public int insertMemberInfo(MemberDTO memberDTO) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		System.out.println(memberDTO);
		try {
			int insertMemberResult = sqlSession.insert(namespace + ".insertMemberInfo", memberDTO);
			return insertMemberResult;
		} finally {
			sqlSession.close();
		}
	}

 	public int getMaxTeamId() {

 		Integer maxTeamId = mybatisconnector.sqlSession().selectOne(namespace + ".selectMemberTeamId");

 		return maxTeamId;
	}

 	public int userCheck(String id, String password) {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		int x = -1;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		try {
			String userCheck = sqlSession.selectOne(namespace + ".passwordCheck",map);
			if(userCheck.equals(password)) {
				x = 1;
				return x;
			} else {
				x = 0;
				return x;
			}
		} finally {
			sqlSession.close();
		}
	}

 }