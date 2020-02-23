package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestIntegerPairs {
	public static String[] requiredMethods = new String[] { "setPairString", "hasTwoPairs" };

	private static final int maximumScore = 11;
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
	public void testMethodPresence() throws Exception {
		IntegerPairs ip = new IntegerPairs();
		Method[] methods = ip.getClass().getMethods();
		ArrayList<String> methodList = new ArrayList<String>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}

		for (String method : requiredMethods) {
			assertTrue("\"" + method + "\"" + " not implemented.", methodList.contains(method));
		}

		totalScore += 1;
	}

	@Test
	public void testNewObject() throws Exception {
		IntegerPairs ip = new IntegerPairs();
		assertFalse("Newly constructed IntegerPairs object should not have two pairs.", ip.hasTwoPairs());

		totalScore += 1;
	}
	
	@Test
	public void testNonIntegerPairs() throws Exception {
		IntegerPairs ip = new IntegerPairs();
		ip.setPairString("A B A B");
		assertFalse("Fails on non-integer pairs", ip.hasTwoPairs());

		totalScore += 1;
	}

	@Test
	public void testIntegerPairCombination() throws Exception {
		IntegerPairs ip = new IntegerPairs();

		ip.setPairString("1 2 2 1");
		assertTrue("Fails on 1 2 2 1", ip.hasTwoPairs());
		totalScore += 2;

		ip.setPairString("1 2 3 4");
		assertFalse("Fails on 1 2 3 4", ip.hasTwoPairs());
		totalScore += 2;
		
		ip.setPairString("1 2 1 4");
		assertFalse("Fails on 1 2 3 4", ip.hasTwoPairs());
		totalScore += 2;

		ip.setPairString("2 2 2 2");
		assertTrue("Fails on 2 2 2 2", ip.hasTwoPairs());
		totalScore += 2;
	}

}
