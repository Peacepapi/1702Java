package com.revature.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CustomerDAO {

	public String getFullname(int id) throws Exception{
								// 1 IN, 2 OUT
		String sql = "CALL FULLNAME(?,?)";
		Connection conn = ConnectionFactory.getConnection();
		CallableStatement stmt = conn.prepareCall(sql);
		stmt.setInt(1, id);
		// register output parameter with JDBC
		stmt.registerOutParameter(2, Types.VARCHAR);
		stmt.execute(); //calling the procedure
		// extract the out param value
		String outParam = stmt.getString(2);
		conn.close();
		return outParam;
	}
	
}








