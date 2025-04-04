package _06_Random;

public class Q8 {

	public static void main(String[] args) {
		/*7. int[] jobTime ={40,32,4,16,5,8};
			위 배열에서 인덱스를 사람의 번호로 가정한다.
			jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
			작업장을 사용할 수 있는 시간은 최대  4시간이다.
			작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
			다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
			0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
			실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		 */
		int[] jobTime ={40,32,4,16,5,8};
		int maxHour=0;
		int maxHourIndex=0;
		for(int i=0;i<jobTime.length;i++) {
			if(jobTime[i]>maxHour) {
				maxHour=jobTime[i];
				maxHourIndex=i;
			}
		}
		System.out.println(maxHour+"/"+maxHourIndex);
		while(jobTime[maxHourIndex]>0) {
			for(int i=0;i<jobTime.length;i++) {
				if(jobTime[i]>4) {
					System.out.println(i+"번 작업중");
					jobTime[i]-=4;
				}else if(jobTime[i]>0) {
					System.out.println(i+"번 작업중");
					jobTime[i]=0;
				}
			}
		}
	}

}
