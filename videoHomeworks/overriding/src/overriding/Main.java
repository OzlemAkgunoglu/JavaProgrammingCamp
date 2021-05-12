package overriding;

public class Main {

	public static void main(String[] args) {
		//OgretmenCreditManager ogretmenCreditManager=new OgretmenCreditManager();
		//System.out.println(ogretmenCreditManager.hesapla(1000));
		BaseCreditManager[] creditManagers=new BaseCreditManager[] {new OgretmenCreditManager(),new TarimCreditManager(),new OgrenciCreditManager()};
		for (BaseCreditManager creditManager : creditManagers) {
			//Polymorfizm gere�i iki �e�it kredi i�in de hesap yapacak
			System.out.println(creditManager.hesapla(1000));
		}
		
		//��renci kredi faizini farkl� yaparak 
		//Miras al�nan s�n�f� override etmi� olduk
		//Overriding engellemek istersem : kal�t�m al�nacak s�n�fta public final double hesapla yazar�m
	}

}
