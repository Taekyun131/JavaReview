package _04_for2;

public class Q12 {

	public static void main(String[] args) {
		// int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,0,0,0,0,0,3,3}
		//   숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오. 
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,0,0,0,0,0,3,3};
		int count=1;
		int maxNum=0;
		int maxCount=0;
		for(int i=0;i<arr.length-1;i++) {
			int temp=arr[i];
			if(temp==arr[i+1]) {
				count++;
				if(maxCount<count) {
					maxCount=count;
					maxNum=temp;
				}
			}else {
				count=1;
			}
		}
		System.out.println(maxNum+"/"+maxCount);
	}

}
