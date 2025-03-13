package _02_if;

public class Q8 {

	public static void main(String[] args) {
		/*철수는 숫자를 0번째부터 2번째까지 차례대로 수집했다
		 철수는 숫자의 자릿수를 분해하여 합한 결과 값이 가장 큰 숫자를 선택할 예정이다.
		 숫자를 분해하는 것은 45인 경우 4+5를 의미한다
		 철수가 선택할 숫자는 몇 번째 수집한 숫자인가?*/
		int[] a= {45,34,64};
		int sum0=a[0]/10+a[0]%10;
//		System.out.println(sum1);
		int sum1=a[1]/10+a[1]%10;
		int sum2=a[2]/10+a[2]%10;
		
		if(sum0>sum1&&sum0>sum2) {
			System.out.println("0번째 수집한 숫자");
		}else if(sum1>sum0&&sum1>sum2){
			System.out.println("1번째 수집한 숫자");
		}else {
			System.out.println("2번째 수집한 숫자");
		}
	}

}
