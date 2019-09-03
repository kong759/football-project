<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Document</title>
<link rel="stylesheet" type="text/css"
	href="/resources/css/teampage.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/default.css" />
</head>
<body>
	<div class="container_body">
	<div class="container_block">
		<form  class="form-horizontal" role="form"
			method="post" action="teampagePro" name="userinput"
			onsubmit="return checkIt()">
			<div class="content">
				<a href="teampage/teampage"><img src="" alt="TEAMLOGO" /></a>
				<p>TEAMID:${teampage.getTeamInfo().getName()}</p>
				<p>현원:${teampage.getTeamInfo().getPresentNum()}</p>
				<p>정원:${teampage.getTeamInfo().getMaxNum()}</p>
				<input type="submit" value="가입"> <input type="submit"
					value="탈퇴">
			</div>

			<div class="menubar">
				<ul>
					<li><a href="#" id="current">TEAMHISTORY</a>
						<ul>
							<li><a href="#">팀소개</a></li>
							<li><a href="#">팀전적</a></li>
							<li><a href="#">팀활동</a></li>
						</ul></li>
					<li><a href="teampage/player">선수정보</a></li>
				</ul>
			</div>

			<br> <br> <br> <br> <br> <br>

			<div class="row">
				<div class="column" style="background-color: orange;"></div>
				<div class="column" style="background-color: yellow;"></div>
				<div class="column" style="background-color: green;"></div>
			</div>
			<br> <br> <br> <br> <br> <br>
		</form>
		</div>
	</div>

</body>
<script src="/resources/js/Templating.js"></script>
<script>
	window.onload = function() {
		initPage();
	};
</script>
</html>
