package _15_JavaWord;

public class wordDTO {
	private String engWord=null;
	private String korWord=null;
	
	public String getEngWord() {
		return engWord;
	}
	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}
	public String getKorWord() {
		return korWord;
	}
	public void setKorWord(String korWord) {
		this.korWord = korWord;
	}
	
	public void prt() {
		System.out.println("---단어정보---");
		System.out.println("영단어: "+this.engWord);
		System.out.println("뜻: "+ this.korWord);
	}
}
