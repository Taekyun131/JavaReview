package _14_Class_mission;

import java.util.ArrayList;
import java.util.Scanner;

public class Client_mg {
	ArrayList<Client_obj> clientList=new ArrayList<Client_obj>();
	Scanner in=new Scanner(System.in);
	public Client_mg() {
		menu();
	}
	
	public void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원정보 보기");
			System.out.println("3. 회원정보 수정하기");
			System.out.println("4. 회원 탈퇴하기");
			System.out.println("5. 프로그램 종료");
			int selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				addClient();
			}else if(selNum==2) {
				showInfo();
			}else if(selNum==3) {
				modInfo();
			}else if(selNum==4) {
				delInfo();
			}else if(selNum==5) {
				break;
			}
		}
	}
	
	private void addClient() {
		boolean flag=true;
		while(flag) {
			System.out.println("회원의 아이디를 입력하세요");
			String clientId=in.nextLine();
			int idx=findIdx(clientId);
			if(idx==-1) {
				System.out.println("회원의 이름을 입력하세요");
				String clientName=in.nextLine();
				Client_obj newClient=new Client_obj();
				newClient.setClientId(clientId);
				newClient.setClientName(clientName);
				clientList.add(newClient);
				System.out.println("회원가입이 완료되었습니다");
				flag=false;
			}else {
				System.out.println("해당 아이디는 사용이 불가합니다");
			}
		}
	}
	private void showInfo() {
		System.out.println("조회할 회원의 아이디를 입력하세요");
		String clientId=in.nextLine();
		int idx=findIdx(clientId);
		if(idx==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다");
		}else {
			clientList.get(idx).prt();
		}
	}
	private void modInfo() {
		System.out.println("수정할 회원의 아이디를 입력하세요");
		String clientId=in.nextLine();
		int idx=findIdx(clientId);
		if(idx==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다");
		}else {
			Client_obj client=clientList.get(idx);
			client.prt();
			System.out.println("수정할 회원의 이름을 입력하세요");
			String modClientName=in.nextLine();
			client.setClientName(modClientName);
			System.out.println("수정되었습니다");
		}
	}
	private void delInfo() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요");
		String clientId=in.nextLine();
		int idx=findIdx(clientId);
		if(idx==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다");
		}else {
			Client_obj delClient=clientList.get(idx);
			System.out.println("확인을 위해 회원의 이름을 입력하세요");
			String clientName=in.nextLine();
			if(delClient.getClientName().equals(clientName)) {
				clientList.remove(idx);
				System.out.println("탈퇴가 완료되었습니다");
			}else {
				System.out.println("정보가 일치하지 않습니다");
			}
		}
	}
	private int findIdx(String clientId) {
		int idx=-1;
		for(int i=0;i<clientList.size();i++) {
			Client_obj client=clientList.get(i);
			if(client.getClientId().equals(clientId)) {
				idx=i;
				break;
			}
		}
		return idx;
	}
}
