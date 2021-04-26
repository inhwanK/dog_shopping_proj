package dog_shopping_proj;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JndiDS {

	private static DataSource ds;
	
	private JndiDS() {
	}

	static {
		try {
			Context ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/dog_shopping_proj");
			System.out.println("ds : " + ds);
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void commit(Connection con) {
		try {
			con.commit();
			System.out.println("commit success");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection con) {
		try {
			con.rollback();
			System.out.println("commit success");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
