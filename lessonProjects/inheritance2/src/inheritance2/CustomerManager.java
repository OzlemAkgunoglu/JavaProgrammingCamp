package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		//Bunu yapma
		//Bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanacaksa somut s�n�ftan gitme 
		//somut s�n�flar EmailLogger, FileLogger vb. new leme
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		//art�k her �e�it logger ile �al��abilir
	}
}
