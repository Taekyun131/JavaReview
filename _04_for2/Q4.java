package _04_for2;

public class Q4 {

	public static void main(String[] args) {
		// 4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
		//  int[] arr = {45,23,25,64,3,24,48}
		int [] arr= {45,23,25,64,3,24,48};
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			if(temp%2==0) {
				System.out.println(temp);
			}
		}
	}

}
