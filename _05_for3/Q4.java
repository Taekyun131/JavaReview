package _05_for3;

public class Q4 {

	public static void main(String[] args) {
		// String word ="gehoudfkimjnlvy";
		//int[] letter={8,12,3,13,1,14,3,4};
		//letter  배열은 word문자열 알파벳의 위치이다.
		//letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		String word ="gehoudfkimjnlvy";
		int[] letter={8,12,3,13,1,14,3,4};
		String decodeLetter="";
		for(int i=0;i<letter.length;i++) {
			decodeLetter+=word.charAt(letter[i]);
		}
		System.out.println(decodeLetter);
	}

}
