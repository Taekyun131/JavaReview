package _04_for2;

public class Q8 {

	public static void main(String[] args) {
		/* 8.  String test = "abcdeabce";
	    for(int i=0; i < 9; i ++){
	    	char aaa = test.charAt(i);
	    	sysout(aaa);
	        }

	       위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		*/
		String test = "abcdeabce";
		int count=0;
		for(int i=0;i<test.length();i++) {
			char temp=test.charAt(i);
			if(temp=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
