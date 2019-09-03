<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta charset="UTF-8">
<title>팀 생성</title>
</head>
<body>
<div class="modal-header">
    <!-- 닫기(x) 버튼 -->
  <button type="button" class="close" data-dismiss="modal">×</button>
  <!-- header title -->
  <h4 class="modal-title">Header</h4>
</div>
<!-- body -->
<div class="modal-body">

  <div class="container">
	<div class="row">
    <div class="col-md-8">
        <div class="modal_content">
        <h1 class="entry-title"><span>팀 만들기</span> </h1>
        <hr>
            <form class="form-horizontal" method="post" name="signup" id="signup" enctype="multipart/form-data"
             action="${pageContext.request.contextPath}/teamlist/insertteam">        
        <div class="form-group">
          <label class="control-label col-sm-3">구단이름 <br></label>
          <div class="col-md-5 col-sm-8">
            <input type="text" class="form-control" name="name" id="name" placeholder="생성할 팀의 이름을 입력해주세요.">
          </div>
        </div>
        
         <div class="form-group">
          <label class="control-label col-sm-3">팀 최대인원 <span class="text-danger">*</span></label>
          <div class="col-md-8 col-sm-9">
            <div class="form-inline">
              <div class="form-group">&nbsp;&nbsp;&nbsp;
                <select name="maxNum" id="maxNum" class="form-control">
                  <option value="최대 인원">최대 인원</option>
                  <option value="05" >05 </option> 
                  <option value="10" >10 </option>
                  <option value="15" >15 </option>
                  <option value="20" >20 </option>
                  <option value="25" >25 </option>             
                  </select>
              </div>
            </div>
          </div>
        </div>
        
        <div class="form-group">
          <label class="control-label col-sm-3">활동 지역 <span class="text-danger">*</span></label>
          <div class="col-md-8 col-sm-9">
            <label>
            <input name="uniform" type="radio" value="서울" checked>
            서울 </label>
            <label>
            <input name="uniform" type="radio" value="경기도" >
            경기도 </label>
            <label>
            <input name="uniform" type="radio" value="광주" >
            광주 </label>
            <label>
            <input name="uniform" type="radio" value="부산" >
            부산 </label>
          </div>
        </div>
      
        <div class="form-group">
          <label class="control-label col-sm-3">로고 이미지 <br></label>
          <div class="col-md-5 col-sm-8">
            <div class="input-group"> <span class="input-group-addon" id="file_upload"><i class="glyphicon glyphicon-upload"></i></span>
              <input type="file" name="uploadname" id="logoPath" class="form-control upload" placeholder="" aria-describedby="file_upload">
            </div>
          </div>
        </div>
        
        <div class="form-group">
          <div class="col-xs-offset-3 col-md-8 col-sm-9"><span class="text-muted"><span class="label label-danger">Note:-</span> 이 <a href="#">Team</a>을 이대로 생성하시겠습니까? </span> </div>
        </div>
        <div class="form-group">
          <div class="col-xs-offset-3 col-xs-10">
            <input name="Submit" type="submit" value="팀 생성하기" id="modal_close_btn" class="btn btn-primary">
          </div>
          <div class="modal_layer"></div>
        </div>
      </form>
    </div>
    </div>
</div>
</div>
</div>
<!-- Footer -->
<div class="modal-footer">
    Footer
  <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
</div>
</body>
</html>