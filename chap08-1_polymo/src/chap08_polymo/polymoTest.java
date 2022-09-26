package chap08_polymo;

public class polymoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입변환 : 다른 데이터 타입으로 변환하는 행위
		//클래스의 경우 : 자식타입은 부모타입으로 자동변환이 가능하다.
		//Car : SportsCar의 부모클래스
		//SportsCar : Car의 자식클래스
		//변수의 데이터 타입은 부모클래스이지만, 안의 객체는 자식클래스가 들어감
		Car myCar = new SportsCar();
		//부모클래스로 자동으로 타입변환을 해 줄 경우 부모 필드/메소드는 사용 가능
		//부모클래스로 타입변환이 되었기 때문에 sportsCar의 필드/메소드는 사용불가능 
		System.out.println(myCar.color);
		//부모클래스의 메소드를 오버라이딩한 내용은 
		//SportsCar에서 수정한 내용으로 사용이 가능하다
		System.out.println(myCar.speedUp(10));
		
		//자동 형변환의 예시 
		//String + int =  String 형으로 자동 형변환
		System.out.println("글자와 숫자의 결합 : " + 10);
		//double / int = double 형으로 자동 형변환
		System.out.println(10.2/2);
		
		//강제로 형변환
		//방법은 (괄호)를 통해 자료형을 강제로 바꿔줌
		Car yourCar = (Car)new SportsCar();
		System.out.println(10.2/(double)2);
		
		//자식클래스에 부모클래스 개게를 할당할 수 없다.
		//sportsCar = new Car();  //불가능
		
		
		//[실습. 다형성과 타입 변화 확인]
		System.out.println("[실습. 다형성과 타입 변화 확인]");
		People p1 = new Worker("흥부", "남", 30, "농부", 40);
		//오버라이딩을 통해서 메소드를 들고올 때 입력해준 필드값으로 존재 확인
		p1.selfIntro();
		
		//부모자료형의 변수에 넣은 자식객체를 강제로 형변환해서 넣기
		//자식객체를 그대로 사용한다(변수 그대로 할당하였으므로 주소 복사)
		SportsCar sportsCar1 = (SportsCar) myCar;
		//자식객체의 메소드/필드를 사용할 수 있다.
		//주소를 그대로 가져왔기 때문에 값이 동일하게 바뀐다.
		sportsCar1.setTurbo(true);
		
		//자식자료형의 변수에 부모객체를 강제로 형변환해서 넣을 수 없다
		//SportsCar sportCar2 = (SportsCar) new Car();  //불가능
		
		//[실습. 강제 타입변환과 타입확인]
		System.out.println("[실습. 강제 타입변환과 타입확인]");
		//People 참조변수에 Worker 객체를 할당한 후
		//Worker 참조변수에 강제 타입변환을 이용하여 값을 할당하세요.
		System.out.println(p1 instanceof  Worker);
		//instanceof 로 변수 안의 객체의 타입(클래스)를 알 수 있다.
		Worker worker = (Worker) p1;
		worker.intro();
		worker.nextMonth();
		worker.nextMonth();
		
		//상속에서의 다형성
		//Car라는 부모클래스 안에 여러가지 자식클래스가 들어갈 수 있다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
