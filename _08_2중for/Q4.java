package _08_2중for;

public class Q4 {

	public static void main(String[] args) {
		// int[] b = {93,45,83,58,75,56}
		// 다음조건에 따라 오름차순으로 정렬하시오.
		// 1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
		// 2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
		// 3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
		// 오름차순으로 정렬이 될때 까지 반복한다.
		int[] b = {93,45,83,58,75,56};
		int temp=0;
		int length=b.length;
		int maxNum=0;
		int index=0;
		for(int i=0;i<length;i++) {
			maxNum=0;
			temp=0;
			for(int j=0;j<length-i;j++) {
				if(maxNum<b[j]) {
					maxNum=b[j];
					index=j;
				}
			}
			temp=b[length-i-1];
			b[length-i-1]=maxNum;
			b[index]=temp;
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
