package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		/*
		 * String mesaj = "Bug�n hava �ok g�zel."; System.out.println(mesaj);
		 * System.out.println("Eleman say�s�" + mesaj.length());
		 * System.out.println("5. eleman:" + mesaj.charAt(4));
		 * System.out.println(mesaj.concat("ya�as�n!"));
		 * System.out.println(mesaj.startsWith("A"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler= new char[5];
		 * mesaj.getChars(0, 5, karakterler,0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("a"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 4));
		
		//split
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		//arama ifadesini ve datay� k���k harfe �evirerek kar��la�t�rmay� kolayla�t�r�r
		//trim ile ba�taki ve sondaki bo�luklar� atars�n.
		
		
		
		
		
		
	}

}
