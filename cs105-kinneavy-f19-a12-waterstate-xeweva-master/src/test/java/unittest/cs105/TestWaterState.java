package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestWaterState {
	private static final int maximumScore = 10;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	private static String[] testInputsC = { "-10C", "50C", "150C", "0C", "100C" };
	private static MatterState[] testResultsC = { MatterState.SOLID, MatterState.LIQUID, MatterState.GAS,
			MatterState.SOLID, MatterState.GAS };

	private static String[] testInputsF = { "-10F", "50F", "250F", "0F", "300F" };
	private static MatterState[] testResultsF = { MatterState.SOLID, MatterState.LIQUID, MatterState.GAS,
			MatterState.SOLID, MatterState.GAS };

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
	public void testC() {
		WaterState ws = new WaterState("-10C");
		assertTrue("Check", MatterState.SOLID == ws.getState());

		for (int i = 0; i < TestWaterState.testInputsC.length; i++) {
			ws = new WaterState(TestWaterState.testInputsC[i]);
			assertTrue("Check", ws.getState() == TestWaterState.testResultsC[i]);
		}
		totalScore += 5;
	}

	@Test
	public void testF() {
		WaterState ws = new WaterState("-10F");
		assertTrue("Check", MatterState.SOLID == ws.getState());

		for (int i = 0; i < TestWaterState.testInputsF.length; i++) {
			ws = new WaterState(TestWaterState.testInputsF[i]);
			assertTrue("Check", ws.getState() == TestWaterState.testResultsF[i]);
		}
		totalScore += 5;
	}
}
