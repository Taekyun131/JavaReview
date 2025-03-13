package _06_Random;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		int result=0;
		System.out.println("숫자를 두개 입력하세요");
		System.out.println("첫번째 숫자를 입력하세요");
		Scanner in=new Scanner(System.in);
		int firstNum=in.nextInt();
		in.nextLine();
		System.out.println("두번째 숫자를 입력하세요");
		int secondNum=in.nextInt();
		in.nextLine();
		result=firstNum+secondNum;
		System.out.println("두 수의 합:"+result);
		in.close();
	}

}
