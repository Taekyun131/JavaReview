package _17_MiniProject_Service;

import java.util.Scanner;

public class StaffService {
	Scanner in=new Scanner(System.in);
	public StaffService() {
		staffMenu();
	}
	private void staffMenu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 로그인");
			System.out.println("2. 출퇴근 등록");
			System.out.println("3. 근무시간 조회");
			System.out.println("4. 개인정보 수정");
			System.out.println("5. 사직원 작성");
			System.out.println("6. 로그아웃");
			System.out.println("7. 뒤로가기");
			try {
				int selNum=in.nextInt();
				if(selNum==1) {
					staffLogin();
				}else if(selNum==2) {
					staffClockInOut();
				}else if(selNum==3) {
					staffWorkhour();
				}else if(selNum==4) {
					staffModInfo();
				}else if(selNum==5) {
					staffResign();
				}else if(selNum==6) {
					staffLogout();
				}else if(selNum==7) {
					break;
				}else {
					continue;
				}
			} catch (Exception e) {
				e.printStackTrace();
				in.nextLine();
				continue;
			}
		}
	}
	private void staffLogin() {
		// TODO Auto-generated method stub
		
	}
	private void staffClockInOut() {
		// TODO Auto-generated method stub
		
	}
	private void staffWorkhour() {
		// TODO Auto-generated method stub
		
	}
	private void staffModInfo() {
		// TODO Auto-generated method stub
		
	}
	private void staffResign() {
		// TODO Auto-generated method stub
		
	}
	private void staffLogout() {
		// TODO Auto-generated method stub
		
	}
}
