package _09_2차원배열;

public class Q7 {

	public static void main(String[] args) {
		// 다음과 같은 게임배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		// 제거가 가능한 블록의 좌표를 출력하시오
		//	1	1	0	2
		//	3	2	1	2
		//	0	0	3	2
		//	4	4	4	4
		//	2	4	3	1
		//	2	4	1	3
		int [][] gameNumbers= {{1,1,0,2},{3,2,1,2},{0,0,3,2},{4,4,4,4},{2,4,3,1},{2,4,1,3}};
		int count=1;
		int rowIdx=0;
		int colIdx=0;
		for(int i=0;i<gameNumbers[0].length;i++) {
			colIdx=i;
			for(int j=0;j<gameNumbers.length-1;j++) {
				int temp1=gameNumbers[j][i];
				int temp2=gameNumbers[j+1][i];
				if(temp1==temp2) {
					count++;
				}else {
					if(count>=3) {
						rowIdx=j;
						if(rowIdx>=2) {
							System.out.println((rowIdx-count+1)+"/"+colIdx);
						}else {
							System.out.println((gameNumbers.length-count)+"/"+(colIdx-1));
						}
					}
					count=1;
				}
			}
		
		}
	}

}
