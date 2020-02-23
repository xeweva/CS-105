package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestGrade {
	public static String[] requiredMethods = new String[] { "getLetterGrade",
			"getNumericGrade" };

	public static String[] excludedMethods = new String[] { "setLetterGrade",
			"setNumericGrade" };

	private static final int maximumScore = 10;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your estimated score is %d out of %d.\n\n", totalScore,
				maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf(
				"The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Test
	public void testMethods() {

		Grade studentGrade = new Grade("A+");
		Method[] methods = studentGrade.getClass().getMethods();
		ArrayList<String> methodList = new ArrayList<String>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}

		for (String method : requiredMethods) {
			assertTrue("\"" + method + "\"" + " not implemented.",
					methodList.contains(method));
		}

		for (String method : excludedMethods) {
			assertFalse("\"" + method + "\"" + " should not be implemented.",
					methodList.contains(method));
		}

		totalScore += 2;
	}

	@Test
	public void testLetterGrade() throws Exception {
		Grade studentGrade = new Grade("A+");
		assertEquals("Grade should be \"A+\"", "A+",
				studentGrade.getLetterGrade());
		totalScore += 2;
	}

	@Test
	public void testNumericGrade() throws Exception {
		Grade studentGrade = new Grade("B+");
		
		double result = studentGrade.getNumericGrade();
		
		int compareResult = Double.compare(result, 3.3d);
	
		assertTrue("Numeric grade should be 3.3, but was " + result, compareResult == 0 );
		totalScore += 2;
	}

	@Test
	public void testNumericGradeExtremes() throws Exception {
		Grade studentGrade = new Grade("A+");
		assertTrue("Grade should be \"4.0\"",
				4.0 == studentGrade.getNumericGrade());

		studentGrade = new Grade("F-");
		assertTrue("Grade should be \"0.0\"",
				0.0 == studentGrade.getNumericGrade());

		studentGrade = new Grade("F+");
		assertTrue("Grade should be \"0.0\"",
				0.0 == studentGrade.getNumericGrade());

		totalScore += 4;
	}
	
	@Test
	public void testInvalidGrades() throws Exception{
		//F+, G
	}
}
