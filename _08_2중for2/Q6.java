package _08_2중for2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// 키보드로 아이디를 입력받는다.
		// 입력 받은아이디에 특수 문자가 포함 되었는지 확인한다. (유효성)
		// 특수 문자는 @한개로 정의한다.
		// 특수문자가 몇 개 포함되었는지 출력합니다.
		char special='@';
		int count=0;
		System.out.println("아이디를 입력하세요");
		Scanner in=new Scanner(System.in);
		String id=in.nextLine();
		for(int i=0;i<id.length();i++) {
			char temp=id.charAt(i);
			if(temp==special) {
				count++;
			}
		}
		System.out.println("아이디의 특수문자는 "+count+"개 포함");
	}

}
