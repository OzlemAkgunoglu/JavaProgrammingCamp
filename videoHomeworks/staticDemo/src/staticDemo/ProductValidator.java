package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static olan Yapýcý blok çalýþtý ");
	}
	//Bir ürünü güncellerken kaydederken kurallara uygunluðuunu kontrol
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
