package oopIntro;

public class Product {
	//constructer bloðu oluþturacaðýz.biz bunu yazmasak da var 
		//ancak iþlev ekleyeceksek yazmamýz gerekiyor
		public Product(){
			
			System.out.println("Ben çalýþtým");
		}
		
		//constructer bloðu sonu
		public Product(int id,String name,double unitPrice,String detail) {
			this();
			this.id=id;
			this.name=name;
			this.unitPrice=unitPrice;
			this.detail=detail;
		
		}
		//bu alanlara deðer vereceðim Main classda
		int id; 
		String name; //Ürün adý
		double unitPrice; //Birim fiyat
		String detail; //Ürün açýklamasý
}
