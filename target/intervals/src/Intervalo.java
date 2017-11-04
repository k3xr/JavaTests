
public class Intervalo implements Comparable<Intervalo> {

	private char s1, s2;
	private int primero, segundo;

	public char getS1() {
		return s1;
	}

	public void setS1(char s1) {
		this.s1 = s1;
	}

	public char getS2() {
		return s2;
	}

	public void setS2(char s2) {
		this.s2 = s2;
	}

	public int getPrimero() {
		return primero;
	}

	public void setPrimero(int primero) {
		this.primero = primero;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public Intervalo(char start, int firstNum, int secondNum, char end) {
		s1 = '[';
		s2 = ']';
		if(start == '('){
			primero = firstNum+1;
		}
		else{
			primero = firstNum;
		}
		if(end == ')'){
			segundo = secondNum-1;
		}
		else{
			segundo = secondNum;
		}		
	}

	public boolean contiene(Intervalo inter2) {
		return (primero<=inter2.getPrimero() && segundo>=inter2.getSegundo());
	}

	public Intervalo diferencia(Intervalo inter2) {
		Intervalo resultado;
		int newPrimero = 0;
		int newSegundo = 0;
		if(this.segundo>inter2.getSegundo()){
			newSegundo = this.segundo;
			newPrimero = inter2.getSegundo()+1;
		}
		else if(this.primero<inter2.getPrimero()){
			newPrimero = this.primero;
			newSegundo = inter2.getPrimero()-1;
		}
		resultado = new Intervalo('[', newPrimero, newSegundo, ']');
		return resultado;
	}

	public int compareTo(Intervalo inter2) {
		return (primero == inter2.getPrimero() 
				&& segundo == inter2.getSegundo() ? 0 : 1);
	}

}
