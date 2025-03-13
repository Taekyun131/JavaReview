package _07_2중for;

public class Q10 {

	public static void main(String[] args) {
		// 난건물주  <이중For사용>
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		
		int count=0;
		int maxCount=0;
		int countLocation=0;
		for(int i=0;i<arr.length;i++) {
			int firstTemp=arr[i];
			for(int j=i;j<arr.length;j++) {
				int secondTemp=arr[j];
				if(firstTemp==0&&secondTemp==0) {
					count++;
					System.out.println(i+"/"+count);
				}else {
					if(maxCount<count) {
						maxCount=count;
						System.out.println(maxCount);
					}
					if(maxCount>=size) {
						countLocation+=(maxCount-size+1);
					}
					count=0;
					maxCount=0;
					i=j;
					break;
				}
			}
		}
		System.out.println(countLocation);
	}

}
