package day2;

public class Fizz implements MyRule {
	
	public boolean isValid(int input) {
		return input % 3 == 0;
	}
	
	public String getResult() {
		return "Fizz";
	}

}
