package com.test.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class DbConnection {

	public static void main(String args[]) {
		System.out.println("Welcome!");
		String dbUrl = "jdbc:mysql://localhost:3306/dev_db";
		String userName = "dev_user";
		String password = "*******";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println(Objects.isNull(con));
			Statement stmt = con.createStatement();
			int updateCount = stmt.executeUpdate("insert into login values (3, 'abc', false)");
			ResultSet rs = stmt.executeQuery("select * from login");
			if (updateCount != 0) {

				while (rs.next())

					System.out.println(rs.getBoolean(3));
				con.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try{
			
		}catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}
	}
}
