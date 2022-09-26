package chap04_if;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//조건문
		//if문 - 한줄이 일 때 (중괄호 사용하지 않을 때)
		//()안의 조건이 참(true)일 때 실행이 된다
		if (true)
			System.out.println("코드가 실행됩니다");
		
		//if문 바깥에 있는 코드는 if문의 영향을 받지 않는다
		System.out.println("프로그램이 종료되었습니다");
		
		//조건문을 넣어서 확인 - 여러줄 (중괄호 사용)
		int age = 9;
		if (age >= 6) {
			System.out.println(age+" 세 입니다.");
			System.out.println("놀이기구를 탈 수 있습니다.");
		}
		
		//[실습- if문만 사용하는 경우(조건식) 1]
		System.out.println("[실습- if문만 사용하는 경우(조건식) 1]");
		//변수 num에 원하는 값을 할당하고, 
		//num이 10보다 클 때, 변수를 출력하는 조건문을 만들자
		//if문이 끝나면 프로그램이 종료되었습니다를 출력하자
		//if(조건문){문장}
		int num =15;
		if (num > 10) {
			System.out.println("참입니다. " + num);
		}
		System.out.println("프로그램이 종료되었습니다");

		
		//if -  else 거짓일 때 코드 실행
		if ( false)
			System.out.println("참입니다");
		else
			System.out.println("거짓입니다");
		
		
		//if-else문 조건식과 여러줄 출력
		System.out.println("[if-else문 조건식과 여러줄 출력]");
		int age1 = 9;
		if ( age1 > 6 ) {
			System.out.println("축하합니다");
			System.out.println("놀이기구를 탈 수 있습니다");
		} else {
			System.out.println("놀이기구를 탈 수 없습니다");
			System.out.println("나중에 또 오세요");
		}
		
		
		
		//[실습 - if-else문 조건식과 여러줄 출력]
	    System.out.println("[실습 - if-else문 조건식과 여러줄 출력]");
	    //정수형 num 변수를 선언하고, 원하는 수로 초기화 
	    //num이 0이 아니면, 10을 num 으로 나눈 값을 출력하고 
	    //num이 0이면 "입력한 값이 0입니다" 를 출력합니다.
	    int num1 = 5;
	    if ( num1 != 0 ) 
	    	System.out.println("나눈 값 : "+10/num1 );
	    else 
	    	System.out.println("입력한 값이 0입니다.");
	

	    //[실습 - If-else 조건문1]
	    System.out.println("[실습. If-else 조건문 1]");
	   //String자료형 변수를 선언하고 변수 값을 원하는 문자열로 초기화
	   //변수의 문자열이 “종료”라면, 시스템을 종료합니다 라고 출력하
	   //아니면, 시스템을 유지합니다 라고 출력합니다.
	   String str = "종료안함";
	   if (str == "종료")
		   System.out.println("시스템을 종료합니다");
	   else 
		   System.out.println("시스템을 유지합니다");
		
	   
	    System.out.println("[실습 - 삼항연산자 1 ]");
	    //삼항 연산자 ( ? : 으로 이루어짐)
	    //한줄에 참 거짓을 확인하고 싶을 때
	    //삼항연산자의 결과값은 조건에 따른 참/거짓값 이다
	    int x = 10;
	    int y = 11;
	    //삼항연산자, 연산자의 특징 : 계산을 하고 그 결과값을 출력/되돌려줌
	    int maxNum = x>y ? x:y;
	    System.out.println( maxNum );
	    
	 
	    System.out.println("[실습 - 삼항연산자 2 ]");
	    //변수를 임의의 수로 초기화 하고 
	    //: num3 값이 양수이면 “양수”를, 음수이면 “음수”를 출력한다
	    //String state = (___) ? ___ : ___
	    int num3 = -5;
	    String state = num3 > 0 ? "양수" : "음수";
		System.out.println(state);
		
		
		
		 System.out.println("[실습 - 삼항연산자 3 ]");
		//x와 y의 크기가 값으면 “크기가 같다”
		//다르면 “값이 다릅니다”를 출력할 수 있도록 하자
		int x1 = 8;
		int y1 = 6;
		String eq = x1==y1 ? "크기가 같다" : "값이 다르다";
		System.out.println(eq);
		
		
	    
		
		//<7월 28일>
		System.out.println("<7월 28일>");
		//[실습 - if-else]
		System.out.println("[실습 - if-else]");
		
		//코드값을 이용한 성별 확인
		//코드값에 따라 성별을 출력하시오
		//홀수(1,3):남자  /  짝수(2,4):여자
		int code = 4;
		if (code == 1 || code == 3 ) {
			System.out.println("남자입니다");
		}
		else { 
			//중첩 if문 (조건문)
			//if문 또는 else문 안에서 작성 가능하다.
			if (code == 2 || code == 4 )
			System.out.println("여자입니다");
		};
		


		//[실습 - 연속적 if, else if, else 1]
		System.out.println("[실습 - 연속적 if, else if, else 1]");
		//연속적인 if - else if - else 
		//코드값을 이용한 성별 확인
	    //코드값에 따라 성별을 출력하시오
	    //홀수(1,3):남자  /  짝수(2,4):여자
		//[실습 - if-else]에서 중첩 if 로 작성한 코드를 연속적인 if로 작성하기		
		if (code == 1 || code ==3) {
			System.out.println("남자입니다");
		} 
		else if (code == 2 || code == 4) {
			System.out.println("여자입니다");
		}  
		else {  //여기서 else문은 바로 위에 있는 조건이 거짓일 때 실행된다
			System.out.println("없는 코드입니다");
		}
	
		
		
		//[실습 - 연속적 if, else if, else 2]
		System.out.println("[실습 - 연속적 if, else if, else 2]");
		//음수 양수, 0 판별하기
		//임의의 정수 값을 만들어서(num2) 양수, 음수, 0을 값을 확인하고 
		//양수입니다, 음수입니다. 0입니다를 출력한다.
		int num2 = 6;
		
		if (num2 > 0) {
			System.out.println("양수입니다");
		} else if (num2 < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
	
		
		
		//Switch문
		int number = 1;
		//()안에 비교할 값을 넣는다
		//비교할 값은 동일한 자료형으로 넣어주어야 한다
		switch (number) {
		case 0 : //case 뒤에 원하는 값일 경우 출력할 값을 넣는다.
			System.out.println("없음");
			break;
		case 1 : 
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		default : 
			System.out.println("많음");
			break;
		}
		
		
		
		//[실습 - switch]
		System.out.println("[실습 - switch]");
		int week = 4;
		
		switch (week) {
		case 0 :
			System.out.println("월");
			break;
		case 1 :
			System.out.println("화");
			break;
		case 2 :
			System.out.println("수");
			break;
		case 3 :
			System.out.println("목");
			break;
		case 4 :
			System.out.println("금");
			break;
		case 5 :
			System.out.println("토");
			break;
		case 6 :
			System.out.println("일");
			break;	
		default :
			System.out.println("없는 요일입니다");
			break;
		}
		
		
		//[실습 - switch 2]
		System.out.println("[실습 - switch 2]");
		//임의의 정수값으로 초기화 한 후
		//90점 이상이면 A             >10,9
		//80점 이상이면 B             >8
		//70이상이면 C를 출력       >7
		//그 미만의 점수는 F를 출력한다
		int score = 85;
		int scoreCase = score/10;
		
		switch (scoreCase) {
		case  10 : case  9 :
			System.out.println("A학점입니다");
			break;
		case  8:
			System.out.println("B학점입니다");
			break;
		case  7:
			System.out.println("C학점입니다");
			break;
		default:
			System.out.println("F학점입니다");
			break;
		}
		
		
		
		
		//[실습 - switch 3]
		System.out.println("[실습 - switch 3]");
		//카페메뉴 (커피, 아이스티, 녹차)
		//카페메뉴를 입력받아 메뉴이릅과 가격을 출력하시오
		//커피 2000원, 아이스티 2500원, 녹차 1500원, 없는 메뉴 "~의 제품은 없습니다"를 출력하라
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴를 입력하세요 : ");
		int menu = input.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
