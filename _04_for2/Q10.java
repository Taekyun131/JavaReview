package _04_for2;

public class Q10 {

	public static void main(String[] args) {
		/* 10. 범인 숫자 구하기.. 
		  범인은 100부터 999까지 숫자중에 여러명이다. 
		  범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
		*/
		for(int i=100;i<1000;i++) {
			int firstNum=(i/100)%10;
			int secondNum=(i/10)%10;
			int thirdNum=i%10;
			int sum=firstNum+secondNum+thirdNum;
			if(sum%2==0) {
				System.out.println(i);
			}
		}
	}

}
