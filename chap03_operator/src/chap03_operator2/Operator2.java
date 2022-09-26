package chap03_operator2;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7월 27일
		System.out.println("<7월 27일>");
		
		//[실습5]
		System.out.println("[실습5]");
		//Scanner input = new Scanner(System.in)
	    //Input.nextInt() 를 사용하여
	    //면적이 1000에 가깝게 되도록 사각형을 만들어야 할 때,
		//가로 길이를 입력 받으면 세로 길이가 출력 될 수 있도록 하자
		//(결과는 항상 정수로 출력되게한다.)
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("가로길이를 입력하세요(1000을 넘어서는 안됨) : ");
		int w = input.nextInt();
		
		int h = 1000/w;
		double doubleH = 1000.0/w;
		
		System.out.println("세로길이 : "+h+" cm");
		System.out.println("세로길이(실수) : "+doubleH+" cm");
		
		
		System.out.println("아무 값이나 입력하세요 : ");
		String word = input.next();
		System.out.println(word+3);  //문자끼리의 +는 문자의 연결
		
		//[실습6]
		System.out.println("[실습6]");
		//Scanner input = new Scanner(System.in)
		//Input.next() 를 사용하여
		//이름(문자열), 온도(실수), 강의실 이름(문자열)
		//“반갑습니다. 000님” 이 출력될 수 있도록하자
		//현재체온 00도입니다. 000강의실 입니다. 가 출력될수 있도록하자

		System.out.println("이름 : ");
		String name = input.next();
		
		System.out.println("체온 : ");
		double temp = input.nextDouble(); 
		//실수형 double을 사용할 때는 input.nextDouble()을 사용한다.
		
		String  room = "427호";
		
		System.out.println("반갑습니다. "+name+"님");
		System.out.println("현재체온 "+temp+"도 입니다. "+room+" 강의실 입니다.");
	
		
		//[실습7]
		System.out.println("[실습7]");
		//놀이기구를 타기위해서는 6세 이상, 키 140이상 이어야 한다.
		//int age = 9; 
		//Int height = 140;
		//논리식을 사용해서 탈 수 있는지 아닌지 확인해보자
		//>= , &&
		
		int age =  9;
		int height = 140;
		
		System.out.println(age>=6  &&  height>=140);
		

	}

}
