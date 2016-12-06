package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.GameImages;

public class GameImagesTest {
	
	GameImages test = new GameImages();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetSnake() {
		test.getSnake();
		assertEquals(test.getSnake(), test.snakePic);
	}

	@Test
	public void testGetLadder() {
		test.getLadder();
		assertEquals(test.getLadder(), test.ladderImage);
	}

	@Test
	public void testGetTwoLabel() {
		test.getTwoLabel();
		assertEquals(test.getTwoLabel(), test.pinkAndBlue);
	}

	@Test
	public void testGetThreeLabel() {
		test.getThreeLabel();
		assertEquals(test.getThreeLabel(), test.pinkGreen);
	}
	
	@Test
	public void testGUI() {
		test.GUI();
		
	}



	@Test
	public void testGet13Button() {
		test.get13Button();
		assertEquals(test.get13Button(), test.blueAndGreen);
	}
	


}
