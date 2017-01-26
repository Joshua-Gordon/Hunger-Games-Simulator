package event;

import control.EventController;
import tribute.Tribute;

public class SkillEvent extends Event {
	
	int skill, difficulty;
	Event reward;

	public SkillEvent(String name, String description, Tribute[] tributes, int[] directEffects, int skill, int difficulty, Event reward) {
		super(name, description, tributes, directEffects);
		this.skill = skill;
		this.difficulty = difficulty;
		if(reward!=null) this.reward = reward;
	}
	
	@Override
	public void execute() {
		boolean passed = false;
		for(Tribute t : tributes){
			if(EventController.skillCheck(t, skill, difficulty)) passed = true;
		}
		if(passed) {
			for(int i = 0; i < tributes.length; i++) {
				tributes[i].takeDamage(directEffects[2*i]); //Negative damage
				tributes[i].takeSanityDamage(directEffects[2*i + 1]); //Negative sanity damage
				//TODO: Print "(name of tributes) managed to (event description)"
			}
			if(reward!=null)reward.execute();
		} else {
			//TODO: Print "(name of tributes) failed to (event description)"
		}
	}

}
