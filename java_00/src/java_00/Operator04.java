package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		int num = 2;
		String result1 = ((num == 1)) ? "닭" : "소";
		String result2 = ((result1 == "닭")) ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은 " + result1 + " 이므로 " + result2 + "을 요리하겠습니다.");
		
		// 답압
		int animalNum = 1;
		String animal = "";
		String animalResult = "";
		
		animal = (animalNum == 1) ? "닭" : "소";
		animalResult = (animal == "닭") ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은 " + result1 + " 이므로 " + result2 + "을 요리하겠습니다.");
		System.out.println();
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
	
		int var = 10;
		String numResult = "";
		
		numResult = (var % 2 == 0) ? "짝수" : "홀수";
		System.out.println("입력하신 숫자 " + var + "은 " + numResult + " 입니다.");

		
		/**
		 * [평균 구하기]
		 * 
		 * 입력 값 : 국어, 영어, 수학
		 * 조건1) : 국어, 영어, 수학 점수의 평균을 구하여 85점 이상이면 합격 / 미만이면 불합격
		 * 조건2) : 평균 점수는 소수점 자리까지 표시
		 * 
		 * 결과물 예시 : 
		 * 당신의 국어 점수는 85점 입니다.
		 * 당신의 영어 점수는 90점 입니다.
		 * 당신의 수학 점수는 60점 입니다.
		 * 당신의 평균 점수는 78 이고, 불합격 입니다.
		 * 
		 * */
		
		int cls1 = 85;
		int cls2 = 90;
		int cls3 = 61;
		double clsAvg = (cls1 + cls2 + cls3) / 3.0;
		
		String clsResult = (clsAvg >= 85) ? "합격" : "불합격";
		System.out.println("당신의 국어 점수는 " + cls1 + " 입니다.");
		System.out.println("당신의 영어 점수는 " + cls2 + " 입니다.");
		System.out.println("당신의 수학 점수는 " + cls3 + " 입니다.");
		System.out.println("당신의 평균 점수는 " + clsAvg + " 이고 " + clsResult + " 입니다");
		
		
		
		

	}
}
