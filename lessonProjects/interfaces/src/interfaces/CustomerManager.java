package interfaces;

public class CustomerManager {

	// Dependency injection
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer added " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		//Static

	}

	public void delete(Customer customer) {
		System.out.println("Customer deleted" + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

}

// this.logger.log(customer.getFirstName());
// Buraya ait deðil Mikroservis olarak enjekte edilir
// DatabaseLogger logger=new DatabaseLogger();
// logger.log(customer.getFirstName()+" logged to database");
// Customer MAnager loglamaya Baðýmlý
// loosly baðlý ya da tightly baðlý mý ? bu kodlarla tightly. biz loosly e
// çevireceðiz
//this.logger.log(customer.getFirstName());
// sadece interface 
// DatabaseLogger logger=new DatabaseLogger();
// logger.log(customer.getFirstName()+" logged to database");
