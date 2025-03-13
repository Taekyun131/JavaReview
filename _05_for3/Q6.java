
package _05_for3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// 키보드로 문자를 입력받는다. 
		//문자로 입력 받는 방법은 
		//Scanner in = new Scanner(System.in);
		//String a  = in.nextLine();     숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다. 
		//이때 문자열의 길이는 0보다 크고 10보다 작으며 짝수만 가능하다.
		//조건에 만족될때까지 문자 입력을 받는다.
		//문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요
		
	
		while(true) {
			Scanner in=new Scanner(System.in);
			String a=in.nextLine();
			String aReverse="";
			System.out.println(aReverse);
			for(int i=0;i<a.length();i++) {
				aReverse+=a.charAt(a.length()-i-1);
			}
			if(a.length()<10&&a.length()%2==0) {
				if(a.equals(aReverse)) {
					System.out.println("코드를 종료합니다.");
					break;
				}
			}else {
				System.out.println("조건에 맞는 문자열을 입력하세요");
			}
		}
		
		
	}

}
