package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month1 = 12;
		int month2 = 25;
		int num1 = 100;
		int num2 = 10;
		int num3 = 5;
		
		float passingRate = 72.893f;
	
		
		// 숫자 계산
		int numSum = num1 + num2;
		
		// 년도 계산
		int curYear = 2024;
		int varNum = 1;
		int yearResult;
		yearResult = curYear - varNum; // 2023
		
		
		// 원의 둘레 계산
		double circumference = 3.141592653589793d;
		double circumference2 = circumference * num3 * 2;
		
		// 원의 넓이 계산
		double circumference3 = circumference * num3 * num3;
		
		// float -> int 강제형변환
		float num4 = 58.78945f;
		int num5 = (int) num4;
		
		// String -> char 강제형변환
		char i = '뷁';
		int c = (int) i;
		
		
		System.out.println(month1 + "월 " + month2 + "일은 크리스마스 입니다.");	
		System.out.println("작년 " + yearResult + "년도 대학 합격률은 " + passingRate + " 퍼센트 였습니다.");	
		System.out.println(num1 + " 이라는 숫자에 " + num2 + " 을 더하면 " + numSum + " 이 됩니다.");	
		System.out.println("원주율은 " + circumference + " 이고, 반지름이 " + num3 + " 인 원의 둘레는 " + circumference2 + " 입니다.");	
		System.out.println("반지름이 " + num3 + " 인 원의 넓이는 " + circumference3 + " 입니다.");	
		System.out.println(i + " 의 문자번호는 " + c + " 입니다.");	
		System.out.println(num4 + " 를 버림 하면 " + num5 + " 입니다.");	
		
		
	}

}
