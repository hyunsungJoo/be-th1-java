package quiz.jdbc;

import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		
		DeptController.connect();
		DeptController.menu();
	}
}
