package inheritance;

public class Main {

	public static void main(String[] args) {
		// Customer ve employee için ortak alan özellikler var.
		//id isim soyisim vb. ortak , ortak olmayan ise maaþ bilgisi.
		//Ortak alanlarý kullanabilmek için inheritance kullanacaðýz

		Customer customer=new Customer();
		Employee employee= new Employee();
		//Person sýnýfýndaki tüm özellikleri Customer ve Employee sýnýfý kullanabilir
		//Özellikler gibi methodlar yani operasyonlar da kalýtýlýr.
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		//Inheritance sadece bundan ibaret deðil. REferans tipler üzerinden de ele almalýyýz 
	}

}
