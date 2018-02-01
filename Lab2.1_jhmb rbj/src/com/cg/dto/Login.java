package com.cg.dto;

public class Login 
{
	private String userName;
	private String password;
	//constructors
	public Login() {
		super();
	
	}
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	//getter setters
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	//toString
	@Override
	public String toString() 
	{
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	

}
