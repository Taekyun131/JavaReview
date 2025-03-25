package _12_Class_mission;

import java.util.Scanner;

public class Car_Mg {
	Scanner in=new Scanner(System.in);
	Car_obj[] carList=new Car_obj[5];
	
	Car_Mg(){
		init();
	}
	
	private void init() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 차량등록");
			System.out.println("2. 차량조회");
			System.out.println("3. 차량 전체보기");
			System.out.println("4. 차량삭제");
			System.out.println("5. 프로그램 종료");
			int selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				addCar();
			}else if(selNum==2) {
				showCar();
			}else if(selNum==3) {
				allCar();
			}else if(selNum==4) {
				delCar();
			}else if(selNum==5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("올바른 메뉴를 선택해주세요");
			}
		}
	}
	
	public void addCar() {
		boolean flag=findSpace();
		if(flag) {
			Car_obj newCar=new Car_obj();
			System.out.println("차량번호를 입력하세요");
			String carNum=in.nextLine();
			System.out.println("차주의 이름을 입력하세요");
			String ownerName=in.nextLine();
			System.out.println("새로운 차량이 등록되었습니다.");
			newCar.carNum=carNum;
			newCar.ownerName=ownerName;
			for(int i=0;i<carList.length;i++) {
				if(carList[i]==null) {
					carList[i]=newCar;
					break;
				}
			}
		}else {
			System.out.println("차량을 등록할 공간이 가득 찼습니다.");
		}
			
	}
	public void showCar() {
		System.out.println("조회할 차량번호를 입력하세요");
		String carNum=in.nextLine();
		int idx=findCar(carNum);
		if(idx==-1) {
			System.out.println("해당 차량이 없습니다");
		}else {
			carList[idx].prt();
		}
	}
	public void allCar() {
		for(int i=0;i<carList.length;i++) {
			if(carList[i]!=null) {
				carList[i].prt();
			}
		}
		
	}
	public void delCar() {
		System.out.println("삭제할 차량번호를 입력하세요");
		String carNum=in.nextLine();
		int idx=findCar(carNum);
		if(idx==-1) {
			System.out.println("해당 차량이 없습니다");
		}else {
			carList[idx]=null;
			System.out.println("해당 차량이 삭제되었습니다");
		}
	}
	public boolean findSpace() {
		int count=0;
		boolean flag=false;
		for(int i=0;i<carList.length;i++) {
			if(carList[i]==null) {
				count++;
			}
		}
		if(count>0) {
			flag=true;
		}
		return flag;
	}
	public int findCar(String carNum) {
		int idx=-1;
		for(int i=0;i<carList.length;i++) {
			if(carList[i]!=null) {
				Car_obj car=carList[i];
				if(car.carNum.equals(carNum)) {
					idx=i;
				}
			}
		}
		return idx;
	}
}
