package polymorphismDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//EmailLogger logger=new EmailLogger();
		//logger.Log("Log mesaj�");
		//t�m �zellik s�n�flardan bu sonucu elde ederiz
		//overriding yaparak farkl� log mesajlar� alabiliriz
		//inheritance sayesinde Baselogger birden �ok looger �e�idi alabilir.
		
		
		/*
		 * BaseLogger[] loggers= new BaseLogger[]{new FileLogger(),new
		 * DatabaseLogger(),new EmailLogger(),new ConsoleLogger()}; //plug and play -
		 * ekle �al��t�r.
		 * 
		 * for (BaseLogger logger : loggers) { logger.Log("Log mesaj�"); }
		 */
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
	}

}
