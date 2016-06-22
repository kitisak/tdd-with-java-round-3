package workshop01;

public class Range {

	public String format(String string) {
		return "12345";
	}

	public boolean startWithInclusive(String input) {
		return input.startsWith("[");
	}

	public boolean endWithInclusive(String input) {
		return input.endsWith("]");
	}

	public int getStartNumber(String input) {
		int number = input.charAt(1) - 48;
		return startWithInclusive(input)? number : number+1;
	}

	public int getEndNumber(String input) {
		int number = input.charAt(3) - 48;
		return endWithInclusive(input)? number : number-1;
	}

}
