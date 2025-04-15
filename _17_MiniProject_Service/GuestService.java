package _17_MiniProject_Service;

import java.util.Scanner;

import _17_MiniProject_DAO.GuestDAO;
import _17_MiniProject_DTO.GuestDTO;

public class GuestService {
	Scanner in=new Scanner(System.in);
	GuestDAO gdao= GuestDAO.getInstance();
	GuestDTO loginGuest=null;
	public GuestService() {
		guestMenu();
	}
	private void guestMenu() {
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 리뷰작성");
			System.out.println("5. 로그아웃");
			System.out.println("6. 뒤로가기");
			try {
				int selNum=in.nextInt();
				in.nextLine();
				if(selNum==1) {
					guestLogin();
				}else if(selNum==2) {
					guestJoin();
				}else if(selNum==3) {
					guestModInfo();
				}else if(selNum==4) {
					guestAddReview();
				}else if(selNum==5) {
					guestLogout();
				}else if(selNum==6) {
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
	// 고객 로그인
	private void guestLogin() {
		if(loginGuest==null) {
			System.out.println("아이디를 입력하세요");
			String loginGuestId=in.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String loginGuestPassword=in.nextLine();
			GuestDTO guest=gdao.findGuest(loginGuestId);
			if(guest.getGuestId()==null) {
				System.out.println("아이디를 확인해주세요");
			}else {
				if(guest.getGuestPassword().equals(loginGuestPassword)) {
					loginGuest=guest;
					System.out.println(guest.getGuestId()+"님 환영합니다");
				}else {
					System.out.println("비밀번호를 확인해주세요");
				}
			}
		}else {
			System.out.println("이미 로그인 중입니다");
		}
	}
	//고객 회원가입
	private void guestJoin() {
		while(true) {
			System.out.println("아이디를 입력하세요");
			String newGuestId=in.nextLine();
			if(findId(newGuestId)==null) {
				System.out.println("비밀번호를 입력하세요(최대20자)");
				String guestPassword=in.nextLine();
				System.out.println("사용자의 이름을 입력하세요");
				String guestName=in.nextLine();
				System.out.println("주민등록번호 앞 6자리를 입력하세요");
				String guestRegNum1=in.nextLine();
				System.out.println("주민등록번호 뒤 첫 1자리를 입력하세요");
				String guestRegNum2=in.nextLine();
				System.out.println("휴대폰 번호 010 이후 4자리를 입력하세요");
				String guestPhoneNum1=in.nextLine();
				System.out.println("휴대폰 번호 뒤 4자리를 입력하세요");
				String guestPhoneNum2=in.nextLine();
				GuestDTO newGuest=new GuestDTO();
				newGuest.setGuestId(newGuestId);
				newGuest.setGuestName(guestName);
				newGuest.setGuestPassword(guestPassword);
				newGuest.setGuestRegNum(guestRegNum1, guestRegNum2);
				newGuest.setGuestPhoneNum("010", guestPhoneNum1, guestPhoneNum2);
				gdao.insertGuest(newGuest);
				break;
			}else {
				System.out.println("해당 아이디는 이미 등록된 아이디 입니다");
			}	
		}
	}
	private void guestModInfo() {
		
	}private void guestAddReview() {
		
	}
	// 고객 로그아웃
	private void guestLogout() {
		if(loginGuest==null) {
			System.out.println("로그인 되어있지 않습니다");
		}else {
			loginGuest=null;
			System.out.println("로그아웃 되었습니다");
		}
	}
	// 아이디 중복 확인
	private String findId(String guestID) {
		return gdao.findGuest(guestID).getGuestId();
	}
}
