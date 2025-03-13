package _03_for;

public class Q1 {

	public static void main(String[] args) {
		// 1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}else {
				sum-=i;
			}
		}
		System.out.println(sum);
	}

}
