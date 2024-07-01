package memberMng;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	// 객체 선언(단일 객체)
	// Member member = new Member();
	
	// ArrayList<Book> library = new ArrayList<Book>(); 와 유사함
	// 전역변수 : 프로그램 시작과 종료까지 계속 존재하는 리스트 객체
	List<Member> members;
	
	// Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
	// insertMember, updateMember, deleteMember, findMember, findAllMember

	public MemberDAO() {
		members = new ArrayList<Member>();	
	}
	
	//저장
	public void insertMember(Member member) {
		// member에 추가
		members.add(member);
	}
	
	//수정
	public void updateMember(Member member) {
		// 값 순서
		int index = 0;
		members.set(index, member);
	}

	//삭제
	public void deleteMember(Member member) {
		members.remove(member);
	}

	//출력
	public List<Member> findMember() {
		return members;
	}
	//전체출력
	public List<Member> findAllMember() {
		return members;
	}

	
}
