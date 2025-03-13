package _08_2중for;

public class Q3 {

	public static void main(String[] args) {
		// 팩토리얼의 합 구하기 (2중 for로 해결)
		// 1부터 10까지 숫자의 각패토리얼의 합을 구하시오
		// 예를들어 4의 팩토리얼은  1*2*3*4
		//             5의 팩토리얼은 1*2*3*4*5
		int length=10;
		int sum=0;
		for(int i=1;i<=length;i++) {
			int factorial=1;
			for(int j=1;j<=i;j++) {
				factorial*=j;
			}
//			System.out.println(factorial);
			sum+=factorial;
		}
		System.out.println(sum);
	}

}
