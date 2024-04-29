package CH07;

public class MessengerTest {
	public static void main(String[] args) {
		
		Messenger test = new Messenger() {
			
			public void setMessenger(String msg) {
				System.out.println("테스트 메세지"+msg);
			}
			
			public String getMessenger() {
				return "test";
			}
		};
		
		System.out.println(test.getMessenger());
		test.setMessenger("have a nice day!");
	}

}

