package _07_2중for;

public class Q11 {

	public static void main(String[] args) {
		// 000*
		// 00***
		// 0*****
		// *******
		// 0*****
		// 00***
		// 000*
		
		for(int i=0;i<7;i++) {
			if(i<=3) {
				for(int j=0;j<3-i;j++) {
					System.out.print("0");
				}
				for(int k=0;k<2*i+1;k++) {
					System.out.print("*");
				}
			}else {
				for(int j=0;j<i-3;j++) {
					System.out.print("0");
				}
				for(int k=0;k<13-2*i;k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
