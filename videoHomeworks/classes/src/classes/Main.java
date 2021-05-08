package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();//Bellekte CustomerManager türünde nesneoluşturdu
		//new ile o sınıftan bir nesne üretmeyi sağlıyoruz
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2; //iki nesneninde adresi aynı olur .. (stack)
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
		
		// Değer ve Referans tipler 
		//Value type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;//sayi1 in değeri sayı2 ye verilir.
		sayi1=30;//sayi1 değeri 30 olur
		System.out.println(sayi2);
		//Refererence type
		int[] sayilar1= new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;//sayilar1 in adresi artık sayilar2 nin adresi 
		//ikiside içinde {4,5,6} değerlerini içeren adresteler
		sayilar1[0]=10;//ikiside aynı adreste oldukları için ikisininde 0 indisli elemanlarının değeri 10 olur.
		
		System.out.println(sayilar2[0]);
	}

}

