package customexception;

public class Atmsimulator {
	void withdraw(double amount) {
		if(amount>40000) {
			throw new DaylimitException("User your day limit exceeds ");
		}
	}

}
