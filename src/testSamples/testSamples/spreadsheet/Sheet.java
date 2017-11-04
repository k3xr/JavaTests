package spreadsheet;

import java.util.HashMap;
import java.util.Map;

public class Sheet {

	private Map<String, String> data = new HashMap<String, String>();

	public String get(String cell){
		return data.get(cell);
	}

	public void set(String cell, String contents){
		data.put(cell, contents);
	}

	public String evaluate(String cell){

		String cellWithoutSpaces = get(cell).replaceAll("\\s+","");
		if(cellWithoutSpaces.startsWith("=")){
			// formula

			String firstNumber = "";
			char operator = 0;
			String secondNumber = "";


			firstNumber = parseNumber(cellWithoutSpaces,1);
			secondNumber = parseNumber(cellWithoutSpaces,1+firstNumber.length()+1);
			operator = cellWithoutSpaces.charAt(1+firstNumber.length());

			int counter = firstNumber.length() + 2 + secondNumber.length();
			String acumulated = operate(firstNumber, operator, secondNumber);
			while(counter+1 < cellWithoutSpaces.length() && Character.isDigit(cellWithoutSpaces.charAt(counter+1))){
				operator = cellWithoutSpaces.charAt(counter);
				secondNumber = parseNumber(cellWithoutSpaces,counter+1);
				counter = counter + 1 + secondNumber.length();
				acumulated = operate(acumulated, operator, secondNumber);
			}

			return acumulated;	

		}		
		else{
			// number
			return cellWithoutSpaces;
		}
	}

	private String parseNumber(String cellWithoutSpaces, int start){
		String number = "";
		for(int i = start; i<cellWithoutSpaces.length(); i++){
			char digit = cellWithoutSpaces.charAt(i);
			if(Character.isDigit(digit)){
				number += digit;
			}
			else{
				break;
			}
		}
		return number;		
	}

	private String operate(String firstNumber, char operator, String secondNumber){

		if(Integer.parseInt(secondNumber) == 0){
			return "Error";
		}
		int result = 0;
		switch (operator) {
		case '+':  result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
		break;
		case '-':  result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
		break;
		case '*':  result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
		break;
		case '/':  result = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
		break;
		case '%':  result = Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber);
		break;
		}
		String resultString = ""+result;

		return resultString;

	}

}
