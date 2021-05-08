package classesWithAttributes;

public class Product {
	/*int id;  //public
	String name;
	String description;
	double price;
	int stockAmount;*/
	//Constructor kurucu oluþturucu her sýnýfýn kendi adýyla bir kurucu metodu vardýr new Product(); dediðimizde o çalýþýr
	public Product() {
		System.out.println("Constructer çalýþtý");
	}
	//parametreli de olabilir 
	/*public Product(int id, String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Constructer çalýþtý");
	} */
	
	/*bu ikisi bir arada da yazýlabilir . (Overloading)
	*/
	
	public Product(int id, String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Constructer çalýþtý");
		this.id=id;
		this.description=description;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
	} 
	
	
	//getter ve setter metotlarý private olan özelliðe baþka classlardan eriþimi saðlar.		private String _name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	private int id;//private bir özellik sadece bu blok da kullanýlabilir main classdan eriþemezsin
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
