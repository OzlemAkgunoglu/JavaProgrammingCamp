package abstractClasses;

public class Main {

	public static void main(String[] args) {
			WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
			womenGameCalculator.calculate();
			womenGameCalculator.gameOver();
			
			GameCalculator gameCalculator=new WomenGameCalculator();
			
			
			
			/*
			 * abstract classlar new ile kullnýlamaz 
			 *Bu þekilde kullanma !!
			 * GameCalculator gameCalculator=new GameCalculator() {
			 * 
			 * @Override public void calculate() { // TODO Auto-generated method stub
			 * 
			 * } };
			 */
	}

}
