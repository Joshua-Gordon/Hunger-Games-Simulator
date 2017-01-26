package control;

import java.util.Random;

import event.Event;
import tribute.Tribute;

public class EventController implements Controller {
	
	private Event[] events;
		
	public EventController(Event[] events) {
		super();
		this.events = events;
	}
	
	public static boolean skillCheck(Tribute t, int skill, int difficulty) {
		int value = t.getSkills()[skill];
		return value + new Random().nextInt(10) >= difficulty;
		//Difficulty is on a scale from 1 to 20, with 1 being stupidly easy, and 20 being near impossible.
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
