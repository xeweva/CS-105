package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import org.junit.*;

import edu.sbcc.cs105.*;

public class TestTemperatureStats {
	private static final String CELSIUS = "C";
	private static final String FAHRENHEIT = "F";
	
	private static final int maximumScore = 10;
	private static final int maximumAssignmentScore = 15;
	private static int totalScore;

	private TemperatureStats ts;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		out.printf("Your program's functionality scores %d out of %d.\n\n",
				totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		out.printf(
				"The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		out.println("comes from grading related to documentation, algorithms, and other");
		out.println("criteria.");
	}

	@Before
	public void setUp() {
		
		this.ts = new TemperatureStats(CELSIUS);
		ts.addTemperature(new TemperatureReading(0, CELSIUS));
		ts.addTemperature(new TemperatureReading(100, CELSIUS));
		ts.addTemperature(new TemperatureReading(73, FAHRENHEIT));
		ts.addTemperature(new TemperatureReading(90, FAHRENHEIT));
		ts.addTemperature(new TemperatureReading(120, CELSIUS));
		ts.addTemperature(new TemperatureReading(32, FAHRENHEIT));
		ts.addTemperature(new TemperatureReading(45, FAHRENHEIT));
		ts.addTemperature(new TemperatureReading(80, FAHRENHEIT));
	
	}

	@After
	public void tearDown() {
		this.ts = null;
	}

	@Test
	public void testTemperatureReading(){
		
		TemperatureReading testObject;
		double result;
				
		
		try {
			
			// Check celsius WITH NO CONVERSION
			testObject = new TemperatureReading(50, CELSIUS);
			result = testObject.getTemperature(CELSIUS);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 50, result, 0.1);
			
			// Check fahrenheith WITH NO CONVERSION
			testObject = new TemperatureReading(50, FAHRENHEIT);
			result = testObject.getTemperature(FAHRENHEIT);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 50, result, 0.1);
			
			/*
			 * Celsius to Fahrenheit conversions
			 *  
			 */
			
			// Check C to F at boundary 0
			testObject = new TemperatureReading(0, CELSIUS);
			result = testObject.getTemperature(FAHRENHEIT);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 32, result, 0.1);

			// Check C to F at boundary 100
			testObject = new TemperatureReading(100, CELSIUS);
			result = testObject.getTemperature(FAHRENHEIT);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 212, result, 0.1);

			// Check C to F at negative
			testObject = new TemperatureReading(-10, CELSIUS);
			result = testObject.getTemperature(FAHRENHEIT);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 14, result, 0.1);
	
			// Check C to F at > 100
			testObject = new TemperatureReading(150, CELSIUS);
			result = testObject.getTemperature(FAHRENHEIT);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 302, result, 0.1);

			
			// Check C to F at intermediate
			testObject = new TemperatureReading(50, CELSIUS);
			result = testObject.getTemperature(FAHRENHEIT);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 122, result, 0.1);

			totalScore += 1;
			
			/*
			 * Fahrenheit to Celsius conversions
			 *  
			 */
			
			// Check F to C at boundary 32
			testObject = new TemperatureReading(32, FAHRENHEIT);
			result = testObject.getTemperature(CELSIUS);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 0, result, 0.1);

			testObject = new TemperatureReading(212, FAHRENHEIT);
			result = testObject.getTemperature(CELSIUS);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 100, result, 0.1);
			
			testObject = new TemperatureReading(-13, FAHRENHEIT);
			result = testObject.getTemperature(CELSIUS);
			assertEquals("Temperature should be same as constructed when scale doesn't change", -25, result, 0.1);
			
			testObject = new TemperatureReading(248, FAHRENHEIT);
			result = testObject.getTemperature(CELSIUS);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 120, result, 0.1);
			
			testObject = new TemperatureReading(50, FAHRENHEIT);
			result = testObject.getTemperature(CELSIUS);
			assertEquals("Temperature should be same as constructed when scale doesn't change", 10, result, 0.1);
			
		
			totalScore += 1;

			
		} catch (Exception e) {
			assertFalse(e.getMessage(), false);
		}
		
		
	}
	
	@Test
	public void testMaximum() throws Exception {
		
		assertEquals("Maximum not correct.", 120.0, ts.getMaximumTemperature(),
				0.1);
		
		ts.setScale(FAHRENHEIT);
		assertEquals("Maximum not correct.", 248.0, ts.getMaximumTemperature(),
				0.1);
		
		ts.setScale(CELSIUS);
		totalScore += 1;
	}

	@Test
	public void testMinimum() throws Exception {
		
		assertEquals("Minimum not correct.", 0.0, ts.getMinimumTemperature(),
				0.1);
		
		ts.setScale(FAHRENHEIT);
		assertEquals("Maximum not correct.", 32.0, ts.getMinimumTemperature(),
				0.1);
		
		ts.setScale(CELSIUS);
		totalScore += 2;
	}

	@Test
	public void testAverage() throws Exception {
		
		
		assertEquals("Average not correct.", 38.61, ts.getAverageTemperature(),
				0.1);
		
		ts.setScale(FAHRENHEIT);
		assertEquals("Maximum not correct.", 101.5, ts.getAverageTemperature(),
				0.1);
		
		ts.setScale(CELSIUS);
		totalScore += 2;
	}

	@Test
	public void testClear() throws Exception {
		
		/*
		 * assertEquals("Maximum not correct.", 120.0, ts.getMaximumTemperature(), 0.1);
		 * assertEquals("Minimum not correct.", 0.0, ts.getMinimumTemperature(), 0.1);
		 * assertEquals("Average not correct.", 67.5, ts.getAverageTemperature(), 0.1);
		 */

		ts.clearTemperatures();

		
		
		ts.addTemperature(new TemperatureReading(10, CELSIUS));
		ts.addTemperature(new TemperatureReading(110, CELSIUS));
		ts.addTemperature(new TemperatureReading(60, CELSIUS));
		

		assertEquals("Maximum not correct.", 110.0, ts.getMaximumTemperature(),
				0.1);
		assertEquals("Minimum not correct.", 10.0, ts.getMinimumTemperature(),
				0.1);
		assertEquals("Average not correct.", 60.0, ts.getAverageTemperature(),
				0.1);

		totalScore += 3;
	}
}
