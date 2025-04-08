package _17_MiniProject_Service;

import java.util.Scanner;

public class MainService {
	Scanner in=new Scanner(System.in);
	public MainService() {
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 고객 메뉴");
			System.out.println("2. 직원 메뉴");
			System.out.println("3. 프로그램 종료");
			try {
				int selNum=in.nextInt();
				in.nextLine();
				if(selNum==1) {
					GuestService gs=new GuestService();
				}else if(selNum==2) {
					StaffService ss=new StaffService();
				}else if(selNum==3) {
					break;
				}else {
					System.out.println("올바른 메뉴를 선택하세요");
				}
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			
		}
	}
}
