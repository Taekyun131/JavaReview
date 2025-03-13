package _04_for2;

public class Q9 {

	public static void main(String[] args) {
		// 9.  int[] arr = {45,23,25,64,3,24,48} 
		//   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		int maxIndex=0;
		int maxNum=0;
		int[] arr = {45,23,25,64,3,24,48};
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			if(temp>maxNum) {
				maxNum=temp;
				maxIndex=i;
			}
		}
		System.out.println(maxNum+"/"+maxIndex);
	}

}
