package _06_Random;

import java.util.Random;

public class Q4 {

	public static void main(String[] args) {
		//  2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		//  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		Random r=new Random();
		boolean flag=true;
		while(flag) {
			int num=r.nextInt(100)+1;
			System.out.println("뽑은 숫자: "+num);
			if(num%7==0) {
				System.out.println("행운의 숫자");
				flag=false;
			}else {
				System.out.println("조심해야하는 숫자");
			}
		}
	}

}
