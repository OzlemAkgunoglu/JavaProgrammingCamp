package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=23;
		//int remainder=number%2;
		//System.out.println(remainder);
		boolean isPrime=true;
		if (number==1) {
			System.out.println("Asal De�ildir.");
			return;
		}
		if (number<1) {
			System.out.println("Gee�rsiz Say� Girdiniz!");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
			
		}
		if (isPrime) {
			System.out.println("Say� asald�r");
		}else {
			System.out.println("Say� asal de�ildir");
		}
		
		
		
	}

}
