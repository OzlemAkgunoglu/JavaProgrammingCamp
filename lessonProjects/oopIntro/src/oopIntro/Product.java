package oopIntro;

public class Product {
	//constructer blo�u olu�turaca��z.biz bunu yazmasak da var 
		//ancak i�lev ekleyeceksek yazmam�z gerekiyor
		public Product(){
			
			System.out.println("Ben �al��t�m");
		}
		
		//constructer blo�u sonu
		public Product(int id,String name,double unitPrice,String detail) {
			this();
			this.id=id;
			this.name=name;
			this.unitPrice=unitPrice;
			this.detail=detail;
		
		}
		//bu alanlara de�er verece�im Main classda
		int id; 
		String name; //�r�n ad�
		double unitPrice; //Birim fiyat
		String detail; //�r�n a��klamas�
}
