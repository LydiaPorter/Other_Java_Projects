package lydia.porter.troubleshooting;
//ch9

public class Losing_Battle {

	public Losing_Battle() {
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Your hero unsheathes her sword for the last fight of her life.");
		
		int hero_health = 100;
		//System.out.println(hero_health); //after you define it
		int dead_trolls = 0;
		int troll_damage = 5;
		System.out.println();
		int hero_damage = 10;
		System.out.println();
		int troll_health = 10;		
		
		
		System.out.println("Your hero has "+hero_health+" points.");
		while (hero_health > 0) {
			int hero_attack = hero_damage;
			int troll_attack = troll_damage;
			hero_health -= troll_attack;
			
			if (hero_attack >= troll_health) {
				dead_trolls += 1;
				System.out.println("Your hero swings and defeats an evil troll, ");
				System.out.println("but takes " +troll_attack+ " damage points.\n");
				System.out.println("After the attack, your hero now has "+hero_health+" points.");
			}
		
		}
		System.out.println("Your hero fought valiantly and defeated " +dead_trolls+ " trolls.");
		System.out.println("But alas, your hero is no more.");
		
	}

	public static void main(String[] args) {
		new Losing_Battle(); 
		//function call
		//we need this to run!!
		//debugger starts here and then goes to public

	}

}
