package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestLetter {
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
	public void checkWithoutBody() throws Exception {
		Letter l = new Letter("Another Person", "Person");

		
		String expectedText = String.format("Dear Person:%n%n%nSincerely,%n%nAnother Person")
			.replace("\r", "");

		String letterText = l.getText().replace("\r", "");
		assertEquals("There must be no text in the body of the letter or the actual text without a body does not match the expected text.",
				expectedText, letterText);
		
		letterText = l.getText().replace("\r", "");
		assertEquals("Calling getText a second time should return the same result.",
				expectedText, letterText);
				
		totalScore += 5;
	}

	@Test
	public void checkWithBody() throws Exception {
		Letter l = new Letter("Another Person", "Person");
		l.addLine("The quick brown fox.");
		l.addLine("Jumps over the lazy dog.");
		l.addLine("And couldn't be put back together again.");

		String expectedText = String.format(
		"Dear Person:%n%nThe quick brown fox.%nJumps over the lazy dog.%n"
				+ "And couldn't be put back together again.%n%nSincerely,%n%nAnother Person")
				.replace("\r", "");

		String letterText = l.getText().replace("\r", "");
		assertEquals("The actual letter text does not match the expected text.",
			expectedText, letterText);

		letterText = l.getText().replace("\r", "");
		assertEquals("Calling getText a second time should return the same result.",
				expectedText, letterText);
						
		totalScore += 5;
	}
}
