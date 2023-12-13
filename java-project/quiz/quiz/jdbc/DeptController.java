package quiz.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import day18_jdbc_mvc.connUtil.CloseHelper;
import day18_jdbc_mvc.connUtil.ConnectionHelper;
import day18_jdbc_mvc.model.GiftDTO;

public class DeptController {

	// 연결, 삽입, 삭제, 수정, 검색,.....
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;

	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("mariadb");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// menu
	public static void menu() throws SQLException { // 예외처리 위임
		DeptDTO dto = new DeptDTO();
		while (true) {
			System.out.println();

			ConnectionHelper.menu();

			switch (sc.nextInt()) {
			case 0:
				System.out.println("Commit 하시겠습니까?(Y/N) ");
				System.out.println("안하시려면 Rollback 됩니다. ");
				if (sc.next().equalsIgnoreCase("Y")) {
					conn.commit(); // 예외발생
					selectAll(dto.getClassName());
				} else {
					conn.rollback();
					selectAll(dto.getClassName());
				}
				break;

			case 1:
				selectAll(dto.getClassName());
				insert();
				selectAll(dto.getClassName());
				break;
			case 2:
				selectAll(dto.getClassName());
				update(dto.getClassName());
				selectAll(dto.getClassName());
				break;
			case 3:
				selectAll(dto.getClassName());
				break;
			case 4:
				selectByGno(dto.getClassName());
				break;
			case 5:
				selectAll(dto.getClassName());
				delete(dto.getClassName());
				break;
			case 6:
				close();
				System.out.println("프로그램 종료합니다.!!");
				System.exit(0);
				break;
			case 9:
				conn.commit();
				System.out.println("성공적으로 완료 되었습니다.");
				break;

			default:
				System.out.println("없는 번호 선택 하셨습니다. 0~6, 9번 중에서 선택하세요.");
				break;
			} // end switch

		} // end while
	} // end menu

	// delete
	public static void delete(String className) throws SQLException {
		System.out.print("delete recode number DEPTNO= ");
		String DEPTNO = sc.next();
		try {
			pstmt = conn.prepareStatement("DELETE from" + className + " WHERE DEPTNO = ?");
			pstmt.setString(1, DEPTNO);
			int result = pstmt.executeUpdate(); // 쿼리 실행

			System.out.println("정말 삭제하시겠습니까? (y/n) ");
			if (sc.next().equalsIgnoreCase("Y")) {
				commit(); // conn.commit(); // 예외발생
				System.out.println(result + " 개의 데이터가 삭제 되었습니다. ");
			} else {
				rollback(); // conn.rollback();
				System.out.println("rollback 되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// select ~ where
	private static void selectByGno(String className) throws SQLException { //
		System.out.println("검색 원하는 DEPTNO 번호? ");
		pstmt = conn.prepareStatement("select * from " + className + " where DEPTNO = ? ");
		pstmt.setInt(1, sc.nextInt());
		rs = pstmt.executeQuery(); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "  ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
	} // end selectByGno

	// select all
	public static void selectAll(String className) throws SQLException {

		rs = stmt.executeQuery("SELECT * FROM " + className); // 반환값 있는 경우

		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기

				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + (int) rs.getDouble(i) + "  ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
					break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
	}

	// rollback
	public static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("rollback success!!!");
	}

	// commit
	public static void commit() throws SQLException {
		conn.commit();
		System.out.println("commit success!!");
	}

	// insert
	public static void insert() {
		System.out.print("DEPTNO : ");
		String DEPTNO = sc.next();
		System.out.print("DNAME : ");
		String DNAME = sc.next();
		System.out.print("LOC : ");
		String LOC = sc.next();

		try {
			pstmt = conn.prepareStatement("INSERT INTO DEPT VALUES( ?, ?, ?, ? )");
			pstmt.setString(1, DEPTNO);
			pstmt.setString(2, DNAME);
			pstmt.setString(3, LOC);
			int result = pstmt.executeUpdate();

			System.out.println(result + "개 데이터가 추가 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update
	public static void update(String className) throws SQLException { //

		a: while (true) {
			selectAll(className);
			String modify = null;

			System.out.println("0 선택 ==>  update  탈출합니다. ");
			System.out.print("\n\n수정할 DEPTNO : ");
			int DEPTNO = sc.nextInt();

			b: while (true) {
				System.out.println("\n\n1.DEPTNO\t2.DNAME\t3.LOC\t0.exit");
				System.out.print("수정할 필드 : ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.print("바뀔 DEPTNO : ");
					String deptno;
					stmt.execute("update " + className + " set DEPTNO = " + sc.nextInt() + " where DEPTNO = " + DEPTNO);
					break b;
				case 2:
					System.out.print("바뀔 DNAME : ");
					Object sql = stmt.execute(
							"update " + className + " set gname = '" + sc.next() + "' where DEPTNO = " + DEPTNO);
					System.out.println(sql);
					break b;
				case 3:
					System.out.print("바뀔 LOC : ");
					stmt.execute(
							"update " + className + " set g_start = " + sc.nextInt() + " where DEPTNO = " + DEPTNO);
					break b;
				case 0:
					break a; // out while break;
				default:
					System.out.println("잘못된 번호 입니다. ");
					break;
				} // end switch

				switch (choice) {
				case 1:
					modify = "DEPTNO";
				case 2:
					modify = "DNAME";
				case 3:
					modify = "LOC";
				}
				System.out.println(modify + " 수정이 완료 되었습니다. ");
			} // while in end
		} // while out end
	}
}
