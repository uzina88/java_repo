package hotel;

import java.util.List;
import java.util.Scanner;

import memberMng.Member;

public class HotelService {

	public static HotelDAO hotelDAO;
	Scanner sc = new Scanner(System.in);
	
	
	public HotelService() {
		hotelDAO = new HotelDAO();
	}
	
	// 반복문
	public void startProgram() {
		
		while (true) {
			
			int choice = printMenu();
			switch(choice) {

			case 1 :
				// 입실
				chekIn();
				break;

			case 2 :
				// 퇴실
				chekOut();
				break;

			case 3 :
				// 방보기
				roomInfo();
				break;
				
			case 4 :
				// 프로그램 종료
				System.out.println("시스템 종료 !!");
				System.exit(0);
				break;

			default  :
				System.out.println("1~4까지 정수를 입력해 주세요.");
				break;
			}
		}
	}
	
	// 0.프린터 입력 출력
	public int printMenu() {
		
		System.out.println("=== 호텔 관리 프로그램 ===");
		System.out.println("[호텔에는 총]" + hotelDAO.RoomCnt + "개의 객실이 있습니다.]");
		System.out.println("===================================================");
		System.out.println("1.입실  2.퇴실  3.방보기  4.종료");
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		
		return choice;
		
	}
	
	// 1.입실
	public void chekIn() {
		
		System.out.println("몇 번 방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();
		
		// [체크1] 1~RoomCnt 사이의 객실 번호를 입력하였는지
		// [체크2] 선택한 객실에 손님이 있는지(사용이 가능한지 안한지 체크)
		// 체크 1,2가 아니어야 정상적으로 입실 가능
		
		if(roomNum < 1 || roomNum > hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1~ " + hotelDAO.RoomCnt + "호실 까지의 객실이 있습니다.");
			System.out.println("다시 선택해 주세요.");
		} else if(hotelDAO.selectRoomChk(roomNum)) {
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 선택해주세요.");
		} else if(hotelDAO.selectRoomChk(roomNum)) {
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 선택해주세요.");
		} else {
			//객실 체크인
			hotelDAO.chekIn(roomNum);
			System.out.println("객실 체크인이 완료 되었습니다. 즐거운 하루 되세요!!");
		}
		
	}
	
	// 2.퇴실
	public void chekOut() {
		
		System.out.println("몇 번 객실에서 퇴실하시겠습니까?");
		int roomNum = sc.nextInt();
		
		hotelDAO.chekOut(roomNum);
		System.out.println(roomNum + "번방 체크아웃 되셨습니다.");
		
	}
	
	
	// 3.방보기
	public void roomInfo() {
		
		// roomList 받아오기
		List<Room> rooms = hotelDAO.selectRoomList();
		
		// roomList에서 Room 객체의 사용여부를 확인할 수 있도록 반복문 구현
		// Room 객체의 사용 여부는 isUsing으로 알 수 있다
		// isUsing = true 이면, 사용중
		// isUsing = false 이면, 사용가능
		
		int cnt = 1;
		
		// Room r에 rooms를 반복으로 값을 돌려준다.
		for(Room r : rooms) {
			if(r.isUsing() == true) {
				System.out.println(cnt + "호 객실은 현재 손님이 있습니다.");
			} else {
				System.out.println(cnt + "호 객실은 현재 비어 있습니다.");
			}
			cnt++;
		}
		
		// [ 최종 결과 : 총 RoomCon 만큼의 객실 상태를 보여주면 됨 ]
		// 1호 객실은 현재 손님이 있습니다.
		// 2호 객실은 현재 비어 있습니다.
		// 3 ......
		// 10호 객실은 현재 비어 있습니다.
		
	}
	
	
}
