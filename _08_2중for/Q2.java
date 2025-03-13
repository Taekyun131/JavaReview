package _08_2중for;

public class Q2 {

	public static void main(String[] args) {
		// int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		// 배열의 평균값을 구하시오. 소수점 표현하시오. 
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		double avg=0;
		int sum=0;
		int length=arr.length;
		for(int i=0;i<length;i++) {
			int temp=arr[i];
			sum+=temp;
		}
		avg=sum/length;
		System.out.println(avg);
	}

}
