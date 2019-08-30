
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<html lang="ko">

<HEAD>

<TITLE>캘린더</TITLE>

<meta http-equiv="content-type" content="text/html; charset=utf-8">





<script type="text/javaScript" language="javascript"> 

      

       </script>

<style TYPE="text/css">
body {
	scrollbar-face-color: #F6F6F6;
	scrollbar-highlight-color: #bbbbbb;
	scrollbar-3dlight-color: #FFFFFF;
	scrollbar-shadow-color: #bbbbbb;
	scrollbar-darkshadow-color: #FFFFFF;
	scrollbar-track-color: #FFFFFF;
	scrollbar-arrow-color: #bbbbbb;
	margin-left: "0px";
	margin-right: "0px";
	margin-top: "0px";
	margin-bottom: "0px";
}

td {
	font-family: "돋움";
	font-size: 9pt;
	color: #595959;
}

th {
	font-family: "돋움";
	font-size: 9pt;
	color: #000000;
}

select {
	font-family: "돋움";
	font-size: 9pt;
	color: #595959;
}

.divDotText {
	overflow: hidden;
	text-overflow: ellipsis;
}

A:link {
	font-size: 9pt;
	font-family: "돋움";
	color: #000000;
	text-decoration: none;
}

A:visited {
	font-size: 9pt;
	font-family: "돋움";
	color: #000000;
	text-decoration: none;
}

A:active {
	font-size: 9pt;
	font-family: "돋움";
	color: red;
	text-decoration: none;
}

A:hover {
	font-size: 9pt;
	font-family: "돋움";
	color: red;
	text-decoration: none;
}
</style>

</HEAD>

<BODY>

	<form name="calendarFrm" id="calendarFrm" action="" method="post">

		<DIV id="content" style="width: 712px;">



			<table width="100%" border="0" cellspacing="1" cellpadding="1">

				<tr>
					<!-- 수정할부분 -->
					<td align="right"><input type="button"
						onclick="javascript:location.href='<c:url value='/gameschedule' />'"
						value="오늘" /></td>
				</tr>
			</table>
			<!--날짜 네비게이션  -->
			<table width="100%" border="0" cellspacing="1" cellpadding="1"
				id="KOO" bgcolor="#F3F9D7" style="border: 1px solid #CED99C">
				<tr>
					<td height="60">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="10"></td>
							</tr>
							<tr>
								<td align="center"><a
									href="<c:url value='/gameschedule' />?year=${year-1 }&amp;month=${month}"
									target="_self"> <b>&lt;&lt;</b> <!-- 이전해 -->
								</a> <c:if test="${month > 0 }">
										<a
											href="<c:url value='/gameschedule' />?year=${year }&amp;month=${month-1}"
											target="_self"> <b>&lt;</b> <!-- 이전달 -->
										</a>
									</c:if> <c:if test="${month <= 0 }">
										<b>&lt;</b>
									</c:if> &nbsp;&nbsp; ${year }년 ${month+1 }월 &nbsp;&nbsp; <c:if
										test="${month < 11 }">
										<a
											href="<c:url value='/gameschedule' />?year=${year }&amp;month=${month+1}"
											target="_self"> <!-- 다음달 --> <b>&gt;</b>
										</a>
									</c:if> <c:if test="${month > 11 }">
										<b>&gt;</b>
									</c:if> <a
									href="<c:url value='/gameschedule' />?year=${year+1 }&amp;month=${month}"
									target="_self"> <!-- 다음해 --> <b>&gt;&gt;</b>
								</a></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br>
			<table border="0" cellspacing="1" cellpadding="1" bgcolor="#FFFFFF">
				<THEAD>
					<TR bgcolor="#CECECE">
						<TD width='100px'>
							<DIV align="center">
								<font color="red">일</font>
							</DIV>
						</TD>
						<TD width='100px'>
							<DIV align="center">월</DIV>
						</TD>
						<TD width='100px'>
							<DIV align="center">화</DIV>
						</TD>
						<TD width='100px'>
							<DIV align="center">수</DIV>
						</TD>
						<TD width='100px'>
							<DIV align="center">목</DIV>
						</TD>
						<TD width='100px'>
							<DIV align="center">금</DIV>
						</TD>
						<TD width='100px'>
							<DIV align="center">
								<font color="#529dbc">토</font>
							</DIV>
						</TD>
					</TR>
				</THEAD>
				<TBODY>
					<TR>
						
						<c:forEach var="item" items="${gameCalendar}">
							<TD>&nbsp;</TD>
							${item.newLine}++;
						</c:forEach>
						<c:forEach var="item" items="${gameCalendar}" varStatus="status">
							<c:if test="${item.newLine == 0}">
						       color = "RED";
					       <TD valign='top' align='left' height='92px'
									bgcolor='"+backColor+"' nowrap><font color='${color }'>
										${status.current} </font>
							</c:if>
							<c:if test="${item.newLine == 6}">
       						color = "#529dbc";
 							</c:if>
							<c:if test="${item.newLine != 0 && item.newLine != 6}">
							       color = "BLACK"; 
							</c:if>
						</c:forEach>
						
						<c:if test="${iUseDate == gameCalendar.intToday}">
					       if(iUseDate == intToday ) {

             				backColor = "#c9c9c9";

       						}	
						<%
       out.println("<BR>");
	//여기에다가 모 하나 박아야함  gamecount를 박아야겠지?
       out.println("<BR>");

       //기능 제거 

       out.println("</TD>");

       newLine++;

 

       if(newLine == 7)

       {

         out.println("</TR>");

         if(index <= endDay)

         {

           out.println("<TR>");

         }

         newLine=0;

       }

}

//마지막 공란 LOOP

while(newLine > 0 && newLine < 7)

{

  out.println("<TD>&nbsp;</TD>");

  newLine++;

}

%>
						 --%>
					</TR>
				</TBODY>
			</TABLE>
		</DIV>
	</form>

	<!-- 모달창 생성(gamelist)를 받아오려고함 게시판형식으로-->

</BODY>

</HTML>



<!--
 gameInfoByMonth
 -->