package _11_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Cat_m {
	Scanner in=new Scanner(System.in);
	ArrayList<Cat_obj> catList=new ArrayList<Cat_obj>();
	public Cat_m() {
		init();
	}
	
	private void init() {
		while(true) {
			int selNum=0;
			System.out.println("-----메뉴를 선택하세요-----");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 고양이 전체보기");
			System.out.println("5. 프로그램 종료");
			selNum=in.nextInt();
			in.nextLine();
			//번호 선택
			if(selNum==1) {
				addCat();
			}else if(selNum==2){
				modCat();
			}else if(selNum==3) {
				delCat();
			}else if(selNum==4) {
				allCat();
			}else if(selNum==5) {
				break;
			}else {
				System.out.println("올바른 메뉴를 선택하세요");
			}
		}
		
	}
	//고양이 등록
	private void addCat() {
		Cat_obj cat=new Cat_obj();
		System.out.println("고양이의 이름을 입력하세요");
		String name=in.nextLine();
		System.out.println("고양이의 나이를 입력하세요");
		int age=in.nextInt();
		in.nextLine();
		cat.setCatName(name);
		cat.setCatAge(age);
		catList.add(cat);
		System.out.println(name+"("+age+" 세)"+"가 등록되었습니다.");
	}
	//고양이 수정
	private void modCat() {
		while(true) {
			System.out.println("수정할 고양이를 선택하세요");
			allCat();
			int num=in.nextInt();
			in.nextLine();
			try {
				System.out.println(catList.get(num-1).getCatName()+"의 수정할 이름을 입력하세요");
				String modName=in.nextLine();
				System.out.println("수정할 나이를 입력하세요");
				int modAge=in.nextInt();
				catList.get(num-1).setCatName(modName);
				catList.get(num-1).setCatAge(modAge);
				System.out.println("수정이 완료되었습니다");
				break;
			} catch (Exception e) {
				System.out.println("올바른 번호를 입력하세요");
			}
		}
	}
	//고양이 삭제
	private void delCat() {
		while(true) {
			System.out.println("삭제할 고양이를 선택하세요");
			allCat();
			int num=in.nextInt();
			try {
				System.out.println(catList.get(num-1).getCatName()+"을/를 삭제합니다");
				catList.remove(num-1);
				System.out.println("삭제가 완료되었습니다");
			} catch (Exception e) {
				System.out.println("올바른 번호를 입력하세요");
			}
		}
	}
	
	//고양이 전체보기
	private void allCat() {
		for(int i=0;i<catList.size();i++) {
			System.out.println(i+1+" 번");
			catList.get(i).prt();
		}
	}
}
