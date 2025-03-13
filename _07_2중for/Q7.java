package _07_2중for;

public class Q7 {

	public static void main(String[] args) {
		// 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
		//   단, 거스름돈은 만천원이 최대 값이다. 
		//  int money=4570;  // 가격
		//   int pay = 10000;  //지불금액
		int money=4570;  // 가격
	    int pay = 10000;  //지불금액
	    int change=pay-money;
	    int count=0;
	    System.out.println(change);
	    for(int i=0;i<4;i++) {
	    	count=(change/10)%10;
	    	change/=10;
	    	System.out.println((int)Math.pow(10,i+1)+"원 짜리 "+count+"개");
	    }
	   
	}

}
