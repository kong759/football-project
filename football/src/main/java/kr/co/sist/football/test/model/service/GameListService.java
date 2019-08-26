package kr.co.sist.football.test.model.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import kr.co.sist.football.test.model.dao.GameListDao;
import mybatis.config.MybatisConnector;


@Service
public class GameListService {

	private final String namespace = "mybatis.mappers.GameListMapper";
	@Autowired
	public MybatisConnector mybatisConnector;

//	public int getArticleCount(String boardid) throws Exception {
//		SqlSession sqlSession = mybatisConnector.sqlSession();
//		System.out.println("getArticleCount===old");
//		try {
//			return sqlSession.selectOne(namespace + ".getArticleCount", boardid);
//		} finally {
//			sqlSession.close();
//		}
//	}

	
	
	public List gamelistTeaminfo(String name) throws Exception {
		SqlSession sqlSession = mybatisConnector.sqlSession();
		System.out.println("gamelistTeaminfo===old");
		HashMap map = new HashMap();
		map.put("name", name);
		try {
			return ;
		} finally {
			sqlSession.close();
		}
	}

//	public int updateArticle(GameListDao article, String boardid) throws Exception {
//		SqlSession sqlSession = mybatisConnector.sqlSession();
//		HashMap map = new HashMap();
//		map.put("num", article.getNum());
//		int x = -1;
//		try {
//			String dbpasswd = (String) sqlSession.selectOne(namespace + ".update_passwd", map);
//			if (dbpasswd.equals(article.getPasswd())) {
//				x = sqlSession.update(namespace + ".update_update", article);
//			}
//		} finally {
//			sqlSession.commit();
//			sqlSession.close();
//		}
//		return x;
//	}
	
}
