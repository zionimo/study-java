package break_continue;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("[[break 학습]]");
		//반복문안에서 사용할 수 있는 키워드
		//break;
		
		System.out.println("[switch문에서의 break;]");
		//switch문에서의 break;
		int num =0;
		switch (num) {
			case 0:
				System.out.println("입렵된 값은 0입니다");
				break;  //break를 사용해서  switch문을 나간다.
			default : 
				System.out.println("다른 숫자값입니다");
				break;
		}
		
		//반복문에서의 break;
		System.out.println("[반복문에서의 break;]");
		for (int i =0; i<10; i++) {
			System.out.println(i);
			if (i == 4 ) {  //i가 4를 만났을 때 for문을 탈출함
				break;
			}
		}
		
		//while문에서의 break;
		System.out.println("[while문에서의 break;]");
		int a =1;
		while(true) {
			a++;
			System.out.println(a);
			if (a > 10) {
				break;
			}
		}
		

		System.out.println("[실습. for - break]");
		//1~100까지를 출력하는 반복문을 만든다
		//단, 값이 77이면 77은 출력하고 반복을 중단한다
		for ( int i =1; i<=100; i++) {
			System.out.print(i + "   ");  //break 문을 탈출한 후 print를 쓰면 76까지 출력된다.
			if (i ==77) {   //77까지 출력하기 위해 print 뒤에 작성
				break;
			}
			// 10의 배수일 때 줄바꿈 추가
			if (i % 10 ==0)
				System.out.println();
		}
		
		System.out.println();
		
		System.out.println("[실습. while - break]");
		//while의 조건문을 true로 넣은 후,(무한루프) 입력받은 숫자를 출력한다
		//단, 0을 입력 받으면 반복을 그만둔다
		Scanner input = new Scanner(System.in);
		int num1;
		
		while (true) {
			System.out.println("숫자를 입력하세요 (0 : 종료) : ");
			num1 = input.nextInt();
			if (num1 ==0) {
				break;
			}
		}
		
		
		System.out.println("[[Continue 학습]]");
		
		//continue 확인
		//현재의 반복문을 건너뜀
		for (int i=0;  i<10;  i++) {
			if (i == 4) {
				continue;
				//건너뛰고 싶은 코드 위쪽에 작성
			}
			System.out.println(i);
		}
		
		
		System.out.println("[실습. for - continue]");
		//1~30까지 출력할 때 3의 배수는 건너띄고 출력하시오
		for (int i=1; i<=30; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
