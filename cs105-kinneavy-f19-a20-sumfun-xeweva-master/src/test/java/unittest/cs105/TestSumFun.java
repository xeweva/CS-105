package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestSumFun {
	private static final int maximumScore = 14;
	private static final int maximumAssignmentScore = 20;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {

		if (totalScore == maximumScore) {
			out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);
		} else {
			out.printf("Your unit test score is %d out of %d (%d).\n\n", totalScore, maximumScore, totalScore
					- maximumScore);
		}

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf("The assignment is worth a total of %d where the remainder of %d %s\n", maximumAssignmentScore,
				difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Test
	public void testFreshObject() throws Exception {
		SumFun s = new SumFun();
		assertEquals("Total should be 0 after creating an object", 0, s.sumOfAllEvenNumbers());
		assertEquals("Total should be 0 after creating an object", 0, s.sumOfAllOddNumbers());

		totalScore += 2;
	}

	@Test
	public void testEvenSums() throws Exception {
		SumFun s = new SumFun();
		for (int i = 0; i < 100; i++) {
			s.addToList(i);
		}
		assertEquals("Total should be 2450", 2450, s.sumOfAllEvenNumbers());
		assertEquals("sumOfEvenNumbers(8,72) total should be 2450", 1320, s.sumOfEvenNumbers(8, 72));

		totalScore += 2;
	}

	@Test
	public void testOddSums() throws Exception {
		SumFun s = new SumFun();
		for (int i = 0; i < 850; i++) {
			s.addToList(i);
		}
		assertEquals("Total should be 180200", 180625, s.sumOfAllOddNumbers());
		assertEquals("sumOfOddNumbers(200, 642) total should be 93041", 93041, s.sumOfOddNumbers(200, 642));

		totalScore += 2;
	}

	@Test
	public void testSumOfOddDigits() throws Exception {
		SumFun s = new SumFun();
		for (int i = 1000; i < 20000; i++) {
			s.addToList(i);
		}
		assertEquals("Sum of odd digits should be ", 1, s.sumOfOddDigitsForItem(0));
		assertEquals("Sum of odd digits should be ", 4, s.sumOfOddDigitsForItem(3));
		assertEquals("Sum of odd digits should be ", 9, s.sumOfOddDigitsForItem(10007));

		totalScore += 8;
	}

}
