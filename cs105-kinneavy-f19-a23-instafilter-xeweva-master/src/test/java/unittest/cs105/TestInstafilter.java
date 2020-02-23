//Implemented code changes to blur test 
//Alex Dinkelacker
package unittest.cs105;

import static java.lang.System.*;
import static org.junit.Assert.*;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

import org.junit.*;

import edu.sbcc.cs105.*;
import sbccutils.*;

public class TestInstafilter {
	private static final int maximumScore = 31;
	private static final int maximumAssignmentScore = 45;
	private static int totalScore;

	private BufferedImage fakeImage;

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
		fakeImage = new BufferedImage(100, 200, BufferedImage.TYPE_INT_ARGB);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testGrayScale() throws Exception {
		PixelArray pa = new PixelArray(fakeImage);
		pa.fillArray(new Color(60, 0, 0));

		GrayScale gs = new GrayScale();
		PixelArray gsPostFilter = gs.filter(pa);
		Pixel p = new Pixel(20, 20, 20);

		assertEquals(p, gsPostFilter.getPixel(0, 0));
		assertEquals(p, gsPostFilter.getPixel(10, 10));
		totalScore += 2;

		assertEquals(p, gsPostFilter.getPixel(40, 99));
		totalScore += 2;

		assertEquals(p, gsPostFilter.getPixel(pa.getHeight() - 1, pa.getWidth() - 1));
		totalScore += 2;

	}

	@Test
	public void testSepia() throws Exception {
		PixelArray pa = new PixelArray(fakeImage);
		pa.fillArray(new Color(80, 100, 220));

		Sepia s = new Sepia();
		PixelArray sPostFilter = s.filter(pa);
		Pixel p = new Pixel(150, 133, 104);

		assertEquals(p, sPostFilter.getPixel(0, 0));
		assertEquals(p, sPostFilter.getPixel(10, 10));
		totalScore += 3;

		assertEquals(p, sPostFilter.getPixel(40, 99));
		totalScore += 3;

		assertEquals(p, sPostFilter.getPixel(pa.getHeight() - 1, pa.getWidth() - 1));
		totalScore += 3;
	}

	@Test
	public void testBlur() throws Exception {

        BufferedImage image;
       // try {
            image  = ImageIO.read(new File("sbcc.jpg"));
		PixelArray pa = new PixelArray(image);

		Blur b = new Blur();
		PixelArray bPostFilter = b.filter(pa);

		Pixel p = new Pixel(98, 123, 163);
		assertEquals(p, bPostFilter.getPixel(0, 0));

		totalScore += 4;

		p = new Pixel(103, 122, 160);
		assertEquals(p, bPostFilter.getPixel(10, 10));
		totalScore += 4;

		p = new Pixel(126, 130, 127);
		assertEquals(p, bPostFilter.getPixel(40, 99));
		totalScore += 4;

		p = new Pixel(27, 28, 22);
		assertEquals(p, bPostFilter.getPixel(pa.getHeight() - 1, pa.getWidth() - 1));
		totalScore += 4;
        //} catch (Exception e) {
           // System.out.println(e.getMessage());
        //}
        

	}
}
