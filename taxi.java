package project;

public class taxi {
	int number;
	

    public static void main(String[] args){
    
    	
         taxi taxi = new taxi();
		 taxi c1 = new taxi();
		 taxi c2 = new taxi();
		 
		 c1.number = 1357;
		 c2.number = 2468;
		 
		 System.out.println("첫 번째 홀수 택시: " + c1.number);
		 System.out.println("두 번째 짝수 택시: " + c2.number);
//		짝수, 홀수 택시 번호 출력
		
		 System.out.println("기름양에 따른 택시 상태 확인");
		 int nowOilMount = 100;
		 int useOilMount = 100;
		 int totalOilMount = 100;
		 for(int i = 0; i <= useOilMount; i++) {
			 nowOilMount = totalOilMount - i ;
//		
		while(nowOilMount == totalOilMount) {	
			taxi.status();
			nowOilMount++;
			 System.out.println("소모 기름양: "+ i);
			 
		 } if (nowOilMount == 0) {
			 taxi.statusEnd();
			 System.out.println("운행 종료. 소모 기름양: "+ i);
		 }
	 }
//		 기름양에 따른 택시 상태를 출력 소모 기름양이 0일 경우 운행 시작 , 기름을 전부 소진할 경우 운행 종료와 소모된 기름양을 출력
		 
		 System.out.println("탑승 승객에 따른 상태 확인하기");
		 int maxiumHeadCount = 4;
		 int leftoverHeadCount;
		 int rideCount = 4;
		 
		 for (int i = 0; i < rideCount; i++) {
			 leftoverHeadCount = maxiumHeadCount - i;
		 
		 while (leftoverHeadCount == maxiumHeadCount) {
			 System.out.println("운행중입니다.");
			 leftoverHeadCount--;
			 
			 
		 }if (leftoverHeadCount >= 0 && leftoverHeadCount <  maxiumHeadCount) {
			 taxi.statusRide();
			 
			 
		 }else if (leftoverHeadCount < 0);
		 	taxi.doNotRide();
		 	break;
//		 	택시 최대 탑승 승객을 정의하고 승객이 없을때는 운행중 상태를, 탑승시 탑승이라는 상태를 마지막으로 탑승 승객이 최대 승객을 초과할 때는 탑승 불가가 출력
	 }	
		 System.out.println("목적지에 따른 최종 금액과 총 거리 확인하기");
		 int finalPrice;
		 int normalPrice = 3000;
		 int distancePrice = 1000;
		 int normalDistance = 1;
		 int addDistance = 100;
		 int destination = 0;
		 int destinationSeoul = 2;
		 int destinationGuro = 12;
		 for (int i = 0; i <= addDistance; i++) {
			finalPrice = normalPrice + distancePrice * i;
			destination = normalDistance + i;
			
			if (destination == destinationSeoul) {
				System.out.println("목적지 서울역");
				System.out.println("총 거리는 " + destination + "km, 최종 금액은 " + finalPrice + " 원 입니다." );
				
			}else if (destination == destinationGuro) {
				System.out.println("목적지 구로디지털단지");
				System.out.println("총 거리는 " + destination + "km, 최종 금액은 " + finalPrice + " 원 입니다." );
				
			}
//			총 거리와 최종 금액을 정의하고 특정 목적지로 이동하면 해당 목적지에 대한 출려과 거리, 금액이 출력
			
		 }	
		 
	}
		 void status() {
		    	System.out.println("운행을 시작합니다.");
		    }
		    
		    void statusNone() {
	    		System.out.println("탑승이 불가합니다.");
	    	}
		    void statusRace() {
		    	System.out.println("운행중입니다.");
		    }
		    void statusEnd( ) {
		    	System.out.println("기름을 전부 소모하였습니다. 운행을 종료합니다");
		    }
		    void doNotRide() {
		    	System.out.println("탑승 불가");
		    }
		    void statusRide() {
		    	System.out.println("탑승");
		    }

}
