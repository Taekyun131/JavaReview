package _05_for3;

public class Q7 {

	public static void main(String[] args) {
		// String a ="23-56+45*2-56";
		//수식을 계산하는 프로그램을 작성하세요.
		//수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
		//지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
		//메서드는 최대한 적게 사용하세요
		String a ="23-56+45*2-56";
		char temp=' ';
		char sign='+';
		int result=0;
		String num="";
		for(int i=0;i<a.length();i++) {
			temp=a.charAt(i);
			if(temp<48||temp>57) {	//temp가 숫자가 아닐 시
				if(sign=='-') {
					result-=Integer.parseInt(num);
				}else if(sign=='+'){
					result+=Integer.parseInt(num);
				}else if(sign=='*') {
					result*=Integer.parseInt(num);
				}else if(sign=='/') {
					result/=Integer.parseInt(num);
				}
				num="";
				sign=temp;
			}else {
				num+=temp;
			}
		}
		if(sign=='-') {
			result-=Integer.parseInt(num);
		}else if(sign=='+'){
			result+=Integer.parseInt(num);
		}else if(sign=='*') {
			result*=Integer.parseInt(num);
		}else if(sign=='/') {
			result/=Integer.parseInt(num);
		}
		System.out.println(result);
	}

}
