package _15_JavaWord;

import java.util.ArrayList;
import java.util.Scanner;

public class wordDAO {
	Scanner in=new Scanner(System.in);
	ArrayList<wordDTO> wordList	=new ArrayList<wordDTO>();
	public wordDAO() {
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 영단어 등록");
			System.out.println("2. 영단어 전체조회");
			System.out.println("3. 영단어 삭제");
			System.out.println("4. 영단어 수정");
			System.out.println("5. 단어게임");
			System.out.println("6. 프로그램 종료");
			int selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				addWord();
			}else if(selNum==2) {
				showAllWord();
			}else if(selNum==3) {
				delWord();
			}else if(selNum==4) {
				modWord();
			}else if(selNum==5) {
				wordGame wordgame=new wordGame(wordList);
			}else if(selNum==6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("올바른 메뉴를 선택하세요");
			}
		}
	}
	// 영단어 등록
	private void addWord() {
		System.out.println("등록할 영단어를 입력하세요");
		String newEngWord=in.nextLine();
		int idx=findIdx(newEngWord);
		if(idx==-1) {
			System.out.println("영단어 뜻을 입력하세요");
			String newKorWord=in.nextLine();
			wordDTO newWord=new wordDTO();
			newWord.setEngWord(newEngWord);
			newWord.setKorWord(newKorWord);
			wordList.add(newWord);
			System.out.println("영단어가 등록되었습니다");
		}else {
			System.out.println("해당 영단어가 이미 존재합니다");
		}
	}
	//영단어 전체조회
	private void showAllWord() {
		for(wordDTO word:wordList) {
			word.prt();
		}
	}
	//영단어 삭제
	private void delWord() {
		System.out.println("삭제할 영단어를 입력하세요");
		String delEngWord=in.nextLine();
		int idx=findIdx(delEngWord);
		if(idx==-1) {
			System.out.println("해당 영단어가 존재하지 않습니다");
		}else {
			wordList.get(idx).prt();
			boolean flag=true;
			while(flag) {
				System.out.println("해당 영단어를 삭제하시겠습니까?");
				System.out.println("1. 확인");
				System.out.println("2. 취소");
				int selNum=in.nextInt();
				in.nextLine();
				if(selNum==1) {
					wordList.remove(idx);
					System.out.println("영단어가 삭제되었습니다");
					flag=false;
				}else if(selNum==2) {
					System.out.println("취소되었습니다");
					flag=false;
				}else {
					System.out.println("올바른 메뉴를 선택해주세요");
				}
			}
		}
	}
	//영단어 수정
	private void modWord() {
		System.out.println("수정할 영단어를 입력하세요");
		String modEngWord=in.nextLine();
		int idx=findIdx(modEngWord);
		if(idx==-1) {
			System.out.println("해당 영단어를 찾을 수 없습니다");
		}else {
			System.out.println("변경할 영단어를 입력하세요");
			String modNewEngWord=in.nextLine();
			System.out.println("변경할 영단어의 뜻을 입력하세요");
			String modNewKorWord=in.nextLine();
			wordList.get(idx).setEngWord(modNewEngWord);
			wordList.get(idx).setKorWord(modNewKorWord);
			System.out.println("수정되었습니다");
		}
	}
	//영단어 인덱스 찾기
	private int findIdx(String engWord) {
		int idx=-1;
		for(int i=0;i<wordList.size();i++) {
			wordDTO word=wordList.get(i);
			if(word.getEngWord().equals(engWord)) {
				idx=i;
				break;
			}
		}
		return idx;
	}
}
