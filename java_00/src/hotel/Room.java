package hotel;

public class Room {

	// 객실이 사용중인지 아닌지 객체 선언
	private boolean isUsing;
	// true : 사용중
	// false : 사용가능(빈 객실)
	
	
	// 기본 생성자
	public Room() {
		
	}
	
	public Room(boolean isUsing) {
		this.isUsing = isUsing;
	}

	public boolean isUsing() {
		return isUsing;
	}

	public void setInUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}
	
	
	
	
	
}
