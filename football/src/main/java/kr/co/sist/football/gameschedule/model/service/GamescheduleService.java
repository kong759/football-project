package kr.co.sist.football.gameschedule.model.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sist.football.gameschedule.model.dao.GameDao;
import kr.co.sist.football.gameschedule.model.dto.GameCalendar;
import kr.co.sist.football.gameschedule.model.dto.GameInfo;
import kr.co.sist.football.gameschedule.model.dto.GameInfoByMonth;

@Service
public class GamescheduleService {

	private GameDao gameDao;

	private static final int YEAR_TODAY = Calendar.YEAR;
	private static final int MONTH_TODAY = Calendar.MONTH;
	private static final int DATE_TODAY = Calendar.DATE;

	@Autowired
	private GamescheduleService(GameDao gameDao) {
		this.gameDao = gameDao;
	}

	public GameInfoByMonth getGameInfo(int month, int kind) {
		GameInfoByMonth gameInfoByMonth = new GameInfoByMonth();
		List<GameInfo> gameInfos = gameDao.getGamesByDate(month, kind);
		int gameCount = gameDao.getGameCount(kind);

		gameInfoByMonth.setGameInfo(gameInfos);
		gameInfoByMonth.setGameCount(gameCount);

		return gameInfoByMonth;
	}

	public GameCalendar getCalendar(int year, int month) {

		year = year == 0 ? YEAR_TODAY : year;
		month = month == 0 ? MONTH_TODAY : month;

		GameCalendar gameCalendar = new GameCalendar();
		Calendar cal = Calendar.getInstance();

		// 년도/월 셋팅
		cal.set(year, month, 1);

		int startDay = cal.getMinimum(java.util.Calendar.DATE);
		int endDay = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		int start = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int newLine = 0;

		// 오늘 날짜 저장.

		Calendar todayCal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
		int intToday = Integer.parseInt(sdf.format(todayCal.getTime()));
		
		String color = "";
		String sUseDate = Integer.toString(year); 
		sUseDate += Integer.toString(month+1).length() == 1 ? "0" + Integer.toString(month+1) : Integer.toString(month+1);
		sUseDate += Integer.toString(DATE_TODAY).length() == 1 ? "0" + Integer.toString(DATE_TODAY) : Integer.toString(DATE_TODAY);
		int iUseDate = Integer.parseInt(sUseDate);
		String backColor = "#EFEFEF";
		
		int today = year*10000 + month*100; 

		gameCalendar.setYear(year);
		gameCalendar.setMonth(month);
		gameCalendar.setDate(DATE_TODAY);
		gameCalendar.setStart(start);
		gameCalendar.setEndDay(endDay);
		gameCalendar.setStartDay(startDay);
		gameCalendar.setNewLine(newLine);
		gameCalendar.setIntToday(intToday);
		gameCalendar.setColor(color);

		return gameCalendar;
	}

}
