package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;
import edu.sbcc.cs105.*;

public class TestEraDate {
	private static final int maximumScore = 11;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;
	
	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.%n%n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf("The assignment is worth a total of %d where the remainder of %d %s%n", maximumAssignmentScore,
				difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	

	@Test
	public void testIso8601() {
		EraDate graceHopperBirthday = new EraDate(1906, 12, 9);
		assertEquals("Birthdays should match exactly", "1906-12-09", graceHopperBirthday.getIso8601Date());
		
		EraDate bigBirdBirthday = new EraDate(1991, 3, 15);
		assertEquals("Birthdays should match exactly", "1991-03-15", bigBirdBirthday.getIso8601Date());
		
		EraDate newBeginning = new EraDate(1905, 1, 1);
		assertEquals("Birthdays should match exactly", "1905-01-01", newBeginning.getIso8601Date());

		totalScore += 1;

	}

	/**
	 * Returns the Japanese era for the internal date structure. We use the
	 * following dates: 
	 * Meiji - 9/8/1868 - 7/30/1912 
	 * Taisho - 8/1/1912 - 12/25/1926 
	 * Showa - 12/26/1926 - 1/7/1989 
	 * Heisei - 1/8/1989 - 4/30/2019 
	 * Reiwa - 5/1/2109 - Present
	 * 
	 * Note: These dates are not the actual dates since those dates overlap by a
	 * day
	 *
	 */
	@Test
	public void testJapaneseMeijiEra() {

		EraDate date = new EraDate(1868, 1, 25);	
		assertEquals("Era should be Meiji", "Meiji", date.getJapaneseEraName());

		
		date = new EraDate(1912, 7, 30);		
		assertEquals("Check your months to make sure you are subtracting 1 in the constructor.", 
				"Meiji",
				date.getJapaneseEraName());

		
		date = new EraDate(1900, 1, 1);	
		assertEquals("Check your months to make sure you are subtracting 1 in the constructor.", 
				"Meiji", 
				date.getJapaneseEraName());

		totalScore += 2;
	}

	/**
	 * Returns the Japanese era for the internal date structure. We use the
	 * following dates: 
	 * Meiji - 9/8/1868 - 7/30/1912 
	 * Taisho - 8/1/1912 - 12/25/1926 
	 * Showa - 12/26/1926 - 1/7/1989 
	 * Heisei - 1/8/1989 - 4/30/2019 
	 * Reiwa - 5/1/2109 - Present
	 * 
	 * Note: These dates are not the actual dates since those dates overlap by a
	 * day
	 *
	 */
	@Test
	public void testJapaneseTaishoEra() {
		
		EraDate date = new EraDate(1912, 8, 1);		
		assertEquals("Check the month in the constructor", 
				"Taisho", date.getJapaneseEraName());

		
		date = new EraDate(1926, 12, 25);		
		assertEquals("Check the month in the constructor", 
				"Taisho", date.getJapaneseEraName());

		
		date = new EraDate(1922, 1, 1);
		assertEquals("Check the month in the constructor", 
				"Taisho", date.getJapaneseEraName());
		totalScore += 2;
	}

	/**
	 * Returns the Japanese era for the internal date structure. We use the
	 * following dates: 
	 * Meiji - 9/8/1868 - 7/30/1912 
	 * Taisho - 8/1/1912 - 12/25/1926 
	 * Showa - 12/26/1926 - 1/7/1989 
	 * Heisei - 1/8/1989 - 4/30/2019 
	 * Reiwa - 5/1/2109 - Present
	 * 
	 * Note: These dates are not the actual dates since those dates overlap by a
	 * day
	 *
	 */
	@Test
	public void testJapaneseShowaEra() {
		EraDate date = new EraDate(1926, 12, 26);		
		assertEquals("Check the month in the constructor", 
				"Showa", date.getJapaneseEraName());

		
		date = new EraDate(1989, 1, 7);	
		assertEquals("Check the month in the constructor", 
				"Showa", date.getJapaneseEraName());;

		
		date = new EraDate(1950, 1, 1);
		assertEquals("Check the month in the constructor", 
				"Showa", date.getJapaneseEraName());
		totalScore += 2;
	}

	/**
	 * Returns the Japanese era for the internal date structure. We use the
	 * following dates: 
	 * Meiji - 9/8/1868 - 7/30/1912 
	 * Taisho - 8/1/1912 - 12/25/1926 
	 * Showa - 12/26/1926 - 1/7/1989 
	 * Heisei - 1/8/1989 - 4/30/2019 
	 * Reiwa - 5/1/2109 - Present
	 * 
	 * Note: These dates are not the actual dates since those dates overlap by a
	 * day
	 *
	 */
	@Test
	public void testJapaneseHeiseiEra() {
		
		EraDate date = new EraDate(1989, 1, 8);		
		assertEquals("Check the month in the constructor", 
				"Heisei", date.getJapaneseEraName());

		
		date = new EraDate(2014, 1, 1);
		assertEquals("Check the month in the constructor", 
				"Heisei", date.getJapaneseEraName());
		totalScore += 2;
	}

	/**
	 * Returns the Japanese era for the internal date structure. We use the
	 * following dates: 
	 * Meiji - 9/8/1868 - 7/30/1912 
	 * Taisho - 8/1/1912 - 12/25/1926 
	 * Showa - 12/26/1926 - 1/7/1989 
	 * Heisei - 1/8/1989 - 4/30/2019 
	 * Reiwa - 5/1/2109 - Present
	 * 
	 * Note: These dates are not the actual dates since those dates overlap by a
	 * day
	 *
	 */
	@Test
	public void testJapaneseReiwaEra() {
		
		EraDate date = new EraDate(2019, 5, 1);		
		assertEquals("Check the month in the constructor", 
				"Reiwa", date.getJapaneseEraName());

		
		date = new EraDate(2019, 10, 1);
		assertEquals("Check the month in the constructor", 
				"Reiwa", date.getJapaneseEraName());
		totalScore += 1;
	}

	/**
	 * Returns the Japanese era for the internal date structure. We use the
	 * following dates: 
	 * Meiji - 9/8/1868 - 7/30/1912 
	 * Taisho - 8/1/1912 - 12/25/1926 
	 * Showa - 12/26/1926 - 1/7/1989 
	 * Heisei - 1/8/1989 - 4/30/2019 
	 * Reiwa - 5/1/2109 - Present
	 * 
	 * Note: These dates are not the actual dates since those dates overlap by a
	 * day
	 *
	 */
	@Test
	public void testOtherEra() {
		
		EraDate date = new EraDate(497, 12, 31);		
		assertEquals("Check the month in the constructor", 
				"Precedes known Japanese Eras", date.getJapaneseEraName());

	
		date = new EraDate(498, 01, 01);
		assertEquals("Check the month in the constructor", 
				"Other Japanese Era", date.getJapaneseEraName());

		date = new EraDate(1868, 01, 24);		
		assertEquals("Check the month in the constructor", 
				"Other Japanese Era", date.getJapaneseEraName());
			
		totalScore += 1;
	}
}
