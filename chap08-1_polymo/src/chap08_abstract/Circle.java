package chap08_abstract;

public class Circle extends Shape {
	//[실습. 추상클래스 상속]
	//Shape 클래스를 상속받는 Circle 클래스 작성
	//draw()  //원을 그립니다 출력
	//print()  //원클래스에서 출력 : word
	//Main에서 Circle 객체를 생성하고 확인하시오

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다");
	}

	@Override
	public void print(String word) {
		// TODO Auto-generated method stub
		System.out.println("원클래스에서 출력 : " + word);
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
