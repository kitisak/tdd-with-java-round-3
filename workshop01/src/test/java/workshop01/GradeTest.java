package workshop01;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GradeTest {
	
	@Parameters
	public static Collection<Object[]> xxx() {
		return Arrays.asList(new Object[][]{
				{80, "A"},
				{70, "B"},
				{60, "C"},
				{50, "D"},
				{40, "F"}
		});
	}
	
	private int score;
	private String expectedGrade;

	public GradeTest(int score, String expectedGrade) {
		this.score = score;
		this.expectedGrade = expectedGrade;
	}

	Grade grade = new Grade();
	
	@Test public void
	convert_score_to_grade() {
		
		assertEquals(
				String.format("%d=>%s", score, expectedGrade),
				expectedGrade, 
				grade.withScore(score));
	}
	

}
