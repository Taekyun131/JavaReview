package _04_for2;

public class Q5 {

	public static void main(String[] args) {
		// 5.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
		 // int[] arr = {45,23,25,64,3,24,48}
		int[] arr = {45,23,25,64,3,24,48};
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			if(temp%2==1) {
				System.out.println(i);
			}
		}
	}

}
