package day2;

public class FB implements MyRule {
	
	public boolean isValid(int input) {
		return input % 15 == 0;
	}
	
	public String getResult() {
		return "FizzBuzz";
	}

}
