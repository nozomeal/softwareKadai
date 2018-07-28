<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link href="https://fonts.googleapis.com/css?family=Patua+One" rel="stylesheet">
<html>
<style type="text/css">
<!--p{text-align:center;margin-top:150pt;font-size:40px;font-family: 'Patua One', cursive;color:#ffffff;margin-top:250pt;}
body {background-image: url(list.jpg);font-family: 'Patua One', cursive; }
a{text-decoration:none;}
div{margin-top:300pt;text-align:center;font-size:40px; font-color:#ffffff;}
a:link { color: #ffffff; }
a:visited { color: #ffffff;}
a:active { color: #F5C5C5; background-color:#ffffff;} 
a:hover { color: #F5C5C5; background-color:#ffffff; } 
--></style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
</head>
<body>
<p>
<% if(request.getAttribute("number")!=null&&request.getAttribute("name")!=null) { %>
<%= request.getAttribute( "number" ) %> 　　
<%= request.getAttribute( "name" ) %> <br>
<% }%><p>
<div><a href='index.html'>top</a></div>

<p>by Chilly girls</p>
</body>
</html>