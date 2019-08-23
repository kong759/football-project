package kr.co.sist.football.TeamList.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.TeamList.model.dto.TeamListDTO;
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

	//팀 가입할 떄 insert 넣는 메소드
	public int insertTeamInfo()  {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		TeamListDTO teamListDTO = new TeamListDTO();

		/*값 삽입을 위하여 임의로 삽입
		 * teamListDTO.setId(4); teamListDTO.setLocation("a");
		 * teamListDTO.setLogo_path("b"); teamListDTO.setMax_num(2);
		 * teamListDTO.setName("c"); teamListDTO.setPresent_num(3);
		 * teamListDTO.setStrength_code(4); teamListDTO.setUniform_color_code(5);
		 * teamListDTO.setFormation("d");
		 */
		
		try {
			int insertTeam = sqlSession.insert(namespace+".insertTeamInfo",teamListDTO);
			System.out.println(insertTeam);
			return insertTeam; 
		} finally {
			sqlSession.close();
		}
	}
	//모든 팀 정보를 뽑아오는 메소드
	public List<TeamListDTO> selectTeamList()  {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		
		try {
			List<TeamListDTO> insertTeam = sqlSession.selectList(namespace+".pushTeaminfo");
			System.out.println(insertTeam);
			return insertTeam; 
		} finally {
			sqlSession.close();
		}
	}
	//특정 팀 정보를 뽑아오는 메소드
	public List<TeamListDTO> clickTeam()  {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		TeamListDTO teamListDTO = new TeamListDTO();
		int num=3;
		
		teamListDTO.setId(num);

		try {
			List<TeamListDTO> clickTeam = sqlSession.selectList(namespace+".clickTeaminfo");
			System.out.println(clickTeam);
			return clickTeam; 
		} finally {
			sqlSession.close();
		}
	}
}
