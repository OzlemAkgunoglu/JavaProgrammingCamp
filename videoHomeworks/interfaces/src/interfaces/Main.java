package interfaces;

public class Main {

	public static void main(String[] args) {
		//Bir class birdden fazla class� implemente edebilir
		//ICustomerDal �cCustomerDal=new OracleCustomerDal();
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();

		
		
		
	}
}