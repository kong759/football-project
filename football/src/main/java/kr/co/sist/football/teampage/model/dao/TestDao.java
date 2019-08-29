package kr.co.sist.football.teampage.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.config.MybatisConnector;

@Repository
public class TestDao {
	public MybatisConnector mybatisconnector;
	
	private final String namespace = "mybatis.mappers.TestMapper";

	public TestDao() {
	}

	@Autowired
	public TestDao(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}
	
	public void test() throws Exception {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {
			System.out.println(sqlSession.selectList(namespace + ".test"));
		} finally {
			sqlSession.close();
		}
	}
}
