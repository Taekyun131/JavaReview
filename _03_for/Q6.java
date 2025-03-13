package _03_for;

public class Q6 {

	public static void main(String[] args) {
		// 6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
		//누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
		//범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		int sum=0;
		int target=0;
		for(int i=0;i<100;i++) {
			sum+=i;
			if(sum<=44){
				target=i;
			}
		}
		System.out.println(target+1);
	}

}
