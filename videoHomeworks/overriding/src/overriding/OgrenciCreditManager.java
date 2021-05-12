package overriding;

public class OgrenciCreditManager extends BaseCreditManager {
	//öðrenci için farklý bir faiz oraný istiyoruz ..
	//inheritance yapýsýný asla bozma 
	//hesapla imzasýný bozmaszan bu sýnýf içindeki hesapla çalýþacaktýr.
	//overring gerçekleþmiþ olur.
	public double hesapla(double tutar) {
		return tutar*1.10;
	}
	
}
