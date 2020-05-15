import java.util.*;
import java.util.Random;
public class Dice {

	Scanner in=new Scanner(System.in);
	//Properties
	private String dice;
	//Value --> 1 to 6 
	public Dice() {
		String[] dice = {"1","2","3","4","5","6"};
	}
	//Lock --> true or false (boolean)
	boolean lock=true;

	//Methods

	//Getter for Value
	public String getdice() {
		return dice;
	}
	//Getter for Lock
	public boolean getlock() {
		return lock;
	}
	//Setter for Lock
	public boolean setlock(boolean lock) {
		this.lock = lock;
		return lock; 
		} {

	//Method for Roll
	for (int x=0;x<dice.length();x++) {
			Random r=new Random();
			int randomNumber=r.nextInt(dice.length());
			System.out.println("The number is "+randomNumber);
		}
	}
}




