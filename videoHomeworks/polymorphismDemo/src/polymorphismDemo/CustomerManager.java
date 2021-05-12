package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
		//t�m log bi�imlerini loglayabilmek i�in
		
	}
	
	public void add() {
		//Burada ger�ekte veri taba�na ekleme kodu yaz�l�r 
		//Ve sonra m��teri ekleme i�lemi ne zaman yap�ld� kim yapyt�g� verileri loglan�r
		System.out.println("M��teri Eklendi");
		this.logger.log("Log mesaj�");
		//log bu �ekilde yap�lmaz 
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.Log("Log mesaj�");
		// bunun yerine bu s�n�fta private attribute olu�tur
		//
	}
}
