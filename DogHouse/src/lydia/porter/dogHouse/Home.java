package lydia.porter.dogHouse;
	//grab dog class; we already have access because they are already in the same pkg
public class Home {

	public Home() {
		//constructor
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		String name = myDog.getName();
		System.out.println("A day in the life of my dog, " + name);
		myDog.wakeUp();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.hear("ding-dong");
		myDog.hear(name);
		myDog.hear("ding-dong");
		myDog.hear("ding-dong");
		myDog.feed();
		myDog.feed();
		myDog.sleep();
		//comment!
		
		System.out.println("\nNight-time...");
		myDog.sleep();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.wakeUp();
		
		System.out.println("\nAnother day...");
		myDog.hear("ding-dong");
		myDog.feed();
		myDog.feed();
		myDog.feed();
	}

}
