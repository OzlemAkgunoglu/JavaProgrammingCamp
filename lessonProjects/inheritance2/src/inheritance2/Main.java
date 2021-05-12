package inheritance2;

public class Main {

	public static void main(String[] args) {
		//Birbirinin alternatifi oaln kodlar için if yazýlmaz
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());
		
		
	}

}
