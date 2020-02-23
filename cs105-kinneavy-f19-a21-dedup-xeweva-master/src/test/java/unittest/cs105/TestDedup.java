package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestDedup {
	private static final int maximumScore = 12;
	private static final int maximumAssignmentScore = 20;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() throws IOException {
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
	public void testFreshObject() throws Exception {
		Dedup d = new Dedup("large.txt");

		assertTrue("There should be none of any number after creating a fresh object.", d.howMany(0) == 0);

		totalScore += 2;
	}

	@Test
	public void testHowMany() throws Exception {
		Dedup d = new Dedup("large.txt");

		assertEquals("Should only be one 308 in the input file.", 1, d.howMany(308));

		totalScore += 2;

		assertEquals("There should be four 639s in the input file.", 4, d.howMany(639));

		totalScore += 2;
	}

	@Test
	public void testReturnUnique() throws Exception {
		Dedup d = new Dedup("large.txt");
		ArrayList<Integer> unique = d.returnUnique();

		assertEquals("Size of the unique values should be 634.", 634, unique.size());

		totalScore += 2;

		assertEquals("Wrong value at index 200.", 324, (int) unique.get(200));

		totalScore += 2;

		assertEquals("Wrong value at index 0.", 1, (int) unique.get(0));

		assertEquals("Wrong value at index 633.", 998, (int) unique.get(633));

		totalScore += 2;
	}

}
