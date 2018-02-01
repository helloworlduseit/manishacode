package com.cg.service;

import java.sql.SQLException;

import com.cg.dao.LoginDao;
import com.cg.dao.LoginDaoImpl;
import com.cg.dto.Login;

public class LoginServiceImpl implements LoginService
{
	LoginDao logDao=null;

	public LoginServiceImpl()
	{
		logDao=new LoginDaoImpl();
	}
	@Override
	public Login getUserByUnm(String unm) throws SQLException {
		
		return logDao.getUserByUnm(unm);
	}

}
