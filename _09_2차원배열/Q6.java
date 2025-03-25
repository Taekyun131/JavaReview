package _09_2차원배열;

public class Q6 {

	public static void main(String[] args) {
		// 2차원 배열의 모든 값을 출력하시오
		// 출력할 때는 행의 번호는 내림차순, 열의 번호도 내림차순으로 출력하시오
		int[][] a= { {1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25} };
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[a.length-i-1][a[0].length-j-1]+"\t");
			}
			System.out.println();
		}
	}

}
