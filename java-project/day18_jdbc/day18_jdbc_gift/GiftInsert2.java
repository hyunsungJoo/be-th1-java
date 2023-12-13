package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GiftInsert2 {
	public static void main(String[] args) throws Exception {

		// 1. Driver load..... exception
		Class.forName("org.mariadb.jdbc.Driver");

		// 2. Connection & Open
		// driver:IP:portNumber/DBName
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

		// 3. 사용 (DML Insert) - PreparedStatement
		// INSERT INTO gift VALUES(11, '스팸', 800, 1200)
		String sql = "INSERT INTO gift VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 15);
		pstmt.setString(2, "사탕세트");
		pstmt.setInt(3, 50);
		pstmt.setInt(4, 500);
		
		int result = pstmt.executeUpdate(); //반환값이 없는 경우 - insert, update, delete
		
		System.out.println(result + " 개 데이터 추가 성공함.");
		
		conn.commit();
		// 4. 닫기 (자원반환)
		pstmt.close();
//		conn.close();
	}

}
