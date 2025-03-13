package _05_for3;

import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		/*Random이라는 클래스로 객체를 만들어서 r이라는 참조변수로 참조해서 사용해 보자~
			Random r = new Random();  
			int num = r.nextInt(45)+1;     
			// 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
            // 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
            // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
            // 리턴값을 보정하여  num변수의 값에 대입
*/
		//로또번호를 자동으로 생성하는 게임을 작성하시오.
		//중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		int[] lotto=new int[6];
		Random r= new Random();
		for(int i=0;i<lotto.length;i++) {
			int num=r.nextInt(45)+1;
			lotto[i]=num;
			System.out.println(num);
		}
	}

}
