import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	private int x;
	private int y;
	
	public Calculadora() {}
	
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public int soma() {
		return x + y;
	}
	
	public int subtracao() {
		return x - y;
	}
	
	public int multiplicacao() {
		return x * y;
	}
	
	public int divisao() {
		Scanner in = new Scanner(System.in);
		try {
			return x / y;
		}
		catch(ArithmeticException e) {
			while( y == 0 ) {
			System.out.println(e.getMessage());			
			System.out.println("Digite um numero maior que 0(zero)");
			y = in.nextInt();
			
		}
			return x / y;
		}
	} 
	
	public int divisao2() {
		boolean continuar = true;
		int resultado =0;
		
		while (continuar == true) {
	
		try {
			resultado = x / y;
			continuar = false;
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("Divisão por 0(zero)" + e.getMessage());	
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero maior que 0(zero): ");
			this.y = entrada.nextInt();
			
		}
	}
		return resultado;
	}
	
	
	public int divisao3() {
		Scanner in = new Scanner(System.in);
		try {
		
		System.out.println("Informe o valor de x: ");
		x = in.nextInt();
		System.out.println("Informe o valor de y: ");
		y = in.nextInt();
		return x/y;
		
		}
		catch(InputMismatchException i) {
			System.out.println("Valor em formato errado! " + i.getMessage());
			return -1;
		}
		catch(ArithmeticException e) {
			System.out.println("Divisao por 0(zero)!!" + e.getMessage() );
			return -1;
		}
		
	}
	public int divisao4() {
		Scanner in = new Scanner(System.in);
		try {
		
		System.out.println("Informe o valor de x: ");
		x = in.nextInt();
		System.out.println("Informe o valor de y: ");
		y = in.nextInt();
		return x/y;
		
		}
		catch(Exception e) {
			System.out.println("Um erro foi encontrado! " + e.toString());
			return -1;
		}
		finally {
			System.out.println(x/y +" - Metodo sendo finalizado!" );
			
		}
	}
}
