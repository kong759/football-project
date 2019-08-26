package kr.co.sist.football.test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.config.MybatisConnector;

public class MybatisTest {

	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
	private final String namespace = "mybatis.mappers.GameListMapper";
	MybatisConnector mybatisconnector = ctx.getBean(MybatisConnector.class);

	public MybatisTest() {
	}

	public MybatisTest(MybatisConnector mybatisconnector) {
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

	
	  public void game() throws Exception { SqlSession sqlSession =
	  mybatisconnector.sqlSession();
	  
	  try { System.out.println(sqlSession.selectList(namespace +
	  ".gamelistTeaminfo")); } finally { sqlSession.close(); } }
	 
	
//	public void gameroom() throws Exception {
//		SqlSession sqlSession = mybatisconnector.sqlSession();
//
//		try {
//			System.out.println(sqlSession.selectList(namespace + ".gameroomteaminfo"));
//		} finally {
//			sqlSession.close();
//		}
//	}


	public static void main(String[] args) throws Exception {
		MybatisTest test = new MybatisTest();

		test.game();

	}

}
