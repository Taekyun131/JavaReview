package _06_Random;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		System.out.println("숫자를 입력하세요");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		in.nextLine();
		if(num%2==0) {
			System.out.println(num+": 짝수");
		}else {
			System.out.println(num+": 홀수");
		}
		in.close();
	}
}
