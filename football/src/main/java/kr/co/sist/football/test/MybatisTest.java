package kr.co.sist.football.test;

import org.apache.ibatis.session.SqlSession;

import mybatis.MybatisConnector;

public class MybatisTest {

	MybatisConnector mybatisconnector;

	private final String namespace = "mybatis.myBatisTest";

	public MybatisTest() {
	}

	public MybatisTest(MybatisConnector mybatisconnector) {
		this.mybatisconnector = mybatisconnector;
	}

	public void test() throws Exception {
		SqlSession sqlSession = mybatisconnector.sqlSession();

		try {

			System.out.println(sqlSession.selectList(namespace + ".test").get(0).toString());

		} finally {
			sqlSession.close();
		}
	}

	public static void main(String[] args) throws Exception {
		MybatisTest test = new MybatisTest(new MybatisConnector("orcale"));

		test.test();

	}

}
