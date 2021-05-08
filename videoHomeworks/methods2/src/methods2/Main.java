package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj=mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		int sayi =topla(5,7);
		System.out.println(sayi);
		int toplam=topla2(2,5,6,8,6);
		System.out.println(toplam);
		
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//variable argument  topla saddece 2 tane arguman aldý . 
	//daha fazla verebilmek için variable arguments kullanýrýz
	//bunun yerine test edilebilirliði saðlamak için koleksiyonlar yada nesneleri kullanmak daha mantýklý  
	
	public static int topla2(int... sayilar) { //sayilar int array gibi çalýþýr
		int toplam=0;
		for (int sayi:sayilar) 
		{
			toplam=toplam+sayi;
		}
		return toplam;
	}
	
}

