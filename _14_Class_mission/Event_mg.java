package _14_Class_mission;

import java.util.ArrayList;
import java.util.Scanner;

public class Event_mg {
	Scanner in=new Scanner(System.in);
	ArrayList<Event_obj> eventList=new ArrayList<Event_obj>();
	public Event_mg() {
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 이벤트 등록하기");
			System.out.println("2. 이벤트 전체보기");
			System.out.println("3. 프로그램 종료");
			int selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				addEvent();
			}else if(selNum==2) {
				allEvent();
			}else if(selNum==3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("올바른 메뉴를 선택해주세요");
			}
		}
	}
	private void addEvent() {
		System.out.println("등록할 이벤트 제목을 입력하세요");
		String eventTitle=in.nextLine();
		int idx=findIdx(eventTitle);
		if(idx==-1) {
			System.out.println("이벤트 내용을 입력하세요");
			String eventContent=in.nextLine();
			Event_obj newEvent=new Event_obj();
			newEvent.setEventTitle(eventTitle);
			newEvent.setEventContent(eventContent);
			eventList.add(newEvent);
			System.out.println("이벤트가 등록되었습니다.");
		}else {
			System.out.println("해당 이벤트가 이미 존재합니다");
		}
	}
	private void allEvent() {
		for(Event_obj event:eventList) {
			event.prt();
		}
	}
	private int findIdx(String eventTitle) {
		int idx=-1;
		for(int i=0;i<eventList.size();i++) {
			Event_obj event=eventList.get(i);
			if(event.getEventTitle().equals(eventTitle)) {
				idx=-1;
				break;
			}
		}
		return idx;
	}
}
