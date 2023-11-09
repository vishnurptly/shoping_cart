<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RPcart login</title>
<%@include file="header.jsp"%>
<Style>
	body{
	background:#DDE7ED;
</Style>
</head>
<body>

<div class="container">
	<div class="card w-5 mx-auto my-5">
		<div class="card-header text-center">User login</div>
			<div class="card-body">
			<form action="loginServlet" method="post">
			
				<div class="form-group">
					<label>Username</label> <input type="username"
					class="form-control" name="Login-username"
					placeholder="enter your username" required>
				</div>
				<div class="form-group">
					<label>password</label> <input type="password"
					class="form-control" name="Login-password"
					placeholder="*******	" required>
				</div>
				<div class="text-center">
				<button type="submit" class="btn btn-primary">Login</button>
				<a href="Sing.jsp" class="btn btn-primary">Sing up</a>
				
				</div>
				
			</form>
		 </div>
	</div>
</div>


<%@include file="footer.jsp"%>
</body>
</html>