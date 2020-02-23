package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestAlignedNumbers {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	private PrintStream stringStream;
	private ByteArrayOutputStream baos;

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

	@Before
	public void setUp() {
		this.baos = new ByteArrayOutputStream();
		this.stringStream = new PrintStream(baos);		
	}

	
	@Test
	public void testIndividualStats() throws Exception {
		StatisticsCalculator an = new StatisticsCalculator();

		an.setFirstNumber(4);
		an.setSecondNumber(7);
		assertEquals("Sum of 4 and 7 should equal 11", 11, an.getSum());
		assertEquals("Difference of 4 and 7 should equal -3", -3, an.getDifference(), 0.01);
		assertEquals("Average of 4 and 7 should equal 5.5", 5.5, an.getAverage(), 0.01);
		assertEquals("Product of 4 and 7 should equal 28", 28, an.getProduct(), 0.01);
		assertEquals("Distance of 4 and 7 should equal 3", 3, an.getDistance());
		assertEquals("Maximum of 4 and 7 should equal 7", 7, an.getMaximum());
		assertEquals("Minimum of 4 and 7 should equal 4", 4, an.getMinimum());

		totalScore += 4;

	}

	@Test
	public void testStatPrintout() throws Exception {
		StatisticsCalculator an = new StatisticsCalculator();
		an.setFirstNumber(20);
		an.setSecondNumber(25);
		
		AlignedNumbersReport report = new AlignedNumbersReport(stringStream, an);
		report.print();

		System.out.flush();

		StringBuilder answer = new StringBuilder();
		answer.append(String.format("%s%n", "Sum:                        45"));
		answer.append(String.format("%s%n", "Average:                    22.50"));
		answer.append(String.format("%s%n", "Difference:                 -5"));
		answer.append(String.format("%s%n", "Product:                   500"));
		answer.append(String.format("%s%n", "Distance:                    5"));
		answer.append(String.format("%s%n", "Maximum:                    25"));
		answer.append(String.format("%s%n", "Minimum:                    20"));

		String expected = answer.toString();
		String actual = this.baos.toString();

		assertEquals("The strings need to match.", expected, actual);

		this.baos.reset();

		totalScore += 4;
	}

}
