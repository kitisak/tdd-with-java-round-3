package day2;

public class FizzBuzz {

	public String getResult(int input) {		
		MyRule[] rules = RuleFactory.create();		
		String result = String.valueOf(input);
		for (MyRule myRule : rules) {
			if (myRule.isValid(input)) {
				return myRule.getResult();
			}
		}
		return result;
	}
}
