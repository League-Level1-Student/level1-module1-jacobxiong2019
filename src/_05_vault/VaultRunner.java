package _05_vault;

import java.util.Random;

public class VaultRunner {
	public static void main(String[] args) {
		Random rand = new Random();
		Bond bond = new Bond();
		Vault vault = new Vault(rand.nextInt(1000000+1));
		System.out.println(bond.findCode(vault));
	}
	
}
