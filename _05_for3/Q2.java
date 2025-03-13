package _05_for3;

public class Q2 {

	public static void main(String[] args) {
		//	int[] letter={8,12,4,13,2,14,4,5}
		//배열의 가장 큰수가 있는 인덱스를 출력하시오.
		int[] letter= {8,12,4,13,2,14,4,5};
		int maxNum=0;
		int maxIndex=0;
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>maxNum) {
				maxNum=letter[i];
				maxIndex=i;
			}
		}
		System.out.println("인덱스: "+maxIndex);
		System.out.println("숫자: "+maxNum);
	}

}
