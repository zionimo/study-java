package chap03_operatorEx;

import java.util.Scanner;

public class operatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//실습2  대입, 산술, 복합 대입
		//아메리카노:2000원,  카페라떼:3000원,  카푸치노:3500원. 각 3개씩 구입

		int americano = 2000;  
		int cafeLatte = 3000;  
		int cappuccino = 3500; 
		
		int sum = 0;
		sum = americano*3 + cafeLatte*3 + cappuccino*3;
		
		System.out.println(sum); //25500
		
	
		//실습3 대입, 산술, 복합 대입
		//나머지의 몫. 나머지 사용하여 5642초를 몇분 몇초인지 계산하기
		//1분=60초,  /(몫), %(나머지)
		//Scanner input = new Scanner(System.in);
		
		int m = 5642/60;  //94분임. 60분이 넘었음(한시간이 초과이다)
		int s = 5642%60;
		int h = m / 60;
		//60분이 넘었기 때문에 나머지 연산자를 사용해서
		//0~59분의 값을 얻기 위함
		m %= 60;
		
		System.out.println(h+"시간"+m+"분"+s+"초");	
		
		
		//Sanner를 통해서 입력받은 초를 분과 초로 출력하기
		int inputNum=0;  //사용자로부터 입력받은 값을 저장할 곳
		Scanner input = new Scanner(System.in);
		
		System.out.print("초값을 입력해주세요 :  ");

		inputNum  = input.nextInt();
		System.out.println((inputNum/60)+"분"+(inputNum%60)+"초");
	
		
		//실습 4
		//값 2개를 입력받은 후 두개의 값을 나눈 몫과 나머지를 출력하자
		//첫번째 수를 입력하세요:
		//두번째 수를 입력하세요(0제외):
		//Scanner input = new Scanner(System.in), Input.nextInt() 를 사용하여
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요 : ");
		int num1 = input1.nextInt();
		
		System.out.println("두번째 수를 입력하세요(0제외) : ");
		int num2 = input1.nextInt();
		
		int div = num1 / num2;
		int rest = num1 % num2;
		
		System.out.println("몫 : "+ div + ", 나머지 : " + rest);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
