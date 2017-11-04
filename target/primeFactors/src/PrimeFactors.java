import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(int n){

		List<Integer> primesList = new ArrayList<Integer>();

		int[] primeNumbers = {1,2,3,5,7,11};

		int i = primeNumbers.length-1;
		int currentNumber = n;
		while(i>=0 && currentNumber > 1){
			if((currentNumber % primeNumbers[i]) == 0){
				primesList.add(primeNumbers[i]);
				currentNumber = currentNumber/primeNumbers[i];
			}
			else
				i--;		
		}

		return primesList;		
	}
}
