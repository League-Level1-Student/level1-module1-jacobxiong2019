package _04_popcorn;

public class PopcornRunner {
	public static void main(String[] args) {
		Popcorn bag = new Popcorn("buttered");
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(bag);
		microwave.setTime(3);
		microwave.startMicrowave();

	}
}
