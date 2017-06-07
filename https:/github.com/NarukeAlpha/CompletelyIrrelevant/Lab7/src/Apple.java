
public class Apple implements GameThing, Edible {

	public String getName() {
		return "Flaming Apple";
	}
	public String getDescription() {
		return "An enchanted apple by The Dragon himself Alduin";
	}
	public void eat() {
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
		System.out.println("You have been empowered by the apple");
	}
}
