package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestFactors {
	private static final int maximumScore = 10;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.\n\n",
				totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf(
				"The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Test
	public void test150() {
		Factors f = new Factors(150);

		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 2, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 3, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 5, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 5, f.nextFactor());
		assertFalse("Should not have a factor", f.hasMoreFactors());
		totalScore += 3;
	}

	@Test
	public void test295() {
		Factors f = new Factors(295);

		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 5, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 59, f.nextFactor());
		assertFalse("Should not have a factor", f.hasMoreFactors());
		totalScore += 3;
	}

	@Test
	public void test30030() {
		Factors f = new Factors(30030);

		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 2, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 3, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 5, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 7, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 11, f.nextFactor());
		assertTrue("Should have a factor", f.hasMoreFactors());
		assertEquals("Factor incorrect or wrong order.", 13, f.nextFactor());
		assertFalse("Should not have a factor", f.hasMoreFactors());
		totalScore += 4;
	}
}
