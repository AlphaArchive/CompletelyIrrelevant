
public class Scroll implements GameThing, Readable,Openable {
	public boolean isOpen = false;
	public String getName() {
		return "The Elder Scroll";
	}

	public String getDescription() {
		System.out.println("This is one of The Elder Scrolls lost in time, beholder of all power");
		if(isOpen)
			System.out.println("The scroll is open");
		else
			System.out.println("The scroll is closed");
		return "";
	}
	public void read(){
		if(isOpen)
			System.out.println("The scroll is too powerfull to be understood");
		else
			System.out.println("The scroll is unreadable when closed");
	}

	public void open() {
		if(isOpen)
			System.out.println("The scroll is already open");
		else{
			System.out.println("The scroll allows for it to be opened, it is calling you, oh mighty dovahkiin");
			isOpen = true;
		}
	}

	public void close() {
		if(!isOpen)
			System.out.println("The scroll lies dormant already");
		else{
			System.out.println("The scroll calls for duty no longer");
			isOpen = false;
		}
	}

}
