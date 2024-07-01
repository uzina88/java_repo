package memberMng;

import java.util.List;
import java.util.Scanner;

public class MemberService {

	MemberDAO mDAO;
	Scanner sc = new Scanner(System.in);

	// 기본 생성자
	public MemberService() {
		mDAO = new MemberDAO();
	}

	//	===== 회원 관리 프로그램 =====
	//	1. 회원 정보 등록
	//	2. 회원 정보 수정
	//	3. 회원 정보 삭제
	//	4. 회원 정보 출력(이름)
	//	5. 회원 전체 정보 출력
	//	6. 프로그램 종료

	public void startProgram() {
		
		while(true) {
			
			int choice = printMenu();
			int count = 0;
			
			switch (choice) {
			case 1 : 
				displayMsg("1. 회원 정보 등록");
				insertMember();
				break;
			case 2 :
				displayMsg("2. 회원 정보 수정");
				break;
			case 3 : 
				displayMsg("3. 회원 정보 삭제");
				break;
			case 4 : 
				displayMsg("4. 회원 정보 출력(이름)");
				printMember();
				break;
			case 5 : 
				displayMsg("5. 회원 전체 정보 출력");
				printAllMembers();
				break;
			case 6 : 
					displayMsg("프로그램 종료~!!");
					count++;
					break;
			default :
				displayMsg("잘못된 숫자가 입력됨. 1~6 사이의 숫자 입력 가능");
				break;
			}
			// 6번이 카운팅 되면 종료
			// if(choice == 6)
			if(count == 1) {
				break;
			}
		}
	}
	
	// 프로그램 메뉴 출력
	public int printMenu() {
		displayMsg("===== 회원 관리 프로그램 =====");
		displayMsg("1. 회원 정보 등록");
		displayMsg("2. 회원 정보 수정");
		displayMsg("3. 회원 정보 삭제");
		displayMsg("4. 회원 정보 출력(이름)");
		displayMsg("5. 회원 전체 정보 출력");
		displayMsg("6. 프로그램 종료");
		System.out.println("[선텍] : ");
		
		int choice = sc.nextInt();
		return choice;
	}
	
	// 1. 회원정보 생성
	public void insertMember() {
		
//	private String memberId;	// 회원 아이디
//	private String memberPw;	// 회원 비밀번호
//	private String memberName;	// 회원 이름
//	private String email;		// 이메일
//	private String phone;		// 연락처

		// 회원 정보를 등록할 member 객체 생성
		Member member = new Member();
		
		System.out.print("회원 아이디를 입력해 주세요 : ");
		String memberId = sc.next();
		
		System.out.print("회원 비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("회원 이름 : ");
		String memberName = sc.next();
		
		System.out.print("회원 이메일 주소 :");
		String email = sc.next();
		
		System.out.print("회원 연락처 : ");
		String phone = sc.next();
		
		// member에 회원 정보 셋팅
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setEmail(email);
		member.setPhone(phone);
		
		// 셋팅된 member를 List<Member>
		mDAO.insertMember(member);
		
	}
	
	
	// 4. (단일) 회원 정보 메소드 생성
	public void printMember() {
		
		List<Member> members = mDAO.findMember();
		
		System.out.println("조회할 회원 아이디를 입력해 주세요");
		String findId = sc.next();
		
		boolean flag = false;
		
		for(int i=0; i<members.size(); i++) {
			Member member = members.get(i);
			
			// 문자열 비교 equals()
			// findId 와 일치하는 회원만 출력해줘(아이디가 일치헀을 때)
			if(findId.equals(member.getMemberId())) {
				displayMsg("회원 아이디 :" + members.get(i).getMemberId());
				displayMsg("회원 비밀번호 :" + members.get(i).getMemberPw());
				displayMsg("회원 이름 :" + members.get(i).getMemberName());
				displayMsg("회원 이메일 :" + members.get(i).getEmail());
				displayMsg("회원 연락처 :" + members.get(i).getPhone());
				
				flag = true;
				break;	
			}
		}
		
		if(flag == false) {
			displayMsg("회원 아이디가 좋재하지 않습니다.");
		}
		
	}
	
	
	
	// 5. 회원 정보 (전체) 출력 메소드 생성
	public void printAllMembers() {
		
		List<Member> members = mDAO.findAllMember();
		
		// ArrayList는 size();
		for(int i=0; i<members.size(); i++) {
			Member member = members.get(i);
			
			 // LIST에 있는 0번째 멤벌르 가져와라
			displayMsg("-------------------------------------------");
			displayMsg("회원 아이디 :" + members.get(i).getMemberId());
			displayMsg("회원 비밀번호 :" + members.get(i).getMemberPw());
			displayMsg("회원 이름 :" + members.get(i).getMemberName());
			displayMsg("회원 이메일 :" + members.get(i).getEmail());
			displayMsg("회원 연락처 :" + members.get(i).getPhone());
			displayMsg("-------------------------------------------");
		}
		
	}
	
	
	
	// 메세지 출력용 메소드 생성
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	
}
