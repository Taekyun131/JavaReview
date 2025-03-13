package _02_if;

public class Q3 {

	public static void main(String[] args) {
		/* int level=2
		int point=30
		level이 1이면 point에 30을 더하고, level이 1이 아니면 포인트에 10을 더하시오
		sysout을 한번만 사용하여 최종포인트를 출력하시오
		*/
		int level=2;
		int point=30;
		if(level==1) {
			point+=30;
		}else {
			point+=10;
		}
		System.out.println(point);
	}

}
