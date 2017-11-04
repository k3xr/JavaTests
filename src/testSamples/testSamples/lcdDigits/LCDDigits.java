package lcdDigits;

public class LCDDigits {

	private String row0 = "";
	private String row1 = "";
	private String row2 = "";

	String row00 = " _ ";
	String row01 = "| |";
	String row02 = "|_|";

	String row10 = "   ";
	String row11 = "  |";
	String row12 = "  |";

	String row20 = " _ ";
	String row21 = " _|";
	String row22 = "|_ ";

	String row30 = " _ ";
	String row31 = " _|";
	String row32 = " _|";

	String row40 = "   ";
	String row41 = "|_|";
	String row42 = "  |";

	String row50 = " _ ";
	String row51 = "|_ ";
	String row52 = " _|";

	String row60 = " _ ";
	String row61 = "|_ ";
	String row62 = "|_|";

	String row70 = " _ ";
	String row71 = "  |";
	String row72 = "  |";

	String row80 = " _ ";
	String row81 = "|_|";
	String row82 = "|_|";

	String row90 = " _ ";
	String row91 = "|_|";
	String row92 = "  |";

	public String stringRepresentation(int number){

		if(number == 0){
			digitToStringRepresentation(number);
		}
		else{
			while (number > 0) {
				int digit = number%10;
				digitToStringRepresentation(digit);
				number = number / 10;
			}	
		}

		return row0+"\n"+row1+"\n"+row2+"\n";
	}

	private void digitToStringRepresentation(int digit){

		switch(digit){
		case 0:
			row0 = row00+row0;
			row1 = row01+row1;
			row2 = row02+row2;
			break;
		case 1:
			row0 = row10+row0;
			row1 = row11+row1;
			row2 = row12+row2;
			break;
		case 2:
			row0 = row20+row0;
			row1 = row21+row1;
			row2 = row22+row2;
			break;
		case 3:
			row0 = row30+row0;
			row1 = row31+row1;
			row2 = row32+row2;
			break;
		case 4:
			row0 = row40+row0;
			row1 = row41+row1;
			row2 = row42+row2;
			break;
		case 5:
			row0 = row50+row0;
			row1 = row51+row1;
			row2 = row52+row2;
			break;
		case 6:
			row0 = row60+row0;
			row1 = row61+row1;
			row2 = row62+row2;
			break;
		case 7:
			row0 = row70+row0;
			row1 = row71+row1;
			row2 = row72+row2;
			break;
		case 8:
			row0 = row80+row0;
			row1 = row81+row1;
			row2 = row82+row2;
			break;
		case 9:
			row0 = row90+row0;
			row1 = row91+row1;
			row2 = row92+row2;
			break;
		}
	}
}
