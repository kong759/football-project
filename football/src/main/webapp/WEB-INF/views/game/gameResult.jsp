<%@ page contentType="text/html; charset=utf-8"%>
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
			<div class="section-title" style="background: url(img/slide/1.jpg)">
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<h1>Points Table</h1>
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
			<section class="content-info">

				<div class="container padding-top">
					<div class="row">
						<div class="col-lg-12">
							<div class="recent-results results-page">
								<c:forEach items="${gamelist.gameInfos}" var="gameInfo">
									<div class="info-results">
										<ul>

											<li><span class="head">게임 번호: ${gameInfo.id} 팀 이름
													Vs 팀 이름 </span>
												<h3>${gameInfo.name}</h3>
												<div class="goals-result">
													<a href="single-team.html"> <img
														src="img/clubs-logos/por.png" alt=""> 팀 이름
													</a> <span class="goals"> <b>2</b> - <b>3</b> <a
														href="single-result.html" class="btn theme">View More</a>
													</span> <a href="single-team.html"> <img
														src="img/clubs-logos/esp.png" alt=""> 팀 이름
													</a>
												</div></li>
										</ul>
									</div>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>


			</section>
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
<script>
	window.onload = function() {
		initPage("<%=session.getAttribute("userId")%>
	");
	};
</script>
</html>