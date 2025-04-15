package _17_MiniProject_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RestaurantDAO {
	protected String username="system";
	protected String password="1111";
	protected String url="jdbc:oracle:thin:@localhost:1521:orcl";
	protected String driverName="oracle.jdbc.driver.OracleDriver";
	protected Connection conn=null;
	
	
	//드라이버 로드
	protected void init() {
		try {
			Class.forName(driverName);
			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//커넥션 가져오는 공통 코드를 메서드로 정의
	protected boolean conn() {
		try {
			conn=DriverManager.getConnection(
					url,username,password);
			System.out.println("커넥션 자원 획득 성공");
			return true;	//커넥션 자원을 정상적으로 획득할 시
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;	//커넥션 자원을 획득하지 못한 경우
	}
	

}
