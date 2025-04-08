package _17_MiniProject_Service;

import java.util.Scanner;

public class GuestService {
	Scanner in=new Scanner(System.in);
	public GuestService() {
		guestMenu();
	}
	private void guestMenu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 리뷰작성");
			System.out.println("5. 로그아웃");
			System.out.println("6. 뒤로가기");
			try {
				int selNum=in.nextInt();
				if(selNum==1) {
					guestLogin();
				}else if(selNum==2) {
					guestJoin();
				}else if(selNum==3) {
					guestModInfo();
				}else if(selNum==4) {
					guestAddReview();
				}else if(selNum==5) {
					guestLogout();
				}else if(selNum==6) {
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
	private void guestLogin() {
		
	}
	private void guestJoin() {
		
	}
	private void guestModInfo() {
		
	}private void guestAddReview() {
		
	}
	private void guestLogout() {
		
	}
}
