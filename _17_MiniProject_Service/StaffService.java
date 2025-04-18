package _17_MiniProject_Service;

import java.util.Scanner;

import _17_MiniProject_DAO.StaffDAO;
import _17_MiniProject_DTO.StaffDTO;

public class StaffService {
	private StaffDTO loginStaff=null;
	private final StaffDAO sdao=StaffDAO.getInstance();
	Scanner in=new Scanner(System.in);
	public StaffService() {
		staffMenu();
	}
	private void staffMenu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 로그인");
			System.out.println("2. 출퇴근 등록");
			System.out.println("3. 근무시간 조회");
			System.out.println("4. 개인정보 수정");
			System.out.println("5. 사직원 작성");
			System.out.println("6. 로그아웃");
			System.out.println("7. 뒤로가기");
			try {
				int selNum=in.nextInt();
				in.nextLine();
				if(selNum==1) {
					staffLogin();
				}else if(selNum==2) {
					staffClockInOut();
				}else if(selNum==3) {
					staffWorkhour();
				}else if(selNum==4) {
					staffModInfo();
				}else if(selNum==5) {
					staffResign();
				}else if(selNum==6) {
					staffLogout();
				}else if(selNum==7) {
					break;
				}else {
					continue;
				}
			} catch (Exception e) {
				e.printStackTrace();
				in.nextLine();
				continue;
			}
		}
	}
	private void staffLogin() {
		if(loginStaff==null) {
			System.out.println("사원번호를 입력하세요");
			String loginStaffIdNum=in.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String loginStaffPassword=in.nextLine();
			StaffDTO findStaff=findStaff(loginStaffIdNum);
			if(findStaff==null) {
				System.out.println("사원번호를 정확하게 입력해주세요");
			}else {
				if(findStaff.getStaffPassword().equals(loginStaffPassword)) {
					System.out.println(findStaff.getStaffName()+" 님 환영합니다");
					loginStaff=findStaff;
				}else {
					System.out.println("비밀번호를 정확하게 입력해주세요");
				}
			}
		}else {
			System.out.println("이미 로그인 되어있습니다");
		}
		
	}
	private void staffClockInOut() {
		// TODO Auto-generated method stub
		
	}
	private void staffWorkhour() {
		// TODO Auto-generated method stub
		
	}
	private void staffModInfo() {
		// TODO Auto-generated method stub
		
	}
	private void staffResign() {
		// TODO Auto-generated method stub
		
	}
	private void staffLogout() {
		if(loginStaff==null) {
			System.out.println("이미 로그아웃 상태입니다");
		}else {
			loginStaff=null;
			System.out.println("로그아웃 되었습니다");
		}
	}
	// 사번으로 직원 조회
	public StaffDTO findStaff(String staffIdNum) {
		return sdao.selectStaff(staffIdNum);
	}
}
