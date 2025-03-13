package _07_2중for;

public class Q5 {

	public static void main(String[] args) {
		//  int[] a ={34,55,23,56,34,45,34};
		// 40보다 큰 수는 모두 몇개인가?
		int[] a ={34,55,23,56,34,45,34};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>40) {
				count++;
			}
		}
		System.out.println(count);
	}

}
