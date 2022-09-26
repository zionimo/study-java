package practice04;

public class BoardGame extends Game {
	
	//필드
	private int peopleNum;
	
	//디폴트 생성자
	void BoardGame() {
		peopleNum = 0;
	}
	
	//매개가 있는 생성자
	public BoardGame(String gameTitle, int peopleNum) {
		super(gameTitle); //슈퍼클래스의 생성자 호출, 매개변수 전달
		this.peopleNum = peopleNum;
	}	
		
	// 메소드
	 public void play() {
		 System.out.println(peopleNum + "명이서 " + getGameTitle() +  " 게임을 시작합니다");
	 }
		
		
		
		
		
		
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
