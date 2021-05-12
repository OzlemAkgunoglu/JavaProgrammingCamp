package oopIntro;

public class Product {

	// bu alanlara deðer vereceðim Main classda
	// Encapsulasyon gerekiyor
	//final sadece constructorda set edilebilir demek
	//final yerine private ile sadece bu sýnýfta eriþilebilir hale getiriyioruz
	//
	private int id;
	private String name; // Ürün adý
	private double unitPrice; // Birim fiyat
	private String detail; // Ürün açýklamasý
	private double discount;
	//private double unitPriceAfterDiscount; //gerek yok sadece okuyorum
	
	public Product() {
		
	}

	// sað týk> source> consturctor using fields
	// parametreli costructor
	// CONSTRUCTER : Bir nesnenin referasýný bellekde oluþturduðumuzda çalýþan blok
	// constructer bloðu oluþturacaðýz.biz bunu yazmasak da var
	// ancak iþlev ekleyeceksek yazmamýz gerekiyor

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;// Gönderilen id = Product(this.id) sýnýfýnýn idsi demek
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		//this.unitPriceAfterDiscount = unitPriceAfterDiscount;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}

}
