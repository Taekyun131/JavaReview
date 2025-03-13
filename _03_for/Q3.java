package _03_for;

public class Q3 {

	public static void main(String[] args) {
		// 3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		int count=0;
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
