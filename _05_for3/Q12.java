package _05_for3;

import java.util.Random;

public class Q12 {

	public static void main(String[] args) {
		// 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		//가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		//오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		int[] lotto=new int[10000];
		int[] count=new int[45];
		int maxCount=0;
		int maxNum=0;
		Random r=new Random();
		
		for(int i=0;i<lotto.length;i++) {
			int num=r.nextInt(45)+1;
			lotto[i]=num;
			count[num-1]++;
		}
		for(int i=0;i<count.length;i++) {
			if(maxCount<=count[i]) {
				maxCount=count[i];
				maxNum=i+1;
			}
		}
		System.out.println(maxNum);
		
	}

}
