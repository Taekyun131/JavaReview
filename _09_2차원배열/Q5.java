package _09_2차원배열;

public class Q5 {

	public static void main(String[] args) {
		// 전체배열의 값 중 홀수를 0으로 마스킹하고, 마스킹된 결과를 2차원 배열로 출력
		int[][] a= { {1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25} };
		//2차원 배열 순회하며 홀수를 0으로 마스킹
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]%2==1) {
					a[i][j]=0;
				}
			}
		}
		//수정된 2차원 배열 출력
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
