package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestReverseWord {
	private static final int maximumScore = 10;
	private static final int maximumAssignmentScore = 15;
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
	public void testBlank() throws IOException {
		ReverseWord rw = new ReverseWord();

		assertEquals("Should be blank.", "", rw.getWord());
		assertEquals("Should be blank.", "", rw.getReversedWord());

		totalScore += 2;
	}

	@Test
	public void testSameWord() throws IOException {
		ReverseWord rw = new ReverseWord();

		rw.setWord("Supercalifragilisticexpialidocious");

		assertEquals("Need to return the same word as what was set.", "Supercalifragilisticexpialidocious",
				rw.getWord());
		totalScore += 1;

		rw.getReversedWord();

		assertEquals("Need to return the same word as what was set.", "Supercalifragilisticexpialidocious",
				rw.getWord());

		totalScore += 2;
	}

	@Test
	public void testRevesedWords() throws IOException {
		ReverseWord rw = new ReverseWord();

		rw.setWord("a");

		assertEquals("Need to return the same word as what was set.", "a", rw.getReversedWord());

		totalScore += 1;

		rw.setWord("abba");

		assertEquals("Need to return the same word as what was set.", "abba", rw.getReversedWord());

		totalScore += 2;

		rw.setWord("Supercalifragilisticexpialidocious");

		assertEquals("Need to return the reversed word.", "suoicodilaipxecitsiligarfilacrepuS", rw.getReversedWord());

		totalScore += 2;

	}
}
