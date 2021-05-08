package classesWithAttributes;

public class Product {
	/*int id;  //public
	String name;
	String description;
	double price;
	int stockAmount;*/
	//Constructor kurucu olu�turucu her s�n�f�n kendi ad�yla bir kurucu metodu vard�r new Product(); dedi�imizde o �al���r
	public Product() {
		System.out.println("Constructer �al��t�");
	}
	//parametreli de olabilir 
	/*public Product(int id, String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Constructer �al��t�");
	} */
	
	/*bu ikisi bir arada da yaz�labilir . (Overloading)
	*/
	
	public Product(int id, String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Constructer �al��t�");
		this.id=id;
		this.description=description;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
	} 
	
	
	//getter ve setter metotlar� private olan �zelli�e ba�ka classlardan eri�imi sa�lar.		private String _name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	private int id;//private bir �zellik sadece bu blok da kullan�labilir main classdan eri�emezsin
	private String name;
	private String renk;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	
	public String getKod() {
		return this.name.substring(0, 1)+id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	

	
}
