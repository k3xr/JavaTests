
public class Principal {

	public static String nada = "love", quince = "fifteen", 
						treinta = "thirty", 
						cuarenta = "forty", 
						ventaja = "advantage";
	
	public static String[] puntajesString = new String[]{"Cero", "Quince", "Treinta", "Cuarenta"};
	public static int[] puntajesInteger = new int[]{0, 15, 30, 40};
	public static int VENTAJA = 45;
	public static int GANAR = 50;
	public static final int CUARENTA = 3;
	public static final int TREINTA = 2;
	public static final int QUINCE = 1;
	public static final int CERO = 0;
	private int player1 = 0;
	private int player2 = 0;
	

	
	
	public String get_score(int number1 , int number2) {

		if(number1==number2 && number1 == CUARENTA){
			return "deuce";
		}
		
		if (number1 > 4 || number2 > 4 ) {
			if (Math.abs(number1-number2) > 2){
				return number1 - number2 > 0? "Gana 1": "Gana 2";
			} else if (Math.abs(number1-number2) ==1) {
				return number1 - number2 >0? "Ventaja 1":"Ventaja 2";
			}
		
		}
		
		return getNumberToString(number1) +" - " + getNumberToString(number2);
	}
	
	
	
	private String getNumberToString(int number){
		String resultado = "";
		switch(number){
			case CERO:
				resultado = nada;
				break;
			case QUINCE:
				resultado = quince;
				break;
			case TREINTA:
				resultado = treinta;
				break;
			case CUARENTA:
				resultado = cuarenta;
				break;
		}
		
		return resultado;
	}
	
}
