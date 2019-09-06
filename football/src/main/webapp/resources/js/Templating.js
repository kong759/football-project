const menuTop = (userId)=>{
	let welcomeMessage = "님 환영합니다!";
//	debugger;
	if(userId=="null"){
		return `<a href="/member/loginmember">log-in</a>
		<a href="/member/insertmember">join</a>`
	}	
	// href userpage변경해야함
	return `<a href="/userpage">${userId}</a>${welcomeMessage}
	<a href="/member/logout">log-out</a>`
}
	const CONTAINER = {
			HEADER: `<!-- Header-->
				<header class="header-2">
				<!-- End headerbox-->
				<div class="headerbox">
				<div class="container">
				<div class="row justify-content-between align-items-center">
				<!-- Logo-->
				<div class="col col-xl-2">
				<div class="logo">
				<a href="/" title="Return Home">
				<img src="/resources/img/logo.png" alt="Logo" class="logo_img" />
				</a>
				</div>
				</div>
				<!-- End Logo-->

				<!-- Adds nav-->
				<div class="col col-xl-10">
				<!-- mainmenu-->
				<nav class="mainmenu">
				<div class="container">
				<!-- Menu-->
				<ul class="sf-menu" id="menu">
				<li class="current">
				<a href="/">Home</a>
				</li>
				<li class="current">
				<a href="/teamlist">Teams</a>
				</li>
				<li class="current">
				<a href="/gamelist">Matches</a>
				<ul class="sub-current">
				<li>
				<a href="/gamelist">Matches</a>
				</li>
				<li>
				<a href="/gameschedule">Match Calendars</a>
				</li>
				</ul>
				</li>
				<li class="current">
				<a href="/gameresult">Results</a>
				</li>
				<li>
				<a href="table-point.html">Point Table</a>
				</li>
				</ul>
				<!-- End Menu-->
				</div>
				</nav>
				<!-- End mainmenu-->
				</div>
				<!-- End nav Header-->
				</div>
				<div class="header-top">
				{menuTop}
				</div>
				</div>
				</div>
				<!-- End headerbox-->
				</header>
				<!-- End Header-->
				`,
				BODY: document.querySelector(".container_body"),
				FOOTER: `<!-- footer-->
					<footer id="footer">
					<!-- Footer Top-->
					<div class="top-footer">
					<!-- Logo Footer-->
					<div class="col-lg-12">
					<div class="logo-footer">
					<h2>FOOTBALL&nbsp;&nbsp;MATCHING</h2>
					</div>
					</div>
					<!-- End Logo Footer-->
					</div>
					<!-- End Footer Top-->

					<!-- Links Footer-->
					<div class="links-footer">
					<div class="container">
					<div class="row"></div>
					</div>
					</div>
					<!-- End Links Footer-->
					</footer>
					<!-- End footer-->

					<!-- footer Down-->
					<div class="footer-down">
					<div class="container">
					<div class="row">
					<div class="col-md-12">
					<p>&copy; 2019 Football Matching . All Rights Reserved</p>
					</div>
					</div>
					</div>
					</div>
					<!-- footer Down-->`
	};

	function initPage(userId) {
		headerHTML = CONTAINER.HEADER.replace("{menuTop}",()=>menuTop(userId))
		CONTAINER.BODY.insertAdjacentHTML("beforebegin", headerHTML);
		CONTAINER.BODY.insertAdjacentHTML("afterend", CONTAINER.FOOTER);
	}
