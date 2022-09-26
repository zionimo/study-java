package chap05_while_forex;

import java.util.Scanner;

public class WhileForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("7월 28일");
		//[실습 - while을 이용한 반복문 3]
		System.out.println("[실습 - while을 이용한 반복문 3]");
		//입력받은 모든 수를 더하는 프로그램
		//0을 입력 받을 때까지 모든 숫자를 더하고 0을 입력 받으면 반복을 나간다
		//반복이 끝난 후, 더한 총합을 출력한다.
		//Scanner input = Scanner(System.in); //1번 선언과 초기화
		//Num = input.nextInt();
		//Num = input.nextInt();
		Scanner input = new Scanner(System.in);
		 
		System.out.println("더할 수를 입력하세요.(0을 입력하면 중단됨) : ");
		int num = input.nextInt();
		
		int sum = 0;
		while (num != 0) {
			sum += num;
			System.out.println("더할 수를 입력하세요.(0을 입력하면 중단됨) : ");
			num = input.nextInt();
		}
		
		System.out.println("입력한 값의 총합은 : "+sum+"입니다.");		
		
		
		
		//[실습 - while을 이용한 반복문 4]
		System.out.println("[실습 - while을 이용한 반복문 4]");
		//구구단 4단을 출력하시오
		//System.out.println(dan+"X"+num1+"="+());
		int dan = 4;
		int num1 = 1;

		while (num1 < 10 ) {  //9까지 출력함
			System.out.println(dan+"X"+num1+"="+(dan * num1));
			
			num1++;  //num1의 값을 1씩 증가시킴
		}
	
		

		
		//[실습 - for 3]
		System.out.println("[실습 - for 3]");
		//숫자를 입력받은 후          
		//두 수를 입력받아 덧셈을 한다
		//더해진 값은 바로 아래 출력한다
		//이때 처음 입력받은 숫자만큼 반복한다
		System.out.println("더하기를 몇 번 반복할지 작성하세요 : ");
		int count = input.nextInt();
	
		int a,b;
		for (int num3 = 1; num3 <= count; num3++) {
			System.out.println("두 수를 띄워서 작성하세요 : ");
			a = input.nextInt();
			b = input.nextInt();
		
			System.out.println("결과 : " + (a+b));
		}
		
		
		
	
		//[실습 - for 4]
		System.out.println("[실습 - for 4]");
		//1부터 20까지의 정수 중 (2 또는 3의 배수)가 아닌 수의 총합을 출력하라 : 73
		//!(값을 부정하여 사용), %(나머지 연산자를 통해 배수 확인)
		int sum9 = 0;
		for (int num9 = 1; num9 <= 20; num9++) {
			if (num9 % 2 != 0 && num9 % 3 !=0) {
		 //! (num9 % 2 == 0 || num9 %3 ==0) 과 같음
				sum9 += num9;
				System.out.println("2,3의 배수가 아닌 수 : "+(num9));
			}
		}
		System.out.println("총합 :"+sum9);
		
		
		//for문의 초기화 값은 for문안에서만 가능하다
		for (int i = 0; i<5; i++) {
			System.out.println("반복문입니다" + i);
		}
		//System.out.println(i); //for문 밖에서는 쓸 수 없다.
		//다른 for문에서 사용한 이름은 다른 for문에서 사용할 수 있다.
		for (int i  = 0;  i<5; i++) {
			System.out.println("새로운i를 이용한 반복문입니다" + i);
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
