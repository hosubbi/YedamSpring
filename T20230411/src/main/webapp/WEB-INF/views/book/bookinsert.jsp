<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시작화면</title>
<style>
	.container {
	}
	.container nav{
		background-color: gray;
		
	}
	.container h1{
		text-align: center;
	}
	.container nav ul li {
		list-style: none;
		display: inline-block;
		margin-right: 20px;
		text-align: center;
		font-size: 20px;
		font-weight: bold;
		
	}
	.container form div label{
	
		margin-right: 30px;
	}
	.container h2{
		text-align: center;
	}
	
	.center {
		text-align: center;
	}
	.information {
		margin-left: 30px;
	}
</style>
</head>
<body>
	<div class=container>
		<header>
			<h1>도서대여관리</h1>
			<nav>
				<ul>
					<li><a href="/register">도서등록</a></li>
					<li><a href="">도서목록조회/수정</li>
					<li><a href="">대여현황조회</a></li>
					<li><a href="/index">홈으로</a></li>
				</ul>
			</nav>
		</header>
		
		
		<section>
			<div class="panel-heading">
                           	<h2>도서 등록</h2>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <form role="form" action="/register" method="post">
                            	<div class="form-group">
                            		<label>도서번호</label>
                            		<input class="form-control" type="number" readonly>
                            	</div>
                            	<div class="form-group">
                            		<label>도서명</label>
                            		<input class="form-control" type="text" name="bookName">
                            	</div>
                            	<div class="form-group">
                            		<label>도서표지</label>
                            		<input class="form-control" type="text" name="bookCoverimg">
                            	</div>
                            	<div class="form-group">
                            		<label>출판일자</label>
                            		<input class="form-control" type="text" name="bookDate">
                            	</div>
                            	<div class="form-group">
                            		<label>금액</label>
                            		<input class="form-control" type="number" name="bookPrice">
                            	</div>
                            	<div class="form-group">
                            		<label>출판사</label>
                            		<input class="form-control" type="text" name="bookPublisher">
                            	</div>
                            	<div class="form-group">
                            		<label>도서소개</label>
                            		<textarea class="form-control" name="bookInfo"></textarea>
                            	</div>
                            	<button type="submit" class="btn btn-default">등록</button>
                            	<button type="reset" class="btn btn-default">조회</button>
                            </form>                            
                        </div>
            </div>
		</section>
		<footer>
			<div class=center>
				<h5>HRDKOREA Copyright© 2016 All right reserved. Human Resources Development Service of Korea.</h5>
			</div>
		</footer>
		
	</div>
	
</body>
</html>