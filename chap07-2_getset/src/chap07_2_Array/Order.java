package chap07_2_Array;

import java.util.Calendar;

public class Order {
	
	//필드
	private String orderNumber;
	private String id;
	private String name;
	private String  productNum;
	
	//정적 변수 orderCount; 를 만들어 사용하라
	private static int orderCount = 0;
	
	//매개변수 없는 생성자
	public Order() {
		Calendar cal = Calendar.getInstance();
		//년도, 달, 일
		//cal객체를 이용하여 현재 날짜를 받아와라
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1;
		int date =  cal.get(cal.DATE);
		
		//정적 변수 orderCount; 를 사용하여 
		//String 20228110이라는 값을 만들어라
		String numString = Integer.toString(year)
										+Integer.toString(month)
										+Integer.toString(date)
										+Integer.toString(orderCount);
										
		//0이 포함된 202208110000 만들기
		//format : 문자열 안에 %d, %s 와 같이 기호를 통해 변수를 넣음
		//숫자형의 경우 숫자가 차지할 공간을 지정해 줄 수 있다. : %2d( = 공간 2 차지)
		//앞에 0이 붙으면 빈 공간을 0으로 채워준다 :  %02d( = 빈공간은 0으로)
		String numZeroString = String.format("%d%02d%02d%04d", year, month, date, orderCount);
				
				
		this.orderNumber = numZeroString;
		this.id = "";
		this.name = "";
		this.productNum = "PD-000";
		
	}
	
	//매개변수 있는 생성자
	public Order(String id, String name, String productNum) {
		this.orderNumber = "000000000000";
		this.id = id;
		this.name = name;
		this.productNum = productNum;
	}
	
	//설정자
	public String getOrderNumber() {
		return orderNumber;
	}
	
	//접근자	
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
		
	// orderNumber 자동으로 작성하는 메소드
		private String numString() {
			Calendar cal = Calendar.getInstance();
			// 년도, 달, 일
			// cal객체를 이용하여 현재 날짜를 받아옴
			int year = cal.get(cal.YEAR);
			int month = cal.get(cal.MONTH) +1;
			int date = cal.get(cal.DATE);
			// 정적변수 orderCount를 만들어서 사용하여 
			// String 20228110 이라는 값을 만드세요
			String numString = Integer.toString(year)
					+ Integer.toString(month)
					+ Integer.toString(date)
					+ Integer.toString(orderCount);
			// 0이 포함된 202208110000 만들기
			// format : 문자열 안에 %d(정수), %s(문자열) 와 같이 기호를 통해 변수를 넣음
			// 숫자형의 경우 숫자가 차지할 공간을 지정해 줄수 있다 : %2d(공간2차지)
			// 앞에 0이 붙으면 빈 공간을 0으로 채워준다 : %02d(빈공간은 0으로)
			String numZeroString = String.format("%d%02d%02d%04d", 
								year, month, date, orderCount);
			
			orderCount++;
			
			return numZeroString;
			
		}
	
}
