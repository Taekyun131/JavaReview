package _00_변수;

public class Q1 {
	public static void main(String[] args) {
	/*프로그램이 시작하면
	메모장 프로그램이라는 문구를 출력한다.
	제목을 저장하며 제목은 [나의 점심]이다.
	[오늘은 자장면]이라는 본문 문자열을 저장한다.
	메모장의 제목과 함께 본문 문자열이 출력된다.
	메모의 제목을 [점심메뉴]라고 바꾼다.
	바뀐 제목을 콘솔에서확인한다.
	조회수를 저장할 변수를 만든다. 조회수는 0 1 2 3 순으로 저장할 예정이다. 처음 값은 0이다. 
	본문 문자열을 [짬뽕도 먹음]으로 변경한다.
	조회수를 10회로 수정한다.
	끝으로
	메모의 제목, 본문, 조회수를 출력한다. 
	*/
	System.out.println("메모장 프로그램");
	String title="나의 점심";
	String content="오늘은 자장면";
	System.out.println("제목: "+title);
	System.out.println("본문: "+content);
	title="점심메뉴";
	System.out.println("변경된 제목: "+title);
	int view=0;
	content="짬뽕도 먹음";
	view=10;
	System.out.println(title);
	System.out.println(content);
	System.out.println(view);
	}
}
