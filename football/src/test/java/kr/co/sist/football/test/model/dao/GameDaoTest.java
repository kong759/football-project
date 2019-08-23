package kr.co.sist.football.test.model.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.config.MybatisConnector;

public class GameDaoTest {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
	MybatisConnector mybatisconnector = ctx.getBean(MybatisConnector.class);

	@Test
	public void testGameDao() {
	}

	@Test
	public void testGameDaoMybatisConnector() {
	}

	@Test
	public void testGetGameCount() {
		SqlSession sqlSession = mybatisconnector.sqlSession();
		sqlSession.selectOne("mybatis.mappers.GameMapper.selectGameCount",0);
	}	

	@Test
	public void testGetGamesByDate() {
//		dao.getGamesByDate("08", 0);

		SqlSession sqlSession = mybatisconnector.sqlSession();

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("kind", 0);
		map.put("month", "08");

		try {
			System.out.println(sqlSession.selectList("mybatis.mappers.GameMapper.selectGamesByDate", map));
			Date date = sqlSession.selectOne("mybatis.mappers.GameMapper.dateTest");
			System.out.println(date);

		} finally {
			sqlSession.close();
		}
	}

}
