package _17_MiniProject_DTO;

public class StaffDTO {
	private String staffName=null;
	private String staffIdNum=null;
	private String staffPassword=null;
	private String staffRank=null;
	private String staffPhoneNum=null;
	private String staffRegNum=null;
	
	//getter, setter
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffIdNum() {
		return staffIdNum;
	}
	public void setStaffIdNum(String staffNum) {
		this.staffIdNum = staffNum;
	}
	public String getStaffRank() {
		return staffRank;
	}
	public void setStaffRank(String staffRank) {
		this.staffRank = staffRank;
	}
	public String getStaffPhoneNum() {
		return staffPhoneNum;
	}
	public void setStaffPhoneNum(String staffPhoneNum) {
		this.staffPhoneNum = staffPhoneNum;
	}
	public void setStaffPhoneNum(String staffPhoneNum1, String staffPhoneNum2) {
		this.staffPhoneNum="010-"+staffPhoneNum1+"-"+staffPhoneNum2;
	}
	public String getStaffRegNum() {
		return staffRegNum;
	}
	public void setStaffRegNum(String staffRegNum) {
		this.staffRegNum = staffRegNum;
	}
	public void setStaffRegNum(String staffRegNum1, String staffRegNum2) {
		this.staffRegNum=staffRegNum1+staffRegNum2;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	
	
}
