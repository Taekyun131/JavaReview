package _05_for3;

import java.util.Random;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// 컴퓨터는 랜덤으로 번호를 먼저 뽑고, 키보드로 사용자가 번호를 입력하는 방식으로 가위 바위 보 게임을 작성하시오
		boolean flag=true;
		Scanner in=new Scanner(System.in);
		while(flag) {
			Random r= new Random();
			int randomNumber=r.nextInt(3)+1;
			System.out.println("번호를 입력하세요");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("4. 게임종료");
			int insertNumber=in.nextInt();
			in.nextLine();
			if(insertNumber==1) {
				if(randomNumber==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("사용자: 가위");
					System.out.println("Draw");
					System.out.println();
				}else if(randomNumber==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("사용자: 가위");
					System.out.println("You Lose");
					System.out.println();
				}else if(randomNumber==3) {
					System.out.println("컴퓨터: 보");
					System.out.println("사용자: 가위");
					System.out.println("You Win");
					System.out.println();
				}
			}else if(insertNumber==2) {
				if(randomNumber==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("사용자: 바위");
					System.out.println("You Win");
					System.out.println();
				}else if(randomNumber==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("사용자: 바위");
					System.out.println("Draw");
					System.out.println();
				}else if(randomNumber==3) {
					System.out.println("컴퓨터: 보");
					System.out.println("사용자: 바위");
					System.out.println("You Lose");
					System.out.println();
				}
			}else if(insertNumber==3) {
				if(randomNumber==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("사용자: 보");
					System.out.println("You Lose");
					System.out.println();
				}else if(randomNumber==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("사용자: 보");
					System.out.println("You Win");
					System.out.println();
				}else if(randomNumber==3) {
					System.out.println("컴퓨터: 보");
					System.out.println("사용자: 보");
					System.out.println("Draw");
					System.out.println();
				}
			}else if(insertNumber==4) {
				System.out.println("게임을 종료합니다");
				flag=false;
			}else {
				System.out.println("번호를 다시 입력하세요");
			}
//			System.out.println(insertNumber);
//			System.out.println(randomNumber);
		}
		
	}
		
}
