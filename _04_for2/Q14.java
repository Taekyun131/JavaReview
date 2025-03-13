package _04_for2;

public class Q14 {

	public static void main(String[] args) {
		// 15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
		//   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int count=1;
		char alphabet=' ';
		String name="";
		for(int i=0;i<ttt.length()-1;i++) {
			alphabet=ttt.charAt(i);
			if(alphabet==ttt.charAt(i+1)) {
				count++;
			}else {
				name+=alphabet;
				name+=count;
				count=1;
			}
		}
		name+=alphabet;
		name+=count;
		System.out.println(name);
	}

}
