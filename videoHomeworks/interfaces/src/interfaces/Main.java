package interfaces;

public class Main {

	public static void main(String[] args) {
		//Bir class birdden fazla classý implemente edebilir
		ICustomerDal ýcCustomerDal=new OracleCustomerDal();
	}

}
