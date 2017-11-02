package sudoku;

import java.util.Arrays;

/**
 * 
 * @author oscarf
 * @since 04-10-2015 
 *
 */
public class Sudoku {

	/**
	 * 
	 * @param candidateSolution the string to be verified
	 * @return 	0:  satisfies all the sudoku conditions
	 * 			-1: each cell doesn't store a positive digit
	 * 			-2: digits repeat in a sub-grid
	 * 			-3: digits repeat in a row
	 * 			-4: digits repeat in a column  
	 */
	public int verify(String candidateSolution){

		if (candidateSolution.length() != 81){
			return -1;
		}

		// checks that all characters are numbers FROM 1-9
		if(!candidateSolution.matches("[1-9]+([1-9])")){
			return -1;
		}

		for (int i=0; i<9; i++){
			int[] subgrid = new int[9];
			int[] row = new int[9];
			int[] column = new int[9];
			for (int j=0; j<9; j++) {
				int positionSubgrid = ((i / 3) * 3 + j / 3) + 9 *(i * 3 % 9 + j % 3);
				subgrid[j] = Character.getNumericValue(candidateSolution.charAt(positionSubgrid));
				int positionRow = i * 9 + j;
				row[j] = Character.getNumericValue(candidateSolution.charAt(positionRow));
				int positionColumn = i + j * 9;
				column[j] = Character.getNumericValue(candidateSolution.charAt(positionColumn));
			}
			if(!validate9Digits(subgrid)){
				return -2;
			}
			if(!validate9Digits(row)){
				return -3;
			}
			if(!validate9Digits(column)){
				return -4;
			}
		}		
		return 0;

	}

	/**
	 * 
	 * @param digits 9 digit array
	 * @return true if numbers from 1 to 9 doesn't repeat in the array
	 */
	private boolean validate9Digits(int[] digits) {
		if(digits.length != 9){
			return false;
		}
		Arrays.sort(digits);
		for(int i=0; i<digits.length; i++){
			if(digits[i] != i+1){
				return false;
			}
		}
		return true;
	}
}
