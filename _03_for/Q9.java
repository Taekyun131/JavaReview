package _03_for;

public class Q9 {

	public static void main(String[] args) {
		/*9. 피보나치 수열 2
		  i를 피보나치 수로 정의한다.
		  i의 변화는 1 1 2 3 5 8 13 이 된다.
		  for(int i=1;i < 20; ){  
		   
   		}*/ 
		int temp=0;
		int temp2=0;
		int sum=0;
		for(int i=1;i<20; ) {
			sum+=i;
			temp2=i+temp;
			temp=i;
			i=temp2;
			System.out.println(i);
			
		}
		System.out.println(sum);
	}

}
