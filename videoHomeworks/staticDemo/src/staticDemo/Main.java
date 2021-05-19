//Explain static classes
//static structers 
//maini baþka birclassdan uþalmak için new diyerek çaðýramayýz Main.main olarak.
//utility araçlarý yazarken kullaýrýz

package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager= new ProductManager();
		Product product=new Product();
		product.price=100;
		product.name="Defter";
		manager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
		//warning best practice e göre iç içe eklmeme iner class yapma
		//single responsibilty bozulur
	}

}
