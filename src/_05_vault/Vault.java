package _05_vault;

public class Vault {
	public Vault(int secretCode)
	{
		this.secretCode = secretCode;
	}
	public boolean tryCode(int guess)
	{
		if (guess == secretCode)
		{
			return true;
		
		}
		else
		{
			return false;
		}
	}
	int secretCode;
}

