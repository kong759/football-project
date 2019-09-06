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
											<li>
												<h6>
													<strong>주 활동지역:</strong> ${teampage.getTeamInfo().getLocation()}
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
													type="button" value="가입" onclick="location.href='/teampage/join'">가입하기</a></button>
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
										<li><a href="#stats" data-toggle="tab">STATS</a></li>
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
														<p>안녕하세요 저희는 좆!망!한 팀이에요
													</div>
												</div>
											</div>


											  <!--Items Club video -->
                                       <div class="row no-line-height">
                                          <div class="col-md-12">
                                              <h3 class="clear-title">핫클립 동영상</h3>
                                          </div>

                                          <!--Item Club News -->
                                          <div class="col-lg-6 col-xl-4">
                                               <!-- Widget Text-->
                                                <div class="panel-box">
                                                    <div class="titles no-margin">
                                                        <h4><a href="#">우승은 우리.</a></h4>
                                                    </div>
                                                    <iframe class="video" src="https://www.youtube.com/embed/Ln8rXkeeyP0" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                                </div>
                                                <!-- End Widget Text-->
                                           </div>
                                           <!--End Item Club News -->

                                           <!--Item Club News -->
                                          <div class="col-lg-6 col-xl-4">
                                               <!-- Widget Text-->
                                                <div class="panel-box">
                                                    <div class="titles no-margin">
                                                        <h4><a href="#">미친듯한 선방!</a></h4>
                                                    </div>
                                                    <iframe class="video" src="https://www.youtube.com/embed/Z5cackyUfgk" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                                </div>
                                                <!-- End Widget Text-->
                                           </div>
                                           <!--End Item Club News -->

                                           <!--Item Club News -->
                                          <div class="col-lg-6 col-xl-4">
                                               <!-- Widget Text-->
                                                <div class="panel-box">
                                                    <div class="titles no-margin">
                                                        <h4><a href="#">역대급 우승골 모음보기</a></h4>
                                                    </div>
                                                    <iframe class="video" src="https://www.youtube.com/embed/hW3hnUoUS0k" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                                </div>
                                                <!-- End Widget Text-->
                                           </div>
                                           <!--End Item Club News -->
                                       </div>
                                       <!--End Items Club video -->
										</div>
										<!-- Tab One - overview -->

										<!-- Tab Two - squad -->
										<div class="tab-pane" id="squad">
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
										<!-- Tab Theree - stats -->
										<div class="tab-pane" id="stats">

											<div class="row">
												<div class="col-lg-12">
													<div class="stats-info">
														<ul>
															<li>Matches Played
																<h3>866</h3>
															</li>

															<li>Wins
																<h3>328</h3>
															</li>

															<li>Losses
																<h3>317</h3>
															</li>

															<li>Goals
																<h3>1,188</h3>
															</li>

															<li>Goals Conceded
																<h3>1,170</h3>
															</li>

															<li>Clean Sheets
																<h3>226</h3>
															</li>
														</ul>
													</div>
												</div>
											</div>

											<div class="row">
												<div class="col-lg-6 col-xl-4">
													<!-- Attack -->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<i class="fa fa-calendar"></i>Attack
															</h4>
														</div>
														<ul class="list-panel">
															<li><p>
																	Goals <span>1,188</span>
																</p></li>
															<li><p>
																	Goals Per Match <span>1.37</span>
																</p></li>
															<li><p>
																	Shots <span>4,621</span>
																</p></li>
															<li><p>
																	Shooting Accuracy % <span>32%</span>
																</p></li>
															<li><p>
																	Penalties Scored <span>30</span>
																</p></li>
															<li><p>
																	Big Chances Created <span>293</span>
																</p></li>
															<li><p>
																	Hit Woodwork <span>107</span>
																</p></li>
														</ul>
													</div>
													<!-- End Attack -->
												</div>

												<div class="col-lg-6 col-xl-4">
													<!-- Attack -->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<i class="fa fa-calendar"></i>Team Play
															</h4>
														</div>
														<ul class="list-panel">
															<li><p>
																	Passes <span>140,417</span>
																</p></li>
															<li><p>
																	Passes Per Match <span>162.14</span>
																</p></li>
															<li><p>
																	Pass Accuracy % <span>76%</span>
																</p></li>
															<li><p>
																	Crosses <span>8,148</span>
																</p></li>
															<li><p>
																	Cross Accuracy % <span>22%</span>
																</p></li>
														</ul>
													</div>
													<!-- End Attack -->
												</div>

												<div class="col-lg-6 col-xl-4">
													<!-- Attack -->
													<div class="panel-box">
														<div class="titles no-margin">
															<h4>
																<i class="fa fa-calendar"></i>Defence
															</h4>
														</div>
														<ul class="list-panel">
															<li><p>
																	Clean Sheets <span>226</span>
																</p></li>
															<li><p>
																	Goals Conceded <span>1,170</span>
																</p></li>
															<li><p>
																	Goals Conceded Per Match <span>1.35</span>
																</p></li>
															<li><p>
																	Saves <span>392</span>
																</p></li>
															<li><p>
																	Tackles <span>7,438</span>
																</p></li>
															<li><p>
																	Tackle Success % <span>75%</span>
																</p></li>
															<li><p>
																	Blocked Shots <span>1,208</span>
																</p></li>
															<li><p>
																	Interceptions <span>5,334</span>
																</p></li>
															<li><p>
																	Clearances <span>11,436</span>
																</p></li>
															<li><p>
																	Headed Clearance <span>3,710</span>
																</p></li>
															<li><p>
																	Aerial Battles/Duels Won <span>25,401</span>
																</p></li>
															<li><p>
																	Errors Leading To Goal <span>59</span>
																</p></li>
															<li><p>
																	Own Goals <span>27</span>
																</p></li>
														</ul>
													</div>
													<!-- End Attack -->
												</div>
											</div>

										</div>
										<!-- End Tab Theree - stats -->
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