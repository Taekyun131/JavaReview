package _15_JavaWord;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class wordGame {
	ArrayList<wordDTO> wordList=null;
	ArrayList<wordDTO> reviewList=new ArrayList<wordDTO>();
	Scanner in=new Scanner(System.in);
	public wordGame(ArrayList<wordDTO> wordList) {
		this.wordList=wordList;
		System.out.println("===영단어 맞추기 게임===");
		System.out.println("무작위로 나타나는 영단어의 뜻을 입력하면 정답");
		System.out.println("정답을 맞추지 못한 단어는 마지막에 정리해 드립니다");
		game(this.wordList);
	}
	private void game(ArrayList<wordDTO> wordList) {
		int[] count=new int[wordList.size()];
		Random random=new Random();
		for(int i=0;i<wordList.size();i++) {
			int randomNumber=random.nextInt(wordList.size());
			wordDTO randomWord=wordList.get(randomNumber);
			if(count[randomNumber]==0) {
				System.out.println(randomWord.getKorWord());
				String answerEngWord=in.nextLine();
				if(answerEngWord.equals(randomWord.getEngWord())) {
					System.out.println("----정답입니다!!----");
					System.out.println();
				}else {
					System.out.println("----틀렸습니다---");
					reviewList.add(randomWord);
					System.out.println();
				}
				count[randomNumber]=1;
			}else {
				i--;
			}
		}
		System.out.println("게임종료");
		System.out.println("오답노트 정리");
		for(wordDTO wrongWord:reviewList) {
			wrongWord.prt();
		}
	}
}
