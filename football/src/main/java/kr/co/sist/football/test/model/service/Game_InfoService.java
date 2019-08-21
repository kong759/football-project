package kr.co.sist.football.test.model.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.test.model.dto.Game_InfoDBBean;
import mybatis.config.MybatisConnector;

@Service
public class Game_InfoService {

	//GameMapper.xml에 namespace존재
	private final String namespace = "mybatis.mappers.GameMapper";

	public MybatisConnector mybatisConnector;


	public Game_InfoService() {
	}

	@Autowired
	public Game_InfoService(MybatisConnector mybatisConnector) {
		this.mybatisConnector = mybatisConnector;
	}

	public int getGameCount(int kind) throws Exception {
		SqlSession sqlSession = mybatisConnector.sqlSession();
		System.out.println("getGameCount===old");
		try {
			return sqlSession.selectOne(namespace + ".getGameCount", kind);
		} finally {
			sqlSession.close();
		}
	}

	public List<Game_InfoDBBean> getGamesByDate(String game_date, int kind) throws Exception {
		SqlSession sqlSession = mybatisConnector.sqlSession();
		System.out.println("getGamesByDate===old");

		HashMap map = new HashMap();
		map.put("game_date", game_date);
		map.put("kind", kind);

		try {
			return sqlSession.selectList(namespace + ".getGamesByDate",map);
		} finally {
			sqlSession.close();
		}
	}


}
