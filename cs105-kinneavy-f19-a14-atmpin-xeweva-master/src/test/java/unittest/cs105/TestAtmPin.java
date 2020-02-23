package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestAtmPin {
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
	public void testGoodPin() {
		
		AtmPin ap = new AtmPin("4213");

		assertTrue("Should accept 4213.", ap.verifyPinCode("4213"));

		totalScore += 2;
	}

	@Test
	public void testBadPin() {
		
		AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept 1337.", ap.verifyPinCode("1337"));

		totalScore += 2;
	}

	@Test
	public void testTooManyAttempts() {
		
		AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertTrue("Blocked. Too many attempts.", ap.isAccountLocked());

		totalScore += 2;
	}

	@Test
	public void testTooManyAttemptsFollowedByGoodPassword() {
		
		AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertTrue("Blocked. Too many attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password because it should be blocked.", ap.verifyPinCode("4213"));
		assertTrue("Good password entered.", ap.lastAttemptFailed());
		assertTrue("Blocked. Too many attempts.", ap.isAccountLocked());

		totalScore += 2;
	}

	@Test
	public void testResetBlocked() {
		
		AtmPin ap = new AtmPin("4213");

		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered.", ap.lastAttemptFailed());
		assertFalse("Not blocked yet. Not enough attempts.", ap.isAccountLocked());
		assertFalse("Should not accept password.", ap.verifyPinCode("1337"));
		assertTrue("Bad password entered..", ap.lastAttemptFailed());
		assertTrue("Should be blocked.", ap.isAccountLocked());
		assertFalse("Should not accept password because it should be blocked.", ap.verifyPinCode("4213"));
		assertTrue("Good password entered.", ap.lastAttemptFailed());
		assertTrue("Blocked. Too many attempts.", ap.isAccountLocked());

		ap.resetFailedAttemptCounter();
		assertTrue("Should accept password after reset.", ap.verifyPinCode("4213"));
		assertFalse("Good password entered.", ap.lastAttemptFailed());
		assertFalse("Blocked. Too many attempts.", ap.isAccountLocked());

		totalScore += 2;
	}
}
