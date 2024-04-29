package quiz;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최소 지폐 수 계산
		//천원 미만 할인, 임의 금액 지불 위해 필요한 지폐 장수 구하는 프로그램
		
		int pirce = 167000;
		
		int oman = pirce / 50000;
		int man = pirce % 50000 / 10000;
		int ochen = pirce % 10000 / 5000;
		int chen = pirce % 5000 / 1000;
		
		int dis = pirce % 1000;
		
		int totalcnt = oman + man + ochen +chen;
		
		
		
		
		
		System.out.println("5만원 : " + oman);
		System.out.println("1만원 : " + man);
		System.out.println("5천원 : " + ochen);
		System.out.println("1천원 : " + chen);
		
		System.out.println("-------------------------");
		
		System.out.printf("총 장수 %d\n ",totalcnt);
		System.out.printf("금액 %d\n ", pirce - dis);
		System.out.printf("할인 %d\n ", dis);
		
		
		
	}

}
