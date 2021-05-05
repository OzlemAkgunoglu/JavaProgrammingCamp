package oopIntro;

public class Main {

	public static void main(String[] args) {
		//Product product1= new Product();//Instance,referance creation, �rnek olu�turduk//constructora yol
				//product1.id=1;
				//product1.name="Lenovo v14";
				//product1.unitPrice=15000;
				//product1.detail="16 GB Ram";
				
				Product product1 = new Product(1,"Lenovo v14",15000,"16 GB Ram");
				
				
				Product product2= new Product();
				product2.id=2;
				product2.name="Lenovo v15";
				product2.unitPrice=16000;
				product2.detail="32 GB Ram";
				
				Product product3= new Product();
				product3.id=3;
				product3.name="Hp 5";
				product3.unitPrice=10000;
				product3.detail="8 GB RAM";
				
				
				Product[] products = {product1,product2,product3}; //Products Dizi
				
				//Product veri t�r�nde ��eler i�eren products dizisinde her bir eleman (product) ismini yazar
				for (Product product : products) {
					System.out.println(product.name);
				}
				
				System.out.println(products.length);
				
				//class referans Tiptir
				
				Category category1= new Category();
				category1.id=1;
				category1.name="Bilgisayar";
				
				Category category2= new Category();
				category2.id=1;
				category2.name="Ev/Bah�e";
				
				ProductManager productManager= new ProductManager();
				productManager.addToCart(product1);
				
				productManager.addToCart(product2);
				productManager.addToCart(product3);
	}

}
