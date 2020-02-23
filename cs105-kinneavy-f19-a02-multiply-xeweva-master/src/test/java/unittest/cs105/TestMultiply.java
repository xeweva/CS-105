package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestMultiply {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 10;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functioning scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf("The assignment is worth a total of %d where the remainder of %d %s\n", maximumAssignmentScore,
				difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Test
	public void testMultiplyByTwo() throws Exception {
		Multiply multiply = new Multiply();

		assertEquals("Answer should be 6.", 6, multiply.byTwo(3));
		totalScore += 4;
	}

	@Test
	public void testGetProduct() throws Exception {
		Multiply multiply = new Multiply();

		assertEquals("Answer should be 162.", 162, multiply.getProduct(54, 3));
		totalScore += 4;
	}
}
