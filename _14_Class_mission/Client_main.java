package _14_Class_mission;

import java.util.Scanner;

public class Client_main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			System.out.println("=====고객관리&이벤트관리 프로그램=====");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 고객 관리 프로그램");
			System.out.println("2. 이벤트 관리 프로그램");
			System.out.println("3. 종료");
			int selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				Client_mg cmg=new Client_mg();
			}else if(selNum==2) {
				Event_mg emg=new Event_mg();
			}else if(selNum==3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
