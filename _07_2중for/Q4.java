package _07_2중for;

public class Q4 {

	public static void main(String[] args) {
		// *******
		// 0*****
		// 00***
		// 000*
		for(int i=0;i<4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("0");
			}for(int k=0;k<7-2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
