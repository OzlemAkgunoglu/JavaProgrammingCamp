package oopIntro;

public class Main {

	public static void main(String[] args) {
		//Product product1= new Product();//Instance,referance creation, �rnek olu�turduk//constructora yol
				//product1.id=1;
				//product1.name="Lenovo v14";
				//product1.unitPrice=15000;
				//product1.detail="16 GB Ram";
				
				Product product1 = new Product(1,"Lenovo v14",15000,"16 GB Ram",10);
				
				
				Product product2= new Product();
				product2.setId(2);
				product2.setName("Lenovo V15");
				product2.setDetail("16 GB ram");
				product2.setDiscount(10);
				product2.setUnitPrice(16000);
				product2.getUnitPriceAfterDiscount();
				System.out.println(product2.getUnitPriceAfterDiscount());
				
				
				//unitPriceAfterDiscount Bunun el ile girilebilir olmas� �ok yanl�� yaz�lbilir de�il sadece okunabilir olmal�
				//bu nedenle bunun gibi fieldlar i�in encapsulatio kullan�r�z.Private olarak tan�mlayaca��z
				Product product3= new Product();
				
				
				Category category1=new Category();
				category1.setId(1);
				category1.setName("��ecek");
				
				Category category2=new Category();
				category2.setId(2);
				category2.setName("Yiyecek");
				
				System.out.println(category1.getName());
				System.out.println(category2.getName());
				
				
				
				//Product[] products = {product1,product2,product3}; //Products Dizi
				
				
				//Product veri t�r�nde ��eler i�eren products dizisinde her bir eleman (product) ismini yazar
				/*
				 * for (Product product : products) { System.out.println(product.name); }
				 * 
				 * System.out.println(products.length);
				 */
				
				//class referans Tiptir
				
				
				/*
				 * Category category1= new Category(); category1.id=1;
				 * category1.name="Bilgisayar";
				 * 
				 * Category category2= new Category(); category2.id=1;
				 * category2.name="Ev/Bah�e";
				 * 
				 * ProductManager productManager= new ProductManager();
				 * productManager.addToCart(product1);
				 * 
				 * productManager.addToCart(product2); productManager.addToCart(product3);
				 */
				 
	}

}
