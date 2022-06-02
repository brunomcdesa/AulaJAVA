
public class UsaExcecaoImpar {
	
	public void testaParImpar(int num) {
		try {
			if(num % 2 == 0) {
				System.out.println("Nenhuma excecao lançada!");
			}else {
				throw new ExcecaoImpar(num);
			}
		}
		catch(ExcecaoImpar e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void testParImpar2(int num) throws ExcecaoImpar {
		if(num % 2 == 0) {
			System.out.println("Nenhuma excecao lançada!");
		}else {
			throw new ExcecaoImpar(num);
		}
	}
	
	
	
}
