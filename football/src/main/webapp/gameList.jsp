<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- css -->
<link rel="stylesheet" type="text/css" href="default.css" />
<!-- add css here! -->
</head>
<body>

	<div class="container_body">



		<div id="div_con" class="vertical-menu">
			<!-- 헤더부분 -->

			<select name="Location">
				<option value="">Location</option>
				<option value="서울">서울</option>
				<option value="경기">경기</option>
				<option value="인천">인천</option>

			</select> <select name="Team">
				<option value="">Team</option>
				<option value="asnal">asnal</option>
				<option value="tot">tot</option>
				<option value="MU">MU</option>
			</select>
			<button type="button" class="btn">Calender</button>
			<!--Calender버튼 눌렀을 때 승주형의 달력페이지로 가는 기능 구현하기 -->

		</div>


		<div id="div_con4" class="vertical-menu">
			<H1>Head-to-Head</H1>
			<div id="div_con5">방 만들기</div>
			<!-- 버튼 눌렀을때 방 생성하는 페이지 만들기 -->
			<div id="div_con5">참가하기</div>
			<!-- 버튼 눌렀을때 원하는 방 참가하는 기능 구현하기 -->
		</div>




		<div id="div_menu" class="vertical-menu">

			<h1>TeamInfo</h1>
			<div id="div_con2">팀이름 : ${name}</div>
			<div id="div_con2">로고</div>
			<div id="div_con2">정원</div>
			<div id="div_con2">현원</div>
			<div id="div_con2">유니폼 색깔</div>
			<div id="div_con2">전력 : ${formation }</div>
			<div id="div_con2">활동지역</div>
			<div id="div_con2">포메이션</div>
		</div>


		<div id="div_menu2">
			<h1>Recent Meetings</h1>
			<div id="div_con2">test1</div>
			<div id="div_con2">test2</div>
			<div id="div_con2">test3</div>
			<div id="div_con2">test4</div>
			<div id="div_con2">test5</div>
			<div id="div_con2">test6</div>
			<div id="div_con2">test1</div>
			<div id="div_con2">test2</div>
			<div id="div_con2">test3</div>
			<div id="div_con2">test4</div>


		</div>

		<div id="div_menu3" class="vertical-menu">

			<div id="div_menu4">
				<h1>Location</h1>
				<div id="div_con6">구장사진</div>
				<div id="div_con2">구장정보</div>
				<div id="div_con2">위치 : ${location}</div>
				<div id="div_con2">test3</div>
				<div id="div_con2">test4</div>
				<img src="/images/ground.jpg" alt="">

			</div>

		</div>




		contents here!
	</div>
</body>


<style>
#div_menu {
	width: 20%;
	height: 800px;
	float: left;
	text-align: reft;
	background-color: #white;
	margin: 5px;
}

#div_menu2 {
	width: 58%;
	height: 800px;
	float: left;
	text-align: center;
	background-color: #white;
	margin: 5px;
	border: 1px solid red;
}

#div_menu3 {
	width: 18%;
	height: 800px;
	float: left;
	text-align: reft;
	background-color: #white;
	margin: 5px;
}

#div_menu4 {
	width: 110%;
	height: 800px;
	float: center;
	text-align: center;
	background-color: #white;
	margin: 5px;
	border: 1px solid red;
}

#div_con {
	width: 100%;
	height: 100px;
	text-align: left;
	background-color: #FFFFCC;
	margin: 5px;
}

#div_con2 {
	width: 40%;
	height: 50px;
	display: inline-block;
	text-align: center;
	background-color: #CCFFCC;
	margin: 5px 5px 5px 5px;
	border: 1px solid gold;
}

#div_con3 {
	width: 20%;
	height: 10px;
	display: inline-block;
	text-align: center;
	background-color: #CCFFCC;
	margin: 5px 5px 5px 5px;
	border: 1px solid gold;
}

#div_con4 {
	width: 100%;
	height: 200px;
	text-align: left;
	background-color: #45235F;
	margin: 5px;
}

#div_con5 {
	position: relative;
	left: 1450px;
	top: 60px;
	width: 10%;
	height: 30px;
	display: inline-block;
	text-align: center;
	background-color: #711553;
	margin: 5px 5px 5px 5px;
	border: 1px solid blue;
	width: 10%;
	left: "300px";
}

#div_con6 {
	width: 90%;
	height: 200px;
	text-align: left;
	background-color: #45235F;
	margin: 5px;
}

#div_con2:hover {
	background-color: white;
}

#div_con5:hover {
	background-color: #FF24B8;
}

#divIma {
	text-align: center;
}
</style>
<script src="Templating.js"></script>
<!-- add script here! -->
<script>
	window.onload = function() {
		initPage();
	};
</script>
</html>