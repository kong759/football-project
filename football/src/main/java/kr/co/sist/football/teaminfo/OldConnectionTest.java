package kr.co.sist.football.teaminfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OldConnectionTest {
	private static String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String dbUser = "admin";
	private static String dbpasswd = "1111";

	public static void main(String[] args) {
		getRole();
	}

	public static void getRole() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			System.out.println(conn.toString());
			String sql = "SELECT * FROM test";
			ps = conn.prepareStatement(sql);

			System.out.println(ps.toString());
			rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println(rs.toString());
			}
		} catch (Exception e) {
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
