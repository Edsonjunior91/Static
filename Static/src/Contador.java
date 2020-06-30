
public class Contador {
	
	private static int valor; /* quando coloco static estou dizendo que o atributo valor pertence
								a classe e não ao objeto	*/
	
	static { /*Ele é chamado sempre que a classe é chamada pela primeira vez, o bloco 
	 			static só pode manipular atributo que é static*/
		
		valor = 1;
	}
	
	public static void incrementar(int valor) {
		valor++;
	}

	public static int getValor() {
		return valor;
	}
	
	
	
}
