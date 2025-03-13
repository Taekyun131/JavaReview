package _05_for3;

public class Q3 {

	public static void main(String[] args) {
		// int[] letter={8,12,4,13,25,14,4,5}
		//범인을찾으시오
		//범인은 짝수이면서 가장큰 값이다. 
		//범인은 14입니다. 
		int[] letter={8,12,4,13,25,14,4,5};
		int maxNum=0;
		for(int num:letter) {
			if(num%2==0) {
				if(num>maxNum) {
					maxNum=num;
				}
			}
		}
		System.out.println(maxNum);
	}

}
