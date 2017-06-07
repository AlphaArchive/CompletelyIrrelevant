public class Sign implements GameThing, Readable, Edible
{
	public String getName()
	{
		return "A CHOLOCLATE SIGN!!!!!";
	}
	public String getDescription()
	{
		return "THIS IS A FUDGING BIG CHOCOLATE SIGN, THERE'S SOME SMALL WRITING BUT WHO CARES";
	}
	public void read() {
		 System.out.println("It's written on the bottom: \n The Dark Brotherhood was here ");
		
	}
	public void eat() {
		AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
		System.out.println("IT TASTED AMA- actually pretty bad, its been there a long while... now I have a stomach ache");
	}
}
