package _07_2중for;

public class Q8 {

	public static void main(String[] args) {
		// int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
		// 애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		// 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		// 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		int count=1;
		int num=0;
		int index=0;
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5} ;
		for(int i=0;i<pang.length;i++) {
			for(int j=i;j<pang.length;j++) {
				if(pang[i]==pang[j]) {
					index=i;
					num=pang[i];
					count++;
					
				}else {
					if(count>=3) {
						System.out.println(num+"/"+count+"/"+index);
					}
					i=j-1;
					count=0;
					break;
				}
			}
			
		}
	}
}
