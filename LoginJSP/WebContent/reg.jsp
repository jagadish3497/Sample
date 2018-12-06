<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<%@ page import = 'java.sql.*'  %>
<%@ page import ='javax.sql.*'  %>

<%
String user=request.getParameter("userid");
String pwd =request.getParameter("pwd");
System.out.println(pwd);
System.out.println(user);
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");
String  mobile=request.getParameter("mobilenumber");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
		Statement st = con.createStatement();
ResultSet rs;

int i =st.executeUpdate("insert into UsersList values ('"+user+"','"+pwd+"','"+fname+"','"+lname+"','"+email+"','"+mobile+"')");
out.println("Success");
%>

<a href ='login.html'>Login</a>
</body>
</html>