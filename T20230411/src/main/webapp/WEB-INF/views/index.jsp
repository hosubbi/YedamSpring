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
			<div class=center>
				<h4>도서대여관리 프로그램</h4>
			</div>
			<h5>국제 대여점의 도서등록, 대여정보 데이터베이스를 구축하고, 도서,DVD 대여관리를 위한 프로그램이다.</h5>
			<h5>프로그램 작성 순서</h5>
			<div class=information>
				<p>1. 도서정보 테이블을 생성한다.</p>
				<p>2. 대여정보 테이블을 생성한다.</p>
				<p>3. 도서정보, 대여정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.</p>
				<p>4. 도서정보 입력 화면프로그램을 작성한다.</p>
				<p>5. 도서정보 조회 프로그램을 작성한다.</p>
				<p>6. 대여 정보 조회 프로그램을 작성한다.</p>
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