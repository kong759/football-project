select * from TEAM_INFO;
select * from GAME_INFO;
select * from GAME_LOCATION;


select * from TAB;


SELECT
	id,
	status_code statusCode,
	max_person_num maxPersonNum,
	kind,
	game_date gameDate,
	duration,
	description,
	maxnum_team maxnumTeam
	FROM
	game_info
	WHERE
	ROWNUM <=3 AND
	1 <= ROWNUM;
	
	DELETE FROM GAME_INFO;
	
	INSERT INTO GAME_INFO VALUES(
		3, 0, 0, 0, SYSDATE, 0, 'ASDF', 0
	)
	