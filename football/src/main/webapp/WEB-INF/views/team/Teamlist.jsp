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
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
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
						<div class="col-md-2 pt-3">
							<div class="form-group ">
								<select id="inputState " class="form-control">
									<option selected>지역</option>
									<option>서울</option>
									<option>경기</option>
									<option>광주</option>
									<option>부산</option>
								</select>
							</div>
						</div>

						<div class="col-md-2 pt-3">
							<div class="form-group">
								<select id="inputState" class="form-control">
									<option selected>인원 수</option>
									<option>05명 이하</option>
									<option>10명 이하</option>
									<option>15명 이하</option>
									<option>20명 이하</option>
								</select>
							</div>
						</div>

						<div class="col-md-2 pt-3">
							<div class="form-group">
								<select id="inputState" class="form-control">
									<option selected>모집 유/무</option>
									<option>모집 중</option>
									<option>모집 완료</option>
								</select>
							</div>
						</div>

						<div class="col-md-2">
							<button type="button" class="btn btn-primary btn-block">Search</button>
						</div>
						<div class="col-md-3">
							<button type="button" class="btn btn-primary">
								<a class="btn-insertTeam">팀 만들기</a>
							</button>
						</div>
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
			<!-- 내용 -->
			<div class="modal-body">

				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<div class="modal_content">
								<h1 class="entry-title">
									<span>팀 만들기</span>
								</h1>
								<hr>
								<form class="form-horizontal" method="post" name="signup"
									id="signup" enctype="multipart/form-data"
									action="${pageContext.request.contextPath}/teamlist/insertteam">
									<div class="form-group">
										<label class="control-label col-sm-3">구단이름 <br></label>
										<div class="col-md-5 col-sm-8">
											<input type="text" class="form-control" name="name" id="name"
												placeholder="생성할 팀의 이름을 입력해주세요.">
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-sm-3">팀 최대인원 <span
											class="text-danger">*</span></label>
										<div class="col-md-8 col-sm-9">
											<div class="form-inline">
												<div class="form-group">
													&nbsp;&nbsp;&nbsp; <select name="maxNum" id="maxNum"
														class="form-control">
														<option value="최대 인원">최대 인원</option>
														<option value="05">05</option>
														<option value="10">10</option>
														<option value="15">15</option>
														<option value="20">20</option>
														<option value="25">25</option>
													</select>
												</div>
											</div>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-sm-3">활동 지역 <span
											class="text-danger">*</span></label>
										<div class="col-md-8 col-sm-9">
											<label> <input name="location" type="radio"
												value="서울" checked> 서울
											</label> <label> <input name="location" type="radio"
												value="경기도"> 경기도
											</label> <label> <input name="location" type="radio"
												value="광주"> 광주
											</label> <label> <input name="location" type="radio"
												value="부산"> 부산
											</label>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-sm-3">로고 이미지 <br></label>
										<div class="col-md-5 col-sm-8">
											<div class="input-group">
												<span class="input-group-addon" id="file_upload"><i
													class="glyphicon glyphicon-upload"></i></span> <input type="file"
													name="uploadname" id="logoPath" class="form-control upload"
													placeholder="" aria-describedby="file_upload">
											</div>
										</div>
									</div>

									<div class="form-group">
										<div class="col-xs-offset-3 col-md-8 col-sm-9">
											<span class="text-muted"><span
												class="label label-danger">Note:-</span> 이 <a href="#">Team</a>을
												이대로 생성하시겠습니까? </span>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-offset-3 col-xs-10">
											<input name="Submit" type="submit" value="팀 생성하기"
												id="modal_close_btn" class="btn btn-primary">
										</div>
										<div class="modal_layer"></div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 내용 -->
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
   };
</script>
</html>
