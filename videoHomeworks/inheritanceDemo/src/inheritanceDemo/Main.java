package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//De�i�ime Direnmeyen programlar yazmak.
		/*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();*/
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//burada hem OgretmenKrediManager hemde tar�m kullan�labilir
		//Referans tip oldu�u i�in ve KAl�t�m ald��� i�in
		//Bir projede birden �ok veri taban� desteklensin istiyorum diyelim swicth kullanma. 
		//her veritaban� i�in veri eri�im yazar�z ve enjekte ederiz 
	}

}
