import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author sali
 *
 */
public class Application {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DBConnector dbConnector = new DBConnector("jdbc:mysql://localhost:3306/employees", "com.mysql.cj.jdbc.Driver", "emanager",
				"emanager");
		Statement statement = dbConnector.getConnection();
		// statement.executeUpdate("Insert into employee(eid, ename, email, mobile,
		// description, salary) values("+1001+","++")")
		for (int i = 1; i < 5; i++) {
			String sql = "insert into Employee(eid, ename, email, mobile, description, salary) values(" + 100 * i
					+ ",'name" + i + "','df" + i + "','df" + i + "','df" + i + "'," + (i * 20) + ")";
			boolean response = statement.execute(sql);
			System.out.println(response);
		}
	}
}
