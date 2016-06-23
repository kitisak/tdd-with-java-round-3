package day2;

public class Buzz implements MyRule {
	
	public boolean isValid(int input) {
		return input % 5 == 0;
	}
	
	public String getResult() {
		return "Buzz";
	}

}
