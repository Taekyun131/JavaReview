package _07_2중for;

public class Q3 {

	public static void main(String[] args) {
		// 000*
		// 00***
		// 0*****
		// *******
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print("0");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
