package _04_for2;

public class Q7 {

	public static void main(String[] args) {
		// 7. int[] arr = {45,23,25,64,3,24,48}
		//   짝수는 모두 몇개인가요?
		int[] arr = {45,23,25,64,3,24,48};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			if(temp%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
