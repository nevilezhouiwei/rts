<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="register">
		<h1 id="title">用户信息注册，请认真填写！</h1>
		<form action="/rts/register" method="post" id="register">
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
				<tr>
					<td><legend class="inputtext" for="conPass">密码确认：</legend></td>
					<td><input type="password" id="repassword" name="repassword"
						value=""></td>
					<td><b id="repasswordInfo"></b></td>

				</tr>
				
				<tr>
					<td><legend class="inputtext" for="birthday">出身日期：</legend></td>
					<td><input type="date" id="birthday" name="birthday" value=""></td>
					<td><b id="birthdayInfo"></b></td>

				</tr>
				<tr>
					<td><legend class="inputtext" for="cerIDno">身份证号码：</legend></td>
					<td><input type="text" id="cerIDno" name="cerIDno" value=""></td>
					<td><b id="cerIDnoInfo"></b></td>

				</tr>
				<tr>
					<td>地址：</td>
					<td><select name="address" id="adID">
							<option value="SH">上海</option>
							<option valu="BJ">北京</option>
					</select>省 <select name="">
							<option value="ZB">闸北区</option>
					</select>区/县<br> <textarea form="register" placeholder="输入街道详细地址"></textarea></td>
				</tr>
			</table>
			<input type="submit" id="testButton" value="注册" />
		</form>
	</div>
</body>
</html>