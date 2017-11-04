package sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuTest {

	@Test
	public void emptyParamString() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = "";		
		assertEquals(-1,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void negativeParamString() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9"
				+ "3-5-6-8-9";		
		assertEquals(-1,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void incorrectDigit0() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "534678912"
				+ "672195348"
				+ "198342567"
				+ "859761423"
				+ "426853791"
				+ "713924856"
				+ "961537284"
				+ "287419605"
				+ "345286179";	
		assertEquals(-1,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void characters82ParamString() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "534678912"
				+ "672195348"
				+ "198342567"
				+ "859761423"
				+ "426853791"
				+ "713924856"
				+ "961537284"
				+ "287419635"
				+ "3452861791";	
		assertEquals(-1,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void characters80ParamString() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "534678912"
				+ "672195348"
				+ "198342567"
				+ "859761423"
				+ "426853791"
				+ "713924856"
				+ "961537284"
				+ "287419635"
				+ "34528617";		
		assertEquals(-1,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void violatesSubgridAndColumns() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789";		
		assertEquals(-2,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void okSolution1() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "534678912"
				+ "672195348"
				+ "198342567"
				+ "859761423"
				+ "426853791"
				+ "713924856"
				+ "961537284"
				+ "287419635"
				+ "345286179";	
		assertEquals(0,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void violatesSubgrid() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "534678912"
				+ "672195348"
				+ "193842567"
				+ "859761423"
				+ "426853791"
				+ "713924856"
				+ "961537284"
				+ "287419635"
				+ "345286179";	
		assertEquals(-2,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void violatesRows() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "123123123"
				+ "456456456"
				+ "789789789"
				+ "123123123"
				+ "456456456"
				+ "789789789"
				+ "123123123"
				+ "456456456"
				+ "789789789";
		assertEquals(-3,testSudoku.verify(candidateSolution));
	}
	
	@Test
	public void violatesColumns() {
		Sudoku testSudoku = new Sudoku();
		String candidateSolution = 
				  "123456789"
				+ "456789123"
				+ "789123456"
				+ "123456789"
				+ "456789123"
				+ "789123456"
				+ "123456789"
				+ "456789123"
				+ "789123456";
		assertEquals(-4,testSudoku.verify(candidateSolution));
	}

}
