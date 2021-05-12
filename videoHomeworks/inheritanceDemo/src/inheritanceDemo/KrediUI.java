package inheritanceDemo;

public class KrediUI {
	/*public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		//button textbox vb her şey burada birbirine bağlanacak
		
		ogretmenKrediManager.Hesapla();
	}
	Bu hatalı bir kullanım çünkü her kredi türü için ayrı ayrı tasarım ve hesaplama yapmak gerekecek
	*/
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();

	}

}
