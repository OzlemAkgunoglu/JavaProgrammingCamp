package polymorphismDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//EmailLogger logger=new EmailLogger();
		//logger.Log("Log mesajý");
		//tüm özellik sýnýflardan bu sonucu elde ederiz
		//overriding yaparak farklý log mesajlarý alabiliriz
		//inheritance sayesinde Baselogger birden çok looger çeþidi alabilir.
		
		
		/*
		 * BaseLogger[] loggers= new BaseLogger[]{new FileLogger(),new
		 * DatabaseLogger(),new EmailLogger(),new ConsoleLogger()}; //plug and play -
		 * ekle çalýþtýr.
		 * 
		 * for (BaseLogger logger : loggers) { logger.Log("Log mesajý"); }
		 */
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
	}

}
