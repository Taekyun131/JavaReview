package _05_for3;

public class Q1 {

	public static void main(String[] args) {
		// int[] letter={8,12,4,13,2,14,4,5}
		// 짝수만 출력하시오.
		int [] letter= {8,12,4,14,2,14,4,5};
//		for(int i=0;i<letter.length;i++) {
//			if(letter[i]%2==0) {
//				System.out.println(letter[i]);
//			}
//		}
		for(int num:letter) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		
	}

}
