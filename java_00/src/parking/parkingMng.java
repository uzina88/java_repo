package parking;

import java.util.Scanner;

public class parkingMng {


	public static Scanner sc = new Scanner(System.in);

	// final : 4행 3열 절대선언(변형 없는 경우) | 기준값
	static final int ROW = 4;
	static final int COL = 3;
	static final String RESULT = "성공!!";
	// static final double PIE = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 주차장 구조
		 * □ □ □
		 * □ □ □
		 * □ □ □
		 * □ □ □
		 * 
		 * */

		//  new String[4][3];	

		String[][] pakingSpace = new String[ROW][COL];

		// 반복문 추
		while (true) {

			System.out.println("[주차장 현황]");
			System.out.println();
			System.out.println("  1 2 3");


			for (int i=0; i<pakingSpace.length; i++) {
				System.out.println();
				System.out.print(i+1 + " ");

				for(int j=0; j<pakingSpace[i].length; j++) {
					if(pakingSpace[i][j] == null) {
						System.out.print("□ ");
					} else {
						System.out.print("■ ");
					}
				}
				System.out.println();
			}

			System.out.println();
			System.out.println("원하는 메뉴를 선택해 주세요.");
			System.out.println("1) 주차 2) 출자 3) 종료");

			String menu = sc.next();

			switch(menu) {
			
			// 1.주차
			case "1" :
				System.out.println("주차하고 싶은 위치를 선택해주세요");
				System.out.println("(예시) 세로 가로 - 2 1");

				int locationRow = sc.nextInt();
				int locationCol = sc.nextInt();
				
				// 기존 주차 행열 숫자보다 크게 입력할 경우에 에러 메세지
				if(locationRow > ROW || locationCol > COL ) {
					System.out.println("주차 위치를 잘못 입력하셨습니다.");
					
					break;
				}
				
				if(pakingSpace[locationRow-1][locationCol-1] != null) {
					System.out.println("이미 주차가 되어 있습니다.");
					System.out.println("처음부터 다시 시작해주세요.");
					System.out.println("------------------------------");
					break;
				}
				
				

				System.out.println("주차 차량의 번호를 입력해주세요. (예: 20가1234) : ");
				String carNum = sc.next();

				System.out.print("차량 번호가 " + carNum + " 맞습니까? (y / n)");
				String confirm = sc.next();

				// y값과 일치하는지? 3을 입력하면 2가 입력됨
				if ("y".equals(confirm)) {
					pakingSpace[locationRow-1][locationCol-1] = carNum;
					System.out.println("주차가 완료되었습니다 !!");
				} else {
					System.out.println("처음부터 다시 시작해주세요.");
					System.out.println("------------------------------");
					break;
				}

				break;

			// 2.출차
			case "2" :
				System.out.println("차량번호는 입력해 주세요 : ");
				String number = sc.next();
				
				int count = 0;
				
				// 2중 배열 돌리기
				for(int i=0; i<pakingSpace.length; i++) {
					for(int j=0; j<pakingSpace[i].length; j++)  {
						//카운트 확인
						System.out.println("count >> " + count);
						if(number.equals(pakingSpace[i][j])) {
							// 값을 비워줄 때 = null;
							pakingSpace[i][j] = null;
							System.out.println("출차 완료!! 안녕히 가세요");
							break;
						} else {
							count++;
						}
						//카운트 확인
						System.out.println("count >> " + count);
					}
				}
				
				// 4 * 3 = 12
				if(count == ROW * COL) {
					System.out.println("차량이 존재하지 않습니다.");
					System.out.println("차량 번호 확인 후 다시 시도해 주세요.");
				}
				
				break;
				
			// 3.종료
			case "3" :
				System.out.println("시스템 종료!!");
				System.exit(0);
				break;

			default :

			}
		}

	}



}