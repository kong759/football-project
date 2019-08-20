package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

public class MybatisConnector {
	String resource;
	String dbName;

	public MybatisConnector() {
	}

	public MybatisConnector(String dbName) {
		this.resource = "mybatis-context.xml";
		this.dbName = dbName;
	}

	public SqlSession sqlSession() {
		// String resource = "mybatis/mybatis-configMysql2.xml";
		
 
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e);
		}
		return new SqlSessionFactoryBuilder().build(inputStream).openSession();
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

}
