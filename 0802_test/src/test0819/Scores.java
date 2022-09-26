package test0819;

public class Scores {
	// <1번문제>
	// 클래스 : Scores
	// 필드 : korean, math, english
	// 생성자 : Scores(), Scores(korean, math, english)
	// 메소드 :arvg () // 세 점수의 평균을 반환한다.

	// 필드
	private int korean;
	private int math;
	private int english;

	// 생성자
	public Scores() {
		korean = 0;
		math = 0;
		english = 0;
	}

	public Scores(int korean, int math, int english) {
		this.korean = korean;
		this.math = math;
		this.english = english;
	}

	// 메소드
	public int arvg() {
		int arvg = (korean + math + english) / 3;
		return arvg;
	}

}