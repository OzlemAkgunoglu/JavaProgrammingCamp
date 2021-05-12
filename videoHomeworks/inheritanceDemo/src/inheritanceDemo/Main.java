package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//Deðiþime Direnmeyen programlar yazmak.
		/*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();*/
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//burada hem OgretmenKrediManager hemde tarým kullanýlabilir
		//Referans tip olduðu için ve KAlýtým aldýðý için
		//Bir projede birden çok veri tabaný desteklensin istiyorum diyelim swicth kullanma. 
		//her veritabaný için veri eriþim yazarýz ve enjekte ederiz 
	}

}
