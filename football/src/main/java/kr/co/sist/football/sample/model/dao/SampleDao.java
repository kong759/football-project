package kr.co.sist.football.sample.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.config.MybatisConnector;

@Repository
public class SampleDao {
	public MybatisConnector mybatisconnector;
	
	private final String namespace = "mybatis.mappers.TestMapper";

	public SampleDao() {
	}

	@Autowired
	public SampleDao(MybatisConnector mybatisconnector) {
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
