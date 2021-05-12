package overriding;

public class Main {

	public static void main(String[] args) {
		//OgretmenCreditManager ogretmenCreditManager=new OgretmenCreditManager();
		//System.out.println(ogretmenCreditManager.hesapla(1000));
		BaseCreditManager[] creditManagers=new BaseCreditManager[] {new OgretmenCreditManager(),new TarimCreditManager(),new OgrenciCreditManager()};
		for (BaseCreditManager creditManager : creditManagers) {
			//Polymorfizm gereği iki çeşit kredi için de hesap yapacak
			System.out.println(creditManager.hesapla(1000));
		}
		
		//Öğrenci kredi faizini farklı yaparak 
		//Miras alınan sınıfı override etmiş olduk
		//Overriding engellemek istersem : kalıtım alınacak sınıfta public final double hesapla yazarım
	}

}
