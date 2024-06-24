package java_01;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 31일 입니다.
		// -----------------------------------------------------

		
			Scanner sc = new Scanner(System.in);
					
			System.out.print("달(월)을 입력하세요. : ");
			int month = sc.nextInt();
			
			switch(month) {
				case 1, 3, 5, 7, 8, 10, 12 :
					System.out.println("마지막 날은 31일입니다.");
					break;
				case 2 :
					System.out.println("마지막날은 28일입니다.");
					break;
				case 4, 6, 9, 11 :
					System.out.println("마지막 날은 30일입니다.");
					break;		
				default : //case를 설정하지 않은 값들은 모두 default로 빠짐.
					System.out.println("1~12월 숫자를 입력해주세요");
					break;
			}
			
			
		
		// 동일한 조건식을 if문으로 작성해보기

			System.out.println("월을 입력해주세요. 해당 말일을 확인하기 ");
			int month2 = sc.nextInt();
			String monthResult = "";
			
			if (month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12) {
				monthResult = "마지막 날은 31일 입니다.";
			} else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
				monthResult = "마지막 날은 30일 입니다.";
			} else if (month2 == 2) {
				monthResult = "마지막 날은 28일 입니다.";
			} else {
				monthResult = "1~12월 숫자를 입력해주세요.";
			}
			
			System.out.println(month2 + " 월은 " + monthResult);
			
			
			sc.close();
	}

}