package _07_2중for;

public class Q9 {

	public static void main(String[] args) {
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		// String ttt ="aabbbcccaaaaddbbbaaaaa";
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		char alphabet=' ';
		int count=0;
		int maxCount=0;
		int endNum=0;
		for(int i=0;i<ttt.length();i++) {
			char firstTemp=ttt.charAt(i);
			for(int j=i;j<ttt.length();j++) {
				char secondTemp=ttt.charAt(j);
				if(firstTemp==secondTemp) {
					count++;
//					System.out.println(i);
//					System.out.println(firstTemp+"/"+count);
					endNum=j;
				}else {
					if(maxCount<count) {
						maxCount=count;
						alphabet=firstTemp;
					}
					i=j-1;
					count=0;
					break;
				}
			}
			if(endNum==ttt.length()-1) {
				if(alphabet==firstTemp) {
					if(maxCount<count) {
						maxCount=count;
					}
				}
				break;
			}
		}
		System.out.println(alphabet+"/"+maxCount);
	}

}
