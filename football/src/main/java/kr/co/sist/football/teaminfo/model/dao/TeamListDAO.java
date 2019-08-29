package kr.co.sist.football.teaminfo.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.teaminfo.model.dto.TeamListDTO;
import mybatis.config.MybatisConnector;


@Repository
public class TeamListDAO {
	public MybatisConnector mybatisconnector;

	private final String namespace = "mybatis.mappers.TeamListMapper";

	public TeamListDAO() {}

	@Autowired//나중에 꼴리면 MybatisConnector mybatisconnector로 @Autowired 하든가 말든가
	public TeamListDAO(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

	//팀 가입할 떄 insert 넣는 메소드 ex)쿼리문을 처리하기 위하여 매개변수 지정
	public int insertTeamInfo(TeamListDTO teamListDTO)  {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		
		try {
			int insertTeamResult = sqlSession.insert(namespace+".insertTeamInfo",teamListDTO);
			return insertTeamResult; 
		} finally {
			sqlSession.close();
		}
	}
	//모든 팀 count를 뽑아오는 메소드
		public List<TeamListDTO> getTeamCount()  {
			SqlSession sqlSession = mybatisconnector.sqlSession();
			
			try {
				List<TeamListDTO> getTeamCount = sqlSession.selectList(namespace+".getTeamCount");
				return getTeamCount; 
			} finally {
				sqlSession.close();
			}
		}
	//모든 팀 정보를 뽑아오는 메소드
	public List<TeamListDTO> selectAllTeamList()  {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		
		try {
			List<TeamListDTO> selectAllTeamList = sqlSession.selectList(namespace+".selectAllTeaminfo");
			return selectAllTeamList; 
		} finally {
			sqlSession.close();
		}
	}
	//특정 팀 정보를 뽑아오는 메소드
	public List<TeamListDTO> selectOneTeam()  {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		TeamListDTO teamListDTO = new TeamListDTO();
		int num=3;
		
		teamListDTO.setId(num);

		try {
			List<TeamListDTO> selectOneTeamList = sqlSession.selectList(namespace+".selectOneTeaminfo");
			return selectOneTeamList; 
		} finally {
			sqlSession.close();
		}
	}
}
