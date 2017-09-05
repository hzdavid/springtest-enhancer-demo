package springtestenhancer.demo.bean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * order data base access object
 * @author david
 *
 */
public class OrderDAOService {

	public void saveToDataBase(Order order) {
		// the logic saving order to database;
		//.....

	}

	public void init() throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.1.109:3306/mydb";
		String user = "root";
		String password = "root";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if (conn.isClosed()) {
			throw new Exception("Can't to connect to the Database!");
		} else {
			System.out.println("Succeefully connecting to the Database!");
		}
	}

}
