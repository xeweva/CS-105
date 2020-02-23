package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestResistorDecoder {
	private static final int maximumScore = 12;
	private static final int maximumAssignmentScore = 25;
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
	public void testOhms() throws IOException {
		ResistorDecoder r = new ResistorDecoder();

		String[] resistor0 = { "Black", "Brown", "Black", "Gold" };
		assertEquals("Check output string.", "1Ω, ±5%", r.decodeResistor(resistor0));
		totalScore += 1;

		String[] resistor1 = { "Brown", "Black", "Black", "Silver" };
		assertEquals("Check output string.", "10Ω, ±10%", r.decodeResistor(resistor1));
		totalScore += 1;

		String[] resistor2 = { "Brown", "Violet", "Brown", "Green" };
		assertEquals("Check output string.", "170Ω, ±0.5%", r.decodeResistor(resistor2));
		totalScore += 1;

		String[] resistor3 = { "White", "White", "Brown", "Blue" };
		assertEquals("Check output string.", "990Ω, ±0.25%", r.decodeResistor(resistor3));
		totalScore += 1;
	}

	@Test
	public void testKOhms() throws IOException {
		ResistorDecoder r = new ResistorDecoder();

		String[] resistor0 = { "Yellow", "Violet", "Red", "Violet" };
		assertEquals("Check output string.", "4.7KΩ, ±0.1%", r.decodeResistor(resistor0));
		totalScore += 1;

		String[] resistor1 = { "Brown", "Black", "Red", "Gray" };
		assertEquals("Check output string.", "1KΩ, ±10%", r.decodeResistor(resistor1));
		totalScore += 1;

		String[] resistor2 = { "Brown", "Green", "Orange", "None" };
		assertEquals("Check output string.", "15KΩ, ±20%", r.decodeResistor(resistor2));
		totalScore += 1;

		String[] resistor3 = { "Yellow", "Blue", "Yellow", "Silver" };
		assertEquals("Check output string.", "460KΩ, ±10%", r.decodeResistor(resistor3));
		totalScore += 1;
	}

	@Test
	public void testMOhms() throws IOException {
		ResistorDecoder r = new ResistorDecoder();

		String[] resistor0 = { "Brown", "Red", "Green", "Green" };
		assertEquals("Check output string.", "1.2MΩ, ±0.5%", r.decodeResistor(resistor0));
		totalScore += 1;

		String[] resistor1 = { "Red", "Brown", "Green", "Green" };
		assertEquals("Check output string.", "2.1MΩ, ±0.5%", r.decodeResistor(resistor1));
		totalScore += 1;

		String[] resistor2 = { "Orange", "Red", "Blue", "Green" };
		assertEquals("Check output string.", "32MΩ, ±0.5%", r.decodeResistor(resistor2));
		totalScore += 1;

		String[] resistor3 = { "Brown", "Black", "Violet", "Brown" };
		assertEquals("Check output string.", "100MΩ, ±1%", r.decodeResistor(resistor3));
		totalScore += 1;
	}

}
