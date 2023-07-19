package com.test.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

import com.test.model.UserDetails;

public class DbConnection {
	
	private static UserDetails setData(String a1, String a2) {
		UserDetails obj = new UserDetails();
		obj.setUserName(a1);
		obj.setRoleName(a2);
		System.out.println(obj.toString());
		return obj;
	}

	public static void main(String args[]) {
		System.out.println("Welcome!");
		String dbUrl = "jdbc:mysql://localhost:3306/dev_db";
		String userName = "dev_user";
		String password = "Abcd1234!";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, userName, password);
			System.out.println(Objects.isNull(con));
			Statement stmt = con.createStatement();
			//int updateCount = stmt.executeUpdate("select uD.username, rD.role_name from login as uD join login_roles userRoles on userRoles.login_id = uD.id join roles as rD on rD.role_id = userRoles.role_id");
			ResultSet rs = stmt.executeQuery("select uD.username, rD.role_name from login as uD join login_roles userRoles on userRoles.login_id = uD.id join roles as rD on rD.role_id = userRoles.role_id");
			//if (updateCount != 0) {

				while (rs.next())

					//System.out.println(rs.getString(1) + "---" + rs.getString(2));
					setData(rs.getString(1), rs.getString(2));
				con.close();
			//}
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
