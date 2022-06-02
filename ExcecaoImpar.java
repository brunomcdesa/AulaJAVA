
public class ExcecaoImpar extends Exception {
	private int numero;
	
	public ExcecaoImpar() {}
	
	public ExcecaoImpar(int numero) {
		this.numero = numero;
	}

	public String getMessage() {
		return "O numero " + numero + " é impar!";
	}
	
	public String toString() {
		return "O numero " + numero + " é impar!";
	}
	
	
}
