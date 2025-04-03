package _14_Class_mission;

public class Client_obj {
	private String clientId=null;
	private String clientName=null;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void prt() {
		System.out.println("---회원정보 보기---");
		System.out.println("아이디: "+this.clientId);
		System.out.println("이름: "+this.clientName);
	}
}
