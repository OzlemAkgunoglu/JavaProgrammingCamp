//Explain static classes
//static structers 
//maini ba�ka birclassdan u�almak i�in new diyerek �a��ramay�z Main.main olarak.
//utility ara�lar� yazarken kulla�r�z

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
		//warning best practice e g�re i� i�e eklmeme iner class yapma
		//single responsibilty bozulur
	}

}
