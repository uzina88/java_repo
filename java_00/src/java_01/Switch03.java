package java_01;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 정수1 / 연산자 / 정수2 를 입력 받아 연산식을 구현하여 결과를 출력해 주세요.
		//
		// 입력 값은 총 세개
		// 
		// 정수 1 연산자 정수2 로 계산 및 결과 출력
		// -----------------------------------------------------

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("연산자를 선택하세요. [ +, -, *, / ] : ");
		String oper = sc.next();

		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();

		int result = 0;
		switch (oper) {
		case "+" :
			result = (num1+num2);
			System.out.println(num1+oper+num2 + " = " + result);
			break;
		case "-" :
			result = (num1-num2);
			System.out.println(num1+oper+num2 + " = " + result);
			break;	
		case "*" :
			result = (num1*num2);
			System.out.println(num1+oper+num2 + " = " + result);
			break;	
		case "/" :
			result = (num1/num2);
			System.out.println(num1+oper+num2 + " = " + result);
			break;	
		default : //case를 설정하지 않은 값들은 모두 default로 빠짐.
			System.out.println("연산자 [ +, -, *, / ] 중에 입력주세요.");
			break;
		}
		
		//System.out.println(num1+oper+num2 + " = " + result);
		

		sc.close();

	}

}