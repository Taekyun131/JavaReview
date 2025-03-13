package _06_Random;

import java.util.Random;

public class Q7 {

	public static void main(String[] args) {
		// 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		// 가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		// 오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
		Random r=new Random();
		int [] array=new int[10000];
		int [] numCount=new int[45];
		int maxCount=0;
		int maxCountNum=0;
		//로또번호 배열에 저장
		for(int i=0;i<array.length;i++) {
			int num=r.nextInt(45)+1;
			array[i]=num;
		}
		//로또번호 숫자세기
		for(int i=0;i<array.length;i++) {
			numCount[array[i]-1]++;
		}
		//추천번호 출력
		for(int i=0;i<numCount.length;i++) {
			if(numCount[i]>=maxCount) {
				maxCount=numCount[i];
				maxCountNum=i+1;
			}
		}
	
		System.out.println("추천번호: "+maxCountNum);
		System.out.println("뽑힌 횟수: "+maxCount);
	}

}
