<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="https://fonts.googleapis.com/css?family=Patua+One" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
<!--
body {background-image: url(check.jpg);font-family: 'Patua One', cursive;}
input{border:0; padding:10px; font-size:1.3em;
font-family:Arial, sans-serif; color:#aaa; border:solid 1px #ccc; margin:0 0 20px;
width:300px; -webkit-border-radius: 3px;
-moz-border-radius: 3px; border-radius: 3px; margin-left:400pt; 
}
input.id{margin-top:360pt; }
div{color:#ffffff;  font-size:40px; }
div.yes{margin-top:70pt;}
div.no{margin-top:-40pt;}
a{text-decoration:none;}
a.yes{margin-left:250pt;}
a.no{margin-left:600pt;}
a:link { color: #ffffff; }
a:visited { color: #ffffff; }
a:active { color: #F5C5C5; background-color:#ffffff;} 
a:hover { color: #F5C5C5; background-color:#ffffff; } 
p{text-align:center;margin-top:300pt;font-family: 'Patua One', cursive;color:#ffffff;}
--></style>
<title>Check!</title>
 <body>
  	<input type="text" name="userID" class="id"><br>
<input type="text" name="name"><br>
    <div class="yes"><a href='/Attendance' class="yes">Yes!</a></div>
   	<div class="no"><a href='/Absence' class="no">No...</a></div>

  	<p>by Chilly girls</p>
  </body>
</html>