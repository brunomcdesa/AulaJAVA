import java.util.Scanner;

public class testaExcessaoParImpar {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		UsaExcecaoImpar teste = new UsaExcecaoImpar();
		
		System.out.println("Informe um numero: ");
		int num1 = in.nextInt();
		teste.testaParImpar(num1);
		
		System.out.println("Informe outro numero: ");
		int num2 = in.nextInt();
		try {
		teste.testParImpar2(num2);
		}
		catch(ExcecaoImpar e) {
			System.out.println(e.getMessage());
		}
	}
}
