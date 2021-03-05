package _06_duck;

public class Dog {
	String favoriteActivity;
	int numberofToys;
	Dog(String favoriteActivity, int numberOfToys) {
		this.favoriteActivity = favoriteActivity;
		this.numberofToys = numberOfToys;
	}
	public void chaseBall() {
		System.out.println("The dog chases after the ball.");
	}
}
