package _01_Array;

public class Q7 {

	public static void main(String[] args) {
		// 거스름돈을 구하시오
		// int money=2750
		// int pay=1000
		// 출력: 1000원 ?개, 100원 ?개, 10원 ?개
		int money=2750;
		int pay=1000;
		int change=money-pay;
		System.out.println("거스름돈: "+change);
		System.out.println("1000원: "+(change/1000)%10);
		System.out.println("100원: "+(change/100)%10);
		System.out.println("10원: "+(change/10)%10);
			
	}

}
