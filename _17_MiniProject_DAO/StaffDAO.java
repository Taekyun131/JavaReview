package _17_MiniProject_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import _17_MiniProject_DTO.StaffDTO;

public class StaffDAO extends RestaurantDAO{
	public static StaffDAO sdao=null;
	
	private StaffDAO() {
		super.init();
	}
	
	// 싱글톤 디자인
	public static StaffDAO getInstance() {
		if(sdao==null) {
			sdao=new StaffDAO();
		}
		return sdao;
	}
	
	// 직원 조회
	public StaffDTO selectStaff(String staffIdNum) {
		StaffDTO staff=new StaffDTO();
		if(conn()) {
			try {
				String sql="select * from staff where staffidnum=?";
				PreparedStatement psmt=conn.prepareStatement(sql);
				psmt.setString(1, staffIdNum);
				ResultSet rs=psmt.executeQuery();
				if(rs.next()) {
					staff.setStaffIdNum(staffIdNum);
					staff.setStaffName(rs.getString("staffname"));
					staff.setStaffPassword(rs.getString("staffPassword"));
					staff.setStaffPhoneNum(rs.getString("staffphonenum"));
					staff.setStaffRegNum(rs.getString("staffregnum"));
					staff.setStaffRank(rs.getString("staffrank"));
					return staff;
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
		return null;
	}
}
