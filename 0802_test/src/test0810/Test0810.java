package test0810;

public class Test0810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수 값이 50, 60, 36, 90, 100 이 있을 때, 이 값을 배열에 널고 아래와 같이 출력될수 있도록 코드를 작성하시오
		//60점 이상일 떄 합격이라고 출력한다. 
		//번호는 작성된 점수 순서이다. 
		
		
		int[] score = {50, 60, 36, 90, 100};
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < score.length; i++) {
			if(score[i] >= 60) {				
				System.out.println((i+1)+"번 : 합격");
				sum += score[i];
				count++;
			}
		}
		System.out.println("합격자 평균 : " + sum/count);
		
	}

}
