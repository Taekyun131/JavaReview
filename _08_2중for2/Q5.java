package _08_2중for2;

public class Q5 {

	public static void main(String[] args) {
		// int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599}
		// int[] parking = new int[10];
		// carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
		// parking의 인덱스 번호가 주차번호이다. 
		// 자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
		// 만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
		// (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
		// 주차가 끝난 후 주차번호와 주차항 차량 번호를 출력하시오.
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		for(int i=0;i<carnum.length;i++) {
			int index=carnum[i]%10;
			for(int j=0;j<parking.length-1;j++) {
				if(j==index) {
					if(parking[j]==0) {
						parking[j]=carnum[i];
						carnum[i]=0;
					}else if(parking[j+1]==0) {
						parking[j+1]=carnum[i];
						carnum[i]=0;
					}
				}
			}
			if(index==9) {
				if(parking[9]==0) {
					parking[9]=carnum[i];
					carnum[i]=0;
				}
			}
		}
		
		
		for(int i=0;i<parking.length;i++) {
			System.out.println(parking[i]);
		}
	}

}
