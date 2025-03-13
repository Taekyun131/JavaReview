package _05_for3;

public class Q5 {

	public static void main(String[] args) {
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		//int size=2;
		//arr 배열에서 0이 의미하는 것은 공터이다. 
		//size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//size가 2일경우에 7개이다. 
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int count0=0;
		int countLocation=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				count0++;
			}
			if(arr[i+1]==1) {
				if(count0>=size) {
					countLocation+=count0-size+1;
					count0=0;
				}
			}
			
		
		}
		System.out.println(countLocation);
	}

}
