package overriding;

public class OgrenciCreditManager extends BaseCreditManager {
	//��renci i�in farkl� bir faiz oran� istiyoruz ..
	//inheritance yap�s�n� asla bozma 
	//hesapla imzas�n� bozmaszan bu s�n�f i�indeki hesapla �al��acakt�r.
	//overring ger�ekle�mi� olur.
	public double hesapla(double tutar) {
		return tutar*1.10;
	}
	
}
