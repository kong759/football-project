package kr.co.sist.football.test.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.config.MybatisConnector;


@Repository
public class GameDao {
	
	private final String namespace = "mybatis.mappers.GameMapper";
	
	public MybatisConnector mybatisconnector;
	

	public GameDao() {
	}

	@Autowired
	public GameDao(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}
	//AutoWired를 생성자 형식으로 해 놓으면 더 괜찮다고 해놔서 이렇게 해놓은거임 
	
	public void test() throws Exception {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			System.out.println(sqlSession.selectList(namespace + ".test"));
		} finally {
			sqlSession.close();
		}
	}
}
