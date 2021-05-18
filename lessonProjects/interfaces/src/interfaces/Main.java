package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new EmailLogger(),new FileLogger()};

		CustomerManager customerManager=new CustomerManager(loggers);//CustomerMAnager line9
		
		Customer engin = new Customer(1,"Engin","Demiro�");
		
		customerManager.add(engin);
	
	}

}
