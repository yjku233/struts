package test.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import test.action.Dao;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Dao {
	
	private static Dao instance = new Dao();
	
	public static Dao getInstance() {
		return instance;
	}
	
	private Dao() {}
	
	private void dbClose(Connection conn, PreparedStatement pstmt) {		
		if (conn != null) try { conn.close(); } catch(SQLException e) {}
		if (pstmt != null) try { pstmt.close(); } catch(SQLException e) {}
	}
	
	private Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		Context env = (Context)ctx.lookup("java:comp/env");
		DataSource ds = (DataSource)env.lookup("jdbc/orcl");
		Connection conn = ds.getConnection();
		return conn;
	}
	
	public boolean insertMember(UserInfo userInfo){
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean x = false;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("insert into test1 values(?, ?, ?)");
			pstmt.setString(1, userInfo.getName());
			pstmt.setString(2, userInfo.getAddr());
			pstmt.setString(3, userInfo.getTel());
			pstmt.executeUpdate();
			x = true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(conn,pstmt);
		}
		return x;
	}
}
