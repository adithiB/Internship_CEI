package com.test.model;

public class UserDetails {
	
	private String userName = "some value";
	private String roleName = "some role";
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", roleName=" + roleName + "]";
	}
	
}
