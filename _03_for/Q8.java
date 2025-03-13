package _03_for;

public class Q8 {

	public static void main(String[] args) {
		/*8. 피보나치 수열 1
  		i는 피보나치 수의 갯수이다.   총 8개의 피보나치 수를 구하고 합한 값을
  		출력하시오. 
  		i는 1 2 3 4 5 6 7 까지 증가, i가 4일 때 피보나치 수는 3이 된다.

   		int fib=1;  // 파보나치 수   1 1 2 3 5 8 13
	   for(int i=1;i < 8; i++){  // 피보나치 수의 개수 i  
	   
	   }
	  결과 : 1 + 1 + 2 +3 + 5 + 8 + 13 = 합한 값*/
		int fib=1;
		int fib2=1;
		int temp=0;
		int sum=0;
		for(int i=1;i<8;i++) {
			sum+=fib;
			temp=fib+fib2;
			fib=fib2;
			fib2=temp;
			System.out.println(fib);
		}
		System.out.println(sum);
	}

}
