package test0810;

public class Student {
	//필드값
	String name;
	int number;
	int score;
	
	//매개가 없을 때 생성자
	Student() {
		this.name = "홍길동";
		this.number = 0;
		this.score = 0;
	}
	
	//매개가 있을 때 생성자
	Student (String name, int number) {
		this.name = name;
		this.number = number;
		this.score = 0;
	}
	
	void setScore (int score) {
		this.score = score;
	}
	
	int getScore() {
		return this.score;
	}
	
	void printResult () {
		//60점 이상일 때 합격이 출력되고
		//미만일 때 불합격이라고 출력하시오
		if (score >= 60) {
			System.out.println(name + "님은 합격입니다");
		} else {
			System.out.println(name + "님은 불합격입니다");
		}
	}
	
	
	
	
	
	
}
