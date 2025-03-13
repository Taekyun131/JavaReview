package _02_if;

public class Q6 {

	public static void main(String[] args) {
		// int [] lotto={6,12,33,4,5,26}
		// 홀수인 로또 번호의 합을 구하시오
		int[] lotto= {6,12,33,4,5,26};
		int sum=0;
	
		if(lotto[0]%2==1) {
			sum+=lotto[0];
		}
		if(lotto[1]%2==1) {
			sum+=lotto[1];
		}
		if(lotto[2]%2==1) {
			sum+=lotto[2];
		}
		if(lotto[3]%2==1) {
			sum+=lotto[3];
		}
		if(lotto[4]%2==1) {
			sum+=lotto[4];
		}
		if(lotto[5]%2==1) {
			sum+=lotto[5];
		}
		System.out.println(sum);
	}

}
