package workshop01;

public class Grade {

	public String withScore(int score) {
		if (score == 70) {
			return "B";
		} else if (checkGradeC(score)) {
			return "C";
		} else if (score == 50) {
			return "D";
		} else if (score == 40) {
			return "F";
		}
		return "A";
	}

	private boolean checkGradeC(int score) {
		return score == 60;
	}

}
