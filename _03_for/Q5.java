package _03_for;

public class Q5 {

	public static void main(String[] args) {
		//5. 범인은 100부터 999까지 숫자에 숨어 있다.
		//   범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		for(int i=100;i<1000;i++) {
			int temp=(i/10)%10;
			if(temp%3==0&&temp!=0) {
				System.out.println(i);
			}
		}
	}

}
