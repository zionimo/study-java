package Test0802;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<1번>");
		//2~9까지의 수를 입력을 받고 입력받은 수에 대한 구구단을 출력하세요
		//2~9 이외의 숫자가 들어오면 “구구단에 등록된 수가 아닙니다”를 출력하세요.
		
		Scanner input = new Scanner(System.in);
		System.out.print("출력할 단를 입력하시오(2~9) : ");
		int choose = input.nextInt();
		int num =2;

		while (num <=9) {
			if ( choose >= 2 && choose <= 9) {
				System.out.println(choose+" x "+ num + " = " + (choose * num));
			num++;
			}
			else {
				System.out.println("구구단에 등록된 수가 아닙니다");
				break;
			}
		}                                                                                                                                    
		
		
		System.out.println("<2번>");
		
		System.out.print("메뉴를 선택해주세요 1.짜장   2.짬뽕   3.탕수육   0.종료 : ");
		int menu = input.nextInt();
		
		while (menu != 0) {
			
			switch (menu) {
			case 1 :
				System.out.println("짜장을 선택하였습니다");
				break;
			case 2 :
				System.out.println("짬뽕을 선택하였습니다");
				break;
			case 3 :
				System.out.println("탕수육을 선택하였습니다");
				break;
			case 0 :
				System.out.println("종료되었습니다");
				break;
			}
			
			System.out.print("메뉴를 선택해주세요 1.짜장   2.짬뽕   3.탕수육   0.종료 : ");
			menu = input.nextInt();
		}
		System.out.println("종료되었습니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
