package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static olan Yap�c� blok �al��t� ");
	}
	//Bir �r�n� g�ncellerken kaydederken kurallara uygunlu�uunu kontrol
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
