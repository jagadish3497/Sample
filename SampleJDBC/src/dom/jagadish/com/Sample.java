package dom.jagadish.com;

import java.sql.*;

public class Sample {
	public static void main(String[] args) throws Exception {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="system";
		String pass="3497";
		String query="select * from lol";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		rs.next();
		String n= rs.getString("name");
		System.out.println(n);
		st.close();
		
		con.close();
				}

}
