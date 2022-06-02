import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoIMC {
	private int peso;
	private int altura;
	
	public CalculoIMC() {}
	
	public CalculoIMC(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	public int imc() {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Informe o peso: ");
			this.peso = in.nextInt();
			System.out.println("Informe a altura: ");
			this.altura = in.nextInt();
			int calcimc = peso / (altura * altura);
			return calcimc;
		
		}
		catch(InputMismatchException i) {
			System.out.println("Peso e (ou) altura com entradas invalidas. " + i.getMessage());
			return -1;
		}
		catch(ArithmeticException a) {
			System.out.println("Divisao por 0 (zero) nao é permitido! " + a.getMessage());
			return -1;
		}
		
	} 
	

}
