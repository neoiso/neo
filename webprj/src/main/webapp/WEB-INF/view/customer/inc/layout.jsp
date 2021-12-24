<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>  <!-- 라이브러리 설정 -->
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <!-- <title>공지사항목록</title> -->
    <title><tiles:getAsString name="title" /></title>  <!-- tiles.xml의 title을 가져다 씀 -->
    
    <link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
    <style>
    
        #visual .content-container{	
            height:inherit;
            display:flex; 
            align-items: center;
            
            background: url("../../images/customer/visual.png") no-repeat center;
        }
    </style>
</head>

<body>
    <!-- header 부분 -->
	<tiles:insertAttribute name="header"/>  <!-- 여기에 header 부분을 사용하겠다. tiles.xml의 이름과 같아야함-->

	<!-- visual 부분 -->
	<tiles:insertAttribute name="visual"/>

	<!-- body 부분 -->
	<div id="body">
		<div class="content-container clearfix">

			<!-- aside 부분 -->
			<tiles:insertAttribute name="aside"/>

			<!-- body 부분 -->
			<tiles:insertAttribute name="body"/>

			
		</div>
	</div>
	
	<!-- footer 부분 -->
    <tiles:insertAttribute name="footer"/>



    </body>
    
    </html>