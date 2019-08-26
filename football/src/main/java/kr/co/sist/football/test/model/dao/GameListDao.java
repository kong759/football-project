package kr.co.sist.football.test.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.config.MybatisConnector;

@Repository
public class GameListDao {
	public MybatisConnector mybatisconnector;
	
	private final String namespace = "mybatis.mappers.GameListMapper";

	public GameListDao() {
		
		
	}

	@Autowired
	public GameListDao(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}
	
	public void game() throws Exception {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			System.out.println(sqlSession.selectList(namespace + ".gamelistTeaminfo"));
		} finally {
			sqlSession.close();
		}
	}
}