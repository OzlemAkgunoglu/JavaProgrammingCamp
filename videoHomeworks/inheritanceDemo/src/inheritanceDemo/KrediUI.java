package inheritanceDemo;

public class KrediUI {
	/*public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		//button textbox vb her �ey burada birbirine ba�lanacak
		
		ogretmenKrediManager.Hesapla();
	}
	Bu hatal� bir kullan�m ��nk� her kredi t�r� i�in ayr� ayr� tasar�m ve hesaplama yapmak gerekecek
	*/
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();

	}

}
