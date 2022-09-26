package chap03_operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연산자
		//산술연산자와 대입연산자
	
		int x, y;
		x = 10;
		y = 3;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y); 
		System.out.println(x/y);  //int끼리 나누면 int형으로 나옴
		System.out.println(x%y);  //int끼리 나머지는 int형으로 나옴
		
		//대입연산자: 오른쪽 식을 계산한 후에 변수 에 대입
		//계산식이 끝난 후에 값을 할당하기 때문에
		//int형에서 double형으로 형 변환만 하게 된다
		double sum = x/y; 
		System.out.println(sum);
		
		//실습 산술 연산자1
		//int를 사용하여 변수 sum1 선언 후 
		//10+20+30+40+50 값을 할당 또는 초기화 하라		
		
		//int를 사용하여 변수 mult1 선언 후 
		//10*20*30*40 값을 할당 또는 초기화 하라   	 
		
		//int를 사용하여 변수 sum2 선언 후 
		//10*(20+30)+40 값을 할당 또는 초기화 하라
		
		int sum1, multi1, sum2;
		
		sum1 = 10+20+30+40+50;
		multi1 = 10*20*30*40;
		sum2 = 10*(20+30)+40;
		
		System.out.println(sum1);
		System.out.println(multi1);
		System.out.println(sum2);
		
		
		//실습 산술 연산자2
		//int result, resultRest; 를 만들고 80/3, 80%3의 결과를 확인해보자
		int result, resultRest;
		
		result = 80/3;
		resultRest = 80%3;
		System.out.println(result);   //몫: 26
		System.out.println(resultRest);  //나머지: 2
		System.out.println(26*3+2);  //80이 나오므로 계산 확인
		
		
	    //나머지 연산자의 계산결과의 특징
		//1. 항상 정수로만 나온다
		//2. 값의 범위가 정해져 있다 (0 ~ 나누는 수)
	
		
		//double resultDouble; 를 만들고 80.0/3.0의 결과를 확인하자
		double resultDouble = 80.0/3.0;
	    System.out.println(resultDouble);  //소수점 자리까지 나옴
		
	    
	    //실습 연산자 결합규칙
	    //연산자 우선순위  *,  /,  %  =>  +,  -  
	    //30.0/20+30-10*2
	    //30/20+(30-10)*2
	    //println을 통해 두식의 결과를 확인해보자 
	    System.out.println(30.0/20+30-10*2); //11.5 실수형이 존재해서 실수로 출력
	    System.out.println(30/20+(30-10)*2); //41 정수형만 존재해서 정수으로 출력
	   
	   
	    //실습 단항 연산자
	    int a = +10;  //+붙어서 양수됨(붙이지 않아도 양수)
	    int b = -10;  //-붙여서 음수됨
	    
	    System.out.println(a);
	    System.out.println(b);
	    
	    //전위 단항 연산자(++, --) 
	    //다른 연산을 하기 전에 1증가, 1감소 한다
	    int c = ++a;  //변수(a) 앞에 사용해서 a 값이 증가한다.
	    System.out.println(c);
	    
	    ++a;  //a의 값이 1증가 : 12
	    System.out.println(a);
	    
	    --a;  //a의 값이 1감소 : 11
	    System.out.println(a);
	    
	    //후위 단항 연산자 (++, --)
	    //모든 연산이 끝난 후에 값을 1증가, 1감소 시킨다
	    int d = a++;
	    System.out.println(d);  //11 : 값을 증가시키기 전에 들어간 값
	    System.out.println(a);  //12 : 이후에 1을 증가시킴
	    
	    a++;  //a의 값이 1증가함 : 13
	    System.out.println(a);
	    
	    
	    //실습 단항 연산자
	    // int minusX = 1;
	    // int minusY = 1;
	    //System.out.println(minusX--)와 
	    //System.out.println(--minusY)을 출력하고 
	    //확인한 후 각각 x,y를 출력해 확인하자.
	    int minusX = 1;
	    int minusY = 1;
	    
	    //후위연산자를 사용해서 먼저 값이 출력된 후에 1이 감소한다
	    System.out.println(minusX--) ; //1
	    
	    //전위 연산자를 사용해서 값을 1감소한 후에 출력된다
	    System.out.println(--minusY); //0
	    
	    System.out.println(minusX); //0	
	    System.out.println(minusY); //0
		
		
		//복합 대입연산자
	    //동일한 변수에서 값을 바꿔서 혹은 계산해서 사용할 때 쓰는 방법

	    //10, 20, 30, 40을 더해서 결과값 확인하기
	   // int sum3 = 10+20+30+40;  //한꺼번에 더해서 계산하는 법
	    
	    //만약 한꺼번에 계산할 수 없고 
	    //한 코드가 끝날 때 그 값을 추가해서 더해야 하는 경우
		int sum3 = 0;  //처음 값
		
		//sum3 = 10;    //sum3에 값이 대입해서 들어감(할당)
		sum3 = sum3 +10;  //0(sum3) + 10 : 10
	    sum3 = sum3 + 20;  //10(sum3) + 20 : 30
	    sum3 = sum3 + 30;  //30(sum3) + 30 : 60
	    sum3 = sum3 + 40;  //60(sum3) + 40 : 100
	    System.out.println(sum3);
	    
	    //복합대입연산자 사용방법 (*=,  /=.  %=,  +=,  -=)
	    
	    int mult2 = 1;
	    
	    //mult2 = mult2 * 10;
	    mult2 *= 10;  //곱셈과 대입연산자를 복합해서 사용
	    
	    System.out.println(mult2);
	    
	    
	    //실습 복합대입연산자 
	    int sum4 = 0;
	    sum4 += 10;
	    System.out.println(sum4);  //10
	    
	    int multi3 =1;
	    multi3 *=20;
	    System.out.println(multi3);  //20
	    
	    
	    //관계연산자(==,  !=,  >,  <,  >=,  <=)
	    //관계연산자의 결과값은 항상 참/거짓이다 (boolean값)
	    System.out.println( 10 == 10 );  //true
	    System.out.println( 10 == 100  );  //false
	    
	    int score = 50;
	    //score 값이 60보다 크면 합격(true), 작으면 탈락(false)
	    System.out.println(  score > 60  );  
	    
	    
	    
	    //실습 관계연산자
	    //num1 = 63*4,  num2 = 38*6 값을 넣고 비교연산자를 이용하여
	    //비교한 결과를 출력해보자
	    //==,  !=,  >,  <,  >=
	    int num1 = 63*4;
	    int num2 = 38*6;
	    
	    System.out.println(num1);  //252
	    System.out.println(num2);  //228
	    
	    System.out.println(num1 == num2);  //false
	    System.out.println(num1 != num2);  //true
	    System.out.println(num1 > num2);  //true
	    System.out.println(num1 < num2);  //false
	    System.out.println(num1 >= num2);  //true
	    
	    
	    //7월 27일
	    System.out.println("7월 27일");
	    // 논리연산자 (&&, ||, !) 
	    // 논리형(boolean : true/false)을 계산하는 연산자
	    boolean x1 = true; 
	    boolean y1 = false;
	    
	    // && and 연산자는 true && true 일때 결과가 true가 나온다.
	    // 하나라도 false 이면 결과가 false가 나온다.
	    System.out.println(x1 && y1);
	    
	    // || or 연산자는 하나라도 true이면 결과가 true가 나온다.
	    // false || false일 경우 결과가 false가 나온다.
	    System.out.println(x1 || y1);
	    
	    // ! not 연산자를 사용하면 원래값을 부정(반대)한 값이 나온다.
	    // true => false,  false => true
	    System.out.println(!x1);
	    
	    // 실습 논리 연산자
	    System.out.println("---------");
	    int x2 = 20, y2 = 40;
	    System.out.println(x2 == 20 && y2 == 20); // false
	    System.out.println(x2 == 20 && y2 == 40); // true
	    System.out.println(x2 == 20 || y2 == 10); // true
	    System.out.println(x2 == 10 || y2 == 10); // false
	    System.out.println(x2 == 20 && y2 != 10); // true
	    // !(false) => true
	    System.out.println(!(x2 == 10)); // true
	    
	    
	    System.out.println("---------");
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
