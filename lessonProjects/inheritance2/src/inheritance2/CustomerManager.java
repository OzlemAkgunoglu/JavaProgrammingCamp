package inheritance2;

public class CustomerManager {
	
	public void add(Logger logger) {
		
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		//Bunu yapma
		//Bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanacaksa somut sýnýftan gitme 
		//somut sýnýflar EmailLogger, FileLogger vb. new leme
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		//artýk her çeþit logger ile çalýþabilir
	}
}
