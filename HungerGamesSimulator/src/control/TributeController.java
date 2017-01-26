package control;

import tribute.Tribute;

public class TributeController implements Controller {

	private static Tribute[] tributes;
	private static boolean[] alive;
	
	public TributeController(Tribute[] tributes) {
		this.tributes = tributes;
		for(boolean b : alive) {
			b = true;
		}
	}
	
	@Override
	public void update() {
		for(int i = 0; i < tributes.length;i++) {
			if(tributes[i].getHealth() <= 0 || tributes[i].getSanity() <= 0) {
				alive[i] = false;
			}
		}
	}

	public static Tribute[] getTributes() {
		return tributes;
	}

	public static boolean[] getAlive() {
		return alive;
	}
	
}
