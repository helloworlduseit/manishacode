package com.cg.dao;

import java.sql.SQLException;

import com.cg.dto.Login;

public interface LoginDao 
{
	public Login getUserByUnm(String unm) throws SQLException;
	
}
