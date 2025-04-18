package _17_MiniProject_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import _17_MiniProject_DTO.GuestDTO;

public class GuestDAO extends RestaurantDAO {
	
	public static GuestDAO gdao=null;
	private GuestDAO(){
		super.init();
	}
	
	// 고객 회원가입
	public void insertGuest(GuestDTO newGuest) {
		if(conn()) {
			try {
				String sql="insert into guest (guestid, guestpassword, guestname,guestregnum, guestphonenum) values (?,?,?,?,?)";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, newGuest.getGuestId());
				psmt.setString(2, newGuest.getGuestPassword());
				psmt.setString(3, newGuest.getGuestName());
				psmt.setString(4, newGuest.getGuestRegNum());
				psmt.setString(5, newGuest.getGuestPhoneNum());
				int resultInt=psmt.executeUpdate();
				if(resultInt>0) {
					System.out.println("회원가입이 완료되었습니다");
					conn.commit();
				}else {
					System.out.println("회원가입에 문제가 발생했습니다");
					conn.rollback();
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
	// 싱글톤 디자인
	public static GuestDAO getInstance() {
		if(gdao==null) {
			gdao=new GuestDAO();
		}
		return gdao;
	}
	
	// 고객 정보 수정
	public void updateGuest(GuestDTO modGuest) {
		if(conn()) {
			try {
				String sql="update guest set guestpassword=?, guestname=?, guestphonenum=?, guestregnum=? where guestid=?";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, modGuest.getGuestPassword());
				psmt.setString(2, modGuest.getGuestName());
				psmt.setString(3, modGuest.getGuestPhoneNum());
				psmt.setString(4, modGuest.getGuestRegNum());
				psmt.setString(5, modGuest.getGuestId());
				int ResultInt=psmt.executeUpdate();
				if(ResultInt>0) {
					conn.commit();
					System.out.println("회원 정보가 수정되었습니다");
				}else {
					conn.rollback();
					System.out.println("회원 정보 수정 실패");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	// 아이디 조회
	public GuestDTO findGuest(String guestId) {
		GuestDTO gdto=new GuestDTO();
		if(conn()) {
			try {
				String sql="select * from guest where guestid=?";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, guestId);
				ResultSet rs=psmt.executeQuery();
				if(rs.next()) {
					gdto.setGuestId(rs.getString("guestid"));
					gdto.setGuestName(rs.getString("guestname"));
					gdto.setGuestPassword(rs.getString("guestpassword"));
					gdto.setGuestPhoneNum(rs.getString("guestphonenum"));
					gdto.setGuestRegNum(rs.getString("guestregnum"));
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
		return gdto;
	}
}
