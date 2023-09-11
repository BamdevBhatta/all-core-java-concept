package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// register Driver
		Class.forName("com.mysql.jdbc.Driver");

		// get_Conneciton(url,username,password)
		Connection con = DriverManager.getConnection("jdbc:mysql:/?localhost:3306/testdbipm", "root", " ");
		// ==============insert squall=============
//		String sql = "insert into user (username,password) values()";
//		Statement stmt = con.createStatement();
//		stmt.execute(sql);
//		con.close();
//		System.out.println("Data Added");
		//==============select sequel=========
		String sql = "select * from user";
		Statement stmt = con.createStatement();
		ResultSet rs =stmt.executeQuery(sql);
		
		
		//==========Update========
//		String sql = "update user set password = 'test' where id =2";
//		Statement stmt = con.createStatement();
//		stmt.execute(sql);
//		System.out.println("update Successfully");
	}
}
