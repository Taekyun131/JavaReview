package _02_if;

public class Q5 {

	public static void main(String[] args) {
		// int [] lotto={6,12,33,4,5,26}
		// 네번째 번호가 홀수이면 홀수, 짝수이면 짝수라고 출력
		int[] lotto= {6,12,33,4,5,26};
		if(lotto[3]%2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
	}

}
