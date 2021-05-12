package oopIntro;

public class Product {

	// bu alanlara de�er verece�im Main classda
	// Encapsulasyon gerekiyor
	//final sadece constructorda set edilebilir demek
	//final yerine private ile sadece bu s�n�fta eri�ilebilir hale getiriyioruz
	//
	private int id;
	private String name; // �r�n ad�
	private double unitPrice; // Birim fiyat
	private String detail; // �r�n a��klamas�
	private double discount;
	//private double unitPriceAfterDiscount; //gerek yok sadece okuyorum
	
	public Product() {
		
	}

	// sa� t�k> source> consturctor using fields
	// parametreli costructor
	// CONSTRUCTER : Bir nesnenin referas�n� bellekde olu�turdu�umuzda �al��an blok
	// constructer blo�u olu�turaca��z.biz bunu yazmasak da var
	// ancak i�lev ekleyeceksek yazmam�z gerekiyor

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;// G�nderilen id = Product(this.id) s�n�f�n�n idsi demek
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
