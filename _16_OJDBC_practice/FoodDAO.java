package _16_OJDBC_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodDAO {
	public static FoodDAO fdao=null;
	
	//드라이버 로드 변수
	private String username="system";
	private String password="1111";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName="oracle.jdbc.driver.OracleDriver";
	private Connection conn=null;
	private FoodDAO() {
		init();
	}
	//싱글톤 디자인
	public static FoodDAO getInstance() {
		if(fdao==null) {
			fdao=new FoodDAO();
		}
		return fdao;
	}
	// 드라이버 로드
	private void init() {
		try {
			Class.forName(driverName);
			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private boolean conn() {//커넥션 가져오는 공통 코드를 메서드로 정의
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
	//음식 등록
	public void insertFood(FoodDTO fdto) {
		if(conn()) {
			String sql="insert into myfood values (?,default,?)";
			try {
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, fdto.getFoodName());
				psmt.setInt(2, fdto.getFoodLikeLevel());
				int resultInt=psmt.executeUpdate();
				if(resultInt>0) {
					conn.commit();
				}else {
					conn.rollback();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	//음식조회
	public FoodDTO selectFood(String searchFoodName) {
		FoodDTO resultFood=new FoodDTO();
		try {
			if(conn()) {
				String sql="select * from myfood where foodName=?";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, searchFoodName);
				ResultSet rs=psmt.executeQuery();
				if(rs.next()) {
					resultFood.setFoodName(rs.getString("foodName"));
					resultFood.setFoodLikeLevel(rs.getInt("foodLikeLevel"));
					resultFood.setFoodIntime(rs.getString("foodInTime"));
					return resultFood;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultFood;
	}
	//음식수정
	public void updateFood(FoodDTO modFood) {
		try {
			if(conn()) {
				String sql="UPDATE myfood SET foodLikeLevel=? WHERE foodName=?";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setInt(1, modFood.getFoodLikeLevel());
				psmt.setString(2, modFood.getFoodName());
				int resultInt=psmt.executeUpdate();
				if(resultInt>0) {
					conn.commit();
					System.out.println("변경되었습니다");
				}else {
					conn.rollback();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//음식삭제
	public void deleteFood(String delFoodName) {
		try {
			if(conn()) {
				String sql="delete myfood where foodName=?";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, delFoodName);
				int resultInt=psmt.executeUpdate();
				if(resultInt>0) {
					conn.commit();
					System.out.println("삭제되었습니다");
				}else {
					conn.rollback();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
