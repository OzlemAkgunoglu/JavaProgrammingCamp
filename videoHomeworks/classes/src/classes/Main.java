package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();//Bellekte CustomerManager t�r�nde nesneolu�turdu
		//new ile o s�n�ftan bir nesne �retmeyi sa�l�yoruz
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2; //iki nesneninde adresi ayn� olur .. (stack)
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
		
		// De�er ve Referans tipler 
		//Value type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;//sayi1 in de�eri say�2 ye verilir.
		sayi1=30;//sayi1 de�eri 30 olur
		System.out.println(sayi2);
		//Refererence type
		int[] sayilar1= new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;//sayilar1 in adresi art�k sayilar2 nin adresi 
		//ikiside i�inde {4,5,6} de�erlerini i�eren adresteler
		sayilar1[0]=10;//ikiside ayn� adreste olduklar� i�in ikisininde 0 indisli elemanlar�n�n de�eri 10 olur.
		
		System.out.println(sayilar2[0]);
	}

}

