
select to_char(sysdate,'MM') from dual;
select * from  game_info where to_char(game_date, 'MM')='08' AND kind=0;



update GAME_INFO set game_date = sysdate where id=0;
select sysdate from dual

SELECT
		id,
		status_code,
		max_person_num,
		kind,
		game_date,
		duration,
		description,
		maxnum_team
		FROM
		game_info
		WHERE
		kind = '0' AND
		to_char(game_date, 'MM')='08'
		
		select nvl(count(*),0) from game_info where kind = 0