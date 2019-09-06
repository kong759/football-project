package kr.co.sist.football.gameschedule.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sist.football.common.model.dto.GameInfo;
import kr.co.sist.football.gameschedule.model.dto.GameCount;
import mybatis.config.MybatisConnector;

@Repository
public class GameDao {

	private final String namespace = "mybatis.mappers.GameMapper";

	public MybatisConnector mybatisConnector;

	public GameDao() {
	}

	@Autowired
	public GameDao(MybatisConnector mybatisConnector) {
		System.out.println(mybatisConnector.toString());
		this.mybatisConnector = mybatisConnector;
	}

	/*public List<GameInfo> getGamesByDate(int month, int kind) {
		SqlSession sqlSession = mybatisConnector.sqlSession();
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("kind", kind);
		map.put("month", month);

		try {
			return sqlSession.selectList("mybatis.mappers.GameMapper.selectGamesByDate", map);
		} catch (RuntimeException e) {
			System.err.println("========================");
			System.err.println("=====날짜를 입력해주세요=====");
			System.err.println("========================");
			return null;
		} finally {

			sqlSession.close();
		}*/
	
	public List<GameCount> getGameCount(){
		SqlSession sqlSession = mybatisConnector.sqlSession();
		try {
			List<GameCount> scheduleMap = sqlSession.selectList(namespace + ".selectGameCount");
			return scheduleMap;
		} finally {
			sqlSession.close();
		}
	
	}
	
	public List<GameInfo> getGameInfo(String gamedate) {
		SqlSession sqlSession = mybatisConnector.sqlSession();
		try {
			List<GameInfo> gameList = sqlSession.selectList(namespace + ".selectGamesByDate", gamedate);
			System.out.println("dao" + gameList);
			return gameList;
		} finally {
			sqlSession.close();
		}
	}

}
