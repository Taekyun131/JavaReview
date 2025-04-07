package _16_OJDBC_practice;

import java.util.Scanner;

public class FoodService {
	FoodDAO fdao=FoodDAO.getInstance();
	Scanner in=new Scanner(System.in);
	public FoodService() {
		menu();
	}
	private void menu() {
		while(true) {
			System.out.println("-----메뉴를 선택하세요-----");
			System.out.println("1. 음식등록");
			System.out.println("2. 음식조회");
			System.out.println("3. 음식수정");
			System.out.println("4. 음식삭제");
			System.out.println("5. 프로그램 종료");
			try {
				int selectNumber=in.nextInt();
				in.nextLine();
				if(selectNumber==1) {
					addFood();
				}else if(selectNumber==2) {
					showFood();
				}else if(selectNumber==3) {
					modFood();
				}else if(selectNumber==4) {
					delFood();
				}else if(selectNumber==5) {
					break;
				}else {
					System.out.println("올바른 메뉴를 선택하세요");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private void addFood() {
		System.out.println("등록할 음식을 입력하세요");
		String foodName=in.nextLine();
		System.out.println("등록할 음식의 선호정도를 입력하세요(0~10)");
		int foodLikeLevel=in.nextInt();
		in.nextLine();
		FoodDTO fdto=new FoodDTO();
		fdto.setFoodName(foodName);
		fdto.setFoodLikeLevel(foodLikeLevel);
		fdao.insertFood(fdto);
	}
	private void showFood() {
		System.out.println("조회할 음식을입력하세요");
		String searchFoodName=in.nextLine();
		FoodDTO searchFood=fdao.selectFood(searchFoodName);
		if(searchFood.getFoodName()!=null) {
			System.out.println("음식이름: "+searchFood.getFoodName());
			System.out.println("선호정도: "+searchFood.getFoodLikeLevel());
			System.out.println("등록날짜: "+searchFood.getFoodIntime());
			System.out.println();
		}else {
			System.out.println("해당 음식이 등록되어있지 않습니다");
		}
	}
	private void modFood() {
		System.out.println("수정할 음식을 입력하세요");
		String FoodName=in.nextLine();
		System.out.println("수정할 음식 선호도를 입력하세요");
		int modFoodLikeLevel=in.nextInt();
		FoodDTO modFood=new FoodDTO();
		modFood.setFoodName(FoodName);
		modFood.setFoodLikeLevel(modFoodLikeLevel);
		fdao.updateFood(modFood);
	}
	private void delFood() {
		System.out.println("삭제할 음식을 입력하세요");
		String delFoodName=in.nextLine();
		System.out.println(delFoodName+"을/를 삭제하시겠습니까?");
		System.out.println("1. 삭제");
		System.out.println("2. 취소");
		int selectNumber=in.nextInt();
		if(selectNumber==1) {
			fdao.deleteFood(delFoodName);
		}else if(selectNumber==2) {
			System.out.println("삭제가 취소되었습니다");
		}else {
			System.out.println("잘못된 번호를 선택했습니다");
		}
	}
	
}
