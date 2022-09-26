package chap05_while_for;

import java.util.Scanner;

public class WhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//반복문 while
		//while문 작성 시 주의할 점
		//1. 조건문이 true일 때만 안의 내용 실행
		//2. 항상 true이면 무한반복에 빠져 프로그램 안끝남
		int num = 0;
		while (num < 5) {
			System.out.println( "반복되고 있음" + num);
			num++;
		}
			
		
		//[실습 - while을 이용한 반복문 1]
		System.out.println("[실습 - while을 이용한 반복문 1]");
		//10~1까지 카운트 다운을 출력하시오
		//1~10까지 먼저 출력
		int num1 = 1;
		while (num1 <=10) {
			System.out.println(num1);
			num1++;
		}
		// 실습 - while 카운트다운
		System.out.println("[실습 - while을 이용한 반복문 1-1]");
		int countDown = 10;
		while (countDown > 0) {
			System.out.println(countDown);
			countDown--;
		}
		
		
		
		//[실습 - while을 이용한 반복문 2]
		System.out.println("[실습 - while을 이용한 반복문 2]");
		//1~100까지 전체합(sum)과 짝수의 합과(even) 홀수의 합(odd)을 구해서 출력하시오
		//합을 구하는 방법 : sum+=1 복합 대입 연산자 사용
		//while문 안에 if문을 사용해서 짝수와 홀수의 합을 구할 수 있다
		int sum, even, odd;
		int num2 =1;
		sum = 0;
		even = 0;
		odd = 0;
		
		while (num2 <= 100) {
			//전체합
			sum += num2;
			
			//짝수의 합
			if (num2%2 == 0) {
				even += num2;
			}
			else {  	//홀수의 합
				odd += num2;
			}
			num2++;
			
			}
			//반복이 끝난 후 결과값 확인을 하려면 while문 바깥에 작성
	
			System.out.println(sum);  //sum의 최종값
			System.out.println(even); //even의 최종값
			System.out.println(odd);  //odd의 최종값
	
		
		
	
		//[실습 - do while : 반복한 내용이 무조건 한번은 실행되는 조건문]
		System.out.println("[실습 - do while을 이용한 반복문]");
		//입력받은 모든 수를 더하는 프로그램
		//0을 입력 받을 때까지 모든 숫자를 더하고 0을 입력 받으면 반복을 나간다
		//반복이 끝난 후, 더한 총합을 출력한다.
		//Scanner input = Scanner(System.in); //1번 선언과 초기화
		//Num = input.nextInt();
		Scanner input = new Scanner(System.in);

		int num4 = 0;
		int sum4 = 0;
		
		do {  //  while 의 뒤에 있던 반복할 내용이 do를 이용해서 앞으로 가져옴
			System.out.print("더할 값을 입력해주세요(0을 입력하면 중단됨) : ");
			num4 = input.nextInt();
			sum4 += num4;
		} while (num4 != 0); // 조건이 참이라면 do로 올라가 다시 반복
		System.out.println("더한 값 : " + sum4);
		
		
		//[실습 - do while 1]
		System.out.println("[실습 - do while 1]");
		//1~10까지 수를 출력하시오
		int num5 = 1;
		do {
			System.out.println(num5);
			num5++;
		} while (num5 <=10);
		 
	
		
		
		//[실습 - do while 2]
		System.out.println("[실습 - do while 2]");
		//업다운 게임
		//숫자를 지정하고 그 숫자가 맞을 때까지 반복해서 알려주는 프로그램
		int answer = 59;
		int guess;
		int tries = 0;
				
		do {
			System.out.print("정답을 추측하여 보세요 : ");
			guess = input.nextInt();
			tries++;
			
			if (guess < 59) {
			System.out.print("정답값보다 작습니다. ");
			}
			else if (guess > 59) {
			System.out.print("정답값보다 큽니다. ");
			}
		} while (guess != answer);
		
		System.out.println("축하합니다. 시도횟수 = "+ tries);
		

		//for문
		//[for (초기화 ; 조건식 ; 증감계산)]
		System.out.println("[for (초기화 ; 조건식 ; 증감계산)]");
		for (int num6 = 1; num6<=10 ; num6++) {
			System.out.println(num6);
		}
		
		//[실습 - for 1]
		System.out.println("[실습 - for 1]");
		//1~10까지의 합 구하기
		//1부터 10까지 정수를 더하여 합을 구하시오
		int sum7 = 0;
		
		for (int num7 = 1; num7 < 11; num7++) {
			sum7 += num7;
			System.out.println("1~"+num7+"까지 정수의 합 : "+ sum7);
		}

	
		
		//[실습 - for 2]
		System.out.println("[실습 - for 2]");
		//팩토리얼(!) : 1부터 어떤 양의 정수 n까지의 정수를 모두 곱한 것
		//20!의 값을 구하시오
		long mult = 1L;  //int로 하면 바이트 부족으로 출력오류 발생 => long을 사용할 것
		
		for (int fac=1 ; fac <21 ; fac++) {
			mult *= fac;
			System.out.println("1~"+fac+"까지 정수의 곱 : "+ mult);
		}

		
	
		
		//[for 중첩반복문]
		System.out.println("[실습 - for 중첩반복문]");
		for (int i = 0; i < 2; i++) {
			System.out.println("for문 i에서 반복중입니다");
			for(int j = 0; j < 2; j++) {
				System.out.println("i : "+i+", j : "+j);
			}
			System.out.println("내부 for문이 종료되었습니다");
		}

		
		
		//[실습 - for 중첩반복문 1]
		System.out.println("[실습 - for 중첩반복문 1]");
		//for중첩문을 활용하여 구구단 2단부터 9단까지 출력하기
		//바깥쪽 for문 증가 혹은 감소
		//안쪽 for문 초기화값부터 ~n까지 반복
		for (int i = 2; i <= 9; i++) {
			System.out.println("<"+ i +"단>");
			for (int j=1; j <= 9; j++) {
				System.out.println(i + " X "+ j + " = " + i * j);
			}
		}
		
		
		
		//[실습 - for 중첩반복문 2]
		System.out.println("[실습 - for 중첩반복문 2]");
		//print를 이용하여 *으로 5x5 박스를 출력하라
		//줄을 바꾸고 싶을 때는 println()만 작성하면 됨 (괄호안에 값이 없어도 됨)
		for (int i=0; i<5; i++) {
			//가로로 별 다섯개를 출력함
			for (int j=0; j<5; j++) {
				System.out.print(" * ");
			}
			//별 5개 출력 후 줄 바꿈 
			System.out.println("");
		}
		

		
		
		//중첩반복문 확인 + 조건문 확인
		for (int i=0;  i<=4;  i++) {
			for (int j=4;  j>=0;  j--) {
				if (i >= j) {
					System.out.print(i+","+j+"  ");
				} else {
					System.out.println("     ");
				}
			}	
			System.out.println();
		}
		
		
		
		System.out.println("<8/2>");
		System.out.println("[실습 - 중첩반복문과 조건]");
		//printf / print를 사용하여 *으로 아래 모양을 출력하라
		for (int i=0; i<=4; i++) {
			for (int j=0; j<=4; j++) {
				if (i >= j) {
					System.out.print(" *  ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
