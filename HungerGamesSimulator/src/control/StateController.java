package control;

public class StateController implements Controller{

	public static int state = 0;
	/*
	 * state is a very powerful variable.
	 * It represents what the game should be doing at the current moment.
	 * Here is the mapping:
	 * 0 : Character Creation
	 * 1 : Beginning
	 * 2 : Day
	 * 3 : Night
	 * 4 : Final
	 * 5 : Victory
	 */
	EventController ec;
	TributeController tc;
	
	public StateController(EventController ec, TributeController tc) {
		this.ec = ec;
		this.tc = tc;
	}
	
	@Override
	public void update() {
		ec.update();
		tc.update();
	}

}
