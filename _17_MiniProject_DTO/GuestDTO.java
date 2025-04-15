package _17_MiniProject_DTO;

public class GuestDTO {
	private String guestName=null;
	private String guestId=null;
	private String guestPassword=null;
	private String guestRegNum=null;
	private String guestPhoneNum=null;
	
	//getter, setter
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestRegNum() {
		return guestRegNum;
	}
	public void setGuestRegNum(String guestRegNum) {
		this.guestRegNum=guestRegNum;
	}
	public void setGuestRegNum(String guestRegNum1, String guestRegNum2) {
		this.guestRegNum = guestRegNum1+"-"+guestRegNum2;
	}
	public String getGuestPhoneNum() {
		return guestPhoneNum;
	}
	public void setGuestPhoneNum(String guestPhoneNum) {
		this.guestPhoneNum=guestPhoneNum;
	}
	public void setGuestPhoneNum(String guestPhoneNum1, String guestPhoneNum2, String guestPhoneNum3) {
		this.guestPhoneNum = guestPhoneNum1+"-"+guestPhoneNum2+"-"+guestPhoneNum3;
	}
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	public String getGuestPassword() {
		return guestPassword;
	}
	public void setGuestPassword(String guestPassword) {
		this.guestPassword = guestPassword;
	}
	
	
}
