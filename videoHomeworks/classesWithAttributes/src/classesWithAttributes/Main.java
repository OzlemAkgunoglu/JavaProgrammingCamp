package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		/* Product product = new Product();
		 * product.name = "Laptop"; product.id = 1; product.description = "asus laptop";
		 * product.price = 5000; product.stockAmount = 50; Product class�nda public
		 * tan�mlam�� olsayd�k bu �ekilde veriler al�n�rd� ama bu kullan�mdo�ru de�il
		 */
		
		//Parametreli constructor kullansayd�m 
		Product product = new Product(1,"Laptop","Asus Laptop",5000,5,"siyah");
		//Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(5);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());

		//productManager.Add2(1, "", "", 1000);
	}

}
