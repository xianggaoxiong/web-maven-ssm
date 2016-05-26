<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="${pageContext.request.contextPath }/user/login" method="post">
	<table border="1" cellpadding="1">
		<tr>
			<td colspan="2" align="center">登入界面</td>
		</tr>
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="username"/></td>
		</tr>
		<tr>
			<td>密&nbsp;&nbsp;码:</td>
			<td><input type="password" name="password"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="登入"/></td>
		</tr>
	</table>
</form>
</center>
</body>
</html>