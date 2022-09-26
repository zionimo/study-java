package array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 확인
		int[] numbers;  // 배열의 참조변수 선언
		numbers = new int[6];  //배열의 생성
		int[] numbers2 = new int[6];  //배열 생성
		int[] numbers3 = numbers2;  //배열의 주소		
		
		//{}중괄호를 통해서 값을 바로 입력 가능(초기화)
		int[] scores = {10, 20, 40, 70};
		int index = 0;
		
		//[] 대괄호를 이용하여 배열의 값 접근
		//[] : 인덱스 (0~) : 정수값(변수)
		numbers[0] = 1;
		System.out.println(scores[index+1]);
		System.out.println(scores);  //주소
		System.out.println(numbers);  
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		
		numbers2[0]=5;
		System.out.println(numbers2[0]);
		System.out.println(numbers3[0]);
		
		//for문을 이용한 배열 요소 출력
		//배열의 길이를 직접 입력해줄 수도 있지만 length를 사용해서 쓸 수 있다.
		
		
		for (int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//for-each 루프
		//배열안에 있는 요소를 score에 담아서 사용할 수 있다.
		//배열안에 있는 값을 가져오는 것이기 때문에 배열의 값을 수정할 수 없다.
		for (int score : scores) {
			System.out.println(score);
		}
		
		
		
		System.out.println("[실습. double 배열 초기화]");
		//[배열에 학생들의 키 저장 후 평균 구하기]
		//double 배열을 선언후 학생들의 키 값 5개를 넣어 초기화한다
		//이후 for문을 통해 모든 값을 더한 후 학생들 키의 평균을 구하자
		double[] heights = {155.8, 163, 178.2, 180, 185};
		double sum = 0.0;
		for (double height : heights) {
			sum += height;
		}
		System.out.println("학생들의 평균 키는" +(sum/heights.length)+"cm 입니다");
		//평균키 값을 sum/5으로 계산하지 않는 이유는 학생인원에 수정이 있을 때도 적용가능하기 위함 
		
		
		System.out.println("8/4 <2차원 배열>");
		//2차원 배열
		//2차원 배열의 선언과 생성
		int[][] numArray = new int[3][5];
		//내용확인을위해 중첩 반복문 사용
		int count = 1;
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<5; j++) {
				numArray[i][j] = count;
				count++;
				System.out.print(numArray[i][j]+ " ");
			}
			System.out.println();
		}
		
		numArray[0][0] = 100;
		System.out.println("프로그램을 종료합니다");
		
		
		//2차원 배열 초기화
		int[][] tableArray = {{10, 20, 30}, {40, 50, 60, 65}, {70, 80,90}};
		
		for (int i = 0; i<tableArray.length; i++) {
			for (int j = 0; j<tableArray[i].length; j++) {
				System.out.print(tableArray[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("<2차원 배열 - 단어장>");
		//String [][] words = {{"chair","의자"}, {"computer","컴퓨터"}, {"integer", "정수"}};
		//for 문, words.length
		//사용하여 영어 단어와 뜻, 출력하기
		
		String [][] words = {{"chair","의자"}, {"computer","컴퓨터"}, {"integer", "정수"}};
		
		for (int i=0; i<words.length; i++) {
			for (int j=0; j<words[i].length; j++) {
				System.out.print(words[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		//선택정렬코드
		int[] numberSort = {5, 2, 6, 1};
		int temp, least; 
		
		for (int i =0; i < numberSort.length-1; i++) {
			least = i; 
			for (int j = i + 1; j < numberSort.length; j++) {
				//값들을 하나씩 비교하면서 최소값 확인
				if (numberSort[j] < numberSort[least]) {
					least = j; //현재 값이 더 작다면 인덱스값을 넣어줌
				}
			}
			//반복문이 끝난 후에 가장 작은 값의 위치를 바꿔줌
			temp = numberSort[i];  //첫번째의 값을 저장
			//첫번째 자리에 가장 작은 값 할당
			numberSort[i] = numberSort[least];
			numberSort[least] = temp;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
