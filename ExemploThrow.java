import java.util.Scanner;

public class ExemploThrow {
	public static void main(String [] args) {
		String senhaAtual = "123456";
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("Informe a senha: ");
			String senha = in.nextLine();
			if(senha.equals(senhaAtual)) {
				System.out.println("Acesso permitido!");
			}
			else {
				throw new Exception("Senha incorreta!");
			}
		
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro! " + e.getMessage());			
		}
		
	}
}
