select * from TEAM_INFO;
select * from GAME_INFO;
select * from GAME_LOCATION;


select * from TAB;




insert into team_info values(
32,
'khj',
3,
15,
20,
3,
98,
'seoul',
433
);

insert into team_info values(
3,
'kkm',
2,
12,
23,
1,
68,
'daegu',
343
);

insert into game_location values(
1,
'seoul',
'33'
);

insert into game_info values(
1,
1,
6,
1,
SYSDATE,
30,
'GG',
3);


insert into team_participate values(
32,
3
);

select * from TEAM_PARTICIPATE;



select game_info.id, team_info.name, game_info.game_date, game_info.duration
, game_location.name, game_location.location from game_info, team_info, game_location where
game_info.id = 1 and team_info.name is not null and game_location.name is not null