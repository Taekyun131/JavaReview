package _05_for3;

public class Q13 {

	public static void main(String[] args) {
		/*String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		숫자별로 수집된 수만큼 카운팅하세요.
		카운팅 배열은
		int[] a = new int[10]; 
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0 - 9까지를 숫자로 정의한다.
		조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다.*/
		String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int[] count = new int[10];
		for(int i=0;i<a.length();i++) {
			char temp=a.charAt(i);
			if(temp!='/') {
				count[temp-48]++;
			}
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(i+1+":"+count[i]);
		}
	}

}
