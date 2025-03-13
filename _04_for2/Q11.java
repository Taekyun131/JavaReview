package _04_for2;

public class Q11 {

	public static void main(String[] args) {
		// 12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
		//   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int count=0;
		int maxCount=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==0) {
				count++;
				if(maxCount<count) {
					maxCount=count;
				}
			}
			if(arr[i+1]!=0) {
				count=0;
			}

		}
		
		System.out.println(maxCount);
	}

}
