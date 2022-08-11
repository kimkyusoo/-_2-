package project; 
public class bus{
	       int number;
	       
	    public static void main(String[] args){
	    
	    	
	         bus bus = new bus();
			 bus c1 = new bus();
			 bus c2 = new bus();
//버스 객체 생성 완료(번호 고유값)		 
			 c1.number = 1357;
			 c2.number = 2468;
			 
			 System.out.println("첫 번째 홀수 버스: " + c1.number);
			 System.out.println("두 번째 짝수 버스: " + c2.number);
//			 버스 객체 생성 후 고유번호(짝/홀수)입력 완료.
			 
			 int nowOilMount = 100;
			 int maximumHeadCount = 30;
			 int price = 1000;
			 System.out.println("운행 시작. " + "현재 기름 양: " + nowOilMount + " 최대 탑승 가능 승객: " + maximumHeadCount + " 이용 요금: " + price);
	    
//			 최대승객수, 오일양, 버스 상태, 이용요금 정의 및 운행시작 시 출력되도록 하기 완료.
			 System.out.println("소모된 기름에 따른 버스 상태변경 확인하기");
			 
			 int totalOilMount = 100;
			 int useOilMount = 100;
			 for(int i = 0; i <= useOilMount; i++) {
				 nowOilMount = totalOilMount - i ;
			
			while(nowOilMount == totalOilMount) {	
				bus.status();
				nowOilMount++;
				 System.out.println("소모 기름양: "+ i);
				
			 }if (nowOilMount <= 10 && nowOilMount > 0) {
				 bus.statusWarnning();
				 System.out.println("소모 기름양: "+ i);
				 
				 
				 
			 }else if (nowOilMount == 0) {
				 bus.statusEnd();
				 System.out.println("운행 종료. 소모 기름양: "+ i);
				 
//		기름양을 정의하고 소모된 기름양이 90이상 100미만일 때 주유 필요를 출력, 소모된 기름양이 100일 경우 운행종료. 차고지행을 출력		 
				 
   
	 		}
		 }
			 
			 
			 System.out.println("승객 수 & 요금 확인하기");
			
			 int totalPrice = 0;
			 int leftoverHeadCount = 0;
			 int rideHeadCount = 30;
			 for(int i = 0; i <= rideHeadCount; i++) {
				 leftoverHeadCount = maximumHeadCount - i; 
				 
				 totalPrice = 1000 * i;
				 
				 while(leftoverHeadCount == maximumHeadCount) {
					 bus.status();
					 leftoverHeadCount--;
					 
				 }if (leftoverHeadCount > 0 && leftoverHeadCount <maximumHeadCount) {
					 System.out.println("현재 탑승 승객 수: "+ i);
					 
				 }else if(leftoverHeadCount == 0 ) {
					 bus.leftoverHeadCount();
					 	 
				 }
				 System.out.println("총 버스 요금: " + totalPrice);
			 }
    
	    }
	    void status() {
	    	System.out.println("운행");
	    }
	    
	    void statusEnd() {
    		System.out.println("차고지행");
    	}
	    void statusWarnning() {
	    	System.out.println("주유가 필요합니다");
	    }
	    void leftoverHeadCount() {
	    	System.out.println("최대 승객입니다");
	    }
}