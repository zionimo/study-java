package chap08_inherit;

public class Worker extends People {
	//필드 
	private String job;
	private int careerMonth;
	
	//[실습]
	//디폴트 생성자(매개변수x) 묵시적 호출
	public Worker() {
		this.job = "";
		this.careerMonth = 0;
	}
	
	//모든 필드값을 받아오는 생성자 명시적 호출
	public Worker(String name, String gender, int age, String job, int careerMonth) {
		super(name, gender, age);
		this.job = job;
		this.careerMonth = careerMonth;
		
	}
	
	//메소드
	public int  nextMonth() {
		this.careerMonth++;
		return this.careerMonth;
	}
	
	//슈퍼클래스의 메소드를 사용하는 메소드
	//selfIntro를 가져와서 출력하고, 아래에 job입니다 라고 함께 출력하는 메소드
	public void intro () {  //동일한 이름의 메소드가 있으므로
		//슈퍼클래스에서 받아옴을 명시
		super.selfIntro();
		System.out.println("직업은 " + job + " 입니다");
	}

	@Override
	public void selfIntro () {
		//name입니다. job에서 일을 하고 있습니다 를 출력하시오
		System.out.println(name + " 입니다." + job +"일을 하고 있습니다");
	}
	
	//equals 메소드를 만들어서 이름, 성별, 나이, 직업 일한 개월이 같을 때
	//true를 return 하세요 (그 외에는 전부 false return)
	public boolean equals(Worker worker ) {
		if (name ==worker.name && gender == worker.gender && age == worker.age 	
		&& job == worker.job && careerMonth == worker.careerMonth) {
			return true;
		} else {
			return true;			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
