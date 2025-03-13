package _04_for2;

public class Q2 {

	public static void main(String[] args) {
		// 2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		int sum=0;
		for(int i=1;i<100;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
