package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("SMS sended to "+message);
	}
	//implements : logger ý SmsLogger a uyarla 
}
