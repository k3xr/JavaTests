/**
 * 
 * @author Oscarf
 *
 */
public class Statistics {

	public static double average(double[] data){

		double average = 0;
		for(int i=0; i<data.length; i++){
			average += data[i];
		}
		return average/data.length;		
	}	

	/**
	 * @param data
	 * @return histogram of the data as a string
	 */
	public static String histogram(double[] data){

		double max = data[0];
		double min = data[0];
		for (int i=1; i<data.length; i++){
			if (data[i] > max){
				max = data[i];
			}
			else if (data[i] < min){
				min = data[i];
			}
		}
		
		int numberOfClasses = (int)Math.sqrt(data.length)+1;
		double classLength = (max - min)/numberOfClasses;

		int[] freq = new int[numberOfClasses];

		for (int i=0; i<data.length; i++){
			// for each value

			double minInterval = min;
			double maxInterval = min+classLength;
			
			for(int j=0; j<numberOfClasses; j++){
				// for each class
				if(j==0 && data[i] >= minInterval && data[i] <= maxInterval){
					freq[0]++;
					break;
				}
				else if (data[i] > minInterval && data[i] <= maxInterval){
					freq[j]++;
					break;
				}
				minInterval = maxInterval;
				maxInterval = maxInterval+classLength;
			}
		}		
		
		int maxFreq = freq[0];
		for(int i=1; i<freq.length; i++){
			if(freq[i] > maxFreq){
				maxFreq = freq[i];
			}
		}
		
		String toPrint = "";
		for(int i=0; i<maxFreq;){
			toPrint += "    ";
			for(int j=0; j<numberOfClasses; j++){
				if(freq[j] >= maxFreq){
					toPrint = insertOcurrence(toPrint);
				}
				else{
					toPrint = insertNonOcurrence(toPrint);
				}
			}
			maxFreq--;
			toPrint += "\n";
		}		
		
		toPrint = printBase(toPrint, numberOfClasses);		
		
		for(int j=0; j<numberOfClasses; j++){
			// for each class			
			toPrint += (min+classLength*j)+"\t"; 						
		}	
		toPrint += max + "\n";
		
		return toPrint;
	}
	
	private static String insertOcurrence(String toPrint){
		return toPrint += "*       ";
	}
	
	private static String insertNonOcurrence(String toPrint){
		return toPrint += "        ";
	}
	
	private static String printBase(String toPrint, int numberOfClasses){
		
		for(int j=0; j<numberOfClasses; j++){
			// for each class			
			toPrint += "________";
		}	
		toPrint += "\n"; 
		
		for(int j=0; j<numberOfClasses; j++){	
			toPrint += "|       ";
		}	
		toPrint += "|\n"; 	
		
		return toPrint;		
	}
}
