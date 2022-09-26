package chap06_ArrayEx;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("[실습. double 배열 초기화 2]");
		// [배열에 scanner을 통해 체온을 저장]
		// 값을 5개 갖는 double배열을 선언한 후
		// for문과 scanner을 통해 값을 받아 각 배열에 저장하고 출력하자
		// Scanner input = new Scanner(System.in);
		// for (int i=0; ; i++) > i 값을 인덱스 값으로 사용
		// 단, 출력할 때 체온이 37이상이면 숫자앞에 "(위험)"이라는 문구를 함께 출력하라
		double[] tempers = new double[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < tempers.length; i++) {
			System.out.print("체온을 입력하세요 : ");
			tempers[i] = input.nextDouble();
			System.out.println(tempers[i]);
		}
		// for-each 사용
		for (double temper : tempers) {
			if (temper >= 37) {
				System.out.println("(위험) " + temper);
			} else {
				System.out.println(temper);
			}
		}

		System.out.println("[실습. double 배열 초기화 3]");
		// [배열안의 문자와 비교하여 출력하기]
		// String 배열을 바나나, 딸기, 포도, 사과, 키위 로 초기화 한다.
		// Scanner 이용하여 과일이름을 입력받고
		// 배열안에 있는 과일이면, “(과일이름)이 있습니다.”를 출력하고
		// 아니면, “없습니다” 라고 출력하자. 배열 안의 값을 전부 비교 equals()
		String[] fruits = { "바나나", "딸기", "포도", "사과", "키위" }; // 어레이 초기화

		System.out.print("과일종류를 입력하세요 : ");
		String fruitInput = input.next();

		for (int i = 0; i < fruits.length; i++) {
			if (fruitInput.equals(fruits[i])) {
				System.out.println(fruitInput + "가 있습니다.");
				break;
			}
		}

		// 있는지 없는지를 확인하는 for문
		boolean isFruit = false;
		for (int i = 0; i < fruits.length; i++) {
			if (fruitInput.equals(fruits[i])) {
				isFruit = true;
				break;
			}
		}
		if (isFruit) {
			System.out.println(fruitInput + "가 있습니다.");
		} else {
			System.out.println("없습니다.");
		}

		System.out.println("[실습. int배열 크기를 입력]");
		// [학생 수 입력받은 후 성적 입력하기]
		// Scanner를 통해 학생의 수를 입력 받고, 받은 수로 점수 배열을 선언한다.
		// For문을 통해 Scanner를 사용하여 점수 배열 안에 학생의 성적 값을 초기화한후
		// For-each문을 통해, 60점 이상인 점수만 출력한다.
		System.out.println(" 학생 수를 입력하세요 : ");
		int student = input.nextInt();
		int[] studentScores = new int[student];

		for (int i = 0; i < student; i++) {
			System.out.print((i + 1) + "번째 성적을 입력하세요 : ");
			studentScores[i] = input.nextInt();
		}

		for (int score : studentScores) {
			if (score >= 60) {
				System.out.println("60점 이상 : " + score + "점");
			}
		}




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}