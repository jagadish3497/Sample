<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>


</head>
<body>
	<%
		String user = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		//System.out.println(user+" "+pwd);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system", "orcl11g");
		PreparedStatement preparedStatement = con
				.prepareStatement("select userid,password from UsersList where userid=? and  password=?");
		preparedStatement.setString(1, user);
		preparedStatement.setString(2, pwd);
		ResultSet rs = preparedStatement.executeQuery();
		if(rs==null){
			out.print("Error");
		}
		 if(!rs.next())
			out.print("Provide correct details");
		else { 
		
			/*  System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));  */
		 if (user.equals(rs.getString(1)) && pwd.equals(rs.getString(2))) {
			         out.println("Welcome" + user);
			     
		   }
		
		
	}
		
	%>
	<hr/>
	<a href=login.html>Login</a>
</body>
</html>