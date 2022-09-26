package chap09_interface;

public class Student implements Comparable {
	private String name;
	private int grade;
	
	//디폴트 생성자
	public Student() {
		name = "홍길동";
		grade = 0;
	}
	
	//매개변수가 있는 생성자
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Object otherObject) {
		//비교하는 메소드 
		//Student 객체를 받아와서 그 객체안의 grade를 비교하는 메소드
		
		//1.otherObject를 instanceof 로 객체의 타입을 확인하고 
		//	객체의 타입이 Student일 때, 그 객체를 Student 객체로 형변환한다
		if ( otherObject instanceof Student) {
			Student student = (Student) otherObject;
			//2.형변환을 했다면, this 객체의 grade에 접근해서  
			//	형변환한 otherObject의 grade를 비교
			//2-1. 값이 같으면 0을 return, 
			//		this의 값이 크면 1을 return, this의 값이 작으면 -1을 return
			
			if (this.grade == student.grade) {
				return 0;
			} else if (this.grade > student.grade) {
				return 1;
			} else {
				return -1;
			}
		
		}
		
		
		//1-1. 객체의 타입이 Student가 아닐 때, 
		//		Student 객체가 아닙니다 를 출력하고 return 10을 반환 
		else {
			System.out.println("Student 객체가 아닙니다");
			return 10;
		}
		
		
	}
	
	
}
