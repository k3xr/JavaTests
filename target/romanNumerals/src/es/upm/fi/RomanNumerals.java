package es.upm.fi;

/**
 * 
 * @author oscarf
 * @since 10-10-2015 
 *
 */
public class RomanNumerals {

	static String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	/**
	 * 
	 * @param originalNumber integer to be converted to Roman
	 * @return String with the Roman representation of the originalNumber
	 */
	public static String numToRomans(int originalNumber) {

		if (originalNumber < 1 || originalNumber > 3999){
			return "Invalid input number";
		}

		String romanNumber = "";		
		int numLetters = 0;

		for (int i = 0; i < romans.length; i++) {
			numLetters = originalNumber / numbers[i];
			originalNumber %= numbers[i];
			for(int j = 0; j < numLetters; j++){
				romanNumber += romans[i];
			}
		}

		return romanNumber;
	}
}
