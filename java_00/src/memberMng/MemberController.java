package memberMng;

public class MemberController {

	public static void main(String[] args) {
		// Controller 에서 프론트에 값을 던져줌
		
		MemberService memberService = new MemberService();
		
		memberService.startProgram();
		
	}

}
