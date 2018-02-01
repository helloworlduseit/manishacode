package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.dto.Login;
import com.cg.util.DBUtil;

public class LoginDaoImpl implements LoginDao 
{

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	@Override
	public Login getUserByUnm(String unm) throws SQLException 
	{
		Login user=null;
		con=DBUtil.getcon();
		System.out.println("Got Connection");
		String qry="SELECT * FROM user_142958 WHERE user_id=?";
		pst=con.prepareStatement(qry);
		pst.setString(1, unm);
		rs=pst.executeQuery();
		rs.next();
		user=new Login(rs.getString("user_id"),rs.getString("password"));
		return user;
	}

}
