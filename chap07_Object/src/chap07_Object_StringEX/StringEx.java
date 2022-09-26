package chap07_Object_StringEX;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("[실습. String 클래스의 메소드 length(), charAt()]");
		//String 문자열 : "2022-08-05"
		//For문을 이용하여, 문자열 길이만큼 반복하여 문자를 하나씩 출력한다.
		//charAt() 이 "-"면 "."로 바꿔서 출력한다.
		String date = "2022-08-05";
		//문자열 메소드는 문자열 값을 직접 바꾸지 않는다.
		for (int i=0; i<date.length(); i++) {
			if (date.charAt(i) == '-' ) {
				//메소드는 필드값이 아니기에 대입연산자를 이용해서 
				//값을 수정할 수 없다
				//date.charAt(i) = "."; - 오류
				System.out.println(".");
				continue;
			}
			System.out.print(date.charAt(i));
		}
		
		
		System.out.println("[실습. String 클래스의 메소드 concat()]");
		//While 문을 통해 입력받은 문자열을 allWord라는 변수에 이어서 붙이는 프로그램을 만들기
		//“종료”를 입력받으면 반복문을 빠져나와 allWord에 들어간 문자열을 출력한다.
		//.concat() // 원래 문자열에 영향을 주지 않음
		Scanner input = new Scanner(System.in);
		
		String allWord = "";
		String inputWord = "";
		

		while (!(inputWord.equals ("종료"))) {			
			System.out.print("단어를 입력하시오. 멈추려면 종료 : ");
			inputWord = input.next();
			//allWord = allWord + inputWord와 동일한 결과
			allWord = allWord.concat(inputWord);
		}
		
		System.out.println("결과확인  : " + allWord);
		
		
		
		System.out.println("[실습. String 클래스의 메소드 replace()]");
		//이름을 입력 받고, 이름의 가운데 값을 *로 대치 하는 프로그램을 만들자.
		//String s =“홍길동”
		//s.replace(‘길’,’*’);
		System.out.println("이름을 입력하세요 : ");
		String s = input.next();
		//charAt() 괄호 안 값에 위치한 단어를 출력해줌
		char middle = s.charAt(1);
		System.out.println(middle);
		
		//charAt() 괄호 안 값에 위치한 단어와 같은 '모든' 단어를 *로 출력함
		System.out.println(s.replace(middle, '*'));
		System.out.println(s.replace(s.charAt(1), '*'));		
		
		
		
		System.out.println("[실습. String 클래스의 메소드 parseInt()]");
		//Scanner클래스를 이용하여 생일값 (0101)
		//Integer 클래스의 parseInt()를 사용하여 입력 받은 문자열을 정수로 바꿔 저장하자.
		//int z = Integer.parseInt("12");
		//String z1 = Integer.toString(123);
		String birthDay = "0108";
		System.out.println(birthDay);
		// 전체를 숫자로 바꿈
		int birthDayNum = Integer.parseInt(birthDay);
		System.out.println(birthDayNum);
		
		// 달과 일을 잘라서 숫자로 바꿈
		// substring을 이용하여 글자를 자름
		String month = birthDay.substring(0, 2); 
		// 자른 글자를 숫자로 바꿔줌
		int birthDayMonth = 
				Integer.parseInt(month);
		System.out.println(birthDayMonth);
		
		// 글자에서 일자의 자리만큼 잘라줌
		String day = birthDay.substring(2); 
		// 자른 글자를 숫자로 바꿔줌
		int birthDayDay = 
				Integer.parseInt(day);
		System.out.println(birthDayDay);
	

		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
