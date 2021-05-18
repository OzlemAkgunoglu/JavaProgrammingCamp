package abstractClasses;

public abstract class GameCalculator {
	
	//calculate overide olmak zorunda
	public abstract void calculate();
	
	public final void gameOver() {
		System.out.println("Game Over!!");
		//override edilemez
	}
}
