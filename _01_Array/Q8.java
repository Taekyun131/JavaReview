package _01_Array;

public class Q8 {

	public static void main(String[] args) {
		// 볼이 벙커에 빠졌으면 true, 안 빠졌으면 false 출력
		//벙커영역
		//int xA=700
		//int yA=500
		//int xB=900
		//int yB=300
		
		//공 영역(공은 가로세로 3)
		//int xC=650
		//int yC=150
		int xA=700;
		int yA=500;
		int xB=900;
		int yB=300;
		
		int xC=650;
		int yC=150;
		
		System.out.println((xC>xA)&&(xC+3<xB)&&(yC<yA)&&(yC-3>yB));
		
	}

}
