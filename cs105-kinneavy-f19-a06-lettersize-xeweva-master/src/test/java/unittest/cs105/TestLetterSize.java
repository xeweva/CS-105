package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestLetterSize {
	private static final int maximumScore = 10;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf("The assignment is worth a total of %d where the remainder of %d %s\n", maximumAssignmentScore,
				difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Test
	public void checkWidth() throws Exception {
		LetterSize ls = new LetterSize(8.5, 11.0);
		assertEquals("Width must be around 215.9", 215.90, ls.getWidthInMillimeters(), 0.05);

		ls = new LetterSize(12.0, 12.0);
		assertEquals("Width must be around 304.80", 304.80, ls.getWidthInMillimeters(), 0.05);

		ls = new LetterSize(0.0, 0.0);
		assertEquals("Width must be around 0.0", 0.0, ls.getWidthInMillimeters(), 0.05);

		totalScore += 5;
	}

	@Test
	public void checkHeight() throws Exception {
		LetterSize ls = new LetterSize(8.5, 11.0);
		assertEquals("Height must be around 279.4", 279.40, ls.getHeightInMillimeters(), 0.05);

		ls = new LetterSize(12.0, 12.0);
		assertEquals("Height must be around 304.80", 304.80, ls.getHeightInMillimeters(), 0.05);

		ls = new LetterSize(0.0, 0.0);
		assertEquals("Height must be around 0.0", 0.0, ls.getHeightInMillimeters(), 0.05);

		totalScore += 5;
	}

}
