<!--<form action="LoginServlet" method="post">
    Name:<input type="text" name="name"><br>
    Password:<input type="password" name="password"><br>
    <input type="submit" value="login">
</form>-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script src="<c:url value="/bootstrap/js/jquery.min.js"/>"></script>
    <script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
</head>
<body>

<div class="container">
    <h1>Login page</h1>
    <form id="loginform" action="LoginServlet" method="post" class="form-horizontal" role="form">
        <div style="margin-bottom: 25px" class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input id="name" type="text" class="form-control" name="name" placeholder="Enter your name">
        </div>
        <div style="margin-bottom: 25px" class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <input id="password" type="password" class="form-control" name="password" placeholder="password">
        </div>
        <div style="margin-top:10px" class="form-group">
            <div class="col-sm-12 controls">
                <input type="submit" class="btn btn-default pull-right" value="Login">
            </div>
        </div>
    </form>
</div>

</body>
</html>