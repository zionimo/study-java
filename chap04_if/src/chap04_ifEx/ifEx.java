package chap04_ifEx;

import java.util.Scanner;

public class ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//[실습 - if문만 사용하는 경우(조건식) 2] 
		System.out.println("[실습- if문만 사용하는 경우(조건식) 2]");
		//변수 num 의 값을 만들고, 
		//Scanner input = new Scanner(System.in); Input.nextInt를 사용하여 값을 받은 후
		//받은 값이 10보다 크고 20보다 작다면 (&& 논리연산자 필요) 변수num을 출력하자
		//마지막에 프로그램이 종료되었습니다. 를 출력한다.

		Scanner input = new Scanner(System.in);
		
		System.out.println("값이 10 초과 20 미만이면 출력됩니다 : ");
		int num = input.nextInt();
		
		if ( num >10  &&  num<20 ) {
			System.out.println("범위 내의 수입니다. "+num);
		}
		System.out.println("프로그램이 종료되었습니다.");
		 
		
		
		
		//[실습 - if문만 사용하는 경우(조건식) 3] 
		System.out.println("[실습- if문만 사용하는 경우(조건식) 3]");
		//name이 본인 이름이 맞을 때(같을 때)(==) 본인이 맞습니다를 출력한다.
		//마지막에 프로그램이 종료되었습니다를 출력한다.
		
		System.out.println("이름을 입력해주세요 : ");
		String name = input.next();
		
		if (name.equals("그린"))  
		//값을 받아와서 비교할 때는 .equals(비교할 문자열) 사용
		//결과값이 true, false를 가짐
        //if ( name == "그린") 으로 적을 시 "본인이 맞습니다" 출력 안됨
			
			System.out.println("본인이 맞습니다");
		System.out.println("프로그램이 종료되었습니다.");
		
		
		
		
		//[실습 - if문만 사용하는 경우(논리형 변수) 1]
		System.out.println("[실습- if문만 사용하는 경우(논리형 변수) 1]");
		//Boolean 변수 rainIs를 선언하고, rainIs을 참으로 초기화하자
		//rainIs가 참이면 우산을 챙기세요 를 출력하는 조건문을 만들자
		//If문이 끝나면 확인이 완료되었습니다를 출력하자
		//false로 바꾸었을때 어떤지 확인하자
		Boolean rainIs = true;
		if (rainIs == true) 
			System.out.println("우산을 챙기세요.");
		System.out.println("확인이 완료되었습니다.");
		
		
		
		
		
		//[실습 - if문만 사용하는 경우(논리형 변수) 2]
	    System.out.println("[실습- if문만 사용하는 경우(논리형 변수) 2]");
	    //Boolean 변수 hatHave를 선언을 하고, hatHave 를 참으로 초기화
	    //hatHave가 참일 때, 모자를 가지고 있습니다 를 출력하는 조건문을 만들자
	    //If문이 끝나면 확인이 완료되었습니다를 출력하자
	    //false로 바꾸었을때 어떤지 확인하자
	    Boolean hatHave = true;
	    if (hatHave = true)  
	    	System.out.println("모자를 가지고 있습니다.");
		System.out.println("확인이 완료되었습니다.");
		
		
		
		
		
		//[실습 - If문을 연달아 사용하는 경우 1]
	    System.out.println("[실습- If문을 연달아 사용하는 경우 1]");
	    //Boolean eat를 선언하고 eat을  참으로 초기화한다
	    //eat이 참이면 밥을 먹었다 라고 출력합니다
	    //int time을 선언하고 time의 값을 원하는 정수로 초기화 한다
	    //time의 값이 10보다 작으면 택시를 탄다고 출력한다
	    //마지막에 프로그램이 종료되었습니다를 출력한다.
	    Boolean eat = true;
	    if (eat)
	    	System.out.println("밥을 먹었다");
	    
	    int time = 4;
	    if (time < 10)
	    	System.out.println("택시를 탄다");
	    
	    System.out.println("프로그램이 종료되었습니다");
		
	    
	    
	    
	    
	   //[실습 - If문을 연달아 사용하는 경우 2]
	   System.out.println("[실습- If문을 연달아 사용하는 경우 2]");
	   //String 변수를 2개를 만들어 안에 Puppy, 라는 값을 동일하게 초기화 하고
	   //두 변수를 비교한후 같다면, 같은 종류입니다 가 출력된다.
	   //int 변수 num을 선언하고 Scanner input = new Scanner(System.in)
	   //input.nextInt를 이용하여, 
	   //값을 넣고 값이 -100보다 작거나, 100보다 크면 그 값을 출력한다(||논리 연산자 사용)
	   //마지막에 프로그램이 종료되었습니다를 출력한다.
		String one = "Puppy";
		String two = "Puppy";
		
		if ( one == two ) 
			System.out.println("같은 종류입니다.");
		
		System.out.println("값이 -100 미만이거나, 100 초과이면 값을 출력합니다 : ");
		int num1 = input.nextInt();
		
		if ( num1 < -100  ||  num1 > 100 )
			System.out.println("범위 내의 값입니다. "+ num1);
		
		System.out.println("프로그램이 종료되었습니다");
	    
	    
	    
		//[실습 - 2]
	    System.out.println("[실습. If-else 조건문 2]");
	   //Scanner input = new Scanner(System.in);
	   //(변수) = input.nextInt();
	   //점수를 입력 받고 점수가 60보다 크면 합격, 아니면 불합격을 출력한다.
	   //If-else 문이 끝나면 수고하셨습니다를 출력한다.
	    
		System.out.println("점수를 입력하세요 : ");
		int score = input.nextInt();
		
		if (score > 60)
			System.out.println("합격");
		else 
			System.out.println("불합격");
		System.out.println("수고하셨습니다");
		
	    
		   
		//[실습 - If-else 조건문 3]
	    System.out.println("[실습. If-else 조건문 3]");
	    //Scanner input = new Scanner(System.in);
	    //키와 나이를 입력받고, 논리 연산자 &&를 사용하여 
	    //키 140보다 크고, 나이가 10보다 크면
	    //놀이기구를 탈 수 있습니다 를 출력하고.
	    //아니면 놀이기구를 탈수 없습니다 를 출력합니다.
	    
	    System.out.println("키를 입력하세요 : ");
	    int height2 = input.nextInt();
	    
	    System.out.println("나이를 입력하세요 : ");
		int age2 =  input.nextInt();
		
		if ( height2>140  &&  age2>10 )
			System.out.println("놀이기구를 탈 수 있습니다");
		else 
			System.out.println("놀이기구를 탈 수 업습니다");
		
		
		

		//[실습 - 중첩 if 1]
		System.out.println("[실습 - 중첩 if 1]");
		//홀수 짝수, 음수 양수 판단
		//정수 하나를 입력받고 (0제외)
		//먼저 홀수인지 짝수인지 출력하고 음수인지 양수인지 출력하라
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("아무 정수를 입력하세요(0은 제외) : ");
		int number = input1.nextInt();

		//홀수, 짝수 판별은 
		// 값을 2로 나누었을 때 나머지가 1이나 -1이면 홀수
		//아니라면 짝수로 간주했다 
		if ( number%2 == 1  || number%2 == -1 ) {
			System.out.print("이 값은 홀수이며 ");
			if ( number > 0 ) {
				System.out.println("양수입니다");
			}
			else {
					System.out.println("음수입니다.");
			}
		}
		else {
			System.out.print("이 값은 짝수이며 ");
			if ( number > 0 ) {
				System.out.println("양수입니다");
			}	else {
 					System.out.println("음수입니다.");
 				}
		}	
		
		
		
		
		
		//[실습 - 중첩 if 2]
		System.out.println("[실습 - 중첩 if 2]");
		//최대값 구하기 - max
		//정수 3개를 입력 받고
		//그 정수 3개의 "최소값", "최대값"을 구하여 출력하시오
		//"숫자 세개를 띄어쓰기로 구분해서 입력하세요"
		//int a = input.nextInt();
		//int b = input.nextInt();
		//int c = input.nextInt();
		
		int a, b, c, max;
		
		System.out.println("숫자 세개를 띄어쓰기로 구분해서 입력하세요");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a > b) {
			max = a;  //max에 a 할당
			if (a > c) {  //조건문을 ( max > c )
				System.out.println("최대값 : " +a);  //max
			} 
			else {
				//c가 max값 보다 크므로 max값에 할당
				System.out.println("최대값 : " +c);  //max
			}
		}
		else {
			if (b > c) {
				System.out.println("최대값 : " +b);
			}
			else {
				System.out.println("최대값 : " +c);
			}
		}
		
		
		//최소값 구하기 연습해보기
		
		
		
		
		

		
		
		//[실습 - 연속적 if, else if, else 3]
		System.out.println("[실습 - 연속적 if, else if, else 3]");
		//학점계산
		//점수를 입력받아 
		//90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C를 출력하고
		//그 미만의 점수는 F를 출력한다
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score1 = input2.nextInt();
		 
		if ( score1 >= 90 ) {
			System.out.println("A 학점입니다");
		} else if ( score1 >=80 ) { 
			System.out.println("B 학점입니다");
		} else if ( score1 >=70 ) {
			System.out.println("C 학점입니다");
		} else {
			System.out.println("F 학점입니다");
		}
		
		
		

		
		
		//[실습 - 연속적 if, else if, else 4]
		System.out.println("[실습 - 연속적 if, else if, else 4]");
		//미세먼지 판별기
		//미세먼지 값을 임의로 정한 뒤
		//0~30이면 좋음, 31~80이면 보통, 81~150이면 나쁨, 151이상이면 매우나쁨을 출력하시오
		int dust = 5;
		
		if (dust >=0  && dust <= 30) {
			System.out.println("미세먼지 좋음");
		} else if (dust <=  80) {
			System.out.println("미세먼지 보통");
		} else if (dust <= 150) {
			System.out.println("미세먼지 나쁨");
		} else {
			System.out.println("미세먼지 매우 나쁨");
		}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
