import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author sali
 *
 */
public class DBConnector {

	private Connection connection;

	public DBConnector(String urlString, String driverClassName, String user, String password)
			throws ClassNotFoundException, SQLException {

		// This loads the drivers into JVM
		Class.forName(driverClassName);
		// This tries to connect to database using Driver loaded above
		connection = DriverManager.getConnection(urlString, user, password);
	}

	public Statement getConnection() throws SQLException {
		return this.connection.createStatement();
	}
}
