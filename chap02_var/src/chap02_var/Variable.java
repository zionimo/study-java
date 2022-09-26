package chap02_var;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed; // 변수 선언
		long interertRate =  1; // 변수 초기화
		int 반복횟수, loop2 ; // 변수 동시 선언
		
		//선언을 한 경우 변수 이름에다가 값을 넣음
		//동시 선언 한 경우 활용 가능
		speed =  10; 
		반복횟수 = 2;
		loop2 =  20;
		
		// 변수는 값을 할당할 때 마지막에 할당된 값이 들어간다.
		// 위에서는 10이었지만 0의 값을 넣어주었기 때문에 
		// 값이 0이 된다
		speed = 0; 
		
		// 변수를 출력하기 위해서는 이름만 작성한다
		System.out.println(speed);
		System.out.println(반복횟수);
		
		//실습 정수형 변수 선언/ 초기화 하기		
		//나이 26, 일자 10, 금액 5000, 개수 5, 점수 100
		int age = 26;
		int date = 10;
		int  amount = 5000;
		int count = 5;
		int score = 100;

		System.out.println(age);
		System.out.println(date);
		System.out.println(amount);
		System.out.println(count);
		System.out.println(score);
		
		//실습 long 변수 선언
		//시간 = 거리/속도
		//거리 = 9460800000000km 속도 = 300000(km/s)일 때 몇 일 걸리는지 구하시오
		//System.out. println(거리/속도)
		//long에 값을 넣어줄 때 int의 범위를 지난 값은 L을 붙여준다.
		long distance =  9460800000000L;
		 // 변수는 동일한 이름을 선언할 수 없다(위에서 speed 이미 사용함)
		long speedLight = 300000L;
		
		//print메소드 안에 수식을 입력하면 계산하여 출력한다.
		System.out.println("소요시간은 " + (distance/speedLight)/3600 + "일 입니다");

		//실습 실수형 변수 선언
		//반지름이 10인 구의 부피를 double 자료형을 가진 변수에 할당하라
		//V=4/3 * 3.14 * 반지름의 3제곱
		//예시) Int num = 10+10;
		//변수의 값에 계산식도 들어갈 수 있다
		int half = 10;
		double volume = 4/3 * 3.14 * half * half * half;
		System.out.println("구의 부피는 "+ volume + "입니다"); // 소수점이 포함되어 나옴
		
		//3.14값을 double형에 할당
		double pi = 3.14;
		System.out.println(pi);
			
		//기호상수(final) - 값을 수정하여 할당할 수 없다
		//초기화 값을 바꾸어서 원하는 값을 넣을 수 있다
		//final 상수를 사용하면 클래스는 대문자로 적는다 pi -> PI
		final double PI = 3.141592;
		System.out.println(PI);
		
		//실습 기호상수 -final
		//정육면체의 한 변의 길이(=모서리)를 기호 상수로 두고, 부피를 계산해서 출력하자
		//final 상수를 사용하면 클래스는 대문자로 적는다 line -> LINE
		//모서리의 길이 값 4,6,10 순서대로 해보기
		final int LINE = 4;
		//변수는 변수끼리 계산한 값도 할당할 수 있다
		int V = LINE*LINE*LINE;
		System.out.println(V);		
	
		//논리형
		//boolean 논리형은 참, 거짓 두가지 값만 가지는 자료형
		boolean isRain = false; //0과 같은 정수값은 넣을 수 없다
		System.out.println(isRain); //false로 출력되지만 boolean 값이다
				
		//실습 논리형
		//int num = 10;
		//boolean check;를 만들어서 num>20 값을 check에 넣고 check를 출력하여 확인하자
		//check = (num>20);
		//아래에 num 값을 30으로 바꾸고 num>20값을 check에 넣고, check를 출력하여 확인하자
		int num = 10;
		boolean check;
		check = (num > 20); //10 > 20 : 거짓
		System.out.println(check);
		
		//num 값을 30으로 바꾸기
		num = 30;
		check =  (num>20); //30>20 : 참
		System.out.println(check);
		
		
		//문자형과 문자열
		//문자형은 유니코드로 된 한 글자를 표시할 수 있다
		char ch1 = '가';
		char ch2 = '\uac00'; // 역슬래시(\) : enter키 위에 위치
		System.out.println(ch2);
		
		// 7월 26일 화요일
		
		//문자열은 String 클래스를 이용해서 값을 할당할 수 있다
		//"" 쌍따옴표 사용 : 쌍따옴표 안에 있는 모든 글은 문자열 취급
		String s = "Hello world!";
		System.out.println(s);
	
		//int를 이용하여 number에 숫자값10을 할당하라
		int number = 10;
		System.out.println(number);
		
		//boolean을 이용하여 isSunny에 true 값을 할당하라
		boolean isSunny = true;
		System.out.println(isSunny);
		
		//char를 이용하여 char_a에 a값을 할당하라
		char char_a = 'a';  //char는 작은 따옴표 사용
		System.out.println(char_a);
		
		//String을 이용하여 sayHi에 hi를 할당하라
		String sayHi = "hi";  //String은 쌍 따옴표 사용
		System.out.println(sayHi);
		
		//문자열의 특수문자
		//쌍따옴표 출력하기: \"   작은 따옴표 출력하기: \'   줄바꿈: \n
 		String word = "   \"   \'   \n줄바꿈 됨   "; 
		System.out.println(word);
		
		//실습 문자열에 특수문자 출력하기
		//"Hello (줄바꾸기) world" 출력하기
		String word2 = "\"Hello \nworld\"";
		System.out.println(word2);
		
		//형변환
		//축소변환: double => int 데이터가 사라질 수 있다 (소수점 이하 사라짐)
		int i = (int)10.5;
		System.out.println(i);
		
		//확대변환: int => double
		double d = (double)10;
		System.out.println(d);
		
		//실습 확대변환
		//328/5의 결과가 소수점아래 자리까지 될 수 있도록 하라
		
		//65 => int/int => int형으로 출력
		System.out.println( 328/5);
		
		//65.6 => double/int => double 형으로 출력 (더 큰쪽으로 맞춤)
		System.out.println((double)328/5);
		
		//65.6 => double/double => double 형으로 출력
		System.out.println( (double)328/(double)5);
		
		//강제로 int로 형변환을 했기 때문에 결과가 6
		System.out.println((int)32.8/5);
		
		//하나라도 실수형이면 실수형으로 출력된다
		System.out.println(328.0/5);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}