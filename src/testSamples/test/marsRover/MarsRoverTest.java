package marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
	
	int[][] obstacles = {{2,1},{0,2}};

	@Test
	public void move1Forward() {		
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,1,N)",mr.move("f"));
	}
	
	@Test
	public void move1Backwards() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,4,N)",mr.move("b"));
	}
	
	@Test
	public void turnRight() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,0,E)",mr.move("r"));
	}
	
	@Test
	public void turnLeft() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,0,W)",mr.move("l"));
	}
	
	@Test
	public void turnLeft3times() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,0,E)",mr.move("lll"));
	}
	
	@Test
	public void turnRight4times() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,0,N)",mr.move("rrrr"));
	}
	
	@Test
	public void rf() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(1,0,E)",mr.move("rf"));
	}
	
	@Test
	public void rb() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(4,0,E)",mr.move("rb"));
	}
	
	@Test
	public void bllr() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(0,4,W)",mr.move("bllr"));
	}
	
	@Test
	public void oneSquareGrid() {
		MarsRover mr = new MarsRover(1,1, obstacles);		
		assertEquals("(0,0,N)",mr.move("f"));
	}
	
	@Test
	public void crashIn21() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(1,1,E)(2,1)",mr.move("frff"));
	}
	
	@Test
	public void crashIn21and02() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(1,2,W)(2,1)(0,2)",mr.move("frfflflf"));
	}
	
	@Test
	public void crashIn21and02andContinue() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(1,3,N)(2,1)(0,2)",mr.move("frfflflfrfbf"));
	}
	
	@Test
	public void testReportObstacleTwice() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(1,1,E)(2,1)",mr.move("frfff"));
	}
	
	@Test
	public void testReportObstacleThreeTimes() {
		MarsRover mr = new MarsRover(5,5, obstacles);		
		assertEquals("(2,0,N)(2,1)",mr.move("rfflfbfffffff"));
	}

}
