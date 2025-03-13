package _04_for2;

public class Q13 {

	public static void main(String[] args) {
		// 13. 가장 긴 터널의 알파벳 이름과 길이를 찾으세요
		// String ttt ="aabbbcccaaaaddbbbaaaaa";
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		char alphabet=' ';
		int count=1;
		int maxCount=0;
		for(int i=0;i<ttt.length()-1;i++) {
			if(ttt.charAt(i)==ttt.charAt(i+1)) {
				count++;
				if(maxCount<count) {
					maxCount=count;
					alphabet=ttt.charAt(i);
				}
			}else {
				count=1;
			}
		}
		System.out.println(alphabet+"/"+maxCount);
	}

}
