package day2;

public class RuleFactory {

	public static MyRule[] create() {
		MyRule[] rules = { new FB(),new Fizz(), 
				new Buzz(), new Wow()};
		return rules;
	}

}
