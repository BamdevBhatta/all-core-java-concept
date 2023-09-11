package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// ============Load the Driver Class==========
		Class.forName("com.mysql.cj.jdbc.Driver");

		// ================ Getting Connection=============
		String username = "root";
		String url = "jdbc:mysql://localhost:3306/broadway";
		String password = "   ";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection created");
		
		
		//==================Insert Sql============
		String sql = "insert into table1(name,password) values('hari', '134')";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		con.close();
		System.out.println("Added Successfully");
		//=============Delete sql queris==============
		String sql1 = "delete from table1 where id=1";
		Statement stmt1 = con.createStatement();
		stmt1.execute(sql1);
		System.out.println("Delete successfully");
		con.close();
		
	}
}
