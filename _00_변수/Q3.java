package _00_변수;

public class Q3 {

	public static void main(String[] args) {
		/*
		문제1. 포인트를 저장하는 변수를 만들고 테스트 값으로 80을 입력한다. 포인트 값을 출력하시오.
		문제2. 숫자 2개를 저장하는 변수를 만들고, 첫번째 변수는 10을 두번째 변수는 4를 입력하시오.
         첫번째 변수를 두번째 변수로 나눈 몫을 구하시오. 몫은 소숫점도 나와야 합니다.
		문제3. 이름을 저장하는 변수를 만들고 초기값은  null을 입력하시오.
         홍길동이름을 변수에 저장하고 출력하시오. 출력할때는 이름뒤에 님이라고 붙히시오.
		문제4. 영어점수 90, 수학점수 87, 컴퓨터점수 100 점을 저장하는 변수를 만들고 평균을 구하시오. 
         점수는 정수만 입력이 되어야 하나 평균은 소숫점까지 나와야 합니다.*/
	
		int point=80;
		System.out.println(point);
		
		int var1=10;
		int var2=4;
		System.out.println((float) var1/var2);
		
		String name=null;
		name="홍길동";
		System.out.println(name+"님");
		
		int english=90;
		int math=87;
		int computer=100;
		float avg=(english+math+computer)/3;
		System.out.println(avg);
	}

}
