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

	// tek bir metot ile farkl� tip nesneleri d�nd�rme polimorfizm
	// SOLID Open Closed Principle : Sisteme yeni bir �zellik eklenecekse var olan
	// kodu silemezsin ancak kod ekleyebilirsin

}
