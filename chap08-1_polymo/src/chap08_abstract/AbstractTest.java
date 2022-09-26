package chap08_abstract;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스는 객체를 생성하게 되면 생성자로 생성할 수 없다.
		//추상메소드의 몸체를 구현해서 사용할 수 있다.
		//서브클래스를 통해서 상속받아 그 몸체를 구현하여 사용한다.
		//Shape s1 = new Shape();
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print("단어를 입력합니다");
		r1.move(10, 20);
		
		//[실습. 추상클래스 상속]
		System.out.println("[실습. 추상클래스 상속]");
		//Shape 클래스를 상속받는 Circle 클래스 작성
		//Draw()  //원을 그립니다 출력
		//Print()  //원클래스에서 출력 : word
		//Main에서 Circle 객체를 생성하고 확인하시오
		Circle c1 = new Circle();
		c1.draw();
		c1.print("원");
		
		
		//[실습. 추상클래스 작성 및 활용]
		System.out.println("[실습. 추상클래스 작성 및 활용]");
		//Animal 을 상속받는 추상클래스 Mammal을 작성하고, 서브 클래스 Dog과 Cat을 작성하자
		//추상클래스 Mammalpublic void move() {}  //“이동한다”를 출력 – 메소드 오버라이딩
		//public abstract void sound();   //추상메소드
		//서브클래스 Dog과 Cat (Mammal을 상속 받는다)
		//public void sound() {   }  //각 클래스마다 “멍멍”, “야옹＂을 출력한다.
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.move();
		cat.move();
		dog.sound();
		cat.sound();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
