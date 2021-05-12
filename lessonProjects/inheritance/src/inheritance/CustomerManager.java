package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}

	// bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}

	// tek bir metot ile farklý tip nesneleri döndürme polimorfizm
	// SOLID Open Closed Principle : Sisteme yeni bir özellik eklenecekse var olan
	// kodu silemezsin ancak kod ekleyebilirsin

}
