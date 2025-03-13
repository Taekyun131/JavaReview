package _01_Array;

public class Q5 {

	public static void main(String[] args) {
		// int [] lotto={6,12,33,4,5,26}
		// 다음 규칙에 의해서 저장된 값을 수정하세요
		// 첫번째 번호는 그대로 저장
		// n번째 저장되는 값= 첫번째 번호+두번째 번호+...+n번째 번호
		
		int [] lotto={6,12,33,4,5,26};
		lotto[0]=6;
		lotto[1]+=lotto[0];
		lotto[2]+=lotto[1];
		lotto[3]+=lotto[2];
		lotto[4]+=lotto[3];
		lotto[5]+=lotto[4];
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);

	}

}
