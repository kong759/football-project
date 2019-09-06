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
			<div class="container_body">
				<!-- Section Title -->
				<div class="section-title-team">
					<div class="container">
						<div class="row">
							<div class="col-xl-7">
								<div class="row">
									<div class="col-md-3">
										<img
											src="${pageContext.request.contextPath}/images/${teampage.getTeamInfo().getLogoPath()}"
											alt="">
									</div>
									<div class="col-md-9">
										<h1>${teampage.getTeamInfo().getName()}</h1>
										<ul class="general-info">
											<li>
												<h6>
													<strong>현원:</strong>${teampage.getTeamInfo().getPresentNum()}
												</h6>
											</li>

											<li>
												<h6>
													<strong>정원:</strong> ${teampage.getTeamInfo().getMaxNum()}
												</h6>
											</li>

											<li><h6>
													<strong>주장:</strong> 주장이름
												</h6></li>
											<li><h6>
													<strong>부 주장:</strong> 부 주장이름
												</h6></li>

										</ul>
										<form id="teampageForm" class="form-horizontal" role="form"
											method="get" action="" name="form">
											
											<div class="col-md-3">
												<button class="btn btn-primary btn-block" id="join"
													type="button" value="가입">가입하기</button>
													<button class="btn btn-primary btn-block" id="quit"
													type="button" value="탈퇴">탈퇴하기</button>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="bg-image-team"
						style="background: url(${pageContext.request.contextPath}/resources/img/clubs-teams/teampageBG.jpg);"></div>
				</div>
				<!-- End Section Title -->

				<!-- Section Area - Content Central -->
				<section class="content-info">

					<!-- Single Team Tabs -->
					<div class="single-team-tabs">
						<div class="container">
							<div class="row">
								<!-- Left Content - Tabs and Carousel -->
								<div class="col-xl-12 col-md-12">
									<!-- Nav Tabs -->
									<ul class="nav nav-tabs" id="myTab">
										<li class="active"><a href="#overview" data-toggle="tab">Overview</a></li>
										<li><a href="#squad" data-toggle="tab">Squad</a></li>
									</ul>
									<!-- End Nav Tabs -->
								</div>

								<div class="col-lg-9 padding-top-mini">
									<!-- Content Tabs -->
									<div class="tab-content">
										<!-- Tab One - overview -->
										<div class="tab-pane active" id="overview">

											<div class="panel-box padding-b">
												<div class="titles">
													<h4>Colombia national football team</h4>
												</div>
												<div class="row">
													<div class="col-lg-12 col-xl-4">
														<img src="img/clubs-teams/single-team.jpg" alt="">
													</div>

													<div class="col-lg-12 col-xl-8">
														<p>The Colombia national football team (Spanish:
															Selección de fútbol de Colombia) represents Colombia in
															international football competitions and is overseen by
															the Colombian Football Federation. It is a member of the
															CONMEBOL and is currently ranked thirteenth in the FIFA
															World Rankings.[3] The team are nicknamed Los Cafeteros
															due to the coffee production in their country.</p>

														<p>Since the mid-1980s, the national team has been a
															symbol fighting the country's negative reputation. This
															has made the sport popular and made the national team a
															sign of nationalism, pride and passion for many
															Colombians worldwide.</p>
													</div>
												</div>
											</div>

											<!--Items Club News -->
											<div class="row">
												<div class="col-md-12">
													<h3 class="clear-title">Latest Club News</h3>
												</div>

												<!--Item Club News -->
												<div class="col-lg-6 col-xl-4">
													<!-- Widget Text-->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<a href="#">World football's dates.</a>
															</h4>
														</div>
														<a href="#"><img src="img/blog/1.jpg" alt=""></a>
														<div class="row">
															<div class="info-panel">
																<p>Fans from all around the world can apply for 2018
																	FIFA World Cup™ tickets as the first window of sales.</p>
															</div>
														</div>
													</div>
													<!-- End Widget Text-->
												</div>
												<!--End Item Club News -->

												<!--Item Club News -->
												<div class="col-lg-6 col-xl-4">
													<!-- Widget Text-->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<a href="#">Mbappe’s year to remember</a>
															</h4>
														</div>
														<a href="#"><img src="img/blog/2.jpg" alt=""></a>
														<div class="row">
															<div class="info-panel">
																<p>Tickets may be purchased online by using Visa
																	payment cards or Visa Checkout. Visa is the official.</p>
															</div>
														</div>
													</div>
													<!-- End Widget Text-->
												</div>
												<!--End Item Club News -->

												<!--Item Club News -->
												<div class="col-lg-6 col-xl-4">
													<!-- Widget Text-->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<a href="#">Egypt are one family</a>
															</h4>
														</div>
														<a href="#"><img src="img/blog/3.jpg" alt=""></a>
														<div class="row">
															<div class="info-panel">
																<p>Successful applicants who have applied for
																	supporter tickets and conditional supporter tickets
																	will.</p>
															</div>
														</div>
													</div>
													<!-- End Widget Text-->
												</div>
												<!--End Item Club News -->
											</div>
											<!--End Items Club News -->


											<!--Items Club video -->
											<div class="row no-line-height">
												<div class="col-md-12">
													<h3 class="clear-title">Latest Club Videos</h3>
												</div>

												<!--Item Club News -->
												<div class="col-lg-6 col-xl-4">
													<!-- Widget Text-->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<a href="#">Eliminatory to the world.</a>
															</h4>
														</div>
														<iframe class="video"
															src="https://www.youtube.com/embed/Ln8rXkeeyP0"
															frameborder="0" gesture="media" allow="encrypted-media"
															allowfullscreen></iframe>
													</div>
													<!-- End Widget Text-->
												</div>
												<!--End Item Club News -->

												<!--Item Club News -->
												<div class="col-lg-6 col-xl-4">
													<!-- Widget Text-->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<a href="#">Colombia classification</a>
															</h4>
														</div>
														<iframe class="video"
															src="https://www.youtube.com/embed/Z5cackyUfgk"
															frameborder="0" gesture="media" allow="encrypted-media"
															allowfullscreen></iframe>
													</div>
													<!-- End Widget Text-->
												</div>
												<!--End Item Club News -->

												<!--Item Club News -->
												<div class="col-lg-6 col-xl-4">
													<!-- Widget Text-->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<a href="#">World Cup goal</a>
															</h4>
														</div>
														<iframe class="video"
															src="https://www.youtube.com/embed/hW3hnUoUS0k"
															frameborder="0" gesture="media" allow="encrypted-media"
															allowfullscreen></iframe>
													</div>
													<!-- End Widget Text-->
												</div>
												<!--End Item Club News -->
											</div>
											<!--End Items Club video -->
										</div>
										<!-- Tab One - overview -->

										<!-- Tab Two - squad -->
										<div class="tab-pane" id=" ">
											<div class="row">
												<!-- Item Player -->
												<div class="col-xl-4 col-lg-6 col-md-6">
													<div class="item-player">
														<div class="head-player">
															<img src="img/players/1.jpg" alt="location-team">
															<div class="overlay">
																<a href="single-player.html">+</a>
															</div>
														</div>
														<div class="info-player">
															<span class="number-player"> 13 </span>
															<h4>
																Cristiano Ronaldo <span>Forward</span>
															</h4>
															<ul>
																<li><strong>NATIONALITY</strong> <span><img
																		src="img/clubs-logos/colombia.png" alt="">
																		Colombia </span></li>
																<li><strong>MATCHES:</strong> <span>90</span></li>
																<li><strong>AGE:</strong> <span>28</span></li>
															</ul>
														</div>
														<a href="single-player.html" class="btn">View Player <i
															class="fa fa-angle-right" aria-hidden="true"></i></a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>

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
		initPage("<%=session.getAttribute("userId")%>");
	};
</script>
</html>