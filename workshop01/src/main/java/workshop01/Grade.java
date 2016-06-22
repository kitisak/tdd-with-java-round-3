package workshop01;

public class Grade {

	public String withScore(int score) {
		if (score == 70) {
			return "B";
		} else if (score == 60) {
			return "C";
		} else if (score == 50) {
			return "D";
		} else if (score == 40) {
			return "F";
		}
		return "A";
	}

}
