package alura;

public class Variavel {
	String name = "Thiago";
	
	public Variavel() {
		System.out.println(name);
	}
	
	public void m1() {
		// tem acesso somente aqui dentro
		int a = 10;
		System.out.println(name);
	}
	
//	public static void main(String[] args) {
//		
//		
//		Variavel pessoa = new Variavel();
//		System.out.println(pessoa.name);
//
//	}

}

class Teste {
    static int i = 3;
    public static void main(String[] args) {
        for (new Teste().i = 10; new Teste().i < 100;
             new Teste().i++) {
            System.out.println(i);
        }
    }
}
