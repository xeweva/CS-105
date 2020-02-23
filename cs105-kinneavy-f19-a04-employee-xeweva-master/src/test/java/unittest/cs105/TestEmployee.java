package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestEmployee {
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
	public void checkName() throws Exception {
		Employee e = new Employee("Jose Martinez", 10000);

		assertEquals("Name must match name given in constructor.", "Jose Martinez", e.getName());

		totalScore += 2;
	}

	@Test
	public void checkSalary() throws Exception {
		Employee e = new Employee("Jose Martinez", 10000);

		assertEquals("Name must match name given in constructor.", 10000, e.getSalary(), 0.01);

		totalScore += 2;
	}

	@Test
	public void checkRaise() throws Exception {
		Employee e = new Employee("Jose Martinez", 10000);

		assertEquals("Name must match name given in constructor.", 10000, e.getSalary(), 0.01);
		totalScore += 2;

		e.raiseSalary(17);

		assertEquals("Salary not raised appropriately.", 11700, e.getSalary(), 0.01);

		totalScore += 4;
	}

}
