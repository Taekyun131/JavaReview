package _06_Random;

import java.util.Random;

public class Q6 {

	public static void main(String[] args) {
		// 로또번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		Random r=new Random();
		int [] array=new int[6];
		for(int i=0;i<6;i++) {
			int num=r.nextInt(45)+1;
			array[i]=num;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
