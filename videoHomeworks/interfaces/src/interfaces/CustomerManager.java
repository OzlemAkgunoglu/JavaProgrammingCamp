package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		//i� kodlar� yaz�l�r m��teri ad� girilmi� mi do�ru mu vs
		customerDal.add();
		
	}
}
