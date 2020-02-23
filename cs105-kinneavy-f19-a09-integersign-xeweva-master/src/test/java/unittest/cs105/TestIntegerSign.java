package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestIntegerSign {
	public static String[] requiredMethods = new String[] { "isZero", "isPositive", "isNegative" };

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
	public void testMethodPresence() throws Exception {
		IntegerSign integerSign = new IntegerSign(100);
		Method[] methods = integerSign.getClass().getMethods();
		ArrayList<String> methodList = new ArrayList<String>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}

		for (String method : requiredMethods) {
			assertTrue("\"" + method + "\"" + " not implemented.", methodList.contains(method));
		}

		totalScore += 5;
	}

	@Test
	public void testIntegerSignSigns() throws Exception {
		IntegerSign integerSign = new IntegerSign(42);
		assertFalse("42 is not zero", integerSign.isZero());
		assertTrue("42 is positive", integerSign.isPositive());
		assertFalse("42 is not negative", integerSign.isNegative());

		integerSign = new IntegerSign(-42);
		assertFalse("-42 is not zero", integerSign.isZero());
		assertFalse("-42 is positive", integerSign.isPositive());
		assertTrue("-42 is not negative", integerSign.isNegative());

		integerSign = new IntegerSign(0);
		assertTrue("0 is zero", integerSign.isZero());
		assertTrue("0 is positive", integerSign.isPositive());
		assertFalse("0 is not negative", integerSign.isNegative());

		totalScore += 5;
	}

}
