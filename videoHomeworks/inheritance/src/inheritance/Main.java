package inheritance;

public class Main {

	public static void main(String[] args) {
		// Customer ve employee i�in ortak alan �zellikler var.
		//id isim soyisim vb. ortak , ortak olmayan ise maa� bilgisi.
		//Ortak alanlar� kullanabilmek i�in inheritance kullanaca��z

		Customer customer=new Customer();
		Employee employee= new Employee();
		//Person s�n�f�ndaki t�m �zellikleri Customer ve Employee s�n�f� kullanabilir
		//�zellikler gibi methodlar yani operasyonlar da kal�t�l�r.
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		//Inheritance sadece bundan ibaret de�il. REferans tipler �zerinden de ele almal�y�z 
	}

}
