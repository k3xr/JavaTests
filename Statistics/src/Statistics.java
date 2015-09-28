/**
 * 
 * @author Oscarf
 *
 */
public class Statistics {

//	public static Collection<Integer> data;
//	
//	public static double average(Collection<Double> data){
//
//		double average = 0;
//		for (Iterator<Double> iterator = data.iterator(); iterator.hasNext();) {
//			average += (double) iterator.next();;
//	    }
//		return average/data.size();		
//	}	

	public static double average(double[] data){

		double average = 0;
		for(int i=0; i<data.length; i++){
			average += data[i];
		}
		return average/data.length;		
	}	

	/**
	 * 
	 * @param data
	 * @return histogram of the data as a string
	 */
	public static String histogram(double[] data){

		double max = data[0];
		for (int i=1; i<data.length; i++){
			if (data[i] > max){
				max = data[i];
			}
		}
		double min = data[0];
		for (int i=1; i<data.length; i++){
			if (data[i] < min){
				min = data[i];
			}
		}
		int numberOfClases = (int)Math.sqrt(data.length)+1;
		double classLength = (max - min)/numberOfClases;

		int[] freq = new int[numberOfClases];

		for (int i=0; i<data.length; i++){
			// for each value

			double minInterval = min;
			double maxInterval = min+classLength;
			
//			System.out.println("*----*");
			
			for(int j=0; j<numberOfClases; j++){
//				System.out.println("value "+ data[i] + " max: "+ maxInterval +" min: " + minInterval);
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
		
		String toPrint = "";
		
		int maxFreq = freq[0];
		for(int i=1; i<freq.length; i++){
			if(freq[i] > maxFreq){
				maxFreq = freq[i];
			}
		}
		
		for(int i=0; i<maxFreq;){
			toPrint = toPrint+"     ";
			for(int j=0; j<numberOfClases; j++){
				if(freq[j] >= maxFreq){
					toPrint = toPrint+"*     ";
				}
				else{
					toPrint = toPrint+"      ";
				}
				toPrint = toPrint+"   ";
			}
			maxFreq--;
			toPrint = toPrint+"\n";
		}		
		
		for(int j=0; j<numberOfClases; j++){
			// for each class			
			toPrint = toPrint + "_________";
		}	
		toPrint = toPrint + "\n"; 
		
		for(int j=0; j<numberOfClases; j++){
			// for each class			
			toPrint = toPrint + "|        ";
		}	
		toPrint = toPrint + "|\n"; 
		
		for(int j=0; j<numberOfClases; j++){
			// for each class			
			toPrint = toPrint + (min+classLength*j)+"     "; 						
		}	
		toPrint = toPrint + max + "\n"; 
			
		System.out.println(toPrint);
		
		return "asd";
	}
}
