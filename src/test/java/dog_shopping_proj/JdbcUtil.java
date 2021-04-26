package dog_shopping_proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/shoppingmall?useSSL=false";
			String id = "user_dog_shoppingmall";
			String password = "rootroot";
//			System.out.println(url);

			conn = DriverManager.getConnection(url, id, password);
//			System.out.println(conn1);
//			System.out.println(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

}
