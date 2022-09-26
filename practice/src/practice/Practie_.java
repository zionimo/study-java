package practice;

import java.util.Scanner;

public class Practie_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum;
		sum = 6+8;
		sum = 2+1;
		System.out.println(sum);
		
		
		//선언을 먼저하는 경우
		//for과 while 반복문을 사용할 때 선언을 해줌
		int a = 0;
		for (int i=0; i<5; i++) {
			a = i;
		}
		System.out.println(a);
		
		
		if  (a > 3) { //조건식을 만들기 위한 규칙
			System.out.println("a값은 3보다 큽니다");
		}
		
		
		//통장 확인 프로그램
		//기능을 선택하고 금액을 입력하면
		//입금, 출금, 송금하는 프로그램
		//변수 : 통장 = 이미 가지고 있는 금액 
		//입금 : 통장에 입력한 금액을 추가 (+)
		//아래 기능의 조건 (통장의 금액이 입력한 금액보다 클 때)
		//출금 : 통장에 입력한 금액을 감소함 (-) 
		//송금 : 통장에 입력한 금액을 감소함 (-)
		//+ 어디로 보낼건지 정보 입력, 마지막에 어디로 보내는지 안내함 
		
		//account, money, bank, address 초기화  =>  기능 입력 안내 출력  =>  bank 입력
		//금액입력 안내 출력  =>  money 입력  =>
		//bank == 입금    =>  Account += money   =>   현재 잔액 출력
		//bank == 출금    =>  Account >= money   =>   출금 불가 안내 출력
        //                                          							   =>   Account -= money  =>  현재 잔액 출력
		//bank == 송금    =>  프로그램 종료 안내 출력  
		//                          =>  Account >= money   =>  송금불가 안내 출력
		//                                                                       =>  주소 입력 안내 출력  => Address 초기화 => Account -=money => 현재잔액과 송금결과 출력
		
		Scanner input = new Scanner(System.in);

		int account=10000, money=0;
		String bank, service, address;
		
		//기능 입력 안내
		System.out.print("입금, 출금, 송금 서비스 입니다. 원하는 기능을 입력하세요 : ");
		service = input.next();
	
		System.out.print("거래 은행을 입력하세요 : ");
		bank = input.next();
		
		System.out.print("거래 금액을 입력하세요 : ");
		money = input.nextInt();
			
		if (service.equals("입금"))  {
			account += money;
			System.out.println("입금되었습니다. 현재 잔액은 " + account + "원 입니다.");
		} 
		
		else if (service.equals("출금")){
			if (account >= money) {
				account -= money;
				System.out.println("출금되었습니다. 현재잔액은 " + account + "원 입니다.");
			} else {
				System.out.println("잔액이 부족하여 출금이 불가합니다.");
			}
		} 
		
		else if (service.equals("송금")) {
			if (account >= money) {
				System.out.print("계좌번호를 입력하세요 : ");
				address = input.next();
				account -= money;
				System.out.println("송금되었습니다. 현재잔액은 " + account + "원 입니다");
			} 
			else {
				System.out.println("잔액이 부족하여 출금이 불가합니다.");
			}
		} 
		
		else {
			System.out.println("서비스가 종료되었습니다.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
