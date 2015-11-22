
public class MineField {

	// Input 4x3 mine field
	public static String hintField(String input, int nColumns, int nRows){
		char[] result = input.toCharArray();
		for(int i = 1; i <= nColumns; i++){ //Column
			for(int j = 1; j <= nRows; j++){ //Row
				// each cell
				if(result[i+(j-1)*nColumns-1] == '.'){
					//count mines
					int mineNumber = 0;
					try{if(result[i+(j-1)*nColumns] == '*' && (i+1)<= nColumns ){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j-1)*nColumns-2] == '*' && (i-1)> 0){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j)*nColumns] == '*' && (i+1)<= nColumns && (j+1)<= nRows){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j)*nColumns-2] == '*' && (i-1)>0 && (j+1)<= nRows){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j)*nColumns-1] == '*' && (j+1)<= nRows){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j-2)*nColumns] == '*' && (i+1)<= nColumns && (j-1)>0){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j-2)*nColumns-2] == '*' && (i-1)>0 && (j-1)>0){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					try{if(result[i+(j-2)*nColumns-1] == '*' && (j-1)>0){
						mineNumber++;
					}} catch (ArrayIndexOutOfBoundsException e) {}
					result[i+(j-1)*nColumns-1] = Character.forDigit(mineNumber, 10);
				}
			}
		}
		return String.valueOf(result);		
	}
}
