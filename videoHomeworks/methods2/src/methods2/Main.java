package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bug�n hava �ok g�zel.";
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
		System.out.println("G�ncellendi");
	}

	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	//variable argument  topla saddece 2 tane arguman ald� . 
	//daha fazla verebilmek i�in variable arguments kullan�r�z
	//bunun yerine test edilebilirli�i sa�lamak i�in koleksiyonlar yada nesneleri kullanmak daha mant�kl�  
	
	public static int topla2(int... sayilar) { //sayilar int array gibi �al���r
		int toplam=0;
		for (int sayi:sayilar) 
		{
			toplam=toplam+sayi;
		}
		return toplam;
	}
	
}

