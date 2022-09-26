package chap07_ObjectEx;

import java.util.Scanner;

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RandomUD 객체확인
		RandomUD randomNum = new RandomUD();
		randomNum.startPlay();  //캡슐화
	
		
		//랜덤 수를 가진 업다운 게임
		//1. 랜덤한 수가 만들어짐
		//2. 수를 입력받음
		//3. 입력받은 수를 랜덤한 수와 비교 결과를 알려줌
		//4. 결과에 따라 크다. 작다를 알려주고 (반복 2~4)
		//5. 같다면 게임 끝
		
		//1. 랜덤한 수 만듦
		int num = (int) (Math.random()*100) +1;  //(int)는 값이 double이기 때문에 int로 형변환 한 것
		System.out.println(num);
		
		//2. 수를 입력받음
		int usernum;
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자값을 입력해주세요 : ");
			usernum = input.nextInt();
			
			//3. 입력받은 수와 랜던한 수를 비교하고 결과 출력
			if (usernum > num) {
				//4. 결과 출력
				System.out.println("입력한 숫자가 더 큽니다");
			} else if (usernum < num) {
				System.out.println("입력한 숫자가 더 작습니다");
			} else {
				//usernum과 num이 같을 때 while문을 빠져나옴
				break;
			}
		}
			
		System.out.println("값이 같습니다. 정답입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
