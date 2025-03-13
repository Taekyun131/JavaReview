package _04_for2;

public class Q6 {

	public static void main(String[] args) {
		// 6. int[] arr = {45,23,25,64,3,24,48}
		//   배열의 값을 모두 더한 총합을 구하시오.
		int[] arr = {45,23,25,64,3,24,48};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
