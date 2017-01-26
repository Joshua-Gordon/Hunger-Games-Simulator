package event;

import tribute.Tribute;

public class ItemEvent extends Event{
	
	Item item;

	public ItemEvent(String name, String description, Tribute[] tributes, int[] directEffects, Item item) {
		super(name, description, tributes, directEffects);
		this.item = item;
	}
	
	@Override
	public void execute() {
		for(int i = 0; i < tributes.length; i++) {
			tributes[i].takeDamage(directEffects[2*i]);
			tributes[i].takeSanityDamage(directEffects[2*i + 1]);
			tributes[i].recieveItem(item);
		}
	}

}
