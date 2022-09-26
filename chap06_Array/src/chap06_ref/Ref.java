package chap06_ref;

public class Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//참조형의 값 확인하기(new를 이용해서 만든 것들) 
		//String 으로 확인하기
		String name1 = new String ("그린");
		String name2 = new String ("그린");
		String name3 = "green";
		name1 = "green";
		//==연산자로 String을 비교할 때 주소값으로 비교한다.
		System.out.println(name1 == name2);
		//참조형을 비교할 때는 메소드를 사용해서 비교
		System.out.println(name1.equals(name2));
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
