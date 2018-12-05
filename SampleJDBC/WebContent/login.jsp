<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import = 'java.sql.*'  %>
<%@ page import ='javax.sql.*'  %>


<%
String user=request.getParameter("userid");

String pwd =request.getParameter("pwd");

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe'system''3497' ");
		Statement st = con.createStatement();
ResultSet rs=st.executeQuery("select * from lol where userid="+user+","+pwd+"");
if(rs.next()){
	if(rs.getString(2).equals(pwd)){
		out.println("Welcome"+userid);
	}else{
		out.println("Invalid ");
		
	}
}
else
%>
<a href=login.html>Login</a>
</body>
</html>