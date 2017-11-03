package stringCalculator;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author OscarF
 *
 */
public class StringCalculator {

	public static int Add(String numbers){

		int sum = 0;

		if(numbers.equals("")){
			return sum;
		}
		else if(numbers.contains("\n")){
			String[] splitString = numbers.split("\n");
			sum = sum(splitString[0], splitString[1]);	
		}
		else if(numbers.indexOf(',') < 0){
			sum = Integer.parseInt(numbers);
		}
		else if(numbers.indexOf(',') >= 0){
			sum = sum(",", numbers);
		}

		return sum;
	}

	private static int sum(String separator, String toSum){		
		int sum = 0;
		if(!separator.equals("") && !toSum.equals("") && toSum.contains(separator)){
			List<String> numberList = Arrays.asList(toSum.split(separator));
			for (int i = 0; i < numberList.size(); i++) {
				sum += Integer.parseInt(numberList.get(i));
			}		
		}		
		return sum;		
	}

}
