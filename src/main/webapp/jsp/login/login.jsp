<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录中心</title>
</head>
<body>
	<%
		String messagecopy = (String) request.getAttribute("message");
		String message = (messagecopy == null) ? "" : messagecopy;
	%>

	<div class="login">
		<a href="jsp/servlet/register.jsp">注册用户，点击这里。</a><br>

		<form action="/rts/loginAction" method="get" id="login">
			<table>
				<tr>
					<td><legend class="inputtext" for="userName">用户名称：</legend></td>
					<td><input type="text" id="userName" name="userName" value="" /></td>
					<td><b id="nameInfo"></b></td>

				</tr>
				<tr>
					<td><legend class="inputtext" for="password">密码：</legend></td>
					<td><input type="password" id="password" name="password"
						value=""></td>
					<td><b id="passwordInfo"></b></td>

				</tr>
				<h1><%=message%></h1>
			</table>
			<input type="submit" id="loginButton" value="登录" /><br>
			<a href="/rts/forgetpassword">忘记密码？</a>
			

		</form>
</body>
</html>