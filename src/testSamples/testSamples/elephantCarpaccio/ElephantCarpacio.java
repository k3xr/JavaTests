package elephantCarpaccio;

import java.util.Scanner;


public class ElephantCarpacio {

	public static double calculaValor(double price, int nItems, String sc) {
		double fnPri = price * nItems;
		if(fnPri>=50000){
			fnPri = fnPri-fnPri*0.15;
		}
		else if(fnPri>=10000.0){
			fnPri = fnPri-fnPri*0.1;
		}
		else if(fnPri>=7000.0){
			fnPri = fnPri-fnPri*0.07;
		}
		else if(fnPri>=5000.0){
			fnPri = fnPri-fnPri*0.05;
		}
		else if(fnPri>=1000.0){
			fnPri = fnPri-fnPri*0.03;
		}
		return Math.floor(fnPri * getTaxState(sc)*100)/100;
	}
	
	private static double getTaxState(String sc){
		double result = 0.0;
		switch(sc){
		case "UT":
			result = 6.85;
			break;
		case "NV":
		   result = 8;
		   break;
		case "TX":
			result = 6.25;
			break;
		case "AL":
			result = 4;
			break;
		case "CA":
			result = 8.25;
			break;
		}
		return result/100 + 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de elementos");
		int nItems = scan.nextInt();
		System.out.println("Introduce el precio por elemento");
		double price = scan.nextDouble();
		System.out.println("Introduce el código de estado");
		scan.nextLine();
		String sc = scan.nextLine();
		scan.close();
		
		System.out.println(calculaValor(price, nItems, sc));
	}
}
