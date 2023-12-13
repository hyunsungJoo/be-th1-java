package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftInsert3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		// 1. Driver load..... exception
		Class.forName("org.mariadb.jdbc.Driver");

		// 2. Connection & Open
		// driver:IP:portNumber/DBName
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

		// 3. 사용 (DML Insert) - PreparedStatement
		// INSERT INTO gift VALUES(11, '스팸', 800, 1200)
		System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가 = ");
		String sql = "INSERT INTO gift VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		
		int result = pstmt.executeUpdate(); //반환값이 없는 경우 - insert, update, delete
		
		System.out.println(result + " 개 데이터 추가 성공함.");
		
		conn.commit();
		// 4. 닫기 (자원반환)
		pstmt.close();
//		conn.close();
	}

}
