package _03_for;

public class Q2 {

	public static void main(String[] args) {
		// 2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		int sumOdd=0;
		int sumEven=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("홀수의 합: "+sumOdd);
		System.out.println("짝수의 합: "+sumEven);
	}

}
