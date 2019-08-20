package kr.co.sist.football.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class OracleConnectionTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("/db-config.xml");
		sessionTest(ctx);
		connectionTest(ctx);

	}

	private static void sessionTest(GenericXmlApplicationContext ctx) {
		SqlSessionFactory sqlSessionFactory = ctx.getBean(SqlSessionFactory.class);
		System.out.println(sqlSessionFactory.toString());

		SqlSession session = sqlSessionFactory.openSession();

		System.out.println(session);
	}

	private static void connectionTest(GenericXmlApplicationContext ctx) {
		DataSource ds = ctx.getBean(DataSource.class);
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement("SELECT * FROM TEST");
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.toString());
				System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
