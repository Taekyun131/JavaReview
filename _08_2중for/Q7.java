package _08_2중for;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 키보드로 아이디를 입력 받는다.
		// 입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
		// 특수문자는 String sign="!@#$%^&*"로 정의한다.
		// 특수문자가 몇 개 포함되었는지 출력합니다. 
		String sign="!@#$%^&*";
		int count=0;
		Scanner in=new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id=in.nextLine();
		for(int i=0;i<id.length();i++) {
			char temp=id.charAt(i);
			for(int j=0;j<sign.length();j++) {
				char tempSign=sign.charAt(j);
				if(temp==tempSign) {
					count++;
				}
			}
		}
		System.out.println("아이디에 포함된 특수문자는 "+count+"개 입니다.");
	}

}
