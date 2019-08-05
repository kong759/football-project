package com.dae.football.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MySqlConnectionTest {
public static void main(String[] args) {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("/db-context.xml");
	SqlSessionFactory sqlSessionFactory=ctx.getBean(SqlSessionFactory.class);
	System.out.println(sqlSessionFactory.toString());
	
	SqlSession session = sqlSessionFactory.openSession();
	
	System.out.println(session);
	
}
}
