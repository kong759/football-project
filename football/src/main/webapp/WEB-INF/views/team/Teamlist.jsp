<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Basic -->
<meta charset="utf-8" />
<title>Football matching</title>
<meta name="keywords" content="HTML5 Template" />
<meta name="description" content="Football matching" />
<meta name="author" content="iwthemes.com" />

<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<!-- Theme CSS -->
<link href="/resources/css/gameschedule.css" rel="stylesheet"
	media="screen" />
<link href="/resources/css/main.css" rel="stylesheet" media="screen" />

<!-- Favicons -->
<link rel="shortcut icon" href="/resources/img/icons/favicon.ico" />
<link rel="apple-touch-icon"
	href="/resources/img/icons/apple-touch-icon.png" />
<link rel="apple-touch-icon" sizes="72x72"
	href="/resources/img/icons/apple-touch-icon-72x72.png" />
<link rel="apple-touch-icon" sizes="114x114"
	href="/resources/img/icons/apple-touch-icon-114x114.png" />
</head>

<body>
	<!-- layout-->
	<div id="layout">
		<!-- main contents -->
		<div class="container_body">
			<!-- Section Title -->
			<div class="section-title"
				style="background: url(resources/img/slide/1.jpg)">
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<h1>Teams List</h1>
						</div>

						<div class="col-md-4">
							<div class="breadcrumbs">
								<ul>
									<li><a href="index.html">Home</a></li>
									<li>Inner Page</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Section Title -->

			<!-- Section Area - Content Central -->
			<section class="content-info">

				<!-- Nav Filters -->
				<div class="container-fluid bg-light ">
					<div class="row align-items-center justify-content-center">
						<form id="searchForm" action = "/teamlist/byCondition" class="row align-items-center justify-content-center" style="width:100%">
							<div class="col-md-2 pt-3">
								<div class="form-group ">
									<select id="inputState " class="form-control" name = "location">
										<option value="0" selected>지역</option>
										<option value="02">서울</option>
										<option value="031">경기</option>
										<option value="062">광주</option>
										<option value="051">부산</option>
									</select>
								</div>
							</div>

							<div class="col-md-2 pt-3">
								<div class="form-group">
									<select id="inputState" class="form-control" name = "presentNum">
										<option value = "0" selected>인원 수</option>
										<option value="5">05명 이하</option>
										<option value="10">10명 이하</option>
										<option value="15">15명 이하</option>
										<option value="20">20명 이하</option>
									</select>
								</div>
							</div>

							<div class="col-md-2 pt-3">
								<div class="form-group">
									<select id="inputState" class="form-control" name = "recruit">
										<option value = "" selected>모집 유/무</option>
										<option value="ongoing">모집 중</option>
										<option value="done">모집 완료</option>
									</select>
								</div>
							</div>
							<div class="col-md-2">
								<button id="searchButton" type="button"
									class="btn btn-primary btn-block">Search</button>
							</div>

							<div class="col-md-3">

								<button class="btn-insertTeam">팀 만들기</button>

							</div>
						</form>
					</div>
				</div>
				<!-- End Nav Filters -->
				<!-- 팀 개수-->
				<div class="container_block">
					<center>
						<h4>팀 개수:${teamlist.teamCount}</h4>
					</center>
				</div>
				<!-- 팀 개수-->
				<div class="container padding-top">
					<div class="row portfolioContainer">
						<!-- 팀 정보넣기-->
						<c:forEach var="teamInfo" items="${teamlist.teamInfos}">
							<div class="col-md-6 col-lg-4 col-xl-3 group-a">
								<div class="item-team">

									<div class="head-team">
										<img
											src="${pageContext.request.contextPath}/images/${teamInfo.logoPath}"
											alt="location-team">
										<div class="overlay">
											<a href="single-team.html">+</a>
										</div>
									</div>

									<div class="info-team">
										<span class="logo-team"> <img
											src="${pageContext.request.contextPath}/images/${teamInfo.logoPath}"
											alt="logo-team">
										</span>
										<h4>${teamInfo.name}</h4>
										<span class="location-team"> <i
											class="fa fa-map-marker" aria-hidden="true"></i> Stadium
										</span> <span class="group-team"> <i class="fa fa-trophy"
											aria-hidden="true"></i> Group A
										</span>
									</div>
									<a href="single-team.html" class="btn">Team Profile <i
										class="fa fa-angle-right" aria-hidden="true"></i></a>
								</div>
							</div>
						</c:forEach>
						<!-- 팀 정보넣기-->
					</div>
				</div>
			</section>
		</div>
	</div>
	<div id="myModal" class="modal" style="position: absolute;">
		<!-- Modal content -->
		<div class="modal-content">
			<span class="close">&times;</span>
			<h3></h3>
		</div>
	</div>
	<!-- End layout-->

	<!-- ======================= JQuery libs =========================== -->
	<!-- jQuery local-->
	<script type="text/javascript" src="/resources/js/jquery.js"></script>
	<!-- popper.js-->
	<script type="text/javascript" src="/resources/js/popper.min.js"></script>
	<!-- bootstrap.min.js-->
	<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
	<!-- required-scripts.js-->
	<script type="text/javascript" src="/resources/js/theme-scripts.js"></script>
	<!-- theme-main.js-->
	<script type="text/javascript" src="/resources/js/theme-main.js"></script>
	<!-- ======================= End JQuery libs =========================== -->
</body>
<script src="/resources/js/Teamlist.js"></script>
<script src="/resources/js/Templating.js"></script>
<script type="text/javaScript" language="javascript"> 
      
       var modal = document.getElementById("myModal");
       var span = document.getElementsByClassName("close")[0];
       
       document.querySelector(".btn-insertTeam").addEventListener("click",(e)=>{
    	             if(e.target.className=="btn-insertTeam"){
    	                  modal.style.display = "block";
    	             }
    	         });
       
       span.onclick = function() {
          modal.style.display = "none";
       };
       
       window.onclick = function(event) {
          if (event.target == modal) {
             modal.style.display = "none";
          }
       };
    
       
      window.onload = function() {
	  initPage();
	  teamlist.setSearchEvent();
   };
</script>
</html>
