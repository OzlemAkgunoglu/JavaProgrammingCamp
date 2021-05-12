package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
		//tüm log biçimlerini loglayabilmek için
		
	}
	
	public void add() {
		//Burada gerçekte veri tabaýna ekleme kodu yazýlýr 
		//Ve sonra müþteri ekleme iþlemi ne zaman yapýldý kim yapytýgý verileri loglanýr
		System.out.println("Müþteri Eklendi");
		this.logger.log("Log mesajý");
		//log bu þekilde yapýlmaz 
		//DatabaseLogger logger=new DatabaseLogger();
		//logger.Log("Log mesajý");
		// bunun yerine bu sýnýfta private attribute oluþtur
		//
	}
}
