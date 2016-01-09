package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	List<Frame> frameList = new ArrayList<Frame>();

	public boolean frameEquals(Frame a, Frame b){
		return (a.getFirstThrow() == b.getFirstThrow() &&
				a.getSecondThrow() == b.getSecondThrow());

	}

	public boolean frameListEquals(List<Frame> a, List<Frame> b){
		if(a.size() != b.size()){
			return false;
		}
		for (int i=0; i<a.size();i++){			
			if(!frameEquals(a.get(i),b.get(i))){
				return false;
			}
		}
		return true;
	}

	@Test
	public void defineAFrame() {
		Frame frame1 = new Frame(2,4);
		assertEquals(2,frame1.getFirstThrow());
		assertEquals(4,frame1.getSecondThrow());
	}

	@Test
	public void frame26score8() {
		Frame frame1 = new Frame(2,6);
		assertEquals(8,frame1.score());
	}

	@Test
	public void frame09score9() {
		Frame frame1 = new Frame(0,9);
		assertEquals(9,frame1.score());
	}

	@Test
	public void defineAGame() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		frameList.add(frame1);
		frameList.add(frame2);
		frameList.add(frame3);
		frameList.add(frame4);
		frameList.add(frame5);
		frameList.add(frame6);
		frameList.add(frame7);
		frameList.add(frame8);
		frameList.add(frame9);
		frameList.add(frame10);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertTrue(frameListEquals(game.getFrames(),frameList));

	}

	@Test
	public void scoreOfGame() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertEquals(81,game.score());
	}

	@Test
	public void scoreOfGameWithStrike() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(10,0);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertEquals(94,game.score());
	}

	@Test
	public void scoreOfGameWithSpare() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(1,9);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertEquals(88,game.score());
	}

	@Test
	public void scoreOfGameWithStrikeFollowedBySpare() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(10,0);
		Frame frame2 = new Frame(4,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertEquals(103,game.score());
	}

	@Test
	public void scoreOfGameWithMultipleStrikes() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(10,0);
		Frame frame2 = new Frame(10,0);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertEquals(112,game.score());
	}

	@Test
	public void scoreOfGameWithMultipleSpares() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(8,2);
		Frame frame2 = new Frame(5,5);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);

		assertEquals(98,game.score());
	}

	@Test
	public void scoreOfGameWithSpareAsLastFrame() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,8);
		Frame bonusThrow = new Frame(7,0);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		game.setBonus(bonusThrow);

		assertEquals(90,game.score());
	}

	@Test
	public void scoreOfGameWithStrikeAsLastFrame() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(10,0);
		Frame bonusThrow = new Frame(7,2);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		game.setBonus(bonusThrow);

		assertEquals(92,game.score());
	}

	@Test
	public void scoreOfGameWithStrikeAsBonus() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,8);
		Frame bonusThrow = new Frame(10,0);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		game.setBonus(bonusThrow);

		assertEquals(93,game.score());
	}

	@Test
	public void scoreOfPerfectGame() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(10,0);
		Frame frame2 = new Frame(10,0);
		Frame frame3 = new Frame(10,0);
		Frame frame4 = new Frame(10,0);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(10,0);
		Frame frame7 = new Frame(10,0);
		Frame frame8 = new Frame(10,0);
		Frame frame9 = new Frame(10,0);
		Frame frame10 = new Frame(10,0);
		Frame bonusThrow = new Frame(10,10);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		game.setBonus(bonusThrow);

		assertEquals(300,game.score());
	}

	@Test
	public void scoreOfRealGame135() {
		BowlingGame game = new BowlingGame();

		Frame frame1 = new Frame(6,3);
		Frame frame2 = new Frame(7,1);
		Frame frame3 = new Frame(8,2);
		Frame frame4 = new Frame(7,2);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(6,2);
		Frame frame7 = new Frame(7,3);
		Frame frame8 = new Frame(10,0);
		Frame frame9 = new Frame(8,0);
		Frame frame10 = new Frame(7,3);
		Frame bonusThrow = new Frame(10,0);

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		game.setBonus(bonusThrow);

		assertEquals(135,game.score());
	}

}
