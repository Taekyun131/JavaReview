package _07_2중for;

public class Q12 {

	public static void main(String[] args) {
		// 11번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음.
		
		for(int i=0;i<7;i++) {
			int temp=0;
			if(i<=3) {
				temp=i+4;
			}else {
				temp=10-i;
			}
			for(int j=0;j<temp;j++) {
				if(i<=3) {
					if(j<temp-2*i-1) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}else {
					if(j<temp+2*i-13) {
						System.out.print("0");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
