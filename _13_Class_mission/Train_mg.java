package _13_Class_mission;

import java.util.ArrayList;
import java.util.Scanner;

public class Train_mg {
//	public static Train_mg trainmg=null;
	Scanner in=new Scanner(System.in);
	ArrayList<Train_obj> trainList=new ArrayList<>();
	Train_mg() {
		menu();
	}
	
//	public static Train_mg getInstance() {
//		if(trainmg==null) {
//			trainmg=new Train_mg();
//		}
//		return trainmg;
//	}
	private void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 열차 등록하기");
			System.out.println("2. 열차 전체보기");
			System.out.println("3. 열차 수정하기");
			System.out.println("4. 열차 수리하기");
			System.out.println("5. 열차 수리정보");
			System.out.println("6. 프로그램 종료");
			int selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				addTrain();
			}else if(selNum==2) {
				allTrain();
			}else if(selNum==3) {
				modTrain();
			}else if(selNum==4) {
				fixTrain();
			}else if(selNum==5) {
				showFixTrain();
			}else if(selNum==6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("올바른 메뉴를 선택해주세요");
			}
		}
	}
	
	private void addTrain() {
//		System.out.println("등록할 열차의 번호를 입력하세요");
//		String trainNum=in.nextLine();
		System.out.println("등록할 열차의 번호를 선택하세요");
		System.out.println("1. 1111 (무궁화)");
		System.out.println("2. 2222 (새마을)");
		System.out.println("3. 3333 (무궁화)");
		System.out.println("4. 4444 (새마을)");
		Train_obj newTrain=new Train_obj();
		int selNum=in.nextInt();
		in.nextLine();
		if(selNum==1) {
			newTrain.setTrainNum("1111");
			newTrain.setTrainType("무궁화");
		}else if(selNum==2) {
			newTrain.setTrainNum("2222");
			newTrain.setTrainType("새마을");
		}else if(selNum==3) {
			newTrain.setTrainNum("3333");
			newTrain.setTrainType("무궁화");
		}else if(selNum==4) {
			newTrain.setTrainNum("4444");
			newTrain.setTrainType("새마을");
		}else {
			System.out.println("올바른 번호를 선택해주세요");
		}
		
		System.out.println("등록할 열차의 시간을 입력하세요");
		String trainTime=in.nextLine();
//		newTrain.setTrainNum(trainNum);
		newTrain.setTrainTime(trainTime);
		trainList.add(newTrain);
		System.out.println("열차가 등록되었습니다");
	}
	private void allTrain() {
		for(int i=0;i<trainList.size();i++) {
			Train_obj train=trainList.get(i);
			if(!train.isTrainFix()) {
				train.prt();
			}
		}
	}
	private void modTrain() {
		System.out.println("수정할 열차의 번호를 입력하세요");
		String trainNum=in.nextLine();
		System.out.println("열차의 도착시간을 입력하세요");
		String trainTime=in.nextLine();
		int trainIdx=findIdx(trainNum,trainTime);
		if(trainIdx==-1) {
			System.out.println("수정할 열차가 존재하지 않습니다");
		}else {
			System.out.println("수정할 열차시간을 입력하세요");
			String modTrainTime=in.nextLine();
			trainList.get(trainIdx).setTrainTime(modTrainTime);
			System.out.println("열차정보가 수정되었습니다");
		}
	}
	private int findIdx(String trainNum, String trainTime) {
		int trainIdx=-1;
		for(int i=0;i<trainList.size();i++) {
			Train_obj train=trainList.get(i);
			if(train.getTrainNum().equals(trainNum)) {
				if(train.getTrainTime().equals(trainTime)) {
					trainIdx=i;
				}
			}
		}
		return trainIdx;
	}
	
	private void fixTrain() {
		System.out.println("수리할 열차의 번호를 입력하세요");
		String trainNum=in.nextLine();
		System.out.println("수리할 열차의 도착시간을 입력하세요");
		String trainTime=in.nextLine();
		int trainIdx=findIdx(trainNum,trainTime);
		if(trainIdx==-1) {
			System.out.println("수리할 열차가 존재하지 않습니다");
		}else {
			trainList.get(trainIdx).setTrainFix(true);
			System.out.println("열차의 수리가 요청되었습니다");
		}
	}
	
	private void showFixTrain() {
		for(int i=0;i<trainList.size();i++) {
			Train_obj train=trainList.get(i);
			if(train.isTrainFix()) {
				train.prt();
			}
		}
	}
	
}
