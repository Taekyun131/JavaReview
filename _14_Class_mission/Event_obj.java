package _14_Class_mission;

public class Event_obj {
	private String eventTitle=null;
	private String eventContent=null;
	
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getEventContent() {
		return eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}
	
	public void prt() {
		System.out.println("---이벤트 정보---");
		System.out.println("제목: "+this.eventTitle);
		System.out.println("내용: "+this.eventContent);
	}
}
