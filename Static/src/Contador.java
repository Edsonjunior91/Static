
public class Contador {
	
	private static int valor; /* quando coloco static estou dizendo que o atributo valor pertence
								a classe e n�o ao objeto	*/
	
	static { /*Ele � chamado sempre que a classe � chamada pela primeira vez, o bloco 
	 			static s� pode manipular atributo que � static*/
		
		valor = 1;
	}
	
	public static void incrementar(int valor) {
		valor++;
	}

	public static int getValor() {
		return valor;
	}
	
	
	
}
