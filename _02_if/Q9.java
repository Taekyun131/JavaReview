package _02_if;

public class Q9 {

	public static void main(String[] args) {
		// int[] x={6,5,9}
		//int[] y={4,10,6}
		//0번째 새 위치(6,4)
		//1번째 새 위치(5,10)
		//2번째 새 위치(9,6)
		// 총은 (0,0)에서 (3,2) 방향으로 발사했을 때, 총에 맞는 새의 번호 출력
		int[] bird0= {6,4};
		int[] bird1= {5,10};
		int[] bird2= {9,6};
		int[] bullet= {3,2};
		
		double gradientBullet=bullet[1]/bullet[0];
		double gradientBird0=bird0[1]/bird0[0];
		double gradientBird1=bird1[1]/bird1[0];
		double gradientBird2=bird2[1]/bird2[0];
		
		if(gradientBullet==gradientBird0) {
			System.out.println("0번째 새 맞음");
		}
		if(gradientBullet==gradientBird1) {
			System.out.println("1번째 새 맞음");
		}
		if(gradientBullet==gradientBird2) {
			System.out.println("2번째 새 맞음");
		}
	}

}
