<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
            	<h2>도서 리스트</h2>
                <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                	<thead>
                    	<tr>
	                        <th>도서번호</th>
	                        <th>도서명</th>
	                        <th>도서표지</th>
	                        <th>출판일자</th>
	                        <th>금액</th>
	                        <th>출판사</th>
	                        <th>도서소개</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<c:forEach var="book" items="${list }">
                        	<tr>
                            	<td><c:out value="${book.bookNo }"></c:out></td>
                                <td><c:out value="${book.bookName }"></c:out></td>
                                <td><c:out value="${book.bookCoverimg }"></c:out></td>
                                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${book.bookDate }" /></td>
                                <td><c:out value="${book.bookPrice }"></c:out></td>
                                <td><c:out value="${book.bookPublisher }"></c:out></td>
                                <td><c:out value="${book.bookInfo }"></c:out></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>    
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