package com.cg.service;

import java.sql.SQLException;

import com.cg.dto.Login;

public interface LoginService
{
	public Login getUserByUnm(String unm) throws SQLException ;

}
