package _01_Array;

public class Q4 {

	public static void main(String[] args) {
		// int [] lotto={6,12,33,4,5,26}
		// 홀수번쨰로 뽑은 번호의 총합을 구하시오. 단 저장된 번호 값은 유지
		int [] lotto= {6, 12, 33, 4, 5, 26};
		int sum=0;
		sum+=lotto[0]+lotto[2]+lotto[4];
		System.out.println(sum);

	}

}
