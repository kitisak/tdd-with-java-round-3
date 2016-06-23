package day2;

public class Wow implements MyRule {
	
	public boolean isValid(int input) {
		return input % 7 == 0;
	}
	
	public String getResult() {
		return "Wow";
	}

}
