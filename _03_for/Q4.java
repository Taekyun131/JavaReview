package _03_for;

public class Q4 {

	public static void main(String[] args) {
		// 4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
	    //453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		int sum1=0;
		int sum10=0;
		int sum100=0;
		for(int i=100;i<=999;i++) {
			sum1+=i%10;
			sum10+=(i%100)/10;
			sum100+=i/100;
		}
		System.out.println(sum1+sum10+sum100);
	}

}
