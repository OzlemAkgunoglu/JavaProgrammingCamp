package intro;

import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		// Banka sitesi Sim�lasyonu
		String internetSubeButonu = "�nternet �ubesine Gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		//int vade = 36;
		//boolean dustuMU = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar sabit resmi");
		}

		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "MSB kredisi";
		String kredi4 = "Konut kredisi";
		

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);

		String[] krediler = { "H�zl� Kredi", "Mutlu Emekli Kredisi", "MSB Kredisi", "Konut Kredisi", "�ift�i Kredisi" };
		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);

		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}

	}

}
